package models;

public class AtendimentoAlimentacao extends Atendimento {
    private String refeicaoOferecida;
    private int caloriasEstimadas;    

    public AtendimentoAlimentacao(String data, String observacoes, PessoaAcolhida pessoa,
            Profissional profissional, String refeicaoOferecida, int caloriasEstimadas) {
        super(data, observacoes, pessoa, profissional);
        this.refeicaoOferecida = refeicaoOferecida;
        this.caloriasEstimadas = caloriasEstimadas;
    }

    public AtendimentoAlimentacao(String data, PessoaAcolhida pessoa, Profissional profissional,
            String refeicaoOferecida, int caloriasEstimadas) {
        super(data, pessoa, profissional);
        this.refeicaoOferecida = refeicaoOferecida;
        this.caloriasEstimadas = caloriasEstimadas;
    }

    public String getRefeicaoOferecida() {
        return refeicaoOferecida;
    }
    public void setRefeicaoOferecida(String refeicaoOferecida) {
        this.refeicaoOferecida = refeicaoOferecida;
    }

    public int getCaloriasEstimadas() {
        return caloriasEstimadas;
    }
    public void setCaloriasEstimadas(int caloriasEstimadas) {
        this.caloriasEstimadas = caloriasEstimadas;
    }
    
    @Override
    public String getTipo() {
        return "Alimentação";
    }
}
