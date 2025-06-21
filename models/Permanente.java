package models;

public class Permanente extends Abrigo {
    private int tempoMinimoMeses;

    public Permanente(String nome, Endereco endereco, int capacidade, int tempoMinimoMeses) {
        super(nome, endereco, capacidade);
        this.tempoMinimoMeses = tempoMinimoMeses;
    }

    public int getTempoMinimoMeses() {
        return tempoMinimoMeses;
    }
    public void setTempoMinimoMeses(int tempoMinimoMeses) {
        this.tempoMinimoMeses = tempoMinimoMeses;
    }

    @Override
    public String getTipo() {
        return "Permanente";
    }

}
