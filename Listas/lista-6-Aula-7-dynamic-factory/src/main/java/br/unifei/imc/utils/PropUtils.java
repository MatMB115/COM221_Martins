package br.unifei.imc.utils;

import br.unifei.imc.asteroide.TipoAST;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.rmi.RemoteException;
import java.util.Properties;

public class PropUtils {

    public static String buscaNomeClasse(TipoAST tipoAst){

        Properties prop = new Properties();

        try{
            prop.load(Files.newInputStream(
                    Paths.get("asteroides.properties")));
        } catch (IOException e){
            e.printStackTrace();
        }

        return prop.getProperty(tipoAst.name());
    }

}
