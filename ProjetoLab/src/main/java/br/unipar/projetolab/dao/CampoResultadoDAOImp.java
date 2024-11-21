package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.CampoResultadoExame;
import br.unipar.projetolab.models.Exame;
import br.unipar.projetolab.models.Guia;
import br.unipar.projetolab.models.ResultadoExame;
import br.unipar.projetolab.utils.EntityManagerUtil;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.List;

public class CampoResultadoDAOImp implements CampoResultadoDAO {

    private EntityManager em;

    public CampoResultadoDAOImp(EntityManager em) {
        this.em = em;
    }

    @Override
    public CampoResultadoExame save(CampoResultadoExame c) {
        try {
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
            return c;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao salvar o campo do resultado do exame: " + e.getMessage());
        }
    }

    @Override
    public CampoResultadoExame update(CampoResultadoExame c) {
        try {
            em.getTransaction().begin();
            CampoResultadoExame atualizado = em.merge(c);
            em.getTransaction().commit();
            return atualizado;
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao atualizar o campo do resultado do exame: " + e.getMessage());
        }
    }

    @Override
    public boolean delete(CampoResultadoExame c) {
        try {
            em.getTransaction().begin();
            CampoResultadoExame remover = em.find(CampoResultadoExame.class, c.getId());
            if (remover != null) {
                em.remove(remover);
                em.getTransaction().commit();
                return true;
            } else {
                em.getTransaction().rollback();
                return false;
            }
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao remover o campo do resultado do exame: " + e.getMessage());
        }
    }

    @Override
    public List<CampoResultadoExame> findAll() {
        try {
            TypedQuery<CampoResultadoExame> query = em.createQuery("SELECT c FROM CampoResultadoExame c", CampoResultadoExame.class);
            return query.getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar todos os campos dos resultados de exames: " + e.getMessage());
        }
    }

    @Override
    public CampoResultadoExame findById(Long id) {
        try {
            return em.find(CampoResultadoExame.class, id);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar o campo do resultado do exame por ID: " + e.getMessage());
        }
    }

    @Override
    public List<CampoResultadoExame> findByGuia(String nomePaciente) {
        try {
            String jpql = "SELECT c FROM CampoResultadoExame c JOIN c.guia g WHERE LOWER(g.paciente.nome) LIKE :nome";
            return em.createQuery(jpql, CampoResultadoExame.class)
                    .setParameter("nome", "%" + nomePaciente.toLowerCase() + "%")
                    .getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar os campos de resultado do exame pela guia: " + e.getMessage());
        }
    }

    @Override
    public void inativarConvenio(CampoResultadoExame c) {
//        try {
//            em.getTransaction().begin();
//            CampoResultadoExame campo = em.find(CampoResultadoExame.class, c.getId());
//            if (campo != null) {
//                campo.setAtivo(false); // Supondo que há um atributo `ativo` na entidade
//                em.merge(campo);
//                em.getTransaction().commit();
//            } else {
//                em.getTransaction().rollback();
//                throw new RuntimeException("Campo não encontrado para inativação.");
//            }
//        } catch (Exception e) {
//            em.getTransaction().rollback();
//            throw new RuntimeException("Erro ao inativar o campo: " + e.getMessage());
//        }
    }
    public CampoResultadoExame findByEstruturaAndResultado(Long estruturaId, Long resultadoExameId) {
        try {
            return em.createQuery(
                    "SELECT c FROM CampoResultadoExame c WHERE c.estruturaExame.id = :estruturaId AND c.resultadoExame.id = :resultadoExameId",
                    CampoResultadoExame.class)
                    .setParameter("estruturaId", estruturaId)
                    .setParameter("resultadoExameId", resultadoExameId)
                    .getSingleResult();
        } catch (Exception e) {
            return null;
        }
    }

    @Override
    public void salvar(CampoResultadoExame campoResultadoExame) {
        try {
            em.getTransaction().begin();
            if (campoResultadoExame.getId() == null) {
                em.persist(campoResultadoExame);
            } else {
                em.merge(campoResultadoExame);
            }
            em.getTransaction().commit();
        } catch (Exception e) {
            em.getTransaction().rollback();
            throw new RuntimeException("Erro ao salvar o campo do resultado do exame", e);
        }
    }

    @Override
    public CampoResultadoExame buscarPorEstruturaEResultado(Long estruturaId, Long resultadoId) {
        try {
            return em.createQuery(
                    "SELECT c FROM CampoResultadoExame c WHERE c.estruturaExame.id = :estruturaId AND c.resultadoExame.id = :resultadoId",
                    CampoResultadoExame.class)
                    .setParameter("estruturaId", estruturaId)
                    .setParameter("resultadoId", resultadoId)
                    .getResultStream()
                    .findFirst()
                    .orElse(null);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar campo de resultado por estrutura e resultado", e);
        }
    }

    @Override
    public List<CampoResultadoExame> buscarPorResultadoExame(Long resultadoExameId) {
        try {
            return em.createQuery(
                    "SELECT c FROM CampoResultadoExame c WHERE c.resultadoExame.id = :resultadoId",
                    CampoResultadoExame.class)
                    .setParameter("resultadoId", resultadoExameId)
                    .getResultList();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar campos de resultado por resultado de exame", e);
        }
    }

    @Override
    public ResultadoExame criarOuBuscarResultadoExame(Long exameId, Long guiaId) {
        try {
            ResultadoExame resultadoExame = em.createQuery(
                    "SELECT r FROM ResultadoExame r WHERE r.exame.id = :exameId AND r.guia.id = :guiaId",
                    ResultadoExame.class)
                    .setParameter("exameId", exameId)
                    .setParameter("guiaId", guiaId)
                    .getResultStream()
                    .findFirst()
                    .orElse(null);

            if (resultadoExame == null) {
                resultadoExame = new ResultadoExame();
                resultadoExame.setExame(new Exame()); // Aqui você deve buscar o exame pelo ID ou passar um objeto completo
                resultadoExame.setGuia(new Guia()); // Aqui você deve buscar a guia pelo ID ou passar um objeto completo
                em.getTransaction().begin();
                em.persist(resultadoExame);
                em.getTransaction().commit();
            }
            return resultadoExame;
        } catch (Exception e) {
            throw new RuntimeException("Erro ao criar ou buscar resultado de exame", e);
        }
    }

}
