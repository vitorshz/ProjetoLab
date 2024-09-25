package br.unipar.projetolab.models;

import javax.persistence.*;

@Entity
@Table(name = "usuario")
public class Usuario extends PessoaFisica {

    @Column(name = "login", nullable = false, unique = true, length = 50)
    private String login;

    @Column(name = "senha", nullable = false, length = 100)
    private String senha;

   
    public Usuario() {}

   
    public Usuario(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

   
    public void setLogin(String login) {
        this.login = login;
    }

    public String getLogin() {
        return login;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getSenha() {
        return senha;
    }

   
    public boolean equals(Usuario u) {
        if (u == null) {
            return false;
        } else if (u.getLogin().equals(this.getLogin()) && u.getSenha().equals(this.getSenha())) {
            return true;
        }
        return false;
    }
}