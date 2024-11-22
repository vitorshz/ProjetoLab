package com.example.backsite.repository;
import com.example.backsite.models.ResultadosExame;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ResultadosExameRepository extends JpaRepository<ResultadosExame, Long> {
    // Busca por guia (para listar todos os resultados de uma guia específica)
    List<ResultadosExame> findByGuiaId(Long guiaId);

    // Busca por exame (caso necessário encontrar resultados por tipo de exame)
    List<ResultadosExame> findByExameId(Long exameId);

    // Busca por guia e exame (caso específico de consulta cruzada)
    List<ResultadosExame> findByGuiaIdAndExameId(Long guiaId, Long exameId);
}
