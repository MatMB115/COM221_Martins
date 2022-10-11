package br.unifei.imc.controle;

import br.unifei.imc.comando.Comando;
import br.unifei.imc.comando.NullCommand;
import br.unifei.imc.dispositivos.Garagem;
import br.unifei.imc.dispositivos.Lampada;

import java.util.ArrayList;
import java.util.List;

public class Controle {

    private List<Comando> comandosLigar;
    private List<Comando> comandosDesligar;
    public Controle(int qtdBtn){
        comandosLigar = new ArrayList<>();
        comandosDesligar = new ArrayList<>();
        for (int i = 0; i < qtdBtn; i++) {
            comandosLigar.add(new NullCommand());
            comandosDesligar.add(new NullCommand());
        }
    }

    public void apertarBtnLiga(int slot){
        comandosLigar.get(slot).executar();
    }

    public void apertarBtndesliga(int slot){
        comandosDesligar.get(slot).executar();
    }

    public void setComando(int slot, Comando comandoLigar, Comando comandoDesligar){
        comandosDesligar.set(slot, comandoDesligar);
        comandosLigar.set(slot, comandoLigar);
    }
}
