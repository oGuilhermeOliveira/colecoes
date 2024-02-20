package br.com.guilhermeoli;


import java.util.Collections;
import java.util.List;

/**
 * @author guiol
 */
public class LinkedList<S> {

    public static void main(String args[]) {
        exemploListaSimples();
        exemploListaSimplesOrdemAscendente();
    }

    private static void exemploListaSimples() {
        System.out.println("****** exemploListaSimples ******");
        List<String> lista = (List<String>) new LinkedList<>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        System.out.println(lista);
        System.out.println("");

        lista.remove(0);
        System.out.println(lista);
        boolean contem = lista.contains("Antonio Sousa");
        System.out.println(contem);

        System.out.println(lista.get(0));
    }

    private static void exemploListaSimplesOrdemAscendente() {
        System.out.println("****** exemploListaSimplesOrdemAscendente ******");
        List<String> lista = (List<String>) new LinkedList<String>();
        lista.add("João da Silva");
        lista.add("Antonio Sousa");
        lista.add("Lúcia Ferreira");
        Collections.sort(lista);
        System.out.println(lista);
        System.out.println("");
    }
}
