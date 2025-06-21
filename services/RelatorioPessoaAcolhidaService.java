package services;

import models.PessoaAcolhida;

public class RelatorioPessoaAcolhidaService {
    public String gerarFicha(PessoaAcolhida pessoa) {
        StringBuilder sb = new StringBuilder();
        sb.append("===Ficha da pessoa acolhida===\n");
        sb.append("Nome: ").append(pessoa.getNome()).append("\n");
        sb.append("Idade: ").append(pessoa.getIdade()).append("\n");

        if(pessoa.getNecessidades().isEmpty()) {
            sb.append("Nenhuma necessidade registrada.\n");
        } else {
            sb.append("Necessidades:\n");
            for (String n : pessoa.getNecessidades()) {
                sb.append("- ").append(n).append("\n");
            }
        }

        if(pessoa.getHistorico().isEmpty()) {
            sb.append("Nenhum histórico registrado.\n");
        } else {
            sb.append("Histórico:\n");
            for (String h : pessoa.getHistorico()) {
                sb.append("- ").append(h).append("\n");
            }
        }

        sb.append("Telefone: ").append(pessoa.getContato().getTelefone()).append("\n");
        sb.append("Email: ").append(pessoa.getContato().getEmail()).append("\n");
        sb.append("Data ingresso: ").append(pessoa.getDataIngresso()).append("\n");
        sb.append("Está no acolhimento: ").append(pessoa.isAcolhido()).append("\n");

        return sb.toString();
    }
}
