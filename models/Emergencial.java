package models;

public class Emergencial extends Abrigo {
    public Emergencial(String nome, Endereco endereco, int capacidade) {
        super(nome, endereco, capacidade);
    }

    @Override
    public String getTipo() {
        return "Emergencial";
    }
}
