package MODELO;

import java.util.ArrayList;
import java.util.List;

public class CLASE_CLIENTE {
    
    //ATRIBUTOS
    private String dni_cliente;
    private String nombre_cliente;
    private String telefono_cliente;
    private String direccion_cliente;
    List<CLASE_FACTURAS_DE_CLIENTES> lista;
    
    //CONSTRUCTOR PASANDO VALORES 
    public CLASE_CLIENTE(String dni_cliente, String nombre_cliente, String telefono_cliente, String direccion_cliente) {
        this.dni_cliente = dni_cliente;
        this.nombre_cliente = nombre_cliente;
        this.telefono_cliente = telefono_cliente;
        this.direccion_cliente = direccion_cliente;
        this.lista = new ArrayList();
    }    
    
    //METODOS
    void adicion(CLASE_FACTURAS_DE_CLIENTES fac) {
       lista.add(fac);
    }
    
    //imprimiendo las facturas que tiene un cliente
    public void print(){
        System.out.println("Dni: " + dni_cliente);
        System.out.println("Nombre: " + nombre_cliente);
        System.out.println("Telefono: " + telefono_cliente);
        System.out.println("Direccion: " + direccion_cliente);
        double sm=0;
        System.out.println("========== DETALLE FACTURA ==========");
        System.out.println("Numero\tFecha\tMonto");
        for(CLASE_FACTURAS_DE_CLIENTES x:lista){
            sm=sm+x.getMonto_factura();
            System.out.println(x.getNro_factura()+"\t"+x.getFecha_fecha()+"\t"+x.getMonto_factura());    
        }
        System.out.println("Total monto: "+sm);
    }
    
    //ENCAPSULAMIENTOS
    public String getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(String dni_cliente) {
        this.dni_cliente = dni_cliente;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public String getTelefono_cliente() {
        return telefono_cliente;
    }

    public void setTelefono_cliente(String telefono_cliente) {
        this.telefono_cliente = telefono_cliente;
    }

    public String getDireccion_cliente() {
        return direccion_cliente;
    }

    public void setDireccion_cliente(String direccion_cliente) {
        this.direccion_cliente = direccion_cliente;
    }
    
}
