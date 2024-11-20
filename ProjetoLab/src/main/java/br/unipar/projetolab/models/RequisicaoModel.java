
package br.unipar.projetolab.models;

import java.util.ArrayList;
import java.util.List;

public class RequisicaoModel {
    private Paciente pacienteSelecionado;
    private Medico medicoSelecionado;
    private Convenio convenioSelecionado;
    private Guia guiaselecionada;
    private List<GuiaExame> exames; // Lista de exames adicionados à guia
    private String cartaoSUS;
    private String situacao;
    private String procedimento;
    private String dataRequisicao;
    private String faturamento;
    private double valorTotal;
    private double valorPago;
    private double valorDevido;
    
    public RequisicaoModel() {
        exames = new ArrayList<>();
    }

    // Getters e Setters
    public Paciente getPacienteSelecionado() {
        return pacienteSelecionado;
    }

    public void setPacienteSelecionado(Paciente pacienteSelecionado) {
        this.pacienteSelecionado = pacienteSelecionado;
    }

    public Medico getMedicoSelecionado() {
        return medicoSelecionado;
    }

    public void setMedicoSelecionado(Medico medicoSelecionado) {
        this.medicoSelecionado = medicoSelecionado;
    }

    public Convenio getConvenioSelecionado() {
        return convenioSelecionado;
    }

    public void setConvenioSelecionado(Convenio convenioSelecionado) {
        this.convenioSelecionado = convenioSelecionado;
    }

    public List<GuiaExame> getExames() {
        return exames;
    }

    public void addExame(GuiaExame exame) {
        exames.add(exame);
    }

    public String getCartaoSUS() {
        return cartaoSUS;
    }

    public void setCartaoSUS(String cartaoSUS) {
        this.cartaoSUS = cartaoSUS;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getProcedimento() {
        return procedimento;
    }

    public void setProcedimento(String procedimento) {
        this.procedimento = procedimento;
    }

    public String getDataRequisicao() {
        return dataRequisicao;
    }

    public void setDataRequisicao(String dataRequisicao) {
        this.dataRequisicao = dataRequisicao;
    }

    public String getFaturamento() {
        return faturamento;
    }

    public void setFaturamento(String faturamento) {
        this.faturamento = faturamento;
    }

    public Guia getGuiaselecionada() {
        return guiaselecionada;
    }

    public void setGuiaselecionada(Guia guiaselecionada) {
        this.guiaselecionada = guiaselecionada;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public double getValorPago() {
        return valorPago;
    }

    public void setValorPago(double valorPago) {
        this.valorPago = valorPago;
    }

    public double getValorDevido() {
        return valorDevido;
    }

    public void setValorDevido(double valorDevido) {
        this.valorDevido = valorDevido;
    }


    
    
}

