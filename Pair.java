import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Pair {
    static Scanner sc = new Scanner(System.in);

    private static void Hello() {
        System.out.println("Ingresa tu nombre:");
        String name = sc.nextLine();
        if (name.trim().isEmpty()) {
            System.out.println("Hello World");
        } else
            System.out.println("Hello " + name);
    }

    public static void SM() {
        ArrayList<Integer> arreglo = new ArrayList<>();
        System.out.println("¿Cuantos números quiere agregar?");
        int tam = sc.nextInt();
        do {
            System.out.println("Ingresa el número");
            arreglo.add(sc.nextInt());
        } while (arreglo.size() != tam);
        System.out.println("Este es su arreglo: \n" + arreglo.toString());
         Collections.sort(arreglo, Collections.reverseOrder());
         if (arreglo.size() >= 2) {
            int secondLargest = arreglo.get(1); 
            System.out.println("El segundo valor más grande en el ArrayList es: " + secondLargest);
        } else {
            System.out.println("No hay suficientes elementos en el ArrayList para encontrar el segundo valor más grande.");
        }

    }

    private static void mid() {
        LinkedList<Integer> lista = new LinkedList<>();
        System.out.println("¿Cuantos números quiere agregar?");
        int tam = sc.nextInt();
        do {
            System.out.println("Ingresa el número");
            lista.add(sc.nextInt());
        } while (lista.size() != tam);
        System.out.println("Esta es tu lista: \n" + lista.toString());
        if (lista.size() % 2 == 0) {
            int num = lista.size() / 2;
            int actual = 0;
            for (int elemento : lista) {
                if (actual == num) {
                    System.out.println("Elemento medio: " + elemento);
                    break;
                }
                actual++;
            }
        } else {
            int num = (lista.size() - 1) / 2;
            System.out.println("El número de en medio es: " + lista.get(num));
        }
    }

    public static void main(String[] args) {
        
    }
}
