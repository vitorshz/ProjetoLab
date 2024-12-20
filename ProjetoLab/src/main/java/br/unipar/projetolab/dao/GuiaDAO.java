
package br.unipar.projetolab.dao;

import br.unipar.projetolab.models.Guia;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public interface GuiaDAO {

    Guia save(Guia guia);

    Guia update(Guia guia);

    boolean delete(Guia guia);

    Guia findById(Long id);

    List<Guia> findAll();
    
    List<Guia> findAllAtivos();
    
    List<Guia> findByDataCadastro(String dataCadastro);
    
    List<Guia> findByNomePaciente(String nomePaciente);
    
    List<Guia> buscarPorPeriodoESituacao(LocalDateTime dataInicial, LocalDateTime dataFinal, String situacao);

}
