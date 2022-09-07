package br.unifei.imc.model;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Pessoa {
    private Integer id;
    private String nome;
    private Integer idade;

}
