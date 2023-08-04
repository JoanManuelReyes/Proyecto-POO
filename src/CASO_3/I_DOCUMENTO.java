package CASO_3;

import java.text.DecimalFormat;

/**
 *
 * @author Anderson Abarca
 */
public class I_DOCUMENTO {
    
    //ATRIBUTOS
    private String numero;  
    private String fecha;
    private double importe;

    //CONSTRUCTOR VACIO
    public I_DOCUMENTO(){
        
    }
    
    //CONSTRUCTOR
    public I_DOCUMENTO(String fecha, double importe) {
        this.fecha = fecha;
        this.importe = importe;        
    }
    
    //CONSTRUCTOR
    public I_DOCUMENTO(String numero, String fecha, double importe) {
        this.numero = numero;
        this.fecha = fecha;
        this.importe = importe;
    }   
    
    //METODOS
    public String print(){
        String cad = "Numero: " + numero;
        cad = cad + "\nFecha: " + fecha + "\nImporte: " + importe;
        return cad;
    }
    
    //ENCAPSULAMIENTOS
    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public double getImporte() {
        return importe;
    }

    public void setImporte(double importe) {
        this.importe = importe;
    }
    
    
}
