package estructurasrepetitivas_while;

import java.util.Random;
import java.util.Scanner;

public class EstructurasRepetitivas_While {

    public static void main(String[] args) {

        //Ejemplo bucle controlado por contador
        int valorRandom = 0, vuelta = 0;
        Random rand = new Random();
        boolean bandera = true;
        Scanner teclado = new Scanner(System.in);
        String respuesta;

        while (vuelta < 10) {
            valorRandom = rand.nextInt(50);
            System.out.println("Valor random:" + valorRandom + " en la vuelta: " + vuelta);
            vuelta++;
        }

        while (bandera == true) {
            System.out.println("El valor de mi bandera es: " + bandera);
            System.out.println("¿La bandera sigue flameando?");
            respuesta = teclado.next();

            //equalsIgnoreCase() ignora mayúsculas y minúsculas
            
            /*en Java el método trim() ignora los espacios al comienzo y al final de una cadena 
            de caracteres. Este método devuelve una nueva cadena de texto con los espacios en 
            blanco eliminados tanto al principio como al final, pero no modifica los 
            espacios que están en el medio de la cadena.*/
            
            if (respuesta.trim().equalsIgnoreCase("no")) {
                bandera = false;
            }
        }
    }

}
