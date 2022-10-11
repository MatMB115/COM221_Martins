package br.unifei.imc;

import br.unifei.imc.comando.acendeLampada;
import br.unifei.imc.comando.abrirGaragem;
import br.unifei.imc.comando.apagaLampada;
import br.unifei.imc.comando.fecharGaragem;
import br.unifei.imc.controle.Controle;
import br.unifei.imc.dispositivos.Garagem;
import br.unifei.imc.dispositivos.Lampada;

public class Main {
    public static void main(String[] args) {

        Controle c = new Controle(5);

        abrirGaragem ag = new abrirGaragem(new Garagem());
        acendeLampada al = new acendeLampada(new Lampada());
        acendeLampada al1 = new acendeLampada(new Lampada("Quarto"));

        fecharGaragem fg = new fecharGaragem(new Garagem());
        apagaLampada ap = new apagaLampada(new Lampada("Corredor"));
        apagaLampada ap1 = new apagaLampada(new Lampada("Corredor"));

        c.setComando(1,ag,fg);
        c.apertarBtnLiga(1);
        c.apertarBtndesliga(1);

        c.setComando(2,al, ap);
        c.apertarBtnLiga(2);
        c.apertarBtndesliga(2);

        c.setComando(3,al1, ap1);
        c.apertarBtnLiga(3);
        c.apertarBtndesliga(3);
    }
}