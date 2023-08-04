package MODELO;

import java.util.ArrayList;
import java.util.List;

public class CLASE_CLIENTE {
    
    //ATRIBUTOS
    private String dni_cliente;
    private String nombre_cliente;
    private String telefono_cliente;
    private String direccion_cliente;  
    private String correo_cliente;
    private String contraseña_cliente;
    
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

    public String getCorreo_cliente() {
        return correo_cliente;
    }

    public void setCorreo_cliente(String correo_cliente) {
        this.correo_cliente = correo_cliente;
    }

    public String getContraseña_cliente() {
        return contraseña_cliente;
    }

    public void setContraseña_cliente(String contraseña_cliente) {
        this.contraseña_cliente = contraseña_cliente;
    }
    
    
}
