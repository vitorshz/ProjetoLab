package br.unipar.projetolab.models;

import java.time.LocalDate;
import javax.persistence.*;

@Entity
public class Medico {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(name = "conselho_crm", nullable = false, length = 15, unique = true)
    private String conselhoCrm;

    @Column(nullable = false, length = 50)
    private String especialidade;  // Ex: Cardiologia, Pediatria, etc.

    @Column(nullable = false, length = 50)
    private String tipo;  // Ex: Dr, Dra

    @Column(nullable = false, length = 14, unique = true)
    private String cpf;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(length = 15)
    private String celular;

    @Column(length = 100)
    private String email;

    @Column(length = 500)
    private String observacoes;  // Campo para observações ou comentários

    @Column(length = 200) // Tamanho apropriado para um endereço
    private String endereco;  // Novo campo para o endereço

    @Column(nullable = false)
    private boolean ativo = true;  // Todos os médicos são ativos por padrão

    public Medico() {
    }

    public Medico(Long id, String nome, String conselhoCrm, String especialidade, String tipo, String cpf, LocalDate dataNascimento, String celular, String email, String observacoes, String endereco) {
        this.id = id;
        this.nome = nome;
        this.conselhoCrm = conselhoCrm;
        this.especialidade = especialidade;
        this.tipo = tipo;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
        this.celular = celular;
        this.email = email;
        this.observacoes = observacoes;
        this.endereco = endereco;  // Inicializa o novo campo
    }

    // Getters e Setters

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

    public String getConselhoCrm() {
        return conselhoCrm;
    }

    public void setConselhoCrm(String conselhoCrm) {
        this.conselhoCrm = conselhoCrm;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getCelular() {
        return celular;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getObservacoes() {
        return observacoes;
    }

    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco; // Getter e setter para o novo campo
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
}
