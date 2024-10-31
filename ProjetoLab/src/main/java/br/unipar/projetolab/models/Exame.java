
package br.unipar.projetolab.models;

import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "exames")
public class Exame {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, unique = true, length = 10)
    private String abreviacao;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(nullable = false)
    private Double precoPadrao;

    @Column(nullable = false, length = 50)
    private String tipoMaterial;

    @Column(length = 100)
    private String metodo;

    @Column(length = 50)
    private String amostra;

    public Exame() {
    }

    public Exame(Long id, String abreviacao, String nome, Double precoPadrao, String tipoMaterial, String metodo, String amostra, List<EstruturaExame> estruturas, List<ResultadoExame> resultados) {
        this.id = id;
        this.abreviacao = abreviacao;
        this.nome = nome;
        this.precoPadrao = precoPadrao;
        this.tipoMaterial = tipoMaterial;
        this.metodo = metodo;
        this.amostra = amostra;
        this.estruturas = estruturas;
        this.resultados = resultados;
    }

    // Relacionamento com EstruturaExame: Cada exame possui uma lista de estruturas
    @OneToMany(mappedBy = "exame", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<EstruturaExame> estruturas;

    // Relacionamento com ResultadoExame: Cada exame possui uma lista de resultados inseridos
    @OneToMany(mappedBy = "exame", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ResultadoExame> resultados;

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPrecoPadrao() {
        return precoPadrao;
    }

    public void setPrecoPadrao(Double precoPadrao) {
        this.precoPadrao = precoPadrao;
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }

    public String getMetodo() {
        return metodo;
    }

    public void setMetodo(String metodo) {
        this.metodo = metodo;
    }

    public String getAmostra() {
        return amostra;
    }

    public void setAmostra(String amostra) {
        this.amostra = amostra;
    }

    public List<EstruturaExame> getEstruturas() {
        return estruturas;
    }

    public void setEstruturas(List<EstruturaExame> estruturas) {
        this.estruturas = estruturas;
    }

    public List<ResultadoExame> getResultados() {
        return resultados;
    }

    public void setResultados(List<ResultadoExame> resultados) {
        this.resultados = resultados;
    }
    
    public void addEstrutura(EstruturaExame estrutura) {
        estruturas.add(estrutura);
        estrutura.setExame(this); // Define o exame relacionado na estrutura
    }

    public void removeEstrutura(EstruturaExame estrutura) {
        estruturas.remove(estrutura);
        estrutura.setExame(null); // Remove a referência ao exame
    }

    public void addResultado(ResultadoExame resultado) {
        resultados.add(resultado);
        resultado.setExame(this); // Define o exame relacionado no resultado
    }

    public void removeResultado(ResultadoExame resultado) {
        resultados.remove(resultado);
        resultado.setExame(null); // Remove a referência ao exame
    }
}
