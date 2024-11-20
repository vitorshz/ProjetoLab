
package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.CampoResultadoExame;
import br.unipar.projetolab.models.Convenio;
import java.util.List;


public interface CampoResultadoDAO {
    public CampoResultadoExame save(CampoResultadoExame c);
    
    CampoResultadoExame update(CampoResultadoExame guia);

    boolean delete(CampoResultadoExame guia);
    
    public List<CampoResultadoExame> findAll();

    public CampoResultadoExame findById(Long id);
    
    List<CampoResultadoExame> findByGuia(String nomePaciente);

    public void inativarConvenio(CampoResultadoExame c);
}
