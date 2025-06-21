package models;

import interfaces.StatusVaga;

public class Vaga implements StatusVaga{
    private boolean ocupada;
    private PessoaAcolhida pessoa;

    public Vaga() {
        this.ocupada = false;
        this.pessoa = null;
    }

    public boolean isOcupada() {
        return ocupada;
    }

    public PessoaAcolhida getPessoa() {
        return pessoa;
    }
    public void setPessoa(PessoaAcolhida pessoa) {
        this.pessoa = pessoa;
    }

    @Override
    public void ocupar(PessoaAcolhida pessoa) {
        this.pessoa = pessoa;
        this.ocupada = true;
    }

    @Override
    public void liberar() {
        this.pessoa = null;
        this.ocupada = false;
    }
    
}
