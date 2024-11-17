package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Exame;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class ExameDAOImp implements ExameDAO{

    private EntityManager entityManager;

    public ExameDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Exame save(Exame ex) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            if (ex.getId() == null) {
                entityManager.persist(ex); // Novo médico
            } else {
                entityManager.merge(ex); // Médico existente
            }
            transaction.commit();
            System.out.println("Exame salvo/atualizado com sucesso!");
        } catch (Exception e) {
            transaction.rollback();
            throw e; // Relança a exceção para tratamento na camada superior
        }
        return ex;
    }

    @Override
    public Exame update(Exame ex) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            ex = entityManager.merge(ex);
            transaction.commit();
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
        return ex;
    }

    @Override
    public Boolean delete(Exame ex) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            Exame medicoToDelete = entityManager.find(Exame.class, ex.getId());
            if (medicoToDelete != null) {
                entityManager.remove(medicoToDelete); 
                transaction.commit();
                System.out.println("Exame removido com sucesso!");
                return true;
            } else {
                System.out.println("Exame não encontrado.");
                return false;
            }
        } catch (Exception e) {
            transaction.rollback();
            throw e;
        }
    }

    @Override
    public Exame findById(Long id) {
        return entityManager.find(Exame.class, id);
    }

    @Override
    public List<Exame> findAll() {
        return entityManager.createQuery("SELECT e FROM Exame e", Exame.class).getResultList();
    }

    @Override
    public List<Exame> findAllAtivos() {
        return entityManager.createQuery("SELECT e FROM Exame e WHERE e.ativo = true", Exame.class).getResultList();
    }

    @Override
    public List<Exame> findByName(String nome) {
        return entityManager.createQuery("SELECT e FROM exame e WHERE e.nome LIKE :nome AND e.ativo = true", Exame.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
}
