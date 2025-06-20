package models;

import java.util.ArrayList;
import java.util.List;

public class Abrigo {
    private String nome;
    private Endereco endereco;
    private int capacidade;
    private List<Vaga> vagas;

    public Abrigo(String nome, Endereco endereco, int capacidade) {
        this.nome = nome;
        this.endereco = endereco;
        this.capacidade = capacidade;
        this.vagas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public Endereco getEndereco() {
        return endereco;
    }
    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public int getCapacidade() {
        return capacidade;
    }
    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public List<Vaga> getVagas() {
        return vagas;
    }
    
}
