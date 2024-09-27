package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Operador;
import java.util.List;

public interface OperadorDAO {
    Operador save(Operador operador);
    Operador update(Operador operador);
    Boolean delete(Operador operador);
    
    Operador findById(Long id);
    List<Operador> findAll();
}
