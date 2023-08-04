package CASO_3;

//PARA RELLENAR CEROS A LA IZQUIERDA
import java.text.DecimalFormat;

/**
 *
 * @author Anderson Abarca
 */
public class II_BOLETA extends I_DOCUMENTO{
    
    //ATRIBUTOS
    private String cliente;
    
    //METODO PARA GENERAR NUMEROS 
    static int cuenta = 1;
    
    //CONSTRUCTOR VACIO: crear codigos completandolos con 0
    public II_BOLETA(){
        this.setNumero(genera());
    }
    
    //CONSTRUCTOR PARA QUE NO SALGA ERROR
    public II_BOLETA(String fecha, double importe, String cliente) {
        super(fecha, importe);
        super.setNumero(genera());  //Hacemos esto para completar los atributos
        this.cliente = cliente;
    }
    
    //-------------------------GENERAR LOS NUMEROS------------------------------
    String genera(){
        DecimalFormat sd = new DecimalFormat("00000"); //Longitud 5
        String cad = "B" + sd.format(cuenta);
        cuenta++;
        return cad;
    }
    //--------------------------------------------------------------------------
    
    
    //METODO: Impresion: con super se agrega a la impresion anterior de documento
    public String print(){
        String cad = super.print() + "\nCliente: " + cliente;
        return cad;
    }
    
    //ENCAPSULAMIENTO
    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }
    
    
    
    
}
