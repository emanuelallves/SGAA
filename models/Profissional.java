package models;

import java.util.ArrayList;
import java.util.List;

public abstract class Profissional {
    private String nome;
    private String CPF;
    private Contato contato;
    private String horarioEntrada;
    private String horarioSaida;
    protected List<String> tarefas;

    public Profissional(String nome, String CPF, Contato contato, String horarioEntrada, String horarioSaida) {
        this.nome = nome;
        setCPF(CPF);
        this.contato = contato;
        this.horarioEntrada = horarioEntrada;
        this.horarioSaida = horarioSaida;
        tarefas = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCPF() {
        return CPF;
    }
    public void setCPF(String CPF) {
        if(!CPF.matches("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}")) {
            System.out.println("CPF inválido");
            return;
        }
        this.CPF = CPF;
    }

    public Contato getContato() {
        return contato;
    }
    public void setContato(Contato contato) {
        this.contato = contato;
    }

    public String getHorarioEntrada() {
        return horarioEntrada;
    }
    public void setHorarioEntrada(String horarioEntrada) {
        this.horarioEntrada = horarioEntrada;
    }

    public String getHorarioSaida() {
        return horarioSaida;
    }
    public void setHorarioSaida(String horarioSaida) {
        this.horarioSaida = horarioSaida;
    }

    public abstract List<String> getTarefas();
    public abstract void adicionarTarefas(String tarefa);
}
