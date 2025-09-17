package Ejercicio4;

import java.util.Scanner;

public class NumerosHastaCero {

    public static void NumerosHasta() {
        Scanner sc = new Scanner(System.in);
        int N;
        int mayor1 = 0;
        int mayor2 = 0;
        int menor = 0;
        boolean primero = true;

        System.out.println("Introduce un número positivo (0 para terminar): ");

        //Para validar que lo que se introduce es un número
        while (true) {
            if (sc.hasNextInt()) {
                N = sc.nextInt();
                break;
            } else {
                System.out.println("Formato incorrecto. Introduce un número entero:");
                sc.next(); // limpiar entrada incorrecta
            }
        }

        while (N != 0) {
            // Comprobar que el número sea positivo, si no se introduce de nuevo
            if (N < 0) {
                System.out.println("Número no válido, introduce solo positivos:");
            } else {
                // Inicialización la primera vez
                if (primero) {
                    mayor1 = N;
                    menor = N;
                    primero = false;
                }

                // Comprobar par o impar
                esPar(N);

                // Actualizar mayores
                if (N > mayor1) {
                    mayor2 = mayor1;
                    mayor1 = N;
                } else if (N > mayor2 && N != mayor1) {
                    mayor2 = N;
                }

                // Actualizar menor
                if (N < menor) {
                    menor = N;
                }
            }

            System.out.println("Introduce otro número (0 para terminar): ");

            while (true) {
                if (sc.hasNextInt()) {
                    N = sc.nextInt();
                    break;
                } else {
                    System.out.println("Formato incorrecto. Introduce un número entero:");
                    sc.next(); // limpiar entrada incorrecta
                }
            }
        }

        if (!primero) { // Solo se muestra si se introdujeron números válidos
            System.out.println("El mayor número es: " + mayor1);
            System.out.println("El segundo mayor número es: " + mayor2);
            System.out.println("El menor número es: " + menor);
        } else {
            System.out.println("No se introdujeron números válidos.");
        }
    }

    // Método independiente para catalogar números pares o impares
    public static void esPar(int N) {
        if (N % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
