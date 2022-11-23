package br.unifei.imc.framework.comparador;

import br.unifei.imc.app.pojo.BoardGame;
import br.unifei.imc.framework.anotacao.Ignorar;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Comparador {
    public static <T>List<Diferenca> comparador(T obj1, T obj2){
        List<Diferenca> diff = new ArrayList<>();

        Class<?> clazz1 = obj1.getClass();

        for(Field field: clazz1.getDeclaredFields()){
            if(field.isAnnotationPresent(Ignorar.class)) {
                continue;
            }else{
                Object valor1 = null;
                Object valor2 = null;
                try {
                    field.setAccessible(true);
                    valor1 = field.get(obj1);
                    valor2 = field.get(obj2);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                }
                if(!valor2.equals(valor1))
                    diff.add(new Diferenca(field.getName(), valor1, valor2));
            }
        }
        return diff;
    }
}
