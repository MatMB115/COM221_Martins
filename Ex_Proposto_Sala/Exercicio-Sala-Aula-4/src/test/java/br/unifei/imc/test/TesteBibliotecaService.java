package br.unifei.imc.test;

import br.unifei.imc.services.BibliotecaService;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class TesteBibliotecaService {

    static BibliotecaService service;
    @BeforeClass
    public static void setup(){
        service = new BibliotecaService();
    }

    @Test
    public void testeApresentaNotasOrdenadas(){

        double[] notas = {5,4,3,2,1};
        service.apresentarNotasOrdenadas(notas);
        Assert.assertEquals(ConstTestInfo.notasOrdenadas,notas);
    }

}
