package br.unifei.imc;

public class Main {
    public static void main(String[] args) {

        Object[] parametros = new Object[3];
        parametros[0] = "Azul";
        parametros[1] = 4;
        parametros[2] = 599.99;

        Class<?>[] tipos = new Class[3];
        for(int i = 0; i< tipos.length; i++){
            tipos[i] = parametros[i].getClass();
        }

        for(int i = 0; i < tipos.length; i++){
            System.out.println("Valor: " + parametros[i] + " Tipo: " + tipos[i]);
        }
    }
}