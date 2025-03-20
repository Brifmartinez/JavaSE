package estructurasrepetitivas_for;

public class EstructurasRepetitivas_For {

    public static void main(String[] args) {
        
        int suma = 0;
        
        for(int contador = 0; contador<10;contador++){
            System.out.println("Estoy en la vuelta Nº " + contador);
            
            suma = 5 + contador;
            
            if(suma >= 7){
                contador=11;
            }
        }
        
    }
    
}
