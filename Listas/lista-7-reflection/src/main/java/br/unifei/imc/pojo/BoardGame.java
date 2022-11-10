package br.unifei.imc.pojo;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public class BoardGame {

    private String nome;
    private int qtdJogadores;
    private double preco;

}
