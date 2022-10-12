package br.unifei.imc.controle;

import br.unifei.imc.comando.*;
import lombok.Setter;

public class Controle {
    @Setter
    private Comando BtnA, BtnB, BtnC, BtnD;

    public Controle(){
        BtnA = new ComandoAtirar();
        BtnB = new ComandoPular();
        BtnC = new ComandoAgachar();
        BtnD = new ComandoCorrer();
    }

    public void apertarBtnA() {
        BtnA.executar();
    }

    public void apertarBtnB() {
        BtnB.executar();
    }

    public void apertarBtnC() {
        BtnC.executar();
    }

    public void apertarBtnD() {
        BtnD.executar();
    }
}
