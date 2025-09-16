package Ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random Aleatorio = new Random();
        int numero = Aleatorio.nextInt(1,100);
        NumeroRandom(teclado, numero);
    }
    public static void NumeroRandom(Scanner teclado, int numero){
        System.out.println("Introduce un numero para adivinar el numero:");
        int N1 = teclado.nextInt();
        while(numero!=N1){ //PONERLO CON FOR, SOLAMENTE 10 INTENTOS
            System.out.println("Introduce un numero:");
            if(N1<numero){
                System.out.println("El numero es mayor a "+N1);
            }else if(N1>numero){
                System.out.println("El numero es menor a "+N1);
            }else {

            }
        }

    }






}
