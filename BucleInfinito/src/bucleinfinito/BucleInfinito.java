package bucleinfinito;

import java.util.Scanner;

public class BucleInfinito {

    public static void main(String[] args) {

        int contador = 0;
        boolean bandera = true;
        String respuesta;
        Scanner teclado = new Scanner(System.in);

        /*while (contador <= 10) {
            System.out.println("Bucle infinito");
        }*/

        while (bandera == true) {
            System.out.println("Querés dejar de ver este mensaje?");
            respuesta = teclado.next();
        }
    }

}
