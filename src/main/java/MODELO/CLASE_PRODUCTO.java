package MODELO;

public class CLASE_PRODUCTO {
    
    //ATRIBUTOS
    private int codigo_producto;
    private String descripcion_producto;
    private double precio_unitario_producto;
    private int stock_producto;
    
    //CONSTRUCTOR PASANDO VALORES
    public CLASE_PRODUCTO(int codigo_producto, String descripcion_producto, double precio_unitario_producto, int stock_producto) {
        this.codigo_producto = codigo_producto;
        this.descripcion_producto = descripcion_producto;
        this.precio_unitario_producto = precio_unitario_producto;
        this.stock_producto = stock_producto;
    }
    
    
    //ENCAPSULAMIENTOS
    public int getCodigo_producto() {
        return codigo_producto;
    }

    public void setCodigo_producto(int codigo_producto) {
        this.codigo_producto = codigo_producto;
    }

    public String getDescripcion_producto() {
        return descripcion_producto;
    }

    public void setDescripcion_producto(String descripcion_producto) {
        this.descripcion_producto = descripcion_producto;
    }

    public double getPrecio_unitario_producto() {
        return precio_unitario_producto;
    }

    public void setPrecio_unitario_producto(double precio_unitario_producto) {
        this.precio_unitario_producto = precio_unitario_producto;
    }

    public int getStock_producto() {
        return stock_producto;
    }

    public void setStock_producto(int stock_producto) {
        this.stock_producto = stock_producto;
    }
    
}
