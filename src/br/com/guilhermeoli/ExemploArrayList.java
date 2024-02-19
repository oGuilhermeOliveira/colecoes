package br.com.guilhermeoli;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * @author guiol
 */
 public class ExemploArrayList {

        public static void main(String args[]) {
            exemploListaSimples();
            exemploListaSimplesOrdemAscendente();
            exemploNumeros();
            exemploCarros();
        }

        private static void exemploCarros() {
            System.out.println("****** exemploCarro ******");
            List<String> carros = new ArrayList<>();
            carros.add("BMW");
            carros.add("Ferrari");
            carros.add("Porsche");
            Collections.sort(carros);
            System.out.println(carros);
            System.out.println(" ");
        }


        private static void exemploNumeros() {
            System.out.println("****** exemploNumeros ******");
            List<Integer> numeros = new ArrayList<>();
            numeros.add(4);
            numeros.add(3);
            Collections.sort(numeros);
            System.out.println(numeros);
            System.out.println(" ");
        }

        private static void exemploListaSimples() {
            System.out.println("****** exemploListaSimples ******");
            List<String> lista = new ArrayList<String>();
            lista.add("João da Silva");
            lista.add("Antonio Sousa");
            lista.add("Lúcia Ferreira");
            System.out.println(lista);
            System.out.println(" ");
        }

        private static void exemploListaSimplesOrdemAscendente() {
            System.out.println("****** exemploListaSimplesOrdemAscendente ******");
            List<String> lista = new ArrayList<String>();
            lista.add("João da Silva");
            lista.add("Antonio Sousa");
            lista.add("Lúcia Ferreira");
            // Ordernar lista
            Collections.sort(lista);
            System.out.println(lista);
            System.out.println(" ");
        }
    }