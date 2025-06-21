package services;

import models.Abrigo;
import models.Vaga;

public class RelatorioAbrigoService {
    public String gerarFicha(Abrigo abrigo) {
        StringBuilder sb = new StringBuilder();
        sb.append("===Ficha do abrigo===\n");
        sb.append("Nome: ").append(abrigo.getNome()).append("\n");
        sb.append("Endereco: ").append("\n");
        sb.append("- ").append(abrigo.getEndereco().getCidade()).append("\n");
        sb.append("- ").append(abrigo.getEndereco().getRua()).append("\n");
        sb.append("- ").append(abrigo.getEndereco().getNumero()).append("\n");
        sb.append("Capacidade: ").append(abrigo.getCapacidade()).append("\n");
        sb.append("Pessoas que estão acolhidas nesse abrigo: ").append("\n");

        for(Vaga v : abrigo.getVagas()) {
            if(v.getPessoa() != null) {
                System.out.println("- " + v.getPessoa().getNome());
            }
        }

        return sb.toString();
    }
}
