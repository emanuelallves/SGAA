package services;

import models.Atendimento;

public class RelatorioAtendimentoService {
    public String gerarFicha(Atendimento atendimento) {
        StringBuilder sb = new StringBuilder();
        sb.append("===Ficha de atendimento===\n");
        sb.append("Data: ").append(atendimento.getData()).append("\n");
        sb.append("Tipo: ").append(atendimento.getTipo()).append("\n");
        sb.append("Pessoa atendida: ").append(atendimento.getPessoa().getNome()).append("\n");
        sb.append("Profissional responsável: ").append(atendimento.getProfissional().getNome()).append("\n");

        return sb.toString();
    }
}
