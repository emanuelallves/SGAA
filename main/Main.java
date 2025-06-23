package main;

import models.*;
import services.*;

public class Main {
    public static void main(String[] args) {
        Contato c = new Contato("88 9 8858-5840", "joemanuelalves1@gmail.com");

        Profissional enfermeiro = new ProfissionalEnfermeiro("João", "123.456.789-00", c, "00:00",
         "12:00", "Pediatria", "1111111");

        enfermeiro.adicionarTarefas("Aplicar medicamentos");
        enfermeiro.adicionarTarefas("Verificar sinais vitais");

        RelatorioProfissionalService relatorioProfissional = new RelatorioProfissionalService();

        String ficha_profissional = relatorioProfissional.gerarFicha(enfermeiro);

        System.out.println(ficha_profissional);



        Contato contatoPessoa = new Contato("99999-9999", "pessoa@exemplo.com");
        
        PessoaAcolhida pessoa = new PessoaAcolhida("João da Silva", 35, contatoPessoa, "2024-06-23");
        pessoa.adicionarNecessidades("Alimentação");
        pessoa.adicionarAoHistorico("Recebeu abrigo em 2024-06-23");

        RelatorioPessoaAcolhidaService relatorioPessoa = new RelatorioPessoaAcolhidaService();

        String ficha_pessoa = relatorioPessoa.gerarFicha(pessoa);

        System.out.println(ficha_pessoa);


        
        Contato contatoProfissional = new Contato("98888-8888", "cozinheiro@abrigo.com");
        
        ProfissionalCozinheiro cozinheiro = new ProfissionalCozinheiro("Maria Cozinheira", "123.456.789-00", contatoProfissional, "08:00", "17:00");
        cozinheiro.adicionarPrato("Arroz e feijão");
        cozinheiro.setResponsavelPorCardapio(true);
        cozinheiro.adicionarTarefas("Preparar o almoço");
        
        AtendimentoAlimentacao atendimento = new AtendimentoAlimentacao(
            "2024-06-23",
            "Serviu almoço para a pessoa acolhida.",
            pessoa,
            cozinheiro,
            "Arroz, feijão e frango grelhado",
            800
        );
        
        RelatorioAtendimentoService relatorioAtendimento = new RelatorioAtendimentoService();

        String ficha_atendimento = relatorioAtendimento.gerarFicha(atendimento);

        System.out.println(ficha_atendimento);



        Endereco enderecoAbrigo = new Endereco("Rua das Flores", "123", "Fortaleza");

        AbrigoEmergencial abrigo = new AbrigoEmergencial("Abrigo Esperança", enderecoAbrigo, 2, 30);

        Vaga vaga1 = new Vaga();
        Vaga vaga2 = new Vaga();

        abrigo.adicionarVaga(vaga1);
        abrigo.adicionarVaga(vaga2);

        Contato contato1 = new Contato("99999-9999", "joao@exemplo.com");
        PessoaAcolhida pessoa1 = new PessoaAcolhida("João da Silva", 40, contato1, "2024-06-23");

        Contato contato2 = new Contato("98888-8888", "maria@exemplo.com");
        PessoaAcolhida pessoa2 = new PessoaAcolhida("Maria Souza", 35, contato2, "2024-06-23");

        vaga1.ocupar(pessoa1);
        vaga2.ocupar(pessoa2);

        // // System.out.println("Vaga 1 ocupada por: " + vaga1.getPessoa().getNome());
        // // System.out.println("Vaga 2 ocupada por: " + vaga2.getPessoa().getNome());

        // Vaga vaga3 = new Vaga();
        // abrigo.adicionarVaga(vaga3);

        Doacao doacao = new Doacao("Cestas básicas", 500, "2024-06-23", abrigo);
        System.out.println("Doação registrada: " + doacao.getDescricao() + ", valor: " + doacao.getQuantia());

        abrigo.encerrarAcolhimento(pessoa1);

        RelatorioAbrigoService relatorioService = new RelatorioAbrigoService();
        String ficha = relatorioService.gerarFicha(abrigo);
        System.out.println(ficha);

    }
}