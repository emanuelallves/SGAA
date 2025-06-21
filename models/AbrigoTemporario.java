package models;

public class AbrigoTemporario extends Abrigo {
    private int prazoMaximoDias;

    public AbrigoTemporario(String nome, Endereco endereco, int capacidade, int prazoMaximoDias) {
        super(nome, endereco, capacidade);
        this.prazoMaximoDias = prazoMaximoDias;
    }

    public int getPrazoMaximoDias() {
        return prazoMaximoDias;
    }
    public void setPrazoMaximoDias(int prazoMaximoDias) {
        this.prazoMaximoDias = prazoMaximoDias;
    }

    @Override
    public String getTipo() {
        return "Temporário";
    }

}
