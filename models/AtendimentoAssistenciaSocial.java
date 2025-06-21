package models;

public class AtendimentoAssistenciaSocial extends Atendimento {
    private String orientacaoFornecida;

    public AtendimentoAssistenciaSocial(String data, String observacoes, PessoaAcolhida pessoa,
            Profissional profissional, String orientacaoFornecida) {
        super(data, observacoes, pessoa, profissional);
        this.orientacaoFornecida = orientacaoFornecida;
    }

    public AtendimentoAssistenciaSocial(String data, PessoaAcolhida pessoa, Profissional profissional,
            String orientacaoFornecida) {
        super(data, pessoa, profissional);
        this.orientacaoFornecida = orientacaoFornecida;
    }

    public String getOrientacaoFornecida() {
        return orientacaoFornecida;
    }
    public void setOrientacaoFornecida(String orientacaoFornecida) {
        this.orientacaoFornecida = orientacaoFornecida;
    }

    public void registrarEncaminhamento(String local) {
        System.out.println(getPessoa().getNome() + " será encaminhada para " + local);
    }

    @Override
    public String getTipo() {
        return "Saúde básica";
    }
    
}
