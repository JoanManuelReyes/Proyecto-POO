package MODELO;

public class CLASE_VENTA extends CLASE_PRODUCTO{
    
    //ATRIBUTOS
    private int dni_cliente;
    private int cantidad_producto;  
    private int numero_venta;
    private String fecha_venta;
    private double descuento_venta;
    private double precio_venta;
    private double importe_venta;
    
    
    //ENCAPSULAMIENTOS

    public int getDni_cliente() {
        return dni_cliente;
    }

    public void setDni_cliente(int dni_cliente) {
        this.dni_cliente = dni_cliente;
    } 

    public int getCantidad_producto() {
        return cantidad_producto;
    }

    public void setCantidad_producto(int cantidad_producto) {
        this.cantidad_producto = cantidad_producto;
    }

    public int getNumero_venta() {
        return numero_venta;
    }

    public void setNumero_venta(int numero_venta) {
        this.numero_venta = numero_venta;
    }

    public String getFecha_venta() {
        return fecha_venta;
    }

    public void setFecha_venta(String fecha_venta) {
        this.fecha_venta = fecha_venta;
    }

    public double getDescuento_venta() {
        return descuento_venta;
    }

    public void setDescuento_venta(double descuento_venta) {
        this.descuento_venta = descuento_venta;
    }

    public double getPrecio_venta() {
        return precio_venta;
    }

    public void setPrecio_venta(double precio_venta) {
        this.precio_venta = precio_venta;
    }

    public double getImporte_venta() {
        return importe_venta;
    }

    public void setImporte_venta(double importe_venta) {
        this.importe_venta = importe_venta;
    }
    
    
    
    
    
    
    
}
