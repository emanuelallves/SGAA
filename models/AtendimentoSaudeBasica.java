package models;

public class AtendimentoSaudeBasica extends Atendimento {
    private boolean urgencia;

    public AtendimentoSaudeBasica(String data, String observacoes, PessoaAcolhida pessoa,
            Profissional profissional, boolean urgencia) {
        super(data, observacoes, pessoa, profissional);
        this.urgencia = urgencia;
    }

    public AtendimentoSaudeBasica(String data, PessoaAcolhida pessoa, Profissional profissional,
            boolean urgencia) {
        super(data, pessoa, profissional);
        this.urgencia = urgencia;
    }

    public boolean isUrgencia() {
        return urgencia;
    }
    public void setUrgencia(boolean urgencia) {
        this.urgencia = urgencia;
    }

    public void prescreverMedicacao(String medicacao) {
        System.out.println(getPessoa().getNome() + " precisará do medicamento " + medicacao);
    }

    @Override
    public String getTipo() {
        return "Assistência social";
    }
}
