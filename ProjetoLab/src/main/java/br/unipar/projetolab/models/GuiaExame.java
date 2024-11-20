package br.unipar.projetolab.models;

import javax.persistence.*;

@Entity
public class GuiaExame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "guia_id", nullable = false)
    private Guia guia;

    @ManyToOne(optional = false)
    @JoinColumn(name = "exame_id", nullable = false)
    private Exame exame;

    @Column(nullable = false)
    private Double preco;

    @Column(nullable = false, length = 50)
    private String status; // Indica a situação do exame: "Sem Resultado", "Incluído", "Impresso"

    public GuiaExame() {
    }

    public GuiaExame(Guia guia, Exame exame, Double preco, String status) {
        this.guia = guia;
        this.exame = exame;
        this.preco = preco;
        this.status = "Sem Resultado";
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Guia getGuia() {
        return guia;
    }

    public void setGuia(Guia guia) {
        this.guia = guia;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
