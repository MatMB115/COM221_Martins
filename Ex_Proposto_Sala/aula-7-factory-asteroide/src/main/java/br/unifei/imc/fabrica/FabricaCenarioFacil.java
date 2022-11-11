package br.unifei.imc.fabrica;

import br.unifei.imc.asteroide.Asteroide;
import br.unifei.imc.asteroide.AsteroideFogo;
import br.unifei.imc.asteroide.AsteroideGelo;
import br.unifei.imc.asteroide.AsteroidePadrao;

public class FabricaCenarioFacil extends Fabrica{
    @Override
    protected Asteroide criaAsteroide(String tipoAsteroide) {

        Asteroide ast = null;

        if(tipoAsteroide == "Fogo")
            ast = new AsteroideFogo(dificuldade);
        else if(tipoAsteroide == "Gelo")
            ast = new AsteroideGelo(dificuldade);
        else
            ast = new AsteroidePadrao(dificuldade);

        return ast;
    }
}
