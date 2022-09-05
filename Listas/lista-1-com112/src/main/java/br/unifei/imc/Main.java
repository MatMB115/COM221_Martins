package br.unifei.imc;

import br.unifei.imc.model.Game;
import br.unifei.imc.model.Platform;
import br.unifei.imc.model.Publisher;
import br.unifei.imc.service.ServiceGame;
import br.unifei.imc.util.CsvUtils;

import java.nio.file.Paths;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Game> allGameList  = CsvUtils.readGameCvs(Paths.get("vendas-games.csv"));

        List<Game> platGames = ServiceGame.getListByPlatform(allGameList, Platform.PS4);

        platGames.forEach(g -> System.out.println(g.getName()));

        System.out.println("_______________________________");
        List<Game> pubGames = ServiceGame.getListByPublisher(allGameList, Publisher. SonyComputerEntertainment);

        pubGames.forEach(g -> System.out.println(g.getName()));
    }
}
