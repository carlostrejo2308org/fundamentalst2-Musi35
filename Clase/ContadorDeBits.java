package Clase;

public class ContadorDeBits {
    public static int contarBits(int numero) {
        int contador = 0;
        
        //Utiliza un bucle para revisar cada bit del número
        while (numero != 0) {
            // Si el último bit es 1, incrementa el contador
            if ((numero & 1) == 1) {
                contador++;
            }
            
            //Desplaza el número un bit a la derecha para revisar el siguiente bit
            numero = numero >>> 1; // Usamos ">>>", desplazamiento sin signo
        }
        
        return contador;
    }
    
    public static void main(String[] args) {
        // Caso de prueba 1: Contar bits en el número 0
        int numero1 = 0;
        int resultado1 = ContadorDeBits.contarBits(numero1);
        assert resultado1 == Integer.bitCount(numero1) : "Fallo en el caso de prueba 1";
        System.out.println("Caso de prueba 1 exitoso. Resultado: " + resultado1);

        // Caso de prueba 2: Contar bits en un número positivo
        int numero2 = 42;
        int resultado2 = ContadorDeBits.contarBits(numero2);
        assert resultado2 == Integer.bitCount(numero2) : "Fallo en el caso de prueba 2";
        System.out.println("Caso de prueba 2 exitoso. Resultado: " + resultado2);

        // Caso de prueba 3: Contar bits en un número negativo
        int numero3 = -17;
        int resultado3 = ContadorDeBits.contarBits(numero3);
        assert resultado3 == Integer.bitCount(numero3) : "Fallo en el caso de prueba 3";
        System.out.println("Caso de prueba 3 exitoso. Resultado: " + resultado3);
        System.out.println("Todos los casos de prueba han pasado.");
    }
}
