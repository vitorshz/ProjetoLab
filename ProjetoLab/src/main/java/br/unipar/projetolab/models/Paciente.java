package br.unipar.projetolab.models;

import java.time.LocalDate;
import java.time.Period;
import javax.persistence.*;

@Entity
public class Paciente {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;

    @Column(unique = true, nullable = false, length = 14)
    private String cpf;

    private String endereco;

    private String telefone;
    
    @Column(nullable = false)
    private boolean ativo = true;  // Novo campo, por padrão todos pacientes são ativos

    @Column(length = 10)
    private String sexo;  // Masculino ou Feminino

    @Column(length = 2)
    private String tipoSangue;  // A, B, AB, O

    private String fatorRh; 
    
    public Paciente() {
    }

    public Paciente(Long id, String nome, LocalDate dataNascimento, String cpf, String endereco, String telefone, String sexo, String tipoSangue, String fatorRh) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.sexo = sexo;
        this.tipoSangue = tipoSangue;
        this.fatorRh = fatorRh;
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

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public boolean isAtivo() {
        return ativo;
    }

    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }
    
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getTipoSangue() {
        return tipoSangue;
    }

    public void setTipoSangue(String tipoSangue) {
        this.tipoSangue = tipoSangue;
    }

    public String getFatorRh() {
        return fatorRh;
    }

    public void setFatorRh(String fatorRh) {
        this.fatorRh = fatorRh;
    }
    
    
    public int calcularIdade() {
        if (dataNascimento == null) {
            return -1; // Retorna -1 para indicar que a data de nascimento não está definida
        }
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
}
