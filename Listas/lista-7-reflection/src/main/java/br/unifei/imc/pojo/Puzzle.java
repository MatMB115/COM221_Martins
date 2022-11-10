package br.unifei.imc.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class Puzzle {

    private String nome;
    private int qtdPecas;
    private double largura;
    private double altura;

}
