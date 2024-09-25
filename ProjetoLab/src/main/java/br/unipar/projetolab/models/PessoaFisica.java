package br.unipar.projetolab.models;
import javax.persistence.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
    
@Entity
@Table(name = "pessoa_fisica")
public class PessoaFisica extends Pessoa {

    @Column(name = "data_nascimento", nullable = false)
    @Temporal(TemporalType.DATE)  
    private Date dataNasc;

    @Column(name = "rg", nullable = false, length = 9)
    private char[] rg;

    @Column(name = "cpf", nullable = false, length = 11, unique = true)
    private char[] cpf;

    @Column(name = "sexo", nullable = false)
    private char sexo;

    @Column(name = "celular", length = 11)
    private char[] celular;

   

    public void setRg(String doc) {
        char[] rg = doc.toCharArray();
        if (rg.length == 9) {
            this.rg = rg;
        } else {
            System.out.println("RG INVÁLIDO");
        }
    }

    public void setCpf(String doc) {
        char[] cpf = doc.toCharArray();
        if (cpf.length == 11) {
            this.cpf = cpf;
        } else {
            System.out.println("CPF INVÁLIDO");
        }
    }

    public String getCpf() {
        return new String(cpf);
    }

    public String getRg() {
        return new String(rg);
    }

    public void setCelular(String num) {
        if (num != null) {
            char[] cel = num.toCharArray();
            if (cel.length == 11) {
                this.celular = cel;
            } else {
                System.out.println("Celular inválido");
            }
        } else {
            this.celular = null;
        }
    }

    public String getCelular() {
        return this.celular != null ? new String(celular) : null;
    }

    public void setSexo(char s) {
        if (s == 'F' || s == 'M') {
            this.sexo = s;
        } else {
            System.out.println("Sexo INVÁLIDO");
        }
    }

    public char getSexo() {
        return sexo;
    }

    public String getDataNasc() {
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        return df.format(dataNasc);
    }

    public Date getDataNascDate() {
        return this.dataNasc;
    }

    public java.sql.Date getDataNascDateObj() {
        return new java.sql.Date(dataNasc.getTime());
    }

    public void setDataNasc(Date d) {
        this.dataNasc = d;
    }

    public static Date FormatarData(String data_s) throws ParseException {
        SimpleDateFormat df = new SimpleDateFormat("dd-MM-yyyy");
        return df.parse(data_s);
    }
}

