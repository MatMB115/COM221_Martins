package br.unifei.imc.comando;

import br.unifei.imc.dispositivos.Garagem;

public class abrirGaragem implements Comando{

    Garagem g;

    public abrirGaragem(Garagem g){
        this.g = g;
    }
    @Override
    public void executar() {
        g.abrir();
    }
}
