package br.com.altieres;

import java.util.ArrayList;
import java.util.List;

public class UseList {
    public static void main(String[] args) {

        List<Double> notas = new ArrayList<Double>();
        notas.add(7d);
        notas.add(6d);
        notas.add(8d);
        notas.add(5.2);
        notas.add(3.7);
        notas.add(5d);
        notas.add(6.1);

        System.out.println("Imprimir posição do valor 3.7:" + notas.indexOf(3.7));
        System.out.println(notas);

        System.out.println("Add objeto na lista com valor 5.8 na posição 4:" );
        notas.add(4,5.8);
        System.out.println(notas);

        System.out.println("Altere o valor do objeto 8.0 pelo valor 8.1");
        notas.set(notas.indexOf(8.0),8.1);
        System.out.println(notas);

        System.out.println("Verifique se a lista possui o objeto 6.1: " + notas.contains(6.1));


        System.out.println(notas);
    }

}
