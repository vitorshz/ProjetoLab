package br.unipar.projetolab.dao;


import br.unipar.projetolab.dao.ResultadoExameDAO;
import br.unipar.projetolab.models.ResultadoExame;
import br.unipar.projetolab.utils.EntityManagerUtil;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.NoResultException;

public class ResultadoExameDAOImp implements ResultadoExameDAO {

    private final EntityManager em;

    public ResultadoExameDAOImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public ResultadoExame buscarPorGuiaEExame(Long guiaId, Long exameId) {
        try {
            return em.createQuery(
                    "SELECT r FROM ResultadoExame r WHERE r.guia.id = :guiaId AND r.exame.id = :exameId",
                    ResultadoExame.class)
                    .setParameter("guiaId", guiaId)
                    .setParameter("exameId", exameId)
                    .getSingleResult();
        } catch (NoResultException e) {
            return null; // Nenhum resultado encontrado
        }
    }
    @Override
    public List<ResultadoExame> buscarPorGuia(Long guiaId) {
        try {
            return em.createQuery(
                    "SELECT r FROM ResultadoExame r WHERE r.guia.id = :guiaId", ResultadoExame.class)
                    .setParameter("guiaId", guiaId)
                    .getResultList();
        } catch (Exception e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    @Override
    public void salvar(ResultadoExame resultadoExame) {
        try {
            em.getTransaction().begin();
            if (resultadoExame.getId() == null) {
                em.persist(resultadoExame);
            } else {
                em.merge(resultadoExame);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao salvar ResultadoExame: " + e.getMessage(), e);
        }
    }

    @Override
    public void remover(ResultadoExame resultadoExame) {
        try {
            em.getTransaction().begin();
            ResultadoExame resultado = em.find(ResultadoExame.class, resultadoExame.getId());
            if (resultado != null) {
                em.remove(resultado);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao remover ResultadoExame: " + e.getMessage(), e);
        }
    }
}
