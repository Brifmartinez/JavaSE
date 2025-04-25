package logica;

import gui.Principal;

public class EjercicioFinal_CursoJavaSE {

    public static void main(String[] args) {
        Principal ventana = new Principal();
        
        ventana.setVisible(true);
        //Centrar la ventana relativamente con referencia a "null" que no tome nada como referencia
        //Y aparezca en el centro de la pantalla
        ventana.setLocationRelativeTo(null);
    }
    
}
