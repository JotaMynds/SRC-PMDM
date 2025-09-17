package Ejercicio4;

import java.util.Scanner;

public class NumerosHastaCero {
    public static void NumerosHasta() {
        Scanner sc = new Scanner(System.in);
        int N = 0;
        System.out.println("Introduce un número: ");
        int NM1 = 0;
        int NM2 = 0;
        int Nm = 0;
        boolean primero = true;

        //Comprobar que es un numero y no un string y si no es negativo
        while (!sc.hasNextBigInteger()) {
            System.err.println("Formato incorrecto");
            sc.next();
            System.out.println("Introduce un número: ");
            N = sc.nextInt();
        }

        N = sc.nextInt();

        while (N != 0) {
            //Guardar variables para los números máximos y el número mínimo
            while (N < 0) {
                System.err.println("Número no válido");
                sc.next();
                System.out.println("Introduce un número positivo: ");
                N = sc.nextInt();
            }
            if (primero) { // Hacer que el primer número sea el que
                // iguala las asignaciones para que el mínimo pueda compararse
                NM1 = N;
                Nm = N;
                primero = false;
            }
                //Guardar variables para los números máximos y el número mínimo

                esPar(N); //Comprueba si es par con método externo

                if (N > NM1) { // Si el número introducido es mayor que el mayor registrado lo sustituye
                    NM2 = NM1;
                    NM1 = N;
                } else if (N > NM2 && N != NM1) { // Si el número introducido
                    // es mayor que el 2 pero desigual del primero se le asigna
                    NM2 = N;
                }

                // Si el numero introducido es menor que el menor registrado lo sustituye
                if (N < Nm) {
                    Nm = N;
                }


            System.out.println("Introduce otro número: ");

            while (!sc.hasNextBigInteger()) {
                System.err.println("Formato incorrecto");
                sc.nextInt();
                System.out.println("Introduce un número: ");
                N = sc.nextInt();
            }

            N = sc.nextInt();

            if (N < 0) {
                System.err.println("Número no válido");
                sc.nextInt();
                System.out.println("Introduce un número positivo: ");
                sc.nextInt();
            }

        }
        System.out.println("El mayor número es: " + NM1);
        System.out.println("El segundo mayor número es: " + NM2);
        System.out.println("El menor número es: " + Nm);

    }

    /**
     * Cataloga si el número es par o impar
     *
     * @param N número introducido por el usuario
     */

    public static void esPar(int N) {
        if (N % 2 == 0) {
            System.out.println("El número es par");
        } else {
            System.out.println("El número es impar");
        }
    }
}
