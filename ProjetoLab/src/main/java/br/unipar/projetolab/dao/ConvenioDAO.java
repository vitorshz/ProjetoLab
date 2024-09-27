
package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Convenio;
import java.util.List;


public interface ConvenioDAO {
    public Convenio save(Convenio c);
    public List<Convenio> findAll();
    public Convenio findById(Long id);
    public void inativarConvenio(Convenio convenio);
}
