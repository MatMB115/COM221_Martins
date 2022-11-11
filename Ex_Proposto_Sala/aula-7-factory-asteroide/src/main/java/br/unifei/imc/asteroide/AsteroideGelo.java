package br.unifei.imc.asteroide;

public class AsteroideGelo extends Asteroide{
    public AsteroideGelo(double dificuldade) {
        super(dificuldade);
    }

    @Override
    protected void definirValoresBase() {
        this.danoBase = 5;
        this.tipoDano = "Gelo";
    }
}
