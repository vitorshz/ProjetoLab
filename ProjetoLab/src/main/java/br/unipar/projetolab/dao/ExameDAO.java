package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Exame;
import java.util.List;


public interface ExameDAO {
    Exame save(Exame e);
    Exame update(Exame e);
    Boolean delete(Exame e);
    
    Exame findById(Long id); 
    List<Exame> findAll();
    List<Exame> findAllAtivos();
    List<Exame> findByName(String nome);
}
