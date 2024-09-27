package br.unipar.projetolab.models;

import br.unipar.projetolab.enums.TipoPessoa;
import javax.persistence.*;

@Entity
public class Convenio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false, length = 100)
    private String razaoSocial;

    @Column(name = "telefone", length = 20)
    private String telefone;

    @Column(name = "cnpj", length = 20) 
    private String cnpj;

    @Column(name = "cei", length = 20)
    private String cei;

    @Column(name = "cep", length = 10)
    private String cep;

    @Column(length = 255)
    private String endereco;

    @Column(length = 255)
    private String observacoes;

    @Column(nullable = false)
    private boolean ativo = true;
    
    @Column(nullable = true, length = 100) 
    private String fantasia;
    
    @Enumerated(EnumType.STRING) 
    @Column(nullable = false)
    private TipoPessoa tipoPessoa;
    
    // Getters e Setters

    public Convenio() {
    }

    public Convenio(Long id, String nome, String razaoSocial, String telefone, String cnpj, String cei, String cep, String endereco, String observacoes, String fantasia, TipoPessoa tipoPessoa) {
        this.id = id;
        this.nome = nome;
        this.razaoSocial = razaoSocial;
        this.telefone = telefone;
        this.cnpj = cnpj;
        this.cei = cei;
        this.cep = cep;
        this.endereco = endereco;
        this.observacoes = observacoes;
        this.fantasia = fantasia;
        this.tipoPessoa = tipoPessoa;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getCei() {
        return cei;
    }

    public void setCei(String cei) {
        this.cei = cei;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String getFantasia() {
        return fantasia;
    }

    public void setFantasia(String fantasia) {
        this.fantasia = fantasia;
    }

    public TipoPessoa getTipoPessoa() {
        return tipoPessoa;
    }

    public void setTipoPessoa(TipoPessoa tipoPessoa) {
        this.tipoPessoa = tipoPessoa;
    }
    
}
