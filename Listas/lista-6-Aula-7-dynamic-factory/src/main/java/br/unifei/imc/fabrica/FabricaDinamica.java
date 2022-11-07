package br.unifei.imc.fabrica;

import br.unifei.imc.asteroide.Asteroide;
import br.unifei.imc.asteroide.AsteroideFogo;
import br.unifei.imc.asteroide.AsteroideGelo;
import br.unifei.imc.asteroide.TipoAST;

public abstract class FabricaDinamica {

    protected abstract Asteroide criaAsteroide(TipoAST tipoAST);

    public final Asteroide buscaAsteroide(TipoAST tipoAST){

        Asteroide ast = null;

        ast = criaAsteroide(tipoAST);
        if(tipoAST == TipoAST.AST_FOGO)
            ast = new AsteroideFogo(4);
        else if(tipoAST == TipoAST.AST_GELO)
            ast = new AsteroideGelo(3);
        return ast;
    }
}
