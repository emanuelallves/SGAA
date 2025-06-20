package models;

public class Vaga {
    private boolean ocupada;
    private PessoaAcolhida pessoa;

    public Vaga() {
        this.ocupada = false;
        this.pessoa = null;
    }

    public boolean isOcupada() {
        return ocupada;
    }
    public void ocupar(PessoaAcolhida pessoa) {
        this.pessoa = pessoa;
        this.ocupada = true;
    }
    public void liberar() {
        this.pessoa = null;
        this.ocupada = false;
    }

    public PessoaAcolhida getPessoa() {
        return pessoa;
    }

    
}
