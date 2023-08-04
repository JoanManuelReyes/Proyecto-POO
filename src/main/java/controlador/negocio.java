package controlador;

//Importamos 
import MODELO.*;
import java.sql.*;
import java.util.*;
import util.MySQLConexion;
import Inter_proyecto.Inter;

public class negocio implements Inter{
    
    //-----------------------------------------------------------------------------------------------------
    //LISTADO DE CLIENTES
    public List<CLASE_CLIENTE> listado_clientes(){
        List<CLASE_CLIENTE> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "select dni,nombre_cliente,telefono_cliente,direccion_cliente from cliente";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_CLIENTE p = new CLASE_CLIENTE();
                p.setDni_cliente(rs.getString(1));
                p.setNombre_cliente(rs.getString(2));
                p.setTelefono_cliente(rs.getString(3));               
                p.setDireccion_cliente(rs.getString(4));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------------------------------------
    //LISTADO DE PRODUCTOS
    public List<CLASE_PRODUCTO> listado_productos(){
        List<CLASE_PRODUCTO> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "select p.id_producto,p.descripcion_producto,p.precio_unitario,p.stock_producto,p.categoria_id_categoria, m.nombre_marca,c.nombre_categoria from producto p, proveedor pro, marca m, categoria c where p.proveedor_ruc_proveedor = pro.ruc_proveedor and pro.marca_id_marca = m.id_marca and p.categoria_id_categoria = c.id_categoria";
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_PRODUCTO p = new CLASE_PRODUCTO();
                p.setCodigo_producto(rs.getInt(1));
                p.setDescripcion_producto(rs.getString(2));
                p.setPrecio_unitario_producto(rs.getDouble(3));               
                p.setStock_producto(rs.getInt(4));
                p.setCategoria_producto(rs.getInt(5));
                p.setMarca_producto(rs.getString(6));
                p.setNombre_categoria(rs.getString(7));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    //LISTADO DE PRODUCTOS
    public List<CLASE_PRODUCTO> listado_productos_para_categorias(){
        List<CLASE_PRODUCTO> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "select p.id_producto,p.descripcion_producto,p.precio_unitario,p.stock_producto,p.categoria_id_categoria, m.nombre_marca,c.nombre_categoria from producto p, proveedor pro, marca m, categoria c where p.proveedor_ruc_proveedor = pro.ruc_proveedor and pro.marca_id_marca = m.id_marca and p.categoria_id_categoria = c.id_categoria group by c.nombre_categoria";
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_PRODUCTO p = new CLASE_PRODUCTO();
                p.setCodigo_producto(rs.getInt(1));
                p.setDescripcion_producto(rs.getString(2));
                p.setPrecio_unitario_producto(rs.getDouble(3));               
                p.setStock_producto(rs.getInt(4));
                p.setCategoria_producto(rs.getInt(5));
                p.setMarca_producto(rs.getString(6));
                p.setNombre_categoria(rs.getString(7));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    //LISTADO DE PRODUCTOS
    public List<CLASE_PRODUCTO> listado_productos_de_acuerdo_al_codigo(int id){
        List<CLASE_PRODUCTO> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "select p.id_producto,p.descripcion_producto,p.precio_unitario,p.stock_producto,p.categoria_id_categoria, m.nombre_marca from producto p, proveedor pro, marca m where p.proveedor_ruc_proveedor = pro.ruc_proveedor and pro.marca_id_marca = m.id_marca and p.id_producto = ?";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Pasamos el codigo 
            st.setInt(1, id);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_PRODUCTO p = new CLASE_PRODUCTO();
                p.setCodigo_producto(rs.getInt(1));
                p.setDescripcion_producto(rs.getString(2));
                p.setPrecio_unitario_producto(rs.getDouble(3));               
                p.setStock_producto(rs.getInt(4));
                p.setCategoria_producto(rs.getInt(5));
                p.setMarca_producto(rs.getString(6));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    //-----------------------------------------------------------------------------------------------------
    
    //LISTADO DE PRODUCTOS
    public List<CLASE_PRODUCTO> listado_productos_de_acuerdo_al_categoria(String cad){
        List<CLASE_PRODUCTO> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "select p.id_producto,p.descripcion_producto,p.precio_unitario,p.stock_producto,p.categoria_id_categoria, m.nombre_marca,c.nombre_categoria from producto p, proveedor pro, marca m, categoria c where p.proveedor_ruc_proveedor = pro.ruc_proveedor and pro.marca_id_marca = m.id_marca and p.categoria_id_categoria = c.id_categoria and c.nombre_categoria = ?";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Pasamos el codigo 
            st.setString(1, cad);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_PRODUCTO p = new CLASE_PRODUCTO();
                p.setCodigo_producto(rs.getInt(1));
                p.setDescripcion_producto(rs.getString(2));
                p.setPrecio_unitario_producto(rs.getDouble(3));               
                p.setStock_producto(rs.getInt(4));
                p.setCategoria_producto(rs.getInt(5));
                p.setMarca_producto(rs.getString(6));
                p.setNombre_categoria(rs.getString(7));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------------------------------------
    //LISTADO DE EMPLEADOS
    public List<CLASE_EMPLEADO> listado_empleados(){
        List<CLASE_EMPLEADO> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "select codigo,nombre_empleado,telefono_empleado,direccion_empleado from empleado";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_EMPLEADO p = new CLASE_EMPLEADO();
                p.setCodigo_empleado(rs.getString(1));
                p.setNombre_empleado(rs.getString(2));
                p.setTelefono_empleado(rs.getString(3));               
                p.setDireccion_empleado(rs.getString(4));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    
    //-----------------------------------------------------------------------------------------------------
    //LISTADO DE PROVEEDORES
    public List<CLASE_PROVEEDOR> listado_proveedores(){
        List<CLASE_PROVEEDOR> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "select pro.ruc_proveedor,pro.telefono_proveedor,pro.razon_social,pro.pagina_web,pro.direccion_proveedor, m.nombre_marca from proveedor pro, marca m where pro.marca_id_marca = m.id_marca";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_PROVEEDOR p = new CLASE_PROVEEDOR();
                p.setRuc_proveedor(rs.getString(1));
                p.setTelefono_proveedor(rs.getString(2));
                p.setRazon_social_proveedor(rs.getString(3));               
                p.setPagina_web_proveedor(rs.getString(4));
                p.setDireccion_proveedor(rs.getString(5));
                p.setMarca_proveedor(rs.getString(6));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    //-----------------------------------------------------------------------------------------------------
    //LISTADO DE PROVEEDORES
    public List<CLASE_PROVEEDOR> listado_proveedores_tipos(int id){
        List<CLASE_PROVEEDOR> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "select pro.ruc_proveedor,pro.telefono_proveedor,pro.razon_social,pro.pagina_web,pro.direccion_proveedor, m.nombre_marca from proveedor pro, marca m,producto p where pro.marca_id_marca = m.id_marca and pro.ruc_proveedor = p.proveedor_ruc_proveedor and p.categoria_id_categoria = ? GROUP BY pro.ruc_proveedor;";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Pasamos el codigo 
            st.setInt(1, id);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_PROVEEDOR p = new CLASE_PROVEEDOR();
                p.setRuc_proveedor(rs.getString(1));
                p.setTelefono_proveedor(rs.getString(2));
                p.setRazon_social_proveedor(rs.getString(3));               
                p.setPagina_web_proveedor(rs.getString(4));
                p.setDireccion_proveedor(rs.getString(5));
                p.setMarca_proveedor(rs.getString(6));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    //-----------------------------------------------------------------------------------------------------
    //LISTADO DE PROVEEDORES
    public List<CLASE_PROVEEDOR> listado_productos_proveedores(String cad){
        List<CLASE_PROVEEDOR> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "select pro.ruc_proveedor,pro.telefono_proveedor,pro.razon_social,pro.pagina_web,pro.direccion_proveedor, m.nombre_marca,p.descripcion_producto,p.id_producto from proveedor pro, marca m, producto p where pro.marca_id_marca = m.id_marca and pro.ruc_proveedor = p.proveedor_ruc_proveedor and pro.ruc_proveedor = ?";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Pasamos el codigo 
            st.setString(1, cad);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_PROVEEDOR p = new CLASE_PROVEEDOR();
                p.setRuc_proveedor(rs.getString(1));
                p.setTelefono_proveedor(rs.getString(2));
                p.setRazon_social_proveedor(rs.getString(3));               
                p.setPagina_web_proveedor(rs.getString(4));
                p.setDireccion_proveedor(rs.getString(5));
                p.setMarca_proveedor(rs.getString(6));
                p.setNombre_producto(rs.getString(7));
                p.setCodigo_producto(rs.getInt(8));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    //------------------------------------------------------------------------------------------------------
    public void adicion_ventas_al_cliente(CLASE_VENTA v) {
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "{call spventa(?,?,?)}";
            
            //Preparamos la consulta para procedures
            CallableStatement st = cn.prepareCall(sql);
            
            //Relacionamos 
            st.setInt(1, v.getCodigo_producto());
            st.setInt(2, v.getDni_cliente());
            st.setInt(3, v.getCantidad_producto());
            
            
            //Actualizamos
            st.executeUpdate();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }
    }
    //------------------------------------------------------------------------------------------------------
    
    //-----------------------------------------------------------------------------------------------------
    //LISTADO DE PROVEEDORES
    public List<CLASE_VENTA> listado_productos_vendidos(int co_producto, int dni_cli){
        List<CLASE_VENTA> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "SELECT v.nro,v.fecha_venta,p.precio_unitario,dv.cantidad,dv.precio_venta,v.descuento,h.importe from venta v, producto p, detalle_venta dv,historial_compra h,cliente c WHERE v.nro = dv.venta_nro and dv.venta_nro = h.detalle_venta_venta_nro and dv.producto_id_producto = p.id_producto and p.id_producto = ? and c.dni = ?";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Pasamos el codigo 
            st.setInt(1, co_producto);
            st.setInt(2, dni_cli);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_VENTA p = new CLASE_VENTA();
                p.setNumero_venta(rs.getInt(1));
                p.setFecha_venta(rs.getString(2));
                p.setPrecio_unitario_producto(rs.getDouble(3));               
                p.setCantidad_producto(rs.getInt(4));
                p.setPrecio_venta(rs.getDouble(5));
                p.setDescuento_venta(rs.getDouble(6));
                p.setImporte_venta(rs.getDouble(7));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    //------------------------------------------------------------------------------------------------------
    public void adicion_pedido_proveedor(CLASE_PEDIDO_PROVEEDOR pd) {
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "{call sppedidoprov(?,?,?,?)}";
            
            //Preparamos la consulta para procedures
            CallableStatement st = cn.prepareCall(sql);
            
            //Relacionamos 
            st.setInt(1, pd.getCodigo_empleado());
            st.setInt(2, pd.getCod_producto());
            st.setInt(3, pd.getCant_pedido());
            st.setString(4, pd.getRuc_proveedor());        
            
            //Actualizamos
            st.executeUpdate();                    
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }
    }
    //------------------------------------------------------------------------------------------------------
    
    //-----------------------------------------------------------------------------------------------------
    
    //LISTADO DE PRODUCTOS
    public List<CLASE_PEDIDO_PROVEEDOR> listado_pedidos_proveedores(int cod_empleado,int cod_producto, String ruc_proveedor){
        List<CLASE_PEDIDO_PROVEEDOR> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "select pe.nro_pedido,p.descripcion_producto,pe.fecha_pedido,pe.cantidad_pedido,p.precio_unitario,(pe.cantidad_pedido*p.precio_unitario) importe from pedido_proveedor pe,producto p where pe.producto_id_producto = p.id_producto and pe.empleado_codigo = ? and pe.producto_id_producto = ? and pe.proveedor_ruc_proveedor = ?";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Pasamos el codigo 
            st.setInt(1, cod_empleado);
            st.setInt(2, cod_producto);
            st.setString(3, ruc_proveedor);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_PEDIDO_PROVEEDOR p = new CLASE_PEDIDO_PROVEEDOR();
                p.setNumero_pedido_proveedor(rs.getString(1));
                p.setDescripcion_producto(rs.getString(2));
                p.setFecha_pedido_proveedor(rs.getString(3));               
                p.setCant_pedido(rs.getInt(4));
                p.setPrecio_unitario_producto(rs.getDouble(5));
                p.setImporte_pedido(rs.getDouble(6));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    //------------------------------------------------------------------------------------------------------
    public void eliminar_pedido_proveedor(CLASE_PEDIDO_PROVEEDOR p) {
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "{call spdeletepedidoprov(?)}";
            
            //Preparamos la consulta para procedures
            CallableStatement st = cn.prepareCall(sql);
            
            //Relacionamos 
            st.setString(1, p.getNumero_pedido_proveedor());      
            
            //Actualizamos
            st.executeUpdate();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }
    }
    //------------------------------------------------------------------------------------------------------
    public void edita_pedido_proveedor(CLASE_PEDIDO_PROVEEDOR p) {
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "{call speditpedidoprov(?,?,?)}";
            
            //Preparamos la consulta para procedures
            CallableStatement st = cn.prepareCall(sql);
            
            //Relacionamos 
            st.setString(1, p.getNumero_pedido_proveedor());
            st.setInt(2, p.getCod_producto());
            st.setInt(3, p.getCant_pedido());
            
            
            //Actualizamos
            st.executeUpdate();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }
    }
    //------------------------------------------------------------------------------------------------------
    
    //------------------------------------------------------------------------------------------------------
    public static String buscarCliente(String nombre, String contraseña) {
        String busqueda_cliente = null;
        Connection cn=MySQLConexion.getConexion();
      try{
          String sql="select cliente_dni,empleado_codigo,contrasenia from logearse where cliente_dni=? && contrasenia=?";
          PreparedStatement st=cn.prepareStatement(sql);
          st.setString(1, nombre);
          st.setString(2, contraseña);
          ResultSet rs=st.executeQuery();
          if(rs.next()){
              busqueda_cliente = "s";
          }else{
              busqueda_cliente = "n";
          }
      }catch(Exception ex){
          ex.printStackTrace();
      }finally{
        try{ cn.close();}catch(Exception ex2){}
      }
      return busqueda_cliente;
    }
    //------------------------------------------------------------------------------------------------------
    
    
    
    //------------------------------------------------------------------------------------------------------
    public static String buscarEmpleado(String nombre, String contraseña) {
        String busqueda_empleado = null;
        Connection cn=MySQLConexion.getConexion();
      try{
          String sql="select cliente_dni,empleado_codigo,contrasenia from logearse where empleado_codigo=? && contrasenia=?";
          PreparedStatement st=cn.prepareStatement(sql);
          st.setString(1, nombre);
          st.setString(2, contraseña);
          ResultSet rs=st.executeQuery();
          if(rs.next()){
              busqueda_empleado = "s";
          }else{
              busqueda_empleado = "n";
          }
      }catch(Exception ex){
          ex.printStackTrace();
      }finally{
        try{ cn.close();}catch(Exception ex2){}
      }
      return busqueda_empleado;
    }
    
    //------------------------------------------------------------------------------------------------------
    
    //------------------------------------------------------------------------------------------------------
    public void edita_pedido_cliente(CLASE_VENTA p) {
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "{call speditventa(?,?,?)}";
            
            //Preparamos la consulta para procedures
            CallableStatement st = cn.prepareCall(sql);
            
            //Relacionamos 
            st.setInt(1, p.getNumero_venta());
            st.setInt(2, p.getCodigo_producto());
            st.setInt(3, p.getCantidad_producto());
            
            
            //Actualizamos
            st.executeUpdate();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }
    }
    //------------------------------------------------------------------------------------------------------
    
    //------------------------------------------------------------------------------------------------------
    public void eliminar_pedido_cliente(CLASE_VENTA p) {
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "{call spdeleteventa(?)}";
            
            //Preparamos la consulta para procedures
            CallableStatement st = cn.prepareCall(sql);
            
            //Relacionamos 
            st.setInt(1, p.getNumero_venta());      
            
            //Actualizamos
            st.executeUpdate();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }
    }
    //-----------------------------------------------------------------------------------------------------
    
    
    //------------------------------------------------------------------------------------------------------
    public void adicion_cliente_empleado(REGISTRO p) {
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "{call spnvousuario(?,?,?,?,?,?)}";
            
            //Preparamos la consulta para procedures
            CallableStatement st = cn.prepareCall(sql);
            
            //Relacionamos 
            st.setString(1, p.getDni_cliente());     
            st.setString(2, p.getNombre_cliente()); 
            st.setString(3, p.getContraseña_cliente()); 
            st.setString(4, p.getTelefono_cliente()); 
            st.setString(5, p.getDireccion_cliente()); 
            st.setString(6, p.getCorreo_cliente()); 
            
            //Actualizamos
            st.executeUpdate();
            
            
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }
    }
    //-----------------------------------------------------------------------------------------------------
    
    //------------------------------------------------------------------------------------------------------
    public static String buscar_codigo_empleado(String nombre_empleado, String telefono, String direccion) {
        String busqueda_codigo_empleado = null;
        Connection cn=MySQLConexion.getConexion();
      try{
          String sql="select codigo from empleado where nombre_empleado=? and telefono_empleado=? and direccion_empleado=?";
          PreparedStatement st=cn.prepareStatement(sql);
          st.setString(1, nombre_empleado);
          st.setString(2, telefono);
          st.setString(3, direccion);
          ResultSet rs=st.executeQuery();
          if(rs.next()){
              busqueda_codigo_empleado = rs.getString(1);
          }
      }catch(Exception ex){
          ex.printStackTrace();
      }finally{
        try{ cn.close();}catch(Exception ex2){}
      }
      return busqueda_codigo_empleado;
    }
    
    //------------------------------------------------------------------------------------------------------

    public List<CLASE_GRAFICO_VENTAS> grafico_ventas(){
        List<CLASE_GRAFICO_VENTAS> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "Select detalle_venta_producto_id_producto, Sum(importe) from historial_compra group by detalle_venta_producto_id_producto";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_GRAFICO_VENTAS p = new CLASE_GRAFICO_VENTAS();
                p.setCodigo_producto(rs.getString(1));
                p.setIngreso(rs.getDouble(2));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
    
    //------------------------------------------------------------------------------------------------------

    public List<CLASE_GRAFICO_VENTAS> grafico_productos(){
        List<CLASE_GRAFICO_VENTAS> lis = new ArrayList();
        
        //Abriendo conexion
        Connection cn = MySQLConexion.getConexion();
        
        try{ //En el try vemos si tenemos errores
            String sql = "Select id_producto, stock_producto from producto where stock_producto > 30";
            
            //Preparamos la consulta
            PreparedStatement st = cn.prepareStatement(sql);
            
            //Ejecutamos 
            ResultSet rs = st.executeQuery();
            
            //Leemos
            while (rs.next()) {
                
                //Pasamos la consulta
                CLASE_GRAFICO_VENTAS p = new CLASE_GRAFICO_VENTAS();
                p.setCodigo_producto(rs.getString(1));
                p.setStock_producto(rs.getInt(2));
                
                //Agregamos a la lista
                lis.add(p);
            }
        }
        catch(Exception ex){
            ex.printStackTrace();
        }finally{
            try{
                cn.close();
            }catch(Exception ex2){
                
            }
        }

        return lis;
    }
    //-----------------------------------------------------------------------------------------------------
}

