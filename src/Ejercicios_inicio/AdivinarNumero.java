package Ejercicios_inicio;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random Aleatorio = new Random();
        int numero = Random.nextInt(1,100);
    }
    public void NumeroRandom(Scanner teclado, int numero){
        System.out.println("Introduce un numero para adivinar el numero:");
        int N1 = teclado.nextInt();
        while(numero!=N1){
            System.out.println("Introduce un numero:");
        }

    }






}
