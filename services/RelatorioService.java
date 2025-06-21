package services;
import interfaces.Relatorio;
import models.*;
import java.util.List;

public class RelatorioService implements Relatorio {
    private List<Atendimento> atendimentos;
    private List<Abrigo> abrigos;
    private List<Doacao> doacoes;

    public RelatorioService(List<Atendimento> atendimentos, List<Abrigo> abrigos, List<Doacao> doacoes) {
        this.atendimentos = atendimentos;
        this.abrigos = abrigos;
        this.doacoes = doacoes;
    }

    @Override
    public void gerarRelatorioAtendimentos() {
        System.out.println("Relatório de Atendimentos:");
        for (Atendimento at : atendimentos) {
            System.out.println("- Data: " + at.getData() + ", Tipo: " + at.getTipo() + ", Pessoa: " + at.getPessoa().getNome());
        }
    }

    @Override
    public void gerarRelatorioOcupacoes() {
        System.out.println("Relatório de Ocupações:");
        for (Abrigo ab : abrigos) {
            long ocupadas = ab.getVagas().stream().filter(Vaga::isOcupada).count();
            System.out.println("- " + ab.getNome() + " (" + ab.getTipo() + "): " + ocupadas + "/" + ab.getCapacidade() + " ocupadas");
        }
    }

    @Override
    public void gerarRelatorioDoacoes() {
        System.out.println("Relatório de Doações:");
        for (Doacao d : doacoes) {
            System.out.println("- " + d.getTipo() + ": " + d.getDescricao() + " recebido em " + d.getDataRecebimento());
        }
    }
}

