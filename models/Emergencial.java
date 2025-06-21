package models;

public class Emergencial extends Abrigo {
    private int duracaoMaximaDias;

    public Emergencial(String nome, Endereco endereco, int capacidade, int duracaoMaximaDias) {
        super(nome, endereco, capacidade);
        this.duracaoMaximaDias = duracaoMaximaDias;
    }

    public int getDuracaoMaximaDias() {
        return duracaoMaximaDias;
    }
    public void setDuracaoMaximaDias(int duracaoMaximaDias) {
        this.duracaoMaximaDias = duracaoMaximaDias;
    }

    @Override
    public String getTipo() {
        return "Emergencial";
    }

    @Override
    public void encerrarAcolhimento(PessoaAcolhida pessoa) {
        boolean b = true;
        for(Vaga v : getVagas()) {
            if(v.getPessoa().getNome() == pessoa.getNome()) {
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

}
