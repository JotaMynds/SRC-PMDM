package Ejercicio5;

import java.util.Scanner;

public class Array20numeros {

    public static void IntroducirNumeros(){
        Scanner sc = new Scanner(System.in);
        int [] NP = new int[20];
        System.out.println("Introduce un número primo: ");
        int num= 0;

        while(!sc.hasNextInt()){
            System.out.println("Formato incorrecto");
            sc.next();
            System.out.println("introduce un número primo:");
            num = sc.nextInt();
        }

        num = sc.nextInt();

        for (int i = 0; i < NP.length; i++) {
            if(esPrimo(num)){
                NP[i] = num;
                System.out.println("El número " + num + " es un número primo");
            }else{
                System.out.println("No es un número primo, prueba de nuevo");
            }
            System.out.println("Introduce un número primo: ");
            num = sc.nextInt();

        }
    }
    public static void enseñarNúmeros(int [] NP){
        for(int i = 0; i < NP.length; i++){
            System.out.println(NP[i]);
        }
    }

    public static boolean esPrimo(int numero) {
        if (numero < 2) {
            return false;
        }
        // Se comprueba si el número es divisible por algún número desde 2 hasta su raíz cuadrada.
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                // Si encuentra un divisor, no es primo
                return false;
            }
        }
        // Si no se encuentran divisores, es primo
        return true;
    }
}
