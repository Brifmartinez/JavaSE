package ejerciciovectores_1;

import java.util.Scanner;

public class EjercicioVectores_1 {

    public static void main(String[] args) {
        /*Llevar a cabo un programa que almacene los nombres:
        Alejandra, Leonardo, Rosa, Guillermo, Gabriel, Daniel, Luisa y Ludmila.
        Realizar un recorrido del vector para cargar los datos y otro recorrido para
        mostrar los mismos por pantalla*/

        Scanner teclado = new Scanner(System.in);
        String vectorNombres[] = new String[8];

        for (int i = 0; i < vectorNombres.length; i++) {
            System.out.println("Ingrese el nombre que quieraa guardar");
            //Usamos nextLine() en vez de next() dado que si hubiera "nombre apellido"
            //Se guardaría solo el nombre debido al espacio en blanco
            vectorNombres[i] = teclado.nextLine();
        }
        
        for(int i = 0; i < vectorNombres.length; i++){
            System.out.println("El nombre en la posición " + (i+1) + " es: " + vectorNombres[i]);
        }
    }

}
