package br.unifei.imc.services;

import br.unifei.imc.ordenacao.BubbleSort;
import br.unifei.imc.ordenacao.Ordenacao;
import lombok.Data;

@Data
public class BibliotecaService {

    Ordenacao algoritmo;

    public BibliotecaService(){
        this.algoritmo = new BubbleSort();
    }

    public void apresentarNotasOrdenadas(double[] notas){
        algoritmo.ordenar(notas);
        System.out.println(algoritmo.getClass().getSimpleName());
        for (int i = 0; i < notas.length; i++) {
            System.out.print(notas[i] + " ");
        }
    }

}
