package MODELO;

//IMPORTAMOS CLASES 
import MODELO.*;

//CREAMOS UNA LISTA
import java.util.*;

public class NEGOCIO_CLIENTE {
    
    private List<CLASE_CLIENTE> lis = new ArrayList();
    
    //CONSTRUCTOR 
    public NEGOCIO_CLIENTE(){
        lis.add(new CLASE_CLIENTE("98765432", "Anderson Abarca", "987654321", "Av. el parral #218"));
        lis.add(new CLASE_CLIENTE("12345678", "Manuel Reyes", "895476321", "Jr. Los Alisos"));
        lis.add(new CLASE_CLIENTE("76349812", "Francisco Castañeda", "241728673", "Av. Las Palmeras"));
        lis.add(new CLASE_CLIENTE("98352814", "Victor Segovia", "127634892", "Av. Aviacion"));      
    }
    
    //METODOS
        //1
    public void adicionar_clientes(CLASE_CLIENTE c){
            lis.add(c);
    }

        //2
    public CLASE_CLIENTE busca_cliente(String dni){
        for (CLASE_CLIENTE x:lis){
            if(x.getDni_cliente().equals(dni)) return x;
        }
        return null;
    }

        //3
    public void anula_cliente(CLASE_CLIENTE c){
        lis.remove(c);
    }
    
    //METODOS
    public void ORDENAR_NOMBRE(){
        lis.sort(new ORDEN_NOMBRES());
    }
    
    //ENCAPSULAMIENTOS

    public List<CLASE_CLIENTE> getLis() {
        return lis;
    }

    public void setLis(List<CLASE_CLIENTE> lis) {
        this.lis = lis;
    }   

}

//FUERA DE LAS LLAVES PRINCIPALES

//ORDENAR POR NOMBRES
    class ORDEN_NOMBRES implements Comparator<CLASE_CLIENTE>{

        @Override
        public int compare(CLASE_CLIENTE c1, CLASE_CLIENTE c2) {
            //compareTo: emplear con cadena o fechas
            return c1.getNombre_cliente().compareTo(c2.getNombre_cliente());
        }
        //"Juan">"Luis"   -1
        //"Juan"="Juan"   0
        //"Juan"<"Luis"   1
    }
