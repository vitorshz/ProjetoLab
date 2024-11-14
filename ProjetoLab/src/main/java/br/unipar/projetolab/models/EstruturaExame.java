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
@Table(name = "estrutura_exame")
public class EstruturaExame {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "exame_id", nullable = false)
    private Exame exame;

    @Column(name = "ordem", nullable = false)
    private Integer ordem;

    @Column(length = 5)
    private String variavel;  // Representa o "Var" na interface

    @Column(nullable = false, length = 20)
    private String tipo;

    @Column(length = 100)
    private String texto;

    @Column(length = 20)
    private String unidade;

    @Column(length = 100)
    private String calculo;

    @Column(length = 100)
    private String referencias;

    @Column
    private Boolean obrigatorio;

    @Column(length = 50)
    private String maximo;

    @Column(length = 50)
    private String grupo;

    @Column(name = "valor_padrao", length = 50)
    private String valorPadrao;
    
    
    // Construtor vazio para JPA
    public EstruturaExame() {
    }

    // Construtor com parâmetros para inicialização rápida
    public EstruturaExame(Integer ordem, String variavel, String tipo, String texto, String unidade,
                          String calculo, String referencias, Boolean obrigatorio, String maximo,
                          String grupo, String valorPadrao) {
        this.ordem = ordem;
        this.variavel = variavel;
        this.tipo = tipo;
        this.texto = texto;
        this.unidade = unidade;
        this.calculo = calculo;
        this.referencias = referencias;
        this.obrigatorio = obrigatorio;
        this.maximo = maximo;
        this.grupo = grupo;
        this.valorPadrao = valorPadrao;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Integer getOrdem() {
        return ordem;
    }

    public void setOrdem(Integer ordem) {
        this.ordem = ordem;
    }

    public String getVariavel() {
        return variavel;
    }

    public void setVariavel(String variavel) {
        this.variavel = variavel;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getCalculo() {
        return calculo;
    }

    public void setCalculo(String calculo) {
        this.calculo = calculo;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public Boolean getObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(Boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public String getMaximo() {
        return maximo;
    }

    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }

    public String getGrupo() {
        return grupo;
    }

    public void setGrupo(String grupo) {
        this.grupo = grupo;
    }

    public String getValorPadrao() {
        return valorPadrao;
    }

    public void setValorPadrao(String valorPadrao) {
        this.valorPadrao = valorPadrao;
    }
    
}
