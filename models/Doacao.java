package models;

public class Doacao {
    private String descricao;
    private float quantia;
    private String dataRecebimento;
    private Abrigo abrigo;

    public Doacao(String descricao, float quantia, String dataRecebimento, Abrigo abrigo) {
        this.descricao = descricao;
        setQuantia(quantia);
        this.dataRecebimento = dataRecebimento;
        this.abrigo = abrigo;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public float getQuantia() {
        return quantia;
    }
    public void setQuantia(float quantia) {
        if(quantia > 0) {
            this.quantia = quantia;
            return;
        }

        System.out.println("Quantia inválida para doaçã!");
    }

    public String getDataRecebimento() {
        return dataRecebimento;
    }
    public void setDataRecebimento(String dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    public Abrigo getAbrigo() {
        return abrigo;
    }
    public void setAbrigo(Abrigo abrigo) {
        this.abrigo = abrigo;
    }
    
}
