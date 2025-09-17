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

            //Guardar variables para los números máximos y el número mínimo

            esPar(N);
            if (N > NM1) {
                NM1 = N;
            } else if (N > NM2 && N< NM1) {
                NM2 = N;
            } else if (N < Nm) {
                Nm = N;
            }

            System.out.println("Introduce un número: ");


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
