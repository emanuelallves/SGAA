package models;

public class PessoaAcolhida {
    private String nome;
    private int idade;
    private String necessidades;
    private String historico;
    private Contato contato;
    private String dataIngresso;

    public PessoaAcolhida(String nome, int idade, String necessidades, String historico, Contato contato, 
            String dataIngresso) {
        this.nome = nome;
        setIdade(idade);
        this.necessidades = necessidades;
        this.historico = historico;
        this.contato = contato;
        this.dataIngresso = dataIngresso;
    }

    public PessoaAcolhida(String nome, int idade, String necessidades, Contato contato, String dataIngresso) {
        this.nome = nome;
        this.idade = idade;
        this.necessidades = necessidades;
        this.contato = contato;
        this.dataIngresso = dataIngresso;
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

    public String getNecessidades() {
        return necessidades;
    }
    public void setNecessidades(String necessidades) {
        this.necessidades = necessidades;
    }

    public String getHistorico() {
        return historico;
    }
    public void setHistorico(String historico) {
        this.historico = historico;
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

    
}
