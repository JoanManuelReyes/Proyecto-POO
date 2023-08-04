package Inter_proyecto;

//Importamos 
import MODELO.*;
import java.util.List;

public interface Inter {
    
    List<CLASE_CLIENTE> listado_clientes();
    List<CLASE_PRODUCTO> listado_productos();
    List<CLASE_PRODUCTO> listado_productos_para_categorias();
    List<CLASE_PRODUCTO> listado_productos_de_acuerdo_al_codigo(int id);
    List<CLASE_PRODUCTO> listado_productos_de_acuerdo_al_categoria(String cad);
    List<CLASE_EMPLEADO> listado_empleados();
    List<CLASE_PROVEEDOR> listado_proveedores();
    List<CLASE_PROVEEDOR> listado_proveedores_tipos(int id);
    List<CLASE_PROVEEDOR> listado_productos_proveedores(String cad);
    void adicion_ventas_al_cliente(CLASE_VENTA v);
    List<CLASE_VENTA> listado_productos_vendidos(int co_producto, int dni_cli);
    void adicion_pedido_proveedor(CLASE_PEDIDO_PROVEEDOR pd);
    List<CLASE_PEDIDO_PROVEEDOR> listado_pedidos_proveedores(int cod_empleado,int cod_producto, String ruc_proveedor);
    void eliminar_pedido_proveedor(CLASE_PEDIDO_PROVEEDOR p);
    void edita_pedido_proveedor(CLASE_PEDIDO_PROVEEDOR p);
    void edita_pedido_cliente(CLASE_VENTA p);
    void eliminar_pedido_cliente(CLASE_VENTA p);
    void adicion_cliente_empleado(REGISTRO p);
}









