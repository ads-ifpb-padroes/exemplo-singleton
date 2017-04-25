package br.edu.ifpb.padroes.singleton;

import java.lang.reflect.Constructor;
import java.util.Calendar;

/**
 * Created by diogomoreira on 20/07/16.
 */
public class Loader {

    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException {
        Configuracao c = Configuracao.getInstance("Diogo", "Moreira");
        Calendar calendar = Calendar.getInstance();
        Configuracao c2 = Configuracao.getInstance("Diogo", "Moreira");

        Class<Configuracao> classConf = (Class<Configuracao>) Class.forName("br.edu.ifpb.padroes.singleton.Configuracao");
        Constructor<?>[] constructors = classConf.getConstructors();
        Constructor<Configuracao> construct = null;
        for (Constructor<?> constructor : constructors) {
            construct = (Constructor<Configuracao>) constructor;
        }
        construct.setAccessible(true);

        Configuracao configuracao2 = classConf.newInstance();


        c2.setNomeUsuario("Diogo        1");
        System.out.println(c.getNomeUsuario());
        System.out.println(c == configuracao2);
    }

}
