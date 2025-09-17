package Ejercicio1;

import java.util.Scanner;

public class ProgramaDiasDelMes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mes;

        do {
            System.out.println("Introduce el número de un mes (1-12): ");
            while (!sc.hasNextInt()) {
                // Se puede utilizar BigInteger tambien pero reservaría más memoria.
                System.err.println("Entrada no válida. Escriba un número entero del 1-12");
                sc.next(); // Descarta la entrada no válida y pasa al siguiente valor
                System.out.println("Ingrese un número del mes (1-12) o 0 para salir: ");
            }


            mes = sc.nextInt();

            if (mes == 0) {
                System.out.println("Fin del programa");
            } else {
                int dias = CalendarioMes3.diaDelMes(mes);
                if (dias == -1) {
                    System.err.println("Mes invalido. Introduce un número del mes válido: ");
                } else {
                    System.out.println("El mes " + mes + " tiene " + dias + " dias");
                }
            }
        } while (mes != 0);
        {
            sc.close();
        }
    }
}
