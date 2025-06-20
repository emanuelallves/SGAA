package models;

public class Atendimento {
    private String data;
    private String tipo;
    private String observacoes;
    private PessoaAcolhida pessoa;
    private Profissional profissional;

    public Atendimento(String data, String tipo, String observacoes, PessoaAcolhida pessoa, Profissional profissional) {
        this.data = data;
        this.tipo = tipo;
        this.observacoes = observacoes;
        this.pessoa = pessoa;
        this.profissional = profissional;
    }

    public Atendimento(String data, String tipo, PessoaAcolhida pessoa, Profissional profissional) {
        this.data = data;
        this.tipo = tipo;
        this.pessoa = pessoa;
        this.profissional = profissional;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getObservacoes() {
        return observacoes;
    }
    public void setObservacoes(String observacoes) {
        this.observacoes = observacoes;
    }

    public PessoaAcolhida getPessoa() {
        return pessoa;
    }
    public void setPessoa(PessoaAcolhida pessoa) {
        this.pessoa = pessoa;
    }

    public Profissional getProfissional() {
        return profissional;
    }
    public void setProfissional(Profissional profissional) {
        this.profissional = profissional;
    }

    
}
