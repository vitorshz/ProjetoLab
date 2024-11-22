package com.example.backsite.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "campos_resultado_exame")
public class CamposResultadoExame {
    @Id
    @ColumnDefault("nextval('campos_resultado_exame_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "valor")
    private String valor;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "estrutura_exame_id", nullable = false)
    private EstruturaExame estruturaExame;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "resultado_exame_id", nullable = false)
    private ResultadosExame resultadoExame;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public EstruturaExame getEstruturaExame() {
        return estruturaExame;
    }

    public void setEstruturaExame(EstruturaExame estruturaExame) {
        this.estruturaExame = estruturaExame;
    }

    public ResultadosExame getResultadoExame() {
        return resultadoExame;
    }

    public void setResultadoExame(ResultadosExame resultadoExame) {
        this.resultadoExame = resultadoExame;
    }

}