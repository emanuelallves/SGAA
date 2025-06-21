package interfaces;

import models.PessoaAcolhida;

public interface PessoasAtendidas {
    String listarPessoasAtendidas();
    void adicionarPessoaAtendida(PessoaAcolhida pessoaAtendida);
}