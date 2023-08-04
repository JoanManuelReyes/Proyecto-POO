package MODELO;

public class CLASE_PRODUCTO{
    
    //ATRIBUTOS
    private int codigo_producto;
    private String descripcion_producto;
    private double precio_unitario_producto;
    private int stock_producto;
    private int categoria_producto;
    private String marca_producto; 
    private String nombre_categoria;
    
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

    public int getCategoria_producto() {
        return categoria_producto;
    }

    public void setCategoria_producto(int categoria_producto) {
        this.categoria_producto = categoria_producto;
    }

    public String getMarca_producto() {
        return marca_producto;
    }

    public void setMarca_producto(String marca_producto) {
        this.marca_producto = marca_producto;
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) {
        this.nombre_categoria = nombre_categoria;
    }
    
    
    
    
    
    
}
