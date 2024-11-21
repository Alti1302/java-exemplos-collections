package br.com.altieres;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
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

        System.out.println("Verifique o valo do objeto na posição 5: " + notas.get(5));
        System.out.println(notas);

        System.out.println("Imprima o menor valor da lista do objeto:" + Collections.min(notas));

        System.out.println("Imprima o maior valor da lista do objeto:" + Collections.max(notas));

        System.out.println("Remova o valor da primeira posiçao: ");
        notas.remove(0);

        System.out.println("Remova o valor da 6.1: ");
        notas.remove(6.1);
        System.out.println(notas);

        System.out.println("Verifique se a lista está vaiza: " + notas.isEmpty());

        List<Double> notas2 = new LinkedList<>();

        System.out.println("Crie uma nova lista e insira os valoes da lista antiga nela");
        notas2.addAll(notas);
        System.out.println(notas2);

        System.out.println("Imprima o primeiro valor da nova lista: " + notas2.get(0));
        System.out.println(notas2);

    }

}
