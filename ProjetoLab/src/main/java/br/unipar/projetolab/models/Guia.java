package br.unipar.projetolab.models;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
public class Guia {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "paciente_id", nullable = false)
    private Paciente paciente;

    @ManyToOne(optional = false)
    @JoinColumn(name = "medico_id", nullable = false)
    private Medico medico;

    @ManyToOne
    @JoinColumn(name = "convenio_id")
    private Convenio convenio; // Pode ser nulo caso o convênio seja particular

    @OneToMany(mappedBy = "guia", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<GuiaExame> exames; // Relação com os exames incluídos na guia

    @Column(nullable = false)
    private LocalDateTime dataCadastro; // Data em que a guia foi cadastrada

    @Column
    private LocalDateTime dataConclusao; // Data em que os exames foram concluídos (opcional)

    @Column(nullable = false)
    private boolean particular; // Indica se o convênio é particular (true) ou não (false)

    @Column
    private Double valorTotal; // Valor total dos exames (apenas para particulares)

    @Column
    private Double valorPago; // Valor pago pelo paciente (apenas para particulares)

    @Column
    private Double valorDevido; // Valor devido (apenas para particulares)
    
    @Column(name = "cartao_sus")
    private String cartaoSUS;
    
    public Guia() {
    }

    // Construtor com parâmetros
    public Guia(Paciente paciente, Medico medico, Convenio convenio, boolean particular, Double valorTotal, Double valorPago, Double valorDevido) {
        this.paciente = paciente;
        this.medico = medico;
        this.convenio = convenio;
        this.particular = particular;
        this.valorTotal = valorTotal;
        this.valorPago = valorPago;
        this.valorDevido = valorDevido;
        this.dataCadastro = LocalDateTime.now(); // Registra automaticamente a data de criação
    }

    // Getters e Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Convenio getConvenio() {
        return convenio;
    }

    public void setConvenio(Convenio convenio) {
        this.convenio = convenio;
    }

    public List<GuiaExame> getExames() {
        return exames;
    }

    public void setExames(List<GuiaExame> exames) {
        this.exames = exames;
    }

    public LocalDateTime getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(LocalDateTime dataCadastro) {
        this.dataCadastro = dataCadastro;
    }

    public LocalDateTime getDataConclusao() {
        return dataConclusao;
    }

    public void setDataConclusao(LocalDateTime dataConclusao) {
        this.dataConclusao = dataConclusao;
    }

    public boolean isParticular() {
        return particular;
    }

    public void setParticular(boolean particular) {
        this.particular = particular;
    }

    public Double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(Double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Double getValorPago() {
        return valorPago;
    }

    public void setValorPago(Double valorPago) {
        this.valorPago = valorPago;
    }

    public Double getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(Double valorDevido) {
        this.valorDevido = valorDevido;
    }
    // Getter e Setter
    public String getCartaoSUS() {
        return cartaoSUS;
    }

    public void setCartaoSUS(String cartaoSUS) {
        this.cartaoSUS = cartaoSUS;
    }
}

