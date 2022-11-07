package br.unifei.imc;

import br.unifei.imc.asteroide.Asteroide;
import br.unifei.imc.asteroide.TipoAST;
import br.unifei.imc.fabrica.FabricaCenarioFacil;
import br.unifei.imc.fabrica.FabricaDinamica;

public class Main {
    public static void main(String[] args) {

        FabricaDinamica fab = new FabricaCenarioFacil();

        Asteroide ast1 = fab.buscaAsteroide(TipoAST.AST_ELETRICO);
        System.out.println(ast1.getClass().getName());
        System.out.println(ast1.getDificuldade());
    }
}