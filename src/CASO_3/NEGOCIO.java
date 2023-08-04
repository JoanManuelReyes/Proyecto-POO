package CASO_3;

//IMPORTAMOS TODAS LAS CLASES
import java.util.*;

public class NEGOCIO {
    
    //INICIAMOS UNA LISTA PARA ALMACENAR DOCUMENTOS CON FORMULARIOS
    List<I_DOCUMENTO> doc = new ArrayList();
    
    //CONSTRUCTOR
    public NEGOCIO() {
        doc.add(new II_BOLETA("12-01-21", 330, "Anderson"));
        doc.add(new III_FACTURA("18-01-21", 500, "2222"));
        doc.add(new II_BOLETA("14-01-21", 800, "Alexandra"));
        doc.add(new II_BOLETA("18-01-21", 500, "Melanie"));
        doc.add(new III_FACTURA("25-01-21", 700, "3322"));        
    }
    
    //METODOS
        //1) Agregar boletas a la lista
    public void ADICION_BOLETA(II_BOLETA b){
        doc.add(b);
    }
    
        //2) Agregar facturas a la lista
    public void ADICION_FACTURA(III_FACTURA f){
        doc.add(f);
    }
    
        //3) Eliminar
    public void ANULAR(I_DOCUMENTO d){
        doc.remove(d);
    }    
    
    
    //CONSULTAR DOCUMENTOS: lo buscamos por el numero
    public I_DOCUMENTO BUSCA(String numero){
        for(I_DOCUMENTO x:doc){
            if(x.getNumero().equals(numero)){
                return x;
            }
        }
        return null; //no existe
    }
    
    
    
    //ENCAPSULAMIENTOS
    public List<I_DOCUMENTO> getDoc() {
        return doc;
    }

    public void setDoc(List<I_DOCUMENTO> doc) {
        this.doc = doc;
    }
    
    
    
}
