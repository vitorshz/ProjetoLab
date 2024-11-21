
package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.ResultadoExame;
import java.util.List;

public interface ResultadoExameDAO {
    List<ResultadoExame> buscarPorGuia(Long guiaId);

    ResultadoExame buscarPorGuiaEExame(Long guiaId, Long exameId);

    void salvar(ResultadoExame resultadoExame);

    void remover(ResultadoExame resultadoExame);
}
