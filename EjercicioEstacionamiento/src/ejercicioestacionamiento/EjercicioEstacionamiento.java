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
        int tipoServicio, cantHoras, cont1 = 0, cont2 = 0, cont3 = 0;
        double mediaJornada = (15 * 0.95), jornadaCompleta = (30 * 0.9), totalDia = 0;
        Scanner teclado = new Scanner(System.in);

        /*El programa debe calcular el monto a pagar para cada cliente
        en función del tipo de estacionamiento selecciondado.*/
 /*La carga de datos debe continuar hasta que el usuario ingrese
        la palabra "FIN" en lugar de la patente*/
        do {
            System.out.println("\n=====================================================");
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
 /*  
                        1-  Por hora (Cuyo valor es de $3 USD por hora)
                        2-  Media jornada (Cuyo valor total es de $15 USD y posee 5% de descuento)
                        3-  Jornada completa (Cuyo valor fijo es de $30 USD y posee 10% de descuento)*/

                    System.out.println("\nIngrese la patente de su vehículo");
                    System.out.println("Sin espacios y en MAYÚSCULAS: AAA1234");
                    teclado = new Scanner(System.in);
                    patente = teclado.nextLine();

                    switch (tipoServicio) {
                        case 1:
                            System.out.println("\nUsted seleccionó: OPCIÓN 1 - POR HORA");
                            System.out.println("El valor de la hora es de 3 USD");
                            System.out.println("Ingrese la cantidad de horas a abonar:");
                            teclado = new Scanner(System.in);
                            cantHoras = teclado.nextInt();
                            System.out.println("El valor a abonar es: " + (cantHoras * 3) + " USD");
                            totalDia += (cantHoras * 3);
                            cont1++;
                            break;
                        case 2:
                            System.out.println("\nUsted seleccionó: OPCIÓN 2 - POR MEDIA JORNADA");
                            System.out.println("El valor de la media jornada es de: 15 USD\nTeniendo 5% de decuento.\nValor final por 1 media jornada: " + mediaJornada);
                            System.out.println("Ingrese la cantidad de media jornadas a abonar:");
                            teclado = new Scanner(System.in);
                            cantHoras = teclado.nextInt();
                            System.out.println("El valor a abonar es: " + (cantHoras * mediaJornada) + " USD");
                            totalDia += (cantHoras * mediaJornada);
                            cont2++;
                            break;
                        case 3:
                            System.out.println("\nUsted seleccionó: OPCIÓN 3 - POR JORNADA COMPLETA");
                            System.out.println("El valor de la jornada completa es de: 30 USD\nTeniendo 10% de decuento.\nValor final por 1 jornada completa: " + jornadaCompleta);
                            System.out.println("Ingrese la cantidad de jornadas completas a abonar:");
                            teclado = new Scanner(System.in);
                            cantHoras = teclado.nextInt();
                            System.out.println("El valor a abonar es: " + (cantHoras * jornadaCompleta) + " USD");
                            totalDia += (cantHoras * jornadaCompleta);
                            cont3++;
                            break;
                        default:
                            System.out.println("FIN");
                            break;
                    }

                    System.out.println("\nDesea realizar operación?");
                    System.out.println("SI - Seleccione 1");
                    System.out.println("NO - Seleccione cualquier otra tecla");
                    teclado = new Scanner(System.in);
                    tipoServicio = teclado.nextInt();
                    if (tipoServicio != 1) {
                        tipoServicio = 0;
                    }
                }
                teclado = new Scanner(System.in);
            }
        } while (tipoServicio >= 1 && tipoServicio <= 3);

        System.out.println("=====================================================");
        System.out.println("Totales monetarios del día");
        System.out.println("\nCantidad de servicios por hora: " + cont1);
        System.out.println("\nCantidad de servicios por media jornadas: " + cont2);
        System.out.println("\nCantidad de servicios por jornada completas: " + cont3);
        System.out.println("\nCantidad de dinero recaudado del día: " + totalDia + " USD");
    }

}
