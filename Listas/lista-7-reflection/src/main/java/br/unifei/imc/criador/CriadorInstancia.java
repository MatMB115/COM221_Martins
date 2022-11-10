package br.unifei.imc.criador;

import br.unifei.imc.pojo.BoardGame;

import java.lang.reflect.InvocationTargetException;

public class CriadorInstancia {
    public static Object criaInstancia(Class<?> clazz) {

        Object instancia = null;

        try {
            instancia = clazz.getConstructor().newInstance();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return instancia;

    }

    public static Object criaInstancia(Class<?> clazz, Object[] parametros) {

        Object instancia = null;

        //Construir vetor de tipos
        Class<?>[] paraTipos = new Class[parametros.length];

        for(int i = 0; i < parametros.length; i++){
            paraTipos[i] = getTipo(parametros[i]);
        }
        try {
            instancia = clazz.getConstructor(paraTipos).newInstance(parametros);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return instancia;
    }

    private static  Class<?> getTipo(Object parametro){
        if(parametro.getClass() == Integer.class)
            return int.class;
        else if(parametro.getClass() == Double.class)
            return double.class;
        return parametro.getClass();
    }
}
