package com.example.backsite.models;

import jakarta.persistence.*;
import org.hibernate.annotations.ColumnDefault;

import java.time.Instant;

@Entity
@Table(name = "guia")
public class Guia {
    @Id
    @ColumnDefault("nextval('guia_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "cartao_sus")
    private String cartaoSus;

    @Column(name = "datacadastro", nullable = false)
    private Instant datacadastro;

    @Column(name = "dataconclusao")
    private Instant dataconclusao;

    @Column(name = "particular", nullable = false)
    private Boolean particular = false;

    @Column(name = "valordevido")
    private Double valordevido;

    @Column(name = "valorpago")
    private Double valorpago;

    @Column(name = "valortotal")
    private Double valortotal;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "convenio_id")
    private Convenio convenio;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

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

}