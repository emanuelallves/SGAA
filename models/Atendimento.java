package models;

public abstract class Atendimento {
    private String data;
    private String observacoes;
    private PessoaAcolhida pessoa;
    private Profissional profissional;

    public Atendimento(String data, String observacoes, PessoaAcolhida pessoa, Profissional profissional) {
        this.data = data;
        this.observacoes = observacoes;
        this.pessoa = pessoa;
        this.profissional = profissional;
    }

    public Atendimento(String data, PessoaAcolhida pessoa, Profissional profissional) {
        this.data = data;
        this.pessoa = pessoa;
        this.profissional = profissional;
        this.observacoes = null;
    }

    public String getData() {
        return data;
    }
    public void setData(String data) {
        this.data = data;
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

    public abstract String getTipo();
    
}
