package Clase;

import java.util.Scanner;

public class Alarma {
    static boolean puerta1 = false, puerta2 = false, puerta3 = false; // False es que está cerrado.
    static boolean sensor1 = false, sensor2 = false; // False es que no están activos.
    static int contra = 1234;
    static Scanner sc = new Scanner(System.in);

    public static String abierto() {
        return "El sistema está apagado, no pasa nada. \n";
    }

    public static String parcial() {
        String reporte = "";
        if (puerta1) {
            reporte += "Puerta 1 abierta, se activó la alarma \n";
        }else if (puerta2) {
            reporte += "Puerta 2 abierta, se activó la alarma \n";
        }else if (puerta3) {
            reporte += "Puerta 3 abierta, se activó la alarma \n";
        }else reporte = "Las puertas están cerradas. \n";
        
        if (sensor1 || sensor2) {
            reporte += "No pasa nada con los sensores en este modo\n";
        }

        return reporte;
    }

    public static void cerrarPuertas() {
        puerta1 = false;
        puerta2 = false;
        puerta3 = false;
    }

    public static String vacaciones() {
        String reporte = "";
        if (puerta1) {
            reporte += "Puerta 1 abierta, se activó la alarma \n";
        } else if (puerta2) {
            reporte += "Puerta 2 abierta, se activó la alarma \n";
        }else if (puerta3) {
            reporte += "Puerta 3 abierta, se activó la alarma \n";
        }else if (sensor1) {
            reporte += "El sensor 1 se activó \n";
        }else if (sensor2) {
            reporte += "El sensor 2 se activó \n";
        }else reporte += "Todo está cerrado y no hubo movimientos en los sensores. \n";
        return reporte;
    }

    public static void resetearSensores() {
        sensor1 = false;
        sensor2 = false;
    }

    public static void realizarAccion(int accion) {
        switch (accion) {
            case 1:
                puerta1 = true;
                break;
            case 2:
                puerta2 = true;
                break;
            case 3:
                puerta3 = true;
                break;
            case 4:
                sensor1 = true;
                break;
            case 5:
                sensor2 = true;
                break;
            case 6:
                puerta1 = true;
                puerta2 = true;
                puerta3 = true;
                sensor1 = true;
                sensor2 = true;
                break;
            case 7: 
                cerrarPuertas();
                break;
            case 8:
                resetearSensores(); 
                break;
            default:
                System.out.println("\n");
                break;
        }
    }

    public static void menu() {
        System.out.println("¿Qué acción deseas realizar? (9 para salir)");
        System.out.println("1- Abrir puerta 1.");
        System.out.println("2- Abrir puerta 2.");
        System.out.println("3- Abrir puerta 3.");
        System.out.println("4- Abrir pasar por el sensor 1.");
        System.out.println("5- Abrir pasar por el sensor 2.");
        System.out.println("6- Todo lo de arriba.");
        System.out.println("7- Cerrar las puertas.");
        System.out.println("8- Resetear los sensores.");
        System.out.println("9.- Nada.");
    }

    public static void main(String[] args) {
        int estado = 0;
        do {
            System.out.println("Escoje el modo de alarma que se pondrá:");
            System.out.println("1- Abierto.");
            System.out.println("2- Parcial.");
            System.out.println("3- Vacaciones.");
            System.out.println("4- Cerrar app.");
            estado = sc.nextInt();
            System.out.println("Ingresa la contraseña: ");
            int entrada = sc.nextInt();
            int pass = 0;
            switch (estado) {
                case 1:
                    if (entrada == contra) {
                        System.out.println(abierto());
                    } else {
                        System.out.println("Contraseña incorrecta.");
                    }
                    break;
                case 2:
                    if (entrada == contra) {
                        System.out.println("El modo parcial se activó \n");
                        do {
                            menu();
                            pass = sc.nextInt();
                            realizarAccion(pass);
                        } while (pass != 9);
                        System.out.println(parcial());
                    } else {
                        System.out.println("Contraseña incorrecta.\n");
                    }
                    break;
                case 3:
                    if (entrada == contra) {
                        System.out.println("El modo vacaciones se activó \n");
                        do {
                            menu();
                            pass = sc.nextInt();
                            realizarAccion(pass);
                        } while (pass != 9);
                        System.out.println(vacaciones());
                    } else {
                        System.out.println("Contraseña incorrecta. \n");
                    }
                    break;
                case 4:
                    System.out.println("Aplicación cerrada.");
                    break;
                default:
                    System.out.println("Ingresa una opción válida. \n");
                    break;
            }
        } while (estado != 4);
        sc.close();
    }
}
