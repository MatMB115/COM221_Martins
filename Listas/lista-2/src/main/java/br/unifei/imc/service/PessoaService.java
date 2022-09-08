package br.unifei.imc.service;

import br.unifei.imc.exceptions.OpcaoErradaException;
import br.unifei.imc.gerador.GeradorCSV;
import br.unifei.imc.gerador.GeradorJSON;
import br.unifei.imc.model.Pessoa;
import br.unifei.imc.gerador.GeradorArquivo;

import java.util.ArrayList;
import java.util.List;

public class PessoaService {
    protected List<Pessoa> pessoas;
    public PessoaService(){
        pessoas = new ArrayList<>();
    }
    private void gerarMapaPessoa(){
        pessoas.add(new Pessoa(1,"Guts",39));
        pessoas.add(new Pessoa(2,"Casca",30));
        pessoas.add(new Pessoa(3,"Andreas",60));
    }
    public void gerarArquivo(OpcaoArquivo op){
        if(op != OpcaoArquivo.CSV && op != OpcaoArquivo.JSON){
            throw new OpcaoErradaException("Formato de arquivo inválido");
        }else{
            gerarMapaPessoa();
            if(op.equals(OpcaoArquivo.CSV)){
                GeradorArquivo geraArquivoCVS = new GeradorCSV();
                geraArquivoCVS.gerarArquivo(pessoas);
                pessoas.removeAll(pessoas);
            }else{
                GeradorArquivo geraArquivoJSON = new GeradorJSON();
                geraArquivoJSON.gerarArquivo(pessoas);
                pessoas.removeAll(pessoas);
            }
        }
    }
}
