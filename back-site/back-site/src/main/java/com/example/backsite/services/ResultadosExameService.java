package com.example.backsite.services;

import com.example.backsite.models.ResultadosExame;
import com.example.backsite.repository.ResultadosExameRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResultadosExameService {

    private final ResultadosExameRepository resultadosExameRepository;

    public ResultadosExameService(ResultadosExameRepository resultadosExameRepository) {
        this.resultadosExameRepository = resultadosExameRepository;
    }

    public ResultadosExame salvar(ResultadosExame resultadoExame) {
        return resultadosExameRepository.save(resultadoExame);
    }

    public List<ResultadosExame> buscarPorGuiaId(Long guiaId) {
        return resultadosExameRepository.findByGuiaId(guiaId);
    }

    public List<ResultadosExame> buscarPorExameId(Long exameId) {
        return resultadosExameRepository.findByExameId(exameId);
    }

    public List<ResultadosExame> buscarPorGuiaEExame(Long guiaId, Long exameId) {
        return resultadosExameRepository.findByGuiaIdAndExameId(guiaId, exameId);
    }

}
