package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.EstruturaExame;
import java.util.List;

public interface EstruturaExameDAO {
    EstruturaExame save(EstruturaExame e);

    EstruturaExame update(EstruturaExame e);

    Boolean delete(EstruturaExame e);

    EstruturaExame findById(Long id);

    List<EstruturaExame> findAll();

    List<EstruturaExame> findAllAtivos();

    List<EstruturaExame> findByName(String nome);
}
