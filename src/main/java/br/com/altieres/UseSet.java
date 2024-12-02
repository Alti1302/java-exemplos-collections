package br.com.altieres;

import java.util.*;

public class UseSet {
    public static void main(String[] args) {

        System.out.println("Criando um conjunto e adicionando notas: ");
        Set<Double> notas = new HashSet<>(Arrays.asList(7d, 8d, 8.2, 8.1, 9.0, 7.6, 5d));
        System.out.println(notas.toString());

        System.out.println("Conferindo se existe a nota 5 no conjunto: " + notas.contains(5d));

        System.out.println("Exiba o menor valor do conjunto :" + Collections.min(notas));

        System.out.println("Exiba o maior valor do conjunto :" + Collections.max(notas));

        System.out.println("Exiba a soma do conjunto :");
        Iterator<Double> iterator = notas.iterator();
        Double soma = 0.0;
        while (iterator.hasNext()){
            Double next = iterator.next();
            soma += next;
            
            System.out.println("Exiba a média das notas: " + (soma/notas.size()));

        }
    }
}
