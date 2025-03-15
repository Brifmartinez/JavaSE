package operadores;

import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        //Scanner
        Scanner teclado = new Scanner(System.in);

        double num1, num2, suma;

        System.out.println("Ingrese el primer número que quiera sumar");
        num1 = teclado.nextDouble();

        System.out.println("Ingrese el segundo número que quiera sumar");
        num2 = teclado.nextDouble();

        suma = num1 + num2;

        System.out.println("El resultado de la suma es: " + suma);

        System.out.println("Ingrese un tercer número para multiplicar el resultado anterior");
        int num3;
        num3 = teclado.nextInt();
    }

}
