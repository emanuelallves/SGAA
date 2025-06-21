package interfaces;

import models.PessoaAcolhida;

public interface StatusVaga {
    public void ocupar(PessoaAcolhida pessoa);
    public void liberar();
}
