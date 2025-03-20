package ejercicioestacionamiento;

import java.util.Scanner;

public class EjercicioEstacionamiento {

    public static void main(String[] args) {

        /*
        Varios clientes:
        El programa debe solicitar por teclado dos datos:
            -Patente del vehículo
            -Tipo de estacionamiento*/
        String patente = "";
        int tipoServicio, valorAAbonar;
        Scanner teclado = new Scanner(System.in);

        /*El programa debe calcular el monto a pagar para cada cliente
        en función del tipo de estacionamiento selecciondado.*/
 /*La carga de datos debe continuar hasta que el usuario ingrese
        la palabra "FIN" en lugar de la patente*/
        do {
            System.out.println("\nBienvenido al programa autogestión de:\nESTACIONAMIENTO");
            System.out.println("Por favor, ingrese el tipo de servicio a solicitar");
            System.out.println("Opción 1: Por hora");
            System.out.println("Opción 2: Media jornada");
            System.out.println("Opción 3: Jornada completa");
            System.out.println("Opción FIN: Presione cualquier otra tecla si desea finalizar el programa");
            tipoServicio = teclado.nextInt();

            if (tipoServicio != 1 && tipoServicio != 2 && tipoServicio != 3) {
                System.out.println("Gracias por utilizar el programa de autogestión de:\nESTACIONAMIENTO");
                System.out.println("Hasta luego!");
            } else {
                {
                    /*Los tipos de estacionamiento disponibles son 3:*/
                    /*  1-  Por hora (Cuyo valor es de $3 USD por hora)
                        2-  Media jornada (Cuyo valor total es de $15 USD y posee 5% de descuento)
                        3-  Jornada completa (Cuyo valor fijo es de $30 USD y posee 10% de descuento)*/
                    
                    System.out.println("Ingrese la patente de su vehículo");
                    System.out.println("Sin espacios y en MAYÚSCULAS: AAA1234");
                    teclado = new Scanner(System.in);
                    patente = teclado.nextLine();

                    switch (tipoServicio) {
                        case 1:
                            System.out.println("opción 1");
                            break;
                        case 2:
                            System.out.println("opción 2");
                            break;
                        case 3:
                            System.out.println("opción 3");
                            break;
                        default:
                            System.out.println("FIN");
                            break;
                    }
                }
            }
        } while (tipoServicio >= 1 && tipoServicio <= 3);
    }

}
