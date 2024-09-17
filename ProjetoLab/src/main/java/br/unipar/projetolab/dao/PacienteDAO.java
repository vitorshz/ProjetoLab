package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Paciente;
import java.util.List;

public interface PacienteDAO {
    Paciente save(Paciente paciente);
    Paciente update(Paciente paciente);
    Boolean delete(Paciente paciente);
    
    Paciente findById(Integer id); 
    List<Paciente> findAll();
}
