package br.unifei.imc;

import br.unifei.imc.comando.ComandoAgachar;
import br.unifei.imc.comando.ComandoAtirar;
import br.unifei.imc.comando.ComandoCorrer;
import br.unifei.imc.comando.ComandoPular;
import br.unifei.imc.controle.Controle;

public class Main {
    public static void main(String[] args) {

        Controle c = new Controle();
        c.apertarBtnA();
        c.apertarBtnB();
        c.apertarBtnC();
        c.apertarBtnD();
        System.out.println("\nNovo Mapeamento\n");
        //Novo mapeamento
        //Botao A -> Pular
        //Botao B -> Correr
        //Botao C -> Atirar
        //Botao D -> Agachar
        c.setBtnA(new ComandoPular());
        c.setBtnB(new ComandoCorrer());
        c.setBtnC(new ComandoAtirar());
        c.setBtnD(new ComandoAgachar());

        c.apertarBtnA();
        c.apertarBtnB();
        c.apertarBtnC();
        c.apertarBtnD();

    }
}