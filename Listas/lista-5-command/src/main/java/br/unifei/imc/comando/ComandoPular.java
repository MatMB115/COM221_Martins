package br.unifei.imc.comando;

public class ComandoPular implements Comando{
    @Override
    public void executar() {
        System.out.println("Pulando");
    }
}
