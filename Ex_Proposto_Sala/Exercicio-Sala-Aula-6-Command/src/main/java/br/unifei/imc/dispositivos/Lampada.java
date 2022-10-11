package br.unifei.imc.dispositivos;

public class Lampada {

    private String comodo;

    public Lampada(){
        comodo = "Cozinha";
    }

    public Lampada(String comodo){
        this.comodo = comodo;
    }
    public void acender(){
        System.out.println("Tá acendendo ela em " + comodo);
    }

    public void apagar(){
        System.out.println("Tá apagando ela em " + comodo);
    }
}
