package MODELO;

public class CLASE_SUELDO_EMPLEADO extends CLASE_EMPLEADO{

    //ATRIBUTOS
    private double sueldo;
    private double impuestos;
    
    //CONSTRUCTOR
    public CLASE_SUELDO_EMPLEADO(String nombre_empleado, String telefono_empleado, String direccion_empleado, double impuestos, double sueldo){
        super(nombre_empleado,telefono_empleado,direccion_empleado); //Hace referencia al constructor del PADRE alumno
        this.impuestos = impuestos;
        this.sueldo = sueldo;
    }
    
    //ENCAPSULAMIENTOS
    public double sueldo_empleado() {
        return sueldo - impuestos;
    }
    
    //ENCAPSULAMIENTOS
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public double getImpuestos() {
        return impuestos;
    }

    public void setImpuestos(double impuestos) {
        this.impuestos = impuestos;
    }
    
    
}
