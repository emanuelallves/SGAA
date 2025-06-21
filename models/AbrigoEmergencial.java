package models;

public class AbrigoEmergencial extends Abrigo {
    private int duracaoMaximaDias;

    public AbrigoEmergencial(String nome, Endereco endereco, int capacidade, int duracaoMaximaDias) {
        super(nome, endereco, capacidade);
        this.duracaoMaximaDias = duracaoMaximaDias;
    }

    public int getDuracaoMaximaDias() {
        return duracaoMaximaDias;
    }
    public void setDuracaoMaximaDias(int duracaoMaximaDias) {
        this.duracaoMaximaDias = duracaoMaximaDias;
    }

    @Override
    public String getTipo() {
        return "Emergencial";
    }

}