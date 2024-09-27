package br.unipar.projetolab.dao;


import br.unipar.projetolab.models.Convenio;
import javax.persistence.EntityManager;
import java.util.List;

public class ConvenioDAOImp implements ConvenioDAO{

    private EntityManager entityManager;

    public ConvenioDAOImp(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public Convenio save(Convenio convenio) {
        entityManager.getTransaction().begin();
        if (convenio.getId() == null) {
            entityManager.persist(convenio);  
        } else {
            entityManager.merge(convenio);
        }
        entityManager.getTransaction().commit();
        return convenio;
    }

    public List<Convenio> findAll() {
        return entityManager.createQuery("SELECT c FROM Convenio c WHERE c.ativo = true", Convenio.class).getResultList();
    }

    public Convenio findById(Long id) {
        return entityManager.find(Convenio.class, id);
    }

    public void inativarConvenio(Convenio convenio) {
        entityManager.getTransaction().begin();
        convenio.setAtivo(false);
        entityManager.merge(convenio);
        entityManager.getTransaction().commit();
    }
}

