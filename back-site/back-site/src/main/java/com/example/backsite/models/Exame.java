package com.example.backsite.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "exame")
public class Exame {
    @Id
    @ColumnDefault("nextval('exame_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "abreviacao", nullable = false, length = 10)
    private String abreviacao;

    @Column(name = "amostra", length = 50)
    private String amostra;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo = false;

    @Column(name = "metodo", length = 100)
    private String metodo;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "precopadrao", nullable = false)
    private Double precopadrao;

    @Column(name = "tipomaterial", nullable = false, length = 50)
    private String tipomaterial;

    public Exame(Long exameId) {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAbreviacao() {
        return abreviacao;
    }

    public void setAbreviacao(String abreviacao) {
        this.abreviacao = abreviacao;
    }

    public String getAmostra() {
        return amostra;
    }

    public void setAmostra(String amostra) {
        this.amostra = amostra;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecopadrao() {
        return precopadrao;
    }

    public void setPrecopadrao(Double precopadrao) {
        this.precopadrao = precopadrao;
    }

    public String getTipomaterial() {
        return tipomaterial;
    }

    public void setTipomaterial(String tipomaterial) {
        this.tipomaterial = tipomaterial;
    }

}