package interfaces;

import models.PessoaAcolhida;
import models.Vaga;

public interface RegistrarVagas {
    public boolean adicionarVaga(Vaga vaga);
    public void encerrarAcolhimento(PessoaAcolhida pessoa);
}
