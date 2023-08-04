package VISTAS_EMPLEADO;

//Importamos 
import javax.swing.table.DefaultTableModel;
import MODELO.*;
import controlador.negocio;
import java.awt.Color;
import java.util.*;
import javax.swing.JOptionPane;

public class Hijo2_1_Pedido_Proveedor extends javax.swing.JFrame {

    //Iniciamos negocio 
    negocio obj = new negocio();
    
    //Variables estaticas 
    public static String ruc_proveedor_enviado;
    public static int cod_empleado_enviado;
    
    //Variable general
    int codigo_producto;
   
    int xMouse, yMouse;
    public Hijo2_1_Pedido_Proveedor() {
        initComponents();
        
        //Colocamos la variables en su lugar de impresion
        txtCodigoProveedor.setText(ruc_proveedor_enviado);
 
        //Llenamos el combo
        llena_combo_producto_proveedor(ruc_proveedor_enviado);
    }

    //-------------------------------------------------------------------------------------------------------------------------
    //Llenamos el combo
    void llena_combo_producto_proveedor(String cad){
        
        //Removemos todos los items
        cbProductosProveedor.removeAllItems();
        
        cbProductosProveedor.addItem("Elegir");
        for(CLASE_PROVEEDOR x:obj.listado_productos_proveedores(cad)){
            cbProductosProveedor.addItem(x.getCodigo_producto()+" - "+x.getNombre_producto());
        }      
    } 
    //-------------------------------------------------------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------------------------------------
    void ver_productos_pedido_proveedor(int cod_empleado,int cod_producto, String ruc_proveedor){
        DefaultTableModel dt = (DefaultTableModel)tabla1.getModel();
        
        //Limpiamos la tabla
        dt.setRowCount(0);
        
        double suma_importe = 0;
        //leemos      
        for(CLASE_PEDIDO_PROVEEDOR x:obj.listado_pedidos_proveedores(cod_empleado, cod_producto, ruc_proveedor)){
            Object v[] = {x.getNumero_pedido_proveedor(),x.getDescripcion_producto(),x.getFecha_pedido_proveedor(),x.getCant_pedido(),x.getPrecio_unitario_producto(),x.getImporte_pedido()};
            
            //Lo agregamos a la tabla
            dt.addRow(v);
            suma_importe += x.getImporte_pedido();
        }
        lbImporteTotal.setText("S/. "+suma_importe);
       
    }
    //---------------------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnEditarPedidoProveedor = new javax.swing.JButton();
        btnEliminarPedidoProveedor = new javax.swing.JButton();
        btnFinalizarPedidoProveedor = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        cbProductosProveedor = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        lbImporteTotal = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        btnAgregarPedidoProveedor = new javax.swing.JButton();
        txtUnidadesProveedor = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtCodigoProveedor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 169, 194));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEditarPedidoProveedor.setBackground(new java.awt.Color(220, 169, 194));
        btnEditarPedidoProveedor.setText("Editar");
        btnEditarPedidoProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarPedidoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarPedidoProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarPedidoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 110, 69, -1));

        btnEliminarPedidoProveedor.setBackground(new java.awt.Color(220, 169, 194));
        btnEliminarPedidoProveedor.setText("Eliminar");
        btnEliminarPedidoProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarPedidoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPedidoProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarPedidoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 110, -1, -1));

        btnFinalizarPedidoProveedor.setBackground(new java.awt.Color(220, 169, 194));
        btnFinalizarPedidoProveedor.setForeground(new java.awt.Color(255, 0, 0));
        btnFinalizarPedidoProveedor.setText("Volver atras");
        btnFinalizarPedidoProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarPedidoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarPedidoProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizarPedidoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 520, -1, -1));

        jLabel4.setText("PRODUCTOS:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 170, 100, 20));

        cbProductosProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProductosProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(cbProductosProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 170, 170, -1));

        jLabel5.setText("IMPORTE TOTAL:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 460, 155, -1));

        lbImporteTotal.setBackground(new java.awt.Color(220, 169, 194));
        jPanel1.add(lbImporteTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 460, 132, 13));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "NUMERO PEDIDO", "NOMBRE PRODUCTO", "FECHA", "CANTIDAD", "PRECIO", "IMPORTE"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 230, 640, 200));

        btnAgregarPedidoProveedor.setBackground(new java.awt.Color(220, 169, 194));
        btnAgregarPedidoProveedor.setText("Agregar");
        btnAgregarPedidoProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAgregarPedidoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarPedidoProveedorActionPerformed(evt);
            }
        });
        jPanel1.add(btnAgregarPedidoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 110, -1, -1));
        jPanel1.add(txtUnidadesProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 130, 170, -1));

        jLabel3.setText("UNIDADES:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 130, 85, 20));

        txtCodigoProveedor.setEditable(false);
        jPanel1.add(txtCodigoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 90, 170, -1));

        jLabel2.setText("RUC: ");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 90, 85, 20));

        jLabel1.setText("PEDIDOS A PROVEEDORES");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 60, 213, -1));

        Header.setBackground(new java.awt.Color(220, 169, 194));
        Header.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                HeaderMouseDragged(evt);
            }
        });
        Header.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                HeaderMousePressed(evt);
            }
        });

        exitBtn.setBackground(new java.awt.Color(220, 169, 194));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("X");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel6MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 61, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 649, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 710, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 583, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarPedidoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarPedidoProveedorActionPerformed
        CLASE_PEDIDO_PROVEEDOR pa = new CLASE_PEDIDO_PROVEEDOR();
        
        pa.setCodigo_empleado(cod_empleado_enviado);
        pa.setCod_producto(codigo_producto);
        pa.setCant_pedido(Integer.parseInt(txtUnidadesProveedor.getText()));
        pa.setRuc_proveedor(ruc_proveedor_enviado);
        
        obj.adicion_pedido_proveedor(pa);
        
        JOptionPane.showMessageDialog(this,"¡Pedido Agregado!");
        
        //Limpiamos
        txtUnidadesProveedor.setText("");
        
        //Mostramos la tabla
        ver_productos_pedido_proveedor(cod_empleado_enviado, codigo_producto, ruc_proveedor_enviado);
    }//GEN-LAST:event_btnAgregarPedidoProveedorActionPerformed

    private void cbProductosProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProductosProveedorActionPerformed
        try{
            //Capturo el valor del combo
            String cad = cbProductosProveedor.getSelectedItem().toString();           
            codigo_producto = Integer.parseInt(cad.substring(0,5)); 
            ver_productos_pedido_proveedor(cod_empleado_enviado, codigo_producto, ruc_proveedor_enviado);
        }catch(Exception ex){
            
        }

    }//GEN-LAST:event_cbProductosProveedorActionPerformed

    private void btnEditarPedidoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarPedidoProveedorActionPerformed
        // Seleeccionamos la fila 
        int f = tabla1.getSelectedRow();
        
        //Llamamos al metodo
        String codigo_pedido = tabla1.getValueAt(f, 0).toString();
        
        CLASE_PEDIDO_PROVEEDOR pe = new CLASE_PEDIDO_PROVEEDOR();
        
        //Pasamos valores
        pe.setNumero_pedido_proveedor(codigo_pedido);
        pe.setCod_producto(codigo_producto);
        pe.setCant_pedido(Integer.parseInt(txtUnidadesProveedor.getText()));
        
        //Llamamos al metodo
        obj.edita_pedido_proveedor(pe);
        
        //Mostramos la tabla
        ver_productos_pedido_proveedor(cod_empleado_enviado, codigo_producto, ruc_proveedor_enviado);   
    }//GEN-LAST:event_btnEditarPedidoProveedorActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        // DETECTAR LA FILA SELECCIONADA
        int indice = tabla1.getSelectedRow();
        
        //COLOCAMOS EN EL FORMULARIO (ESPACIOS)
        txtUnidadesProveedor.setText(tabla1.getValueAt(indice,3).toString());
    }//GEN-LAST:event_tabla1MouseClicked

    private void btnEliminarPedidoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPedidoProveedorActionPerformed
        // DETECTAR LA FILA SELECCIONADA
        int indice = tabla1.getSelectedRow();
        
        //Llamamos al metodo
        String codigo_pedido = tabla1.getValueAt(indice, 0).toString();
        
        CLASE_PEDIDO_PROVEEDOR pe = new CLASE_PEDIDO_PROVEEDOR();
        
        //Pasamos valores
        pe.setNumero_pedido_proveedor(codigo_pedido);
        
        //Limpiamos
        txtUnidadesProveedor.setText("");
        
        //Llamamos al metodo
        obj.eliminar_pedido_proveedor(pe);
        
        //Mostramos la tabla
        ver_productos_pedido_proveedor(cod_empleado_enviado, codigo_producto, ruc_proveedor_enviado); 
    }//GEN-LAST:event_btnEliminarPedidoProveedorActionPerformed

    private void btnFinalizarPedidoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarPedidoProveedorActionPerformed
        //Con esto cerramos el form actual
        this.setVisible(false); 
    }//GEN-LAST:event_btnFinalizarPedidoProveedorActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
        this.setVisible(false); 
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseEntered
        exitBtn.setBackground(Color.decode("#e81123"));
    }//GEN-LAST:event_jLabel6MouseEntered

    private void jLabel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseExited
        exitBtn.setBackground(Color.decode("#DCA9C2"));
    }//GEN-LAST:event_jLabel6MouseExited

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Hijo2_1_Pedido_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hijo2_1_Pedido_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hijo2_1_Pedido_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hijo2_1_Pedido_Proveedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hijo2_1_Pedido_Proveedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnAgregarPedidoProveedor;
    private javax.swing.JButton btnEditarPedidoProveedor;
    private javax.swing.JButton btnEliminarPedidoProveedor;
    private javax.swing.JButton btnFinalizarPedidoProveedor;
    private javax.swing.JComboBox<String> cbProductosProveedor;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImporteTotal;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtCodigoProveedor;
    private javax.swing.JTextField txtUnidadesProveedor;
    // End of variables declaration//GEN-END:variables
}
