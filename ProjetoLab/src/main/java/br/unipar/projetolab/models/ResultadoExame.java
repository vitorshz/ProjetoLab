package br.unipar.projetolab.models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "resultados_exame")
public class ResultadoExame {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "exame_id", nullable = false)
    private Exame exame;

    @OneToMany(mappedBy = "resultadoExame", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<CampoResultadoExame> camposResultado;

    // Construtor vazio para JPA
    public ResultadoExame() {
    }

    public ResultadoExame(Exame exame) {
        this.exame = exame;
    }

    // Getters e setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Exame getExame() {
        return exame;
    }

    public void setExame(Exame exame) {
        this.exame = exame;
    }

    public List<CampoResultadoExame> getCamposResultado() {
        return camposResultado;
    }

    public void setCamposResultado(List<CampoResultadoExame> camposResultado) {
        this.camposResultado = camposResultado;
    }

    public void addCampoResultado(CampoResultadoExame campoResultado) {
        camposResultado.add(campoResultado);
        campoResultado.setResultadoExame(this);
    }
}
