package models;

public class Temporario extends Abrigo {
    public Temporario(String nome, Endereco endereco, int capacidade) {
        super(nome, endereco, capacidade);
    }

    @Override
    public String getTipo() {
        return "Temporário";
    }
}
