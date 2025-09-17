package Ejercicio3;

import java.util.Random;
import java.util.Scanner;

public class AdivinarNumero {
    public static void NumeroRandom(){
        Scanner teclado = new Scanner(System.in);

        Random Aleatorio = new Random();
        int numero = Aleatorio.nextInt(1,100);

        System.out.println("Introduce un numero para adivinar el numero:");
        int N1 = teclado.nextInt();

        for(int i= 1; i<=10;i++){
            if(N1<numero){
                System.out.println("El numero es mayor a "+N1);
            }else if(N1>numero){
                System.out.println("El numero es menor a "+N1);
            }else {
                System.out.println("El numero " + N1 + " es el número correcto");
                break;
            }
            System.out.println("Introduce un numero:");
            N1 = teclado.nextInt();
        }
    }






}
