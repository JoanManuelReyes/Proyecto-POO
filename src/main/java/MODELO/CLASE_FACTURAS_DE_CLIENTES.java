package MODELO;

public class CLASE_FACTURAS_DE_CLIENTES {
    
    //ATRIBUTOS
        private int nro_factura;
        private String fecha_fecha;
        private double monto_factura;
        private CLASE_CLIENTE cli;
        
    //GENERA CODIGO
    static int cuenta = 1000;
    
    //CONSTRUCTOR PASANDO VALORES
    public CLASE_FACTURAS_DE_CLIENTES(String fecha_fecha, double monto_factura, CLASE_CLIENTE cli) {
        this.nro_factura = cuenta++;
        this.fecha_fecha = fecha_fecha;
        this.monto_factura = monto_factura;
        this.cli = cli;
        cli.adicion(this); //la clase factura asocirlo a un cliente
    }
    
    //ENCAPSULAMIENTOS
    public int getNro_factura() {
        return nro_factura;
    }

    public void setNro_factura(int nro_factura) {
        this.nro_factura = nro_factura;
    }

    public String getFecha_fecha() {
        return fecha_fecha;
    }

    public void setFecha_fecha(String fecha_fecha) {
        this.fecha_fecha = fecha_fecha;
    }

    public double getMonto_factura() {
        return monto_factura;
    }

    public void setMonto_factura(double monto_factura) {
        this.monto_factura = monto_factura;
    }

    public CLASE_CLIENTE getCli() {
        return cli;
    }

    public void setCli(CLASE_CLIENTE cli) {
        this.cli = cli;
    }
    
    
    
}
