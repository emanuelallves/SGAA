package models;

import java.util.ArrayList;
import java.util.List;

public class PessoaAcolhida {
    private String nome;
    private int idade;
    private List<String> necessidades;
    private List<String> historico;
    private Contato contato;
    private String dataIngresso;
    private boolean acolhido;

    public PessoaAcolhida(String nome, int idade, Contato contato, String dataIngresso) {
        this.nome = nome;
        setIdade(idade);
        this.necessidades = new ArrayList<>();
        this.historico = new ArrayList<>();
        this.contato = contato;
        this.dataIngresso = dataIngresso;
        this.acolhido = true;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        if (idade <= 0) {
            System.out.println("Idade inválida para registro");
            return;
        }
        this.idade = idade;
    }

    public List<String> getNecessidades() {
        return necessidades;
    }
    public void adicionarNecessidades(String necessidades) {
        this.necessidades.add(necessidades);
    }

    public List<String> getHistorico() {
        return historico;
    }
    public void adicionarAoHistorico(String historico) {
        this.historico.add(historico);
    }

    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getDataIngresso() {
        return dataIngresso;
    }
    public void setDataIngresso(String dataIngresso) {
        this.dataIngresso = dataIngresso;
    }

    public boolean isAcolhido() {
        return acolhido;
    }
    public void setAcolhido(boolean acolhido) {
        this.acolhido = acolhido;
    }

    
}
