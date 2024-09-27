package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Medico;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class MedicoDAOImp implements MedicoDAO {

    private EntityManager entityManager;

    public MedicoDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Medico save(Medico medico) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            if (medico.getId() == null) {
                entityManager.persist(medico); // Novo médico
            } else {
                entityManager.merge(medico); // Médico existente
            }
            transaction.commit();
            System.out.println("Médico salvo/atualizado com sucesso!");
        } catch (Exception e) {
            transaction.rollback();
            throw e; // Relança a exceção para tratamento na camada superior
        }
        return medico;
    }

    @Override
    public Medico update(Medico medico) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            medico = entityManager.merge(medico);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
        return medico;
    }

    @Override
    public Boolean delete(Medico medico) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Medico medicoToDelete = entityManager.find(Medico.class, medico.getId());
            if (medicoToDelete != null) {
                entityManager.remove(medicoToDelete); 
                transaction.commit();
                System.out.println("Médico removido com sucesso!");
                return true;
            } else {
                System.out.println("Médico não encontrado.");
                return false;
            }
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    @Override
    public Medico findById(Long id) {
        return entityManager.find(Medico.class, id);
    }

    @Override
    public List<Medico> findAll() {
        return entityManager.createQuery("SELECT m FROM Medico m", Medico.class).getResultList();
    }

    @Override
    public List<Medico> findAllAtivos() {
        return entityManager.createQuery("SELECT m FROM Medico m WHERE m.ativo = true", Medico.class).getResultList();
    }

    @Override
    public List<Medico> findByName(String nome) {
        return entityManager.createQuery("SELECT m FROM Medico m WHERE m.nome LIKE :nome AND m.ativo = true", Medico.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
}
