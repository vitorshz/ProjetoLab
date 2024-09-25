/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.unipar.projetolab.models;

import javax.persistence.*;

@Entity
@Table(name = "paciente")
public class Paciente extends PessoaFisica {

  
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "id_responsavel_financeiro")
    private Pessoa respFin;

    
    public Paciente() {}

    
    public Paciente(PessoaFisica pf) {
        this.setCelular(pf.getCelular());
        this.setCpf(pf.getCpf());
        this.setDataNasc(pf.getDataNascDate());
        this.setEmail(pf.getEmail());
        this.setEndereco(pf.getEndereco());
        this.setIdPessoa(pf.getIdPessoa());
        this.setNome(pf.getNome());
        this.setRg(pf.getRg());
        this.setSexo(pf.getSexo());
        this.setStatus(pf.getStatus());
    }

    
    public void setRespFin(Pessoa p) {
        this.respFin = p;
    }

    public Pessoa getRespFin() {
        return respFin;
    }
}
