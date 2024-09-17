package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Paciente;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;


public class PacienteDAOImp implements PacienteDAO{
    
    private EntityManager entityManager;

    public PacienteDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    @Override
    public Paciente save(Paciente cliente) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.persist(cliente);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Cliente salvo com sucesso!");
        return cliente;
    }

    @Override
    public Paciente update(Paciente cliente) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        entityManager.merge(cliente);
        transaction.commit();
        entityManager.close();
        
        System.out.println("Cliente atualizado com sucesso!");
        return cliente;
    }

    @Override
    public Boolean delete(Paciente cliente) {        
        EntityTransaction transaction = entityManager.getTransaction();
        
        try {
            transaction.begin();
            entityManager.remove(cliente);
            transaction.commit();
            entityManager.close();

            System.out.println("Cliente removido com sucesso!");
            return true;
        } catch (Exception e) {
            transaction.rollback();
            System.out.println("Cliente atualizado com sucesso!");
            return false;
        }
       
    }

    @Override
    public Paciente findById(Integer id) {
        return entityManager.find(Paciente.class, id);
    }

    @Override
    public List<Paciente> findAll() {
        return entityManager.createQuery("SELECT c FROM Cliente c",
                Paciente.class).getResultList();
                
    }
    
}
