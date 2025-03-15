package estructurasrepetitivas_while;

import java.util.Random;

public class EstructurasRepetitivas_While {

    public static void main(String[] args) {

        //Ejemplo bucle controlado por contador
        int valorRandom = 0, vuelta = 0;
        Random rand = new Random();

        while (vuelta < 10) {
            valorRandom = rand.nextInt(50);
            System.out.println("Valor random:" + valorRandom + " en la vuelta: " + vuelta);
            vuelta++;
        }
    }

}
