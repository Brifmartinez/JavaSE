package logica;

import gui.Principal;

public class Ejemplo_GUI {

    public static void main(String[] args) {
        Principal ventana = new Principal();
        ventana.setVisible(true);
        //Lo que hace esto es tomar la resolución de la pantalla actual y colocarla en el medio
        ventana.setLocationRelativeTo(null);
    }
    
}
