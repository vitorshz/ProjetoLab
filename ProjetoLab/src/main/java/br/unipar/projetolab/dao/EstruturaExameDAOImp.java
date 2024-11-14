
package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.EstruturaExame;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class EstruturaExameDAOImp implements EstruturaExameDAO{
    
    private EntityManager entityManager;

    public EstruturaExameDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public EstruturaExame save(EstruturaExame ex) {
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
    public EstruturaExame update(EstruturaExame ex) {
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
    public Boolean delete(EstruturaExame ex) {
        EntityTransaction transaction = entityManager.getTransaction();
        try {
            transaction.begin();
            EstruturaExame medicoToDelete = entityManager.find(EstruturaExame.class, ex.getId());
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
    public EstruturaExame findById(Long id) {
        return entityManager.find(EstruturaExame.class, id);
    }

    @Override
    public List<EstruturaExame> findAll() {
        return entityManager.createQuery("SELECT e FROM EstruturaExame e", EstruturaExame.class).getResultList();
    }

    @Override
    public List<EstruturaExame> findAllAtivos() {
        return entityManager.createQuery("SELECT e FROM EstruturaExame e WHERE e.ativo = true", EstruturaExame.class).getResultList();
    }

    @Override
    public List<EstruturaExame> findByName(String nome) {
        return entityManager.createQuery("SELECT e FROM EstruturaExame e WHERE e.nome LIKE :nome AND e.ativo = true", EstruturaExame.class)
                .setParameter("nome", "%" + nome + "%")
                .getResultList();
    }
    
}
