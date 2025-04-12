package ejerciciovectores_2;

import java.util.Scanner;

public class EjercicioVectores_2 {

    public static void main(String[] args) {
        
        /*
        Realizar un programa que permita la carga de 10 números en un vector.
        Una vez cargados, se necesita que el programa determine cual es el mayor
        y cual es el menor de ellos
        */

        Scanner teclado = new Scanner(System.in);
        int numeros[] = new int[10];
        int mayor = Integer.MIN_VALUE, menor=Integer.MAX_VALUE, indice = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese el valor de la posición : " + (i + 1));
            numeros[i] = teclado.nextInt();
        }

        teclado = new Scanner(System.in);

        do {
            mayor = (numeros[indice] > mayor) ? numeros[indice] : mayor;
            menor = (numeros[indice] < menor) ? numeros[indice] : menor;
            indice++;
        } while (indice < numeros.length);
        
        System.out.println("El número de mayor valor ingresado fue: " + mayor);
        System.out.println("El número de menor valor ingresado fue: " + menor);
    }

}
