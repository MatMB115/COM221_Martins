package br.unifei.imc.comando;

public class ComandoCorrer implements Comando{
    @Override
    public void executar() {
        System.out.println("Correndo");
    }
}
