package br.unifei.imc.comando;

import br.unifei.imc.dispositivos.Garagem;

public class fecharGaragem implements Comando{
    Garagem g;

    public fecharGaragem(Garagem g){
        this.g = g;
    }
    @Override
    public void executar() {
        g.fechar();
    }
}
