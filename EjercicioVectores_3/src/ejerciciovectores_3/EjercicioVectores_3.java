package ejerciciovectores_3;

import java.util.Scanner;

public class EjercicioVectores_3 {

    public static void main(String[] args) {
        /*
        Un empleado desea almacenar en un vector sus 12 sueldos del año.
        A partir de esto, necesitamos un programa que determine y muestre por pantalla
        la suma total de sus 12 sueldos y el promedio de sueldo que tuvo en el año.
        */
        
        double sueldos[] = new double [12];
        Scanner teclado = new Scanner(System.in);
        double total=0;
        
        for (int i = 0; i < sueldos.length; i++) {
            System.out.println("Ingrese el sueldo del mes : " + (i + 1) + "/12");
            sueldos[i] = teclado.nextInt();
            total += sueldos[i];
        }
        
        double promedio=(total/sueldos.length);
        
        System.out.println("La suma de todos los sueldos durante el año fue: " + total + "$U");
        System.out.println("El promedio de cobro por mes fue: " + promedio + "$U");
    }
    
}
