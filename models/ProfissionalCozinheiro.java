package models;

import java.util.ArrayList;
import java.util.List;

public class ProfissionalCozinheiro extends Profissional{
    private List<String> pratos;
    private boolean responsavelPorCardapio;

    public ProfissionalCozinheiro(String nome, String CPF, Contato contato, String horarioEntrada, String horarioSaida) {
        super(nome, CPF, contato, horarioEntrada, horarioSaida);
        this.pratos = new ArrayList<>();
        this.responsavelPorCardapio = false;
    }

    public List<String> getPratos() {
        return pratos;
    }
    public void adicionarPrato(String prato) {
        pratos.add(prato);
    }

    public boolean isResponsavelPorCardapio() {
        return responsavelPorCardapio;
    }
    public void setResponsavelPorCardapio(boolean responsavelPorCardapio) {
        this.responsavelPorCardapio = responsavelPorCardapio;
    }

    @Override
    public List<String> getTarefas() {
        return tarefas;
    }

    @Override
    public void adicionarTarefas(String tarefa) {
        tarefas.add(tarefa);
    }
    
}
