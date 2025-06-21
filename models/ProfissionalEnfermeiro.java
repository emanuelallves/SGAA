package models;

import java.util.List;

import interfaces.PessoasAtendidas;

public class ProfissionalEnfermeiro extends Profissional implements PessoasAtendidas{
    private String especialidade;
    private String COREN;
    private List<PessoaAcolhida> pessoasAtendidas;

    public ProfissionalEnfermeiro(String nome, String CPF, Contato contato, String horarioEntrada, String horarioSaida,
            String especialidade, String COREN) {
        super(nome, CPF, contato, horarioEntrada, horarioSaida);
        this.especialidade = especialidade;
        this.COREN = COREN;
    }

    public String getEspecialidade() {
        return especialidade;
    }
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public String getCOREN() {
        return COREN;
    }
    public void setCOREN(String COREN) {
        this.COREN = COREN;
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
