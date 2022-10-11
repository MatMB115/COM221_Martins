package br.unifei.imc.comando;

import br.unifei.imc.dispositivos.Lampada;

public class acendeLampada implements Comando{

    Lampada l;

    public acendeLampada(Lampada l){
        this.l = l;
    }
    @Override
    public void executar(){
        l.acender();
    }

}
