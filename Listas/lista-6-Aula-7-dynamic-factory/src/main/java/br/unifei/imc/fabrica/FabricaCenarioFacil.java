package br.unifei.imc.fabrica;

import br.unifei.imc.asteroide.Asteroide;
import br.unifei.imc.asteroide.TipoAST;
import br.unifei.imc.utils.PropUtils;

import java.io.IOException;

public class FabricaCenarioFacil extends FabricaDinamica{
    @Override
    protected Asteroide criaAsteroide(TipoAST tipoAST) {
        
        Asteroide ast = null;

        String nomeClasse = PropUtils.buscaNomeClasse(tipoAST);
        
        try{
            Class<?> clazz = Class.forName(nomeClasse);
            ast = (Asteroide) clazz.getConstructor(int.class).newInstance(2);
        } catch (Exception e) {
            e.printStackTrace();
        }

        return ast;
    }
}
