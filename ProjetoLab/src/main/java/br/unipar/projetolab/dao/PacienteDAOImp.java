package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class PacienteDAOImp implements PacienteDAO{
    
    //talvez precise fazer dto
    
    private EntityManager entityManager;

    public PacienteDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
    
    
    @Override
    public Paciente save(Paciente paciente) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            if (paciente.getId() == null) {
                // Novo paciente, usa persist()
                entityManager.persist(paciente);
            } else {
                // Paciente existente, usa merge() para atualizar
                entityManager.merge(paciente);
            }
            transaction.commit();
            System.out.println("Paciente salvo/atualizado com sucesso!");
        } catch (Exception e) {
            transaction.rollback();
            throw e; // Relança a exceção para tratamento na camada superior
        } finally {
            entityManager.close(); // Fecha o EntityManager
        }
        return paciente;
    }

    @Override
    public Paciente update(Paciente paciente) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            paciente = entityManager.merge(paciente);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
        return paciente;
    }

    @Override
    public Boolean delete(Paciente paciente) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Paciente pacienteToDelete = entityManager.find(Paciente.class, paciente.getId());
            if (pacienteToDelete != null) {
                entityManager.remove(pacienteToDelete); 
                transaction.commit();
                System.out.println("Paciente removido com sucesso!");
                return true;
            } else {
                System.out.println("Paciente não encontrado.");
                return false;
            }
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    @Override
    public Paciente findById(Integer id) {
        return entityManager.find(Paciente.class, id);
    }

    @Override
    public List<Paciente> findAll() {
        return entityManager.createQuery("SELECT p FROM Paciente p",
                Paciente.class).getResultList();    }
    
    
    public List<Paciente> findAllAtivos() {
        return entityManager.createQuery("SELECT p FROM Paciente p WHERE p.ativo = true", Paciente.class)
                .getResultList();
    }
    
    public List<Paciente> findByName(String nome) {
        return entityManager.createQuery("SELECT p FROM Paciente p WHERE p.nome LIKE :nome AND p.ativo = true", Paciente.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }

}
