package otrosoperadores;

import java.util.Scanner;

public class OtrosOperadores {

    public static void main(String[] args) {

        /*1)Realizar un programa que muestre en pantalla los números del 1 al 35.
        Uno abajo del otro, utilizar para esto alguna estructura repetitiva.*/
 /*for(int numero = 0; numero < 35 ; numero++){
            System.out.println(numero+1);
        }*/
 /*2)Realizar un programa que dado por teclado un límite numérico (por ejemplo 100)
        muestre en pantalla todos los números hasta ese límite (empezando por 1)*/
 /*int contador = 0, numeroClave = 100, respuesta;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("Ingrese el número clave para finalizar: ");
            respuesta = teclado.nextInt();

            if (respuesta == numeroClave) {
                System.out.println(contador);
            } else {
                contador++;
            }
        } while (respuesta != numeroClave);*/
 /*3) Realizar un programa que muestre por pantalla los números del 200 al 250
 saltando de 2 en dos. La secuencia debería ser: 200... 202... 204... etc.)
         */
 /*for (int numero = 2, numero2 = 200; numero2 <= 250; numero2 += numero) {
            System.out.println(numero2);
        }*/
 /*4) Realizar un programa que lleve a cabo la cuenta regresiva para el año nuevo.
 La cuenta debe comenzar en 10 y terminar en 1.*/
 /*for (int contador = 10; contador > 0; contador--) {
            System.out.println(contador);
            if(contador == 1){
                System.out.println("Feliz año nuevo!");
            }
        }*/
 /*5) Realizar un programa que muestre en pantalla palabras que sean ingresadas por
 teclado hasta que se ingrese la palabra "salir"*/
        String palabra;
        Scanner teclado = new Scanner(System.in);

        do {
            System.out.println("\nIngrese una palabra para mostrar en pantalla\nRecuerde que puede ingresar la palabra 'salir' para terminar el programa");
            palabra = teclado.next();
            System.out.println("\n" + palabra);
        } while (!(palabra.trim().equalsIgnoreCase("salir")));
    }
}
