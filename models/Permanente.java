package models;

public class Permanente extends Abrigo {
    public Permanente(String nome, Endereco endereco, int capacidade) {
        super(nome, endereco, capacidade);
    }

    @Override
    public String getTipo() {
        return "Permanente";
    }
}
