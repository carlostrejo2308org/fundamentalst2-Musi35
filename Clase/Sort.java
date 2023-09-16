package Clase;

import java.util.Collections;
import java.util.ArrayList;
import java.util.Scanner;
//Programa para acomodar un arreglo de mayor a menor utilizando Collections
public class Sort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arreglo = new ArrayList<>();
        System.out.println("¿Cuantos números quiere agregar?");
        int tam = sc.nextInt();
        do {
            System.out.println("Ingresa el número");
            arreglo.add(sc.nextInt());
        } while (arreglo.size() != tam);

        assert arreglo.size() == tam : "El tamaño del arreglo no coincide con el valor ingresado.";
        System.out.println("Este es su arreglo: \n" + arreglo.toString());
        Collections.sort(arreglo, Collections.reverseOrder());
        System.out.println("Este es su arreglo acomodado de mayor a menor: \n" + arreglo);
        sc.close();
    }

}
