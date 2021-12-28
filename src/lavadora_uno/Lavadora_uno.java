
package lavadora_uno;
import Libreria.LLFunciones;
import java.util.Scanner;

/**
 *
 * @author aleja
 */
public class Lavadora_uno {
    
    public static void main (String args[]){
        Scanner entrada= new Scanner(System.in);
        System.out.println("la ropa es blanca o de color");
        System.out.println("1 ropa blanca/ 2 ropa color");
        int TipoDeRopa=entrada.nextInt();
        
        System.out.println("cuantos kilos de ropa");
        int kilos=entrada.nextInt();
        
        LLFunciones mensajero=new LLFunciones(kilos,TipoDeRopa);
        mensajero.setTipoDeRopa(2);
        System.out.println("el tipo de ropa es "+mensajero.getTipoDeRopa());
        mensajero.CicloFinalizado();
    }
}
