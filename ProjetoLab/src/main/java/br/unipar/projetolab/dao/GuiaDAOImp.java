package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Guia;
import br.unipar.projetolab.utils.EntityManagerUtil;
import java.time.LocalDateTime;
import java.util.Date;
import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class GuiaDAOImp implements GuiaDAO {

    private EntityManager em;

    public GuiaDAOImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public Guia save(Guia guia) {
        try {
            em.getTransaction().begin();
            em.persist(guia);
            em.getTransaction().commit();
            return guia;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao salvar a guia: " + e.getMessage());
        }
    }

    @Override
    public Guia update(Guia guia) {
        try {
            em.getTransaction().begin();
            Guia guiaAtualizada = em.merge(guia);
            em.getTransaction().commit();
            return guiaAtualizada;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao atualizar a guia: " + e.getMessage());
        }
    }

    @Override
    public boolean delete(Guia guia) {
        try {
            em.getTransaction().begin();
            Guia guiaRemover = em.find(Guia.class, guia.getId());
            if (guiaRemover != null) {
                em.remove(guiaRemover);
                em.getTransaction().commit();
                return true;
            } else {
                em.getTransaction().rollback();
                return false;
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao remover a guia: " + e.getMessage());
        }
    }

    @Override
    public Guia findById(Long id) {
        try {
            return em.find(Guia.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar a guia por ID: " + e.getMessage());
        }
    }

    @Override
    public List<Guia> findAll() {
        try {
            TypedQuery<Guia> query = em.createQuery("SELECT g FROM Guia g", Guia.class);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar todas as guias: " + e.getMessage());
        }
    }

    @Override
    public List<Guia> findAllAtivos() {
        try {
            TypedQuery<Guia> query = em.createQuery("SELECT g FROM Guia g WHERE g.ativo = true", Guia.class);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar guias ativas: " + e.getMessage());
        }
    }

    @Override
    public List<Guia> findByDataCadastro(String dataCadastro) {
        try {
            TypedQuery<Guia> query = em.createQuery(
                "SELECT g FROM Guia g WHERE FUNCTION('DATE', g.dataCadastro) = :dataCadastro", Guia.class);
            query.setParameter("dataCadastro", dataCadastro);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar guias pela data de cadastro: " + e.getMessage());
        }
    }
    @Override
    public List<Guia> findByNomePaciente(String nomePaciente) {
        String jpql = "SELECT g FROM Guia g WHERE LOWER(g.paciente.nome) LIKE :nome";
        return em.createQuery(jpql, Guia.class)
                .setParameter("nome", "%" + nomePaciente.toLowerCase() + "%")
                .getResultList();
    }
    
    public List<Guia> buscarPorPeriodoESituacao(LocalDateTime dataInicial, LocalDateTime dataFinal, String situacao) {
        String queryStr = "SELECT g FROM Guia g WHERE g.dataCadastro BETWEEN :dataInicial AND :dataFinal";
        if (!situacao.equalsIgnoreCase("todas")) {
            queryStr += " AND g.status = :situacao";
        }

        TypedQuery<Guia> query = em.createQuery(queryStr, Guia.class);
        query.setParameter("dataInicial", dataInicial);
        query.setParameter("dataFinal", dataFinal);

        if (!situacao.equalsIgnoreCase("todas")) {
            query.setParameter("situacao", situacao);
        }

        return query.getResultList();
    }




}
