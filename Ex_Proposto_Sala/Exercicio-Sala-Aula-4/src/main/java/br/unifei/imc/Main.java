package br.unifei.imc;

import br.unifei.imc.ordenacao.InsertionSort;
import br.unifei.imc.ordenacao.SelectionSort;
import br.unifei.imc.services.BibliotecaService;

import java.security.Provider;

public class Main {
    public static void main(String[] args) {
        double[] notas = {5,4,3,2,1};
        double[] notasDesordenadas = notas;

        var service = new BibliotecaService();

        service.apresentarNotasOrdenadas(notas);
        System.out.println();

        notas = notasDesordenadas;
        service.setAlgoritmo(new SelectionSort());
        service.apresentarNotasOrdenadas(notas);
        System.out.println();

        notas = notasDesordenadas;
        service.setAlgoritmo(new InsertionSort());
        service.apresentarNotasOrdenadas(notas);
    }
}
