package br.unifei.imc.test;


import br.unifei.imc.model.Game;
import br.unifei.imc.model.Platform;
import br.unifei.imc.service.ServiceGame;
import br.unifei.imc.util.CsvUtils;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import java.nio.file.Path;
import java.util.List;

public class TesteServiceGame {

    static List<Game> allGameList;
    @BeforeClass
    public static void setup(){
        allGameList = CsvUtils.readGameCvs(Path.of("vendas-games.csv"));
    }

    @Test
    public void testeJogosPS4(){
        List<Game> ps4Games = ServiceGame.getListByPlatform(allGameList, Platform.PS4);
        Assert.assertEquals(5, ps4Games.size());
    }
    @Test
    public void testeJogosPC(){
        List<Game> pcGames = ServiceGame.getListByPlatform(allGameList, Platform.PC);
        Assert.assertEquals(3, pcGames.size());
    }
}
