package arreglos.arrays._bidimensionales_matrices;

import java.util.Scanner;

public class ArreglosArrays_Bidimensionales_Matrices {

    public static void main(String[] args) {
        
        int matriz[][] = new int [3][3];
        Scanner teclado = new Scanner (System.in);
        
        //Cuando una matríz tiene la misma cantidad de filas que de columnas = matríz cuadrada
        
        //Recorrido de la matriz cuadrada y carga de valores en la misma
        for (int f=0; f<3 ; f++){
            for (int c=0; c<3; c++){
                System.out.println("Ingrese el valor para la fila: " + f + " columna " + c);
                matriz[f][c] = teclado.nextInt();
            }
        }
        
        //Recorrido de la matriz cuadrada y muestra de valores en la misma
        //También en este caso podríamos usar matriz.length para el tamaño de la condición
        for (int f=0; f<3 ; f++){
            for (int c=0; c<3; c++){
                System.out.println("Fila: " + f + " Columna" + c + " - Valor: " + matriz[f][c]);
            }
        }
        
        //Otra forma de recorrer la matriz si no sabemos su longitud sería:
        for (int f=0; f<matriz.length ; f++){
            for (int c=0; c<matriz[0].length; c++){
                System.out.println("Fila: " + f + " Columna" + c + " - Valor: " + matriz[f][c]);
            }
        }
    }
    
}
