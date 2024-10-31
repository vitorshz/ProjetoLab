package br.unipar.projetolab.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "campos_resultado_exame")
public class CampoResultadoExame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "resultado_exame_id", nullable = false)
    private ResultadoExame resultadoExame;

    @ManyToOne
    @JoinColumn(name = "estrutura_exame_id", nullable = false)
    private EstruturaExame estruturaExame;

    @Column(length = 255)
    private String valor;

    // Construtor vazio para JPA
    public CampoResultadoExame() {
    }

    // Construtor com parâmetros
    public CampoResultadoExame(ResultadoExame resultadoExame, EstruturaExame estruturaExame, String valor) {
        this.resultadoExame = resultadoExame;
        this.estruturaExame = estruturaExame;
        this.valor = valor;
    }

    // Getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ResultadoExame getResultadoExame() {
        return resultadoExame;
    }

    public void setResultadoExame(ResultadoExame resultadoExame) {
        this.resultadoExame = resultadoExame;
    }

    public EstruturaExame getEstruturaExame() {
        return estruturaExame;
    }

    public void setEstruturaExame(EstruturaExame estruturaExame) {
        this.estruturaExame = estruturaExame;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}
