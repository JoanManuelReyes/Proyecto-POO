package CASO_3;

import java.text.DecimalFormat;

/**
 *
 * @author Anderson Abarca
 */
public class III_FACTURA extends I_DOCUMENTO{
    
    //ATRIBUTOS
    String ruc;
    
    //METODO PARA GENERAR NUMEROS 
    static int cuenta = 1;
    
    //CONSTRUCTOR VACIO: crear codigos completandolos con 0
    public III_FACTURA(){
        this.setNumero(genera());
    }
    
    //CONSTRUCTOR
    public III_FACTURA(String fecha, double importe, String ruc) {
        super(fecha, importe);
        super.setNumero(genera());  //Hacemos esto para completar los atributos de I_DOCUMENTO
        this.ruc = ruc;
    }
    
    //-------------------------GENERAR LOS NUMEROS------------------------------
    String genera(){
        DecimalFormat sd = new DecimalFormat("00000"); //Longitud 5
        String cad = "F" + sd.format(cuenta);
        cuenta++;
        return cad;
    }
    //--------------------------------------------------------------------------
    
    //METODOS
        //1)
    public double IGV(){
        return super.getImporte()*0.18;
    }
    
        //2)
    public double total(){
        return super.getImporte()+IGV();
    }
    
        //3)
    public String print(){
        String cad = super.print() + "\nRuc: " + ruc + "\tIGV: " + IGV() + "\tTotal: " + total();
        return cad;
    }
    
    //ENCAPSULAMIENTOS
    public String getRuc() {
        return ruc;
    }

    public void setRuc(String ruc) {
        this.ruc = ruc;
    }
    
}
