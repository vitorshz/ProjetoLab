package com.example.backsite.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;
import java.util.List;

@Entity
@Table(name = "guia")
public class Guia {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String cartaoSus;
    private Instant datacadastro;
    private Instant dataconclusao;

    private Boolean particular;
    private Double valordevido;
    private Double valorpago;
    private Double valortotal;

    @ManyToOne(fetch = FetchType.LAZY)
    private Convenio convenio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    private Paciente paciente;

    @OneToMany(mappedBy = "guia", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ResultadosExame> resultadosExames;

    public Guia(Long guiaId) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCartaoSus() {
        return cartaoSus;
    }

    public void setCartaoSus(String cartaoSus) {
        this.cartaoSus = cartaoSus;
    }

    public Instant getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(Instant datacadastro) {
        this.datacadastro = datacadastro;
    }

    public Instant getDataconclusao() {
        return dataconclusao;
    }

    public void setDataconclusao(Instant dataconclusao) {
        this.dataconclusao = dataconclusao;
    }

    public Boolean getParticular() {
        return particular;
    }

    public void setParticular(Boolean particular) {
        this.particular = particular;
    }

    public Double getValordevido() {
        return valordevido;
    }

    public void setValordevido(Double valordevido) {
        this.valordevido = valordevido;
    }

    public Double getValorpago() {
        return valorpago;
    }

    public void setValorpago(Double valorpago) {
        this.valorpago = valorpago;
    }

    public Double getValortotal() {
        return valortotal;
    }

    public void setValortotal(Double valortotal) {
        this.valortotal = valortotal;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public List<ResultadosExame> getResultadosExames() {
        return resultadosExames;
    }

    public void setResultadosExames(List<ResultadosExame> resultadosExames) {
        this.resultadosExames = resultadosExames;
    }
}