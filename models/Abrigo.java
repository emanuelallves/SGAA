package models;

import java.util.ArrayList;
import java.util.List;

import interfaces.RegistrarVagas;

public abstract class Abrigo implements RegistrarVagas{
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

    @Override
    public boolean adicionarVaga(Vaga vaga) {
        if(vagas.size() < capacidade && !vaga.isOcupada()) {
            vagas.add(vaga);
            System.out.println("Vaga adicionada com sucesso");
            return true;
        }

        System.out.println("Capacidade máxima atingida ou vaga ocupada");
        return false;

    }

    @Override
    public void encerrarAcolhimento(PessoaAcolhida pessoa) {
        boolean b = true;
        for(Vaga v : getVagas()) {
            if(v.getPessoa() != null && v.getPessoa().getNome().equals(pessoa.getNome())) {
                v.liberar();
                System.out.println("Vaga liberada com sucesso!");
                b = false;
                break;
            }
        }

        if(b) {
            System.out.println("Nenhuma vaga está sendo ocupada por esta pessoa!");
        }
    }

    public abstract String getTipo();
    
}
