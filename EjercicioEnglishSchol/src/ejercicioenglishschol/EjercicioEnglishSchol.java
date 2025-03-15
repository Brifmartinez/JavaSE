package ejercicioenglishschol;

import java.util.Scanner;

public class EjercicioEnglishSchol {

    public static void main(String[] args) {

        //declaración de variables
        int edad;
        Scanner teclado = new Scanner(System.in);

        System.out.println("BIENVENID@");
        System.out.println("Ingrese la edad del alumno por teclado a continuación:");
        System.out.println("a posterior presione ENTER");
        edad = teclado.nextInt();

        if (edad >= 4 && edad <= 6) {
            System.out.println("El horario del grupo KINDER es: Lunes y Miércoles _ 16:00 a 17:30Hs");
        } else {
            if (edad >= 7 && edad <= 8) {
                System.out.println("El horario del grupo 1st Year es: Martes y Jueves _ 16:00 a 17:30Hs");
            } else {
                if (edad >= 9 && edad <= 10) {
                    System.out.println("El horario del grupo 2nd Year es: Martes y Jueves _ 17:30 a 19:00Hs");
                } else {
                    if (edad >= 11 && edad <= 13) {
                        System.out.println("El horario del grupo 3rd Year es: Lunes y Miércoles _ 17:00 a 18:30Hs");
                    } else {
                        System.out.println("INGRESO UNA EDAD QUE NO CORRESPONDE");
                        System.out.println("ASEGÚRESE DE INGRESAR UN NÚMERO ENTERO ENTRE 4 Y 13");
                    }
                }
            }
        }
    }
}
