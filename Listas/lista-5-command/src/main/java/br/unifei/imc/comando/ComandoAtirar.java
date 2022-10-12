package br.unifei.imc.comando;

public class ComandoAtirar implements Comando{
    @Override
    public void executar() {
        System.out.println("Atirando");
    }
}
