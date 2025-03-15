package condicionales;

import java.util.Scanner;

public class Condicionales {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int edad;
        String pregunta;

        System.out.println("Ingrese su edad a continuación: (números enteros)");
        edad = teclado.nextInt();

        if (edad >= 60) {
            System.out.println("Debes tener menos de 60 años para aplicar a la libreta...");
            System.out.println("Imposible seguir con el trámite.");
        } else if (edad >= 18) {
            System.out.println("Puedes aplicar a la libreta de conducir");

            System.out.println("Gustas iniciar el trámite?");
            System.out.println("Ingrese Si/No (sin tilde)");
            pregunta = teclado.next().trim().toLowerCase();

            if (pregunta.equals("no")) {
                System.out.println("Gracias por su consulta, adiós!");
                System.out.println(pregunta.toLowerCase());
            } else {
                System.out.println("Se está iniciando el trámite, aguarde..");
            }
        } else {
            System.out.println("No puedes aplicar a la libreta de conducir");
        }

    }

}
