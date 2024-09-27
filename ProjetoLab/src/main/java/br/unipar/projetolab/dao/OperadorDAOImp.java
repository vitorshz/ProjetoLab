package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Operador;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

public class OperadorDAOImp implements OperadorDAO {

    private EntityManager entityManager;

    public OperadorDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Operador save(Operador operador) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(operador);
        transaction.commit();
        entityManager.close();

        System.out.println("Operador salvo com sucesso!");
        return operador;
    }

    @Override
    public Operador update(Operador operador) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(operador);
        transaction.commit();
        entityManager.close();

        System.out.println("Operador atualizado com sucesso!");
        return operador;
    }

    @Override
    public Boolean delete(Operador operador) {
        EntityTransaction transaction = entityManager.getTransaction();

        try {
            transaction.begin();
            entityManager.remove(entityManager.contains(operador) ? operador : entityManager.merge(operador));
            transaction.commit();
            entityManager.close();

            System.out.println("Operador removido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Erro ao remover operador!");
            return false;
        }
    }

    @Override
    public Operador findById(Long id) {
        return entityManager.find(Operador.class, id);
    }

    @Override
    public List<Operador> findAll() {
        return entityManager.createQuery("SELECT o FROM Operador o", Operador.class).getResultList();
    }
    
}
