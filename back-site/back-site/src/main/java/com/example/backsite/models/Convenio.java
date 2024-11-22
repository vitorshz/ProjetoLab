package com.example.backsite.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import org.hibernate.annotations.ColumnDefault;

@Entity
@Table(name = "convenio")
public class Convenio {
    @Id
    @ColumnDefault("nextval('convenio_id_seq'::regclass)")
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "ativo", nullable = false)
    private Boolean ativo = false;

    @Column(name = "cei", length = 20)
    private String cei;

    @Column(name = "cep", length = 10)
    private String cep;

    @Column(name = "cnpj", length = 20)
    private String cnpj;

    @Column(name = "endereco")
    private String endereco;

    @Column(name = "fantasia", length = 100)
    private String fantasia;

    @Column(name = "nome", nullable = false, length = 100)
    private String nome;

    @Column(name = "observacoes")
    private String observacoes;

    @Column(name = "razaosocial", nullable = false, length = 100)
    private String razaosocial;

    @Column(name = "telefone", length = 20)
    private String telefone;

    @Column(name = "tipopessoa", nullable = false)
    private String tipopessoa;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Boolean getAtivo() {
        return ativo;
    }

    public void setAtivo(Boolean ativo) {
        this.ativo = ativo;
    }

    public String getCei() {
        return cei;
    }

    public void setCei(String cei) {
        this.cei = cei;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getRazaosocial() {
        return razaosocial;
    }

    public void setRazaosocial(String razaosocial) {
        this.razaosocial = razaosocial;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getTipopessoa() {
        return tipopessoa;
    }

    public void setTipopessoa(String tipopessoa) {
        this.tipopessoa = tipopessoa;
    }

}