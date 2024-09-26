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
        transaction.begin();
        entityManager.persist(paciente);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Paciente salvo com sucesso!");
        return paciente;    
    }

    @Override
    public Paciente update(Paciente paciente) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(paciente);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Paciente atualizado com sucesso!");
        return paciente;
    }

    @Override
    public Boolean delete(Paciente paciente) {
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.remove(paciente);
            transaction.commit();
            entityManager.close();

            System.out.println("Paciente removido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Paciente atualizado com sucesso!");
            return false;
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
    
}
