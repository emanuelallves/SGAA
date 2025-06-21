package services;
import interfaces.Notificacao;

public class NotificacaoService implements Notificacao {
    @Override
    public void enviarNotificacao(String mensagem) {
        System.out.println("NOTIFICAÇÃO: " + mensagem);
    }
}