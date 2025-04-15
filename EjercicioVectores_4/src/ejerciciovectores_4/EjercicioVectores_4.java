package ejerciciovectores_4;

import java.util.Scanner;

public class EjercicioVectores_4 {

    public static void main(String[] args) {

        /*
        En una tabla de 4 filas y 3 columnas se guardan las notas de 4 alumnos de secundario.
        Cada fila corresponde a las notas de cada alumno
         */
        double notas[][] = new double[4][3];
        double promedio = 0;
        Scanner teclado = new Scanner(System.in);

        //Recorrido y carga de las notas a la matriz
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[0].length; c++) {
                System.out.println("Ingrese la nota nro " + (c + 1) + " del alumno: " + (f + 1));
                notas[f][c] = teclado.nextDouble();
            }
            teclado = new Scanner(System.in);
        }

        //Recorrido y muestra de las notas a la matriz
        for (int f = 0; f < notas.length; f++) {
            for (int c = 0; c < notas[0].length; c++) {
                promedio += notas[f][c];
                System.out.println("Alumno: " + (f + 1) + " - Nota Nº: " + (c+1) + " " + notas[f][c]);
            }
            System.out.println("El promedio del almuno nro: " + (f + 1) + " es: " + (promedio/notas[0].length));
            promedio = 0;
        }
    }

}
