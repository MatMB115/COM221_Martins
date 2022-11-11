package br.unifei.imc.fabrica;

import br.unifei.imc.asteroide.Asteroide;

public class FabricaCenarioDificil extends Fabrica{
    @Override
    protected Asteroide criaAsteroide(String tipoAsteroide) {
        return ast;
    }
}
