package br.unifei.imc.processador;

import br.unifei.imc.processador.observadores.ObservadorPalavra;

public interface Observavel {

    public void registrar(ObservadorPalavra obs);

    public void cancelar(ObservadorPalavra obs);
}
