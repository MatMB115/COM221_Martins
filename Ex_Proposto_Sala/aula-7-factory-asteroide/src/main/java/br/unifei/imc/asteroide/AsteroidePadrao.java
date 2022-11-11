package br.unifei.imc.asteroide;

public class AsteroidePadrao extends Asteroide{

    public AsteroidePadrao(double dificuldade) {
        super(dificuldade);
    }

    @Override
    protected void definirValoresBase(){
        this.danoBase = 2;
        this.tipoDano = "Padrão";
    }
}
