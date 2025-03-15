package holamundo;

import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        System.out.println("Hola Mundo!");

        //Declaración de variables
        int edad;
        double estatura;
        boolean esMayor;
        char sexoBiologico;
        String domicilio;
        long numeroLargo;

        //Operación de asignación
        edad = 18;
        estatura = 1.7;
        esMayor = true;
        sexoBiologico = 'H';
        domicilio = "Dirección X";
        numeroLargo = 1222222222;

        System.out.println("Hola! Mi edad es " + edad);
        
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("Ingrese su edad:");
        String respuesta = keyboard.next();
        
        System.out.println("Su edad es: " + respuesta);
    }

}
