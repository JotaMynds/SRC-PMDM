package Ejercicio1;

public class CalendarioMes3 {
    /**
     * Devuelve los días del mes (sin tener en cuenta los bisiestos)
     * @param mes número del mes (1-12)
     * @return días del mes, o -1 si el mes no es válido
     */

    public static int diaDelMes(int mes){
        switch (mes){
            case 1,3,5,7,8,10,12:
                return 31;
            case 4,6,9,11:
                return 30;
            case 2:
                return 28;
            default:
                return -1;
        }
    }
}
