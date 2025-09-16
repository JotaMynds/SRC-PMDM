package Ejercicio1;

import java.lang.reflect.Array;
import java.util.Scanner;

public class CalendarioMes2 {

    public static void NumeroMes(){

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce el numero de un mes (1-12)(0 para salir)");
        int Nmes = teclado.nextInt();
        String mes= ObtenerMes(Nmes);

        while (Nmes != 0) {
            switch (Nmes) {
                case 1, 3, 5, 7, 8, 10, 12:
                    System.out.println(mes + " tiene 31 días");
                    break;
                case 4, 6, 9, 11:
                    System.out.println(mes + " tiene 30 días");
                    break;
                case 2:
                    System.out.println(mes + " tiene 28 días");
                    break;
                case 0:
                    System.out.println("EL USUARIO HA SALIDO");
                    break;
                default:
                    System.out.println("El numero no es un mes existente");
                    break;
            }
            System.out.println("Introduce el numero de un mes (1-12)(0 para salir):");
            Nmes = teclado.nextInt();
        }
    }

    public static String ObtenerMes(int Nmes){

        String[] Mes = {"Enero","Febrero","Marzo","Abril","Mayo","Junio", "Julio",
            "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

        return Mes[Nmes-1];
    }
}
