package models;

import java.util.ArrayList;
import java.util.List;

import interfaces.PessoasAtendidas;

public class ProfissionalAssistenteSocial extends Profissional implements PessoasAtendidas{
    private String areaAtuacao;
    private String crasResponsavel;
    private List<PessoaAcolhida> pessoasAtendidas;
    
    public ProfissionalAssistenteSocial(String nome, String CPF, Contato contato, String horarioEntrada, String horarioSaida,
            String areaAtuacao, String crasResponsavel) {
        super(nome, CPF, contato, horarioEntrada, horarioSaida);
        this.areaAtuacao = areaAtuacao;
        this.crasResponsavel = crasResponsavel;
        pessoasAtendidas = new ArrayList<>();
    }

    public String getAreaAtuacao() {
        return areaAtuacao;
    }
    public void setAreaAtuacao(String areaAtuacao) {
        this.areaAtuacao = areaAtuacao;
    }

    public String getCrasResponsavel() {
        return crasResponsavel;
    }
    public void setCrasResponsavel(String crasResponsavel) {
        this.crasResponsavel = crasResponsavel;
    }

    @Override
    public List<String> getTarefas() {
        return tarefas;
    }

    @Override
    public void adicionarTarefas(String tarefa) {
        tarefas.add(tarefa);
    }

    @Override
    public String listarPessoasAtendidas() {
        StringBuilder sb = new StringBuilder();
        for(PessoaAcolhida p : pessoasAtendidas) {
            sb.append("Nome: ").append(p.getNome()).append("\n");
            sb.append("Email: ").append(p.getContato().getEmail()).append("\n");
            sb.append("Telefone: ").append(p.getContato().getTelefone()).append("\n");
        }

        return sb.toString();
    }

    @Override
    public void adicionarPessoaAtendida(PessoaAcolhida pessoaAtendida) {
        this.pessoasAtendidas.add(pessoaAtendida);
    }
    
}
