package models;

public class Agendamento {
    private PessoaAcolhida pessoa;
    private Atendimento atendimento;
    private String dataHora;

    public Agendamento(PessoaAcolhida pessoa, Atendimento atendimento, String dataHora) {
        this.pessoa = pessoa;
        this.atendimento = atendimento;
        this.dataHora = dataHora;
    }

    public PessoaAcolhida getPessoa() {
        return pessoa;
    }
    public void setPessoa(PessoaAcolhida pessoa) {
        this.pessoa = pessoa;
    }

    public Atendimento getAtendimento() {
        return atendimento;
    }
    public void setAtendimento(Atendimento atendimento) {
        this.atendimento = atendimento;
    }

    public String getDataHora() {
        return dataHora;
    }
    public void setDataHora(String dataHora) {
        this.dataHora = dataHora;
    }
    
}
