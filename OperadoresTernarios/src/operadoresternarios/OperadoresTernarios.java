package operadoresternarios;

import java.util.Scanner;

public class OperadoresTernarios {

    public static void main(String[] args) {
        //El operador ternario es una herramienta en Java para tomar decisiones simples en UNA SOLA LÍNEA de código.
        //Permite tomar decisiones basadas en una condición y ASIGNAR UN VALOR a una variable o expresión en función de si la condición es VERDADERA o FALSA
        
        //SINTAXIS
        /*
            variable = (condición) ? valor_si_verdadero : valor_si_falso;
        */
        
        //Programa que dependiendo del promedio de un alumno, nos diga si aprobó o no la materia
        
        String aprobo;
        double promedio;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Ingrese el promedio del alumno");
        promedio = teclado.nextDouble();
        
        aprobo = (promedio >= 6.0) ? "El alumno aprobó satisfactoriamente la materia!" : "El alumno reprobó la materia, debe recursar.";
        
        System.out.println(aprobo);
    }
    
}
