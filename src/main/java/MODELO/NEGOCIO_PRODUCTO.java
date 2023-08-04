package MODELO;

//Importamos
import MODELO.*;
import java.util.*;
public class NEGOCIO_PRODUCTO {
    
     private List<CLASE_PRODUCTO> lis_producto = new ArrayList();
    
    //CONSTRUCTOR 
    public NEGOCIO_PRODUCTO(){
        lis_producto.add(new CLASE_PRODUCTO(1, "Polo", 30, 50));
        lis_producto.add(new CLASE_PRODUCTO(2, "Jean", 40, 50));
        lis_producto.add(new CLASE_PRODUCTO(3, "Short", 35, 50));
        lis_producto.add(new CLASE_PRODUCTO(4, "Camisa", 50, 50));
        lis_producto.add(new CLASE_PRODUCTO(5, "Casaca", 80, 50));
        lis_producto.add(new CLASE_PRODUCTO(6, "Polera", 60, 50));          
    }
    
    //METODOS
        //1
    public void adicionar_producto(CLASE_PRODUCTO p){
            lis_producto.add(p);
    }

        //2
    public CLASE_PRODUCTO busca_producto(int codigo_producto){
        for (CLASE_PRODUCTO x:lis_producto){
            if(x.getCodigo_producto() == codigo_producto)
                return x;
        }
        return null;
    }

        //3
    public void anula_producto(CLASE_PRODUCTO p){
        lis_producto.remove(p);
    }
    
    //METODOS
    public void ORDENAR_NOMBRE_PRODUCTO(){
        lis_producto.sort(new ORDEN_NOMBRE_PRODUCTO());
    }
    
    //ENCAPSULAMIENTOS
    public List<CLASE_PRODUCTO> getlis_producto() {
        return lis_producto;
    }

    public void setlis_producto(List<CLASE_PRODUCTO> lis_producto) {
        this.lis_producto = lis_producto;
    }
    
}

//FUERA DE LAS LLAVES PRINCIPALES

//ORDENAR POR NOMBRES
    class ORDEN_NOMBRE_PRODUCTO implements Comparator<CLASE_PRODUCTO>{

        @Override
        public int compare(CLASE_PRODUCTO p1, CLASE_PRODUCTO p2) {
            //compareTo: emplear con cadena o fechas
            return p1.getDescripcion_producto().compareTo(p2.getDescripcion_producto());
        }
        //"Juan">"Luis"   -1
        //"Juan"="Juan"   0
        //"Juan"<"Luis"   1
    }
