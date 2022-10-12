package br.unifei.imc.comando;

public class ComandoAgachar implements Comando{
    @Override
    public void executar() {
        System.out.println("Agachando");
    }
}
