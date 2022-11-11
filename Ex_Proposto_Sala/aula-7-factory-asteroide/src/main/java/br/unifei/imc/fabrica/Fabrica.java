package br.unifei.imc.fabrica;

import br.unifei.imc.asteroide.Asteroide;

public abstract class Fabrica {

    protected int dificuldade;

    protected abstract  Asteroide criaAsteroide(String tipoAsteroide);

    public final Asteroide devolveAsteroide(String tipo){

        Asteroide ast = null;

        ast = criaAsteroide(tipo);

        return ast;
    }
}
