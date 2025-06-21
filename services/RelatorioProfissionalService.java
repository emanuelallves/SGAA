package services;

import models.Profissional;

public class RelatorioProfissionalService {
    public String gerarFicha(Profissional profissional) {
        StringBuilder sb = new StringBuilder();
        sb.append("===Ficha do profissional===\n");
        sb.append("Nome: ").append(profissional.getNome()).append("\n");
        sb.append("CPF: ").append(profissional.getCPF()).append("\n");
        sb.append("Telefone: ").append(profissional.getContato().getTelefone()).append("\n");
        sb.append("Email: ").append(profissional.getContato().getEmail()).append("\n");
        sb.append("Horário de entrada: ").append(profissional.getHorarioEntrada()).append("\n");
        sb.append("Horário de saída: ").append(profissional.getHorarioSaida()).append("\n");

        if (profissional.getTarefas().isEmpty()) {
            sb.append("Nenhuma tarefa atribuída.\n");
        } else {
            sb.append("Tarefas:\n");
            for (String f : profissional.getTarefas()) {
                sb.append("- ").append(f).append("\n");
            }
        }
        return sb.toString();
    }
}
