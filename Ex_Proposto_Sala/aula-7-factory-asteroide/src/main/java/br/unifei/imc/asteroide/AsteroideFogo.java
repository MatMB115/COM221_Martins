package br.unifei.imc.asteroide;

public class AsteroideFogo extends Asteroide{

    public AsteroideFogo(double dificuldade) {
        super(dificuldade);
    }

    @Override
    protected void definirValoresBase() {
        this.danoBase = 3;
        this.tipoDano = "Fogo";
    }
}
