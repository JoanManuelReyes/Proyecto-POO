package MODELO;

public class CLASE_PEDIDO_PROVEEDOR extends CLASE_PRODUCTO{
    
    //ATRIBUTOS
    private String numero_pedido_proveedor;
    private int codigo_empleado;
    private String ruc_proveedor;
    private int cod_producto;
    private int cant_pedido;
    private String fecha_pedido_proveedor;
    private double importe_pedido;
    
    //ENCAPSULAMIENTOS
    public String getNumero_pedido_proveedor() {
        return numero_pedido_proveedor;
    }

    public void setNumero_pedido_proveedor(String numero_pedido_proveedor) {
        this.numero_pedido_proveedor = numero_pedido_proveedor;
    }

    public int getCodigo_empleado() {
        return codigo_empleado;
    }

    public void setCodigo_empleado(int codigo_empleado) {
        this.codigo_empleado = codigo_empleado;
    }

    public String getRuc_proveedor() {
        return ruc_proveedor;
    }

    public void setRuc_proveedor(String ruc_proveedor) {
        this.ruc_proveedor = ruc_proveedor;
    }

    public int getCod_producto() {
        return cod_producto;
    }

    public void setCod_producto(int cod_producto) {
        this.cod_producto = cod_producto;
    }

    public int getCant_pedido() {
        return cant_pedido;
    }

    public void setCant_pedido(int cant_pedido) {
        this.cant_pedido = cant_pedido;
    }

    public String getFecha_pedido_proveedor() {
        return fecha_pedido_proveedor;
    }

    public void setFecha_pedido_proveedor(String fecha_pedido_proveedor) {
        this.fecha_pedido_proveedor = fecha_pedido_proveedor;
    }

    public double getImporte_pedido() {
        return importe_pedido;
    }

    public void setImporte_pedido(double importe_pedido) {
        this.importe_pedido = importe_pedido;
    }
    
    
    
    
    
}
