package br.unifei.imc.asteroide;

public abstract class Asteroide {

    protected String tipoDano;
    protected double dano, vida,velocidade;
    protected int danoBase;

    public Asteroide(double dificuldade){
        inicializar(dificuldade);
    }
    protected abstract void definirValoresBase();

    public final void inicializar(double dificuldade){

        definirValoresBase();
        this.vida = dificuldade*danoBase;
        this.velocidade = dificuldade*danoBase;
        this.dano = dificuldade*danoBase;
        System.out.println("Inicializando Asteroide...");
        System.out.println("Velocidade: " + velocidade);
        System.out.println("Vida: " + vida);

    }
}
