package models;

public class Doacao {
    private String descricao;
    private String tipo;
    private String dataRecebimento;

    public Doacao(String descricao, String tipo, String dataRecebimento) {
        this.descricao = descricao;
        this.tipo = tipo;
        this.dataRecebimento = dataRecebimento;
    }

    public String getDescricao() {
        return descricao;
    }
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDataRecebimento() {
        return dataRecebimento;
    }
    public void setDataRecebimento(String dataRecebimento) {
        this.dataRecebimento = dataRecebimento;
    }

    
}
