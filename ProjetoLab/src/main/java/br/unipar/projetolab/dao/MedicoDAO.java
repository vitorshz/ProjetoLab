package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Medico;
import java.util.List;

public interface MedicoDAO {
    Medico save(Medico medico);
    Medico update(Medico medico);
    Boolean delete(Medico medico);
    
    Medico findById(Long id); 
    List<Medico> findAll();
    List<Medico> findAllAtivos();
    List<Medico> findByName(String nome);
}
