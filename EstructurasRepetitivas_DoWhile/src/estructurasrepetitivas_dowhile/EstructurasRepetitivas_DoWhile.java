package estructurasrepetitivas;

public class EstructurasRepetitivas_DoWhile {

    public static void main(String[] args) {
        int contador = 1;
        
        do{
            System.out.println("Valores de contador en bucle Do While Nro. 1:" + contador);
            contador++;
        }while(contador<10);
        
        contador = 20;
        
        do{
            System.out.println("Valores de contador en bucle Do While Nro. 2:" + contador);
            contador++;
        }while(contador<10);   
    }
}
