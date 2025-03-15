package ejerciciomerceria;

import java.util.Scanner;

public class EjercicioMerceria {

    public static void main(String[] args) {
        /*
            Mercería mayorista --> vende al por mayor
            Menos de 5 paquetes NO vende
            Entre 5 y 15 se cobra envío a 10USD
            Más de 15 paquetes el envío es gratis.
         */

        int cantidadPaquetes;
        double montoTotal, diferencia, descuento, totalConDescuento;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de paquetes que desea comprar");
        System.out.println("El número debe ser un número entero positivo");
        cantidadPaquetes = teclado.nextInt();

        if (cantidadPaquetes < 5 && cantidadPaquetes > 0) {
            System.out.println("La empresa no permite compra minoristas (cantidad de paquetes menor a 5)");
        } else if (cantidadPaquetes <= 0) {
            System.out.println("Se ingresó un valor incorrecto, repita el proceso.");
        } else {
            System.out.println("Ingrese el monto total de la compra");
            teclado = new Scanner(System.in);
            montoTotal = teclado.nextDouble();
            
            if (cantidadPaquetes >= 5 && cantidadPaquetes <= 15) {
                System.out.println("El envío tiene un costo extra de 10USD");
                System.out.println("Muchas gracias por su compra!");
                montoTotal += 10;
            } else {
                if (cantidadPaquetes > 15) {
                    System.out.println("Usted no tiene costo de envío.");
                    System.out.println("Muchas gracias por su compra!");
                } else {
                    System.out.println("Se ingresó un valor incorrecto, repita el proceso.");
                }
            }

            if (montoTotal < 100) {
                diferencia = 100 - montoTotal;
                System.out.println("El monto es menor a 100 USD por lo que no posee promociones");
                System.out.println("Necesita comprar " + diferencia + " USD para entrar en una promoción");
            } else {
                if (montoTotal >= 100 && montoTotal <= 300) {
                    descuento = (montoTotal * 0.05);
                    totalConDescuento = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 5%. El monto total con descuento es de: " + totalConDescuento + " USD");
                    System.out.println("Su descuento de 5% equivale a: " + descuento + "USD");
                } else {
                    descuento = (montoTotal * 0.1);
                    totalConDescuento = montoTotal - descuento;
                    System.out.println("Por su compra tiene un descuento del 10%. El monto total con descuento es de: " + totalConDescuento + " USD");
                    System.out.println("Su descuento de 10% equivale a: " + descuento + "USD");
                }
            }
        }
    }

}
