package br.unifei.imc.gerador;

import br.unifei.imc.model.Pessoa;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;


public class GeradorJSON implements GeradorArquivo{
    @Override
    public void gerarArquivo(List<Pessoa> pessoas) {

        try {
            PrintWriter arquivo = new PrintWriter(new FileWriter("pessoas.json"));
            GsonBuilder gsonBuilder = new GsonBuilder();
            gsonBuilder.setPrettyPrinting();
            Gson gson = gsonBuilder.create();
            gson.toJson(pessoas, arquivo);

            arquivo.close();

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
