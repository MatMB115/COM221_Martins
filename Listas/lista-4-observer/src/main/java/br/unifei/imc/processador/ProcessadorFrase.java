package br.unifei.imc.processador;

import br.unifei.imc.processador.exception.SemProcessadoresException;
import br.unifei.imc.processador.observadores.ObservadorPalavra;
import lombok.Data;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;
@Data
public class ProcessadorFrase implements Observavel {
    @Getter
    private List<ObservadorPalavra> observadores;

    public ProcessadorFrase(){
        this.observadores = new ArrayList<>();
    }
    public void processar(String frase1) {
        if(observadores.isEmpty()){
            throw new SemProcessadoresException();
        }else{
            String palavras[] = frase1.split(" ");
            for(String palavra : palavras){
                observadores.forEach(obs -> obs.atualiza(palavra));
            }
        }
    }

    public void registrar(ObservadorPalavra obs) {
        this.observadores.add(obs);
    }

    public void cancelar(ObservadorPalavra obs) {
        this.observadores.remove(obs);
    }
}
