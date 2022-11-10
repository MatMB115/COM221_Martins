import br.unifei.imc.criador.CriadorInstancia;
import br.unifei.imc.pojo.BoardGame;
import br.unifei.imc.pojo.Puzzle;
import org.junit.Assert;
import org.junit.Test;



public class TesteCriadorInstancia {

    @Test
    public void testeCriaBGVazio() {
        BoardGame bg = (BoardGame) CriadorInstancia.
                criaInstancia(BoardGame.class);
        Assert.assertNotNull(bg);
    }

    @Test
    public void testeCriaBGParametros() {

        Object[] parametros = new Object[3];
        parametros[0] = "Azul";
        parametros[1] = 4;
        parametros[2] = 599.99;

        BoardGame bg = (BoardGame) CriadorInstancia.criaInstancia(
                BoardGame.class,parametros);

        Assert.assertEquals("Azul", bg.getNome());
        Assert.assertEquals(4, bg.getQtdJogadores());
        Assert.assertEquals(599.99, bg.getPreco(),0.01);

    }

    @Test
    public void testeCriaPuzzleVazio() {

        Puzzle puzzle = (Puzzle) CriadorInstancia.criaInstancia(Puzzle.class);
        Assert.assertNotNull(puzzle);

    }

    @Test
    public void testeCriaPuzzleParametros() {

        Object[] parametros = new Object[4];
        parametros[0] = "Petit Cafe";
        parametros[1] = 6000;
        parametros[2] = 98.9;
        parametros[3] = 56.7;

        Puzzle puzzle = (Puzzle) CriadorInstancia.criaInstancia(Puzzle.class,parametros);

        Assert.assertEquals("Petit Cafe", puzzle.getNome());
        Assert.assertEquals(6000, puzzle.getQtdPecas());
        Assert.assertEquals(98.9, puzzle.getLargura(),0.01);
        Assert.assertEquals(56.7,puzzle.getAltura(),0.1);
    }


}
