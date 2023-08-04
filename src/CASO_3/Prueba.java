package CASO_3;

//IMPORTAMOS LAS CLASES
import java.util.*;

public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // INICIALIZAMOS UNA LISTA
        List<I_DOCUMENTO> doc = new ArrayList();
        
        //AGREGAMOS
        doc.add(new II_BOLETA("12-01-21", 330, "Anderson"));
        doc.add(new III_FACTURA("18-01-21", 500, "2222"));
        doc.add(new II_BOLETA("14-01-21", 800, "Alexandra"));
        doc.add(new II_BOLETA("18-01-21", 500, "Melanie"));
        doc.add(new III_FACTURA("25-01-21", 700, "3322"));
        
        String mensage;
        //IMPRIMIMOS
        for(I_DOCUMENTO x: doc){
            mensage = x instanceof II_BOLETA?"BOLETA":"FACTURA";
            System.out.println("-----"+mensage + "-----" + "\n" + x.print() + "\n======================");
        }
        
        //SOLO BOLETA
        for(I_DOCUMENTO x: doc){
            if(x instanceof II_BOLETA){
               System.out.println("---SOLO BOLETA---" + "\n" + x.print() + "\n======================"); 
            }          
        }
        
        //SOLO FACTURAS
        for(I_DOCUMENTO x: doc){
            if(x instanceof III_FACTURA){
               System.out.println("---SOLO FACTURA---" + "\n" + x.print() + "\n======================"); 
            }          
        }
        
        
        
        
    }
    
}
