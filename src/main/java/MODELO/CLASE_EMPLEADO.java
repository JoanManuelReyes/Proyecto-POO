package MODELO;

//IMPORTAMOS 
import java.text.DecimalFormat;

public abstract class  CLASE_EMPLEADO {
    
    //ATRIBUTOS
    private String codigo_empleado;
    private String nombre_empleado;
    private String telefono_empleado;
    private String direccion_empleado;
    
    //CODIGO GENERADO
    static int cuenta = 1;
    
    
    //CONSTRUCTOR PASANDO VALORES 
    public CLASE_EMPLEADO(String nombre_empleado, String telefono_empleado, String direccion_empleado) {
        DecimalFormat sd = new DecimalFormat("E000");
        this.codigo_empleado = sd.format(cuenta);
        this.nombre_empleado = nombre_empleado;
        this.telefono_empleado = telefono_empleado;
        this.direccion_empleado = direccion_empleado;
        cuenta++;
    }
    
    //ABSTRACTO: es porque no se va a calcular en esta clase, sino en cada clase
    public abstract double sueldo_empleado();
    

    //ENCAPSULAMIENTOS
    public String getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(String codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getNombre_empleado() {
        return nombre_empleado;
    }

    public void setNombre_empleado(String nombre_empleado) {
        this.nombre_empleado = nombre_empleado;
    }

    public String getTelefono_empleado() {
        return telefono_empleado;
    }

    public void setTelefono_empleado(String telefono_empleado) {
        this.telefono_empleado = telefono_empleado;
    }

    public String getDireccion_empleado() {
        return direccion_empleado;
    }

    public void setDireccion_empleado(String direccion_empleado) {
        this.direccion_empleado = direccion_empleado;
    }
    
}
