package models;

public class Profissional {
    private String nome;
    private String tipo;
    private Contato contato;

    public Profissional(String nome, String tipo, Contato contato) {
        this.nome = nome;
        this.tipo = tipo;
        this.contato = contato;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }

    
}
