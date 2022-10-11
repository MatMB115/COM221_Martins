package br.unifei.imc.comando;

import br.unifei.imc.dispositivos.Lampada;

public class apagaLampada implements Comando {
    Lampada l;

    public apagaLampada(Lampada l){
        this.l = l;
    }
    @Override
    public void executar(){
        l.apagar();
    }
}
