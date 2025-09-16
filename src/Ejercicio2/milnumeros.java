package Ejercicio2;

import java.util.Scanner;

public class milnumeros {

    public static void ContarNumeros() {
        Scanner teclado = new Scanner(System.in);
        int NumerosIntroducidos = 0;
        int SumaTotal = 0;
        double Media = 0.0;
        while(SumaTotal < 1000) {
            System.out.print("Ingrese un numero: ");
            int Numero = teclado.nextInt();
            NumerosIntroducidos++;
            SumaTotal += Numero;
            Media = (double) (SumaTotal / NumerosIntroducidos);
        }
        System.out.println("La suma total de los numeros introducidos es: " + SumaTotal +
                "\nLa media de los numeros introducidos es: " + Media +
                "\nLa cantidad de numeros introduccidos es de " + NumerosIntroducidos + " numeros");
    }
}
