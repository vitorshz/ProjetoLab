package br.unipar.projetolab.models;


public class EstruturaExameLinha {
    private int ordem;
    private String var;
    private String tipo;
    private String texto;
    private String unidade;
    private String calculo;
    private String referencias;
    private String maximo;
    private boolean obrigatorio;
    private String vlPadrao;

    public EstruturaExameLinha() {
    }

    public EstruturaExameLinha(int ordem, String var, String tipo, String texto, String unidade, String calculo, String referencias, String maximo, boolean obrigatorio, String vlPadrao) {
        this.ordem = ordem;
        this.var = var;
        this.tipo = tipo;
        this.texto = texto;
        this.unidade = unidade;
        this.calculo = calculo;
        this.referencias = referencias;
        this.maximo = maximo;
        this.obrigatorio = obrigatorio;
        this.vlPadrao = vlPadrao;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    public String getVar() {
        return var;
    }

    public void setVar(String var) {
        this.var = var;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTexto() {
        return texto;
    }

    public void setTexto(String texto) {
        this.texto = texto;
    }

    public String getUnidade() {
        return unidade;
    }

    public void setUnidade(String unidade) {
        this.unidade = unidade;
    }

    public String getCalculo() {
        return calculo;
    }

    public void setCalculo(String calculo) {
        this.calculo = calculo;
    }

    public String getReferencias() {
        return referencias;
    }

    public void setReferencias(String referencias) {
        this.referencias = referencias;
    }

    public String getMaximo() {
        return maximo;
    }

    public void setMaximo(String maximo) {
        this.maximo = maximo;
    }

    public boolean isObrigatorio() {
        return obrigatorio;
    }

    public void setObrigatorio(boolean obrigatorio) {
        this.obrigatorio = obrigatorio;
    }

    public String getVlPadrao() {
        return vlPadrao;
    }

    public void setVlPadrao(String vlPadrao) {
        this.vlPadrao = vlPadrao;
    }
    
}
