package br.unifei.imc.asteroide;

import lombok.Getter;

@Getter
public abstract class Asteroide {

    protected double vida, velocidade;
    protected int dificuldade;

    public Asteroide(int dificuldade){
        this.dificuldade = dificuldade;
    }

}
