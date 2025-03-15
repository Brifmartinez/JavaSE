package condicionales_switch;

import java.util.Scanner;

public class Condicionales_Switch {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero;

        try {
            System.out.println("Ingrese un número entre entero del 1 al 4");
            numero = teclado.nextInt();

            switch (numero) {
                case 1:
                    System.out.println("Se eligió el número 1");
                    break;
                case 2:
                    System.out.println("Se eligió el número 2");
                    break;
                case 3:
                    System.out.println("Se eligió el número 3");
                    break;
                case 4:
                    System.out.println("Se eligió el número 4");
                    break;
                default:
                    System.out.println("Se ingresó un número fuera del parámetro");
            }
        } catch (Exception e) {
            System.out.println("Se ingresó un valor erróneo");
            System.out.println("error: "+e);
        }
    }

}
