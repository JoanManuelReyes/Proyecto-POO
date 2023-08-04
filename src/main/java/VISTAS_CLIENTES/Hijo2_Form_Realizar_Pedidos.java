package VISTAS_CLIENTES;

//Importamos
import javax.swing.table.DefaultTableModel;
import MODELO.*;
import controlador.negocio;
import java.util.*;
import VISTA_PRINCIPAL.*;
import java.awt.Color;

public class Hijo2_Form_Realizar_Pedidos extends javax.swing.JFrame {

    //Iniciamos negocio
    negocio obj = new negocio();
    
    //Varibales estaticas
    public static int codigo_producto_enviado;
    public static int dni_cliente_enviado;
    
    int xMouse, yMouse;
    public Hijo2_Form_Realizar_Pedidos() {
        initComponents();
        
        //Colocamos las variables estaticas 
        txtCodigoProducto.setText(""+codigo_producto_enviado);
        
        //Mostramos la tabla
        ver_productos_pedidos(codigo_producto_enviado, dni_cliente_enviado);
    }
    
    //---------------------------------------------------------------------------------------------------------
    void ver_productos_pedidos(int cod, int dni){
        DefaultTableModel dt = (DefaultTableModel)tabla1.getModel();
        
        //Limpiamos la tabla
        dt.setRowCount(0);
        
        double suma_pedido = 0;
        //leemos      
        for(CLASE_VENTA x:obj.listado_productos_vendidos(cod, dni)){
            Object v[] = {x.getNumero_venta(),x.getFecha_venta(),x.getPrecio_unitario_producto(),x.getCantidad_producto(),x.getPrecio_venta(),x.getDescuento_venta(),x.getImporte_venta()};
            
            //Lo agregamos a la tabla
            dt.addRow(v);
            suma_pedido += x.getImporte_venta();
        }
        txtImporte.setText("S/. "+suma_pedido);
    }
    //---------------------------------------------------------------------------------------------------------

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCodigoProducto = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUnidades = new javax.swing.JTextField();
        btnAñadirProducto = new javax.swing.JButton();
        btnEditarProducto = new javax.swing.JButton();
        btnEliminarProducto = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel3 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        btnFinalizarCompra = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(91, 168, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("CODIGO: ");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 73, 79, -1));

        txtCodigoProducto.setEditable(false);
        jPanel1.add(txtCodigoProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 70, 176, -1));

        jLabel2.setText("UNIDADES");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(66, 104, 79, -1));
        jPanel1.add(txtUnidades, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 101, 176, -1));

        btnAñadirProducto.setBackground(new java.awt.Color(91, 168, 75));
        btnAñadirProducto.setText("Añadir");
        btnAñadirProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnAñadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAñadirProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAñadirProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 83, 77, -1));

        btnEditarProducto.setBackground(new java.awt.Color(91, 168, 75));
        btnEditarProducto.setText("Editar");
        btnEditarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEditarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(514, 83, 77, -1));

        btnEliminarProducto.setBackground(new java.awt.Color(91, 168, 75));
        btnEliminarProducto.setText("Eliminar");
        btnEliminarProducto.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnEliminarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarProductoActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminarProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(609, 83, 77, -1));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "NRO VENTA", "FECHA", "PRECIO UNITARIO", "CANTIDAD", "PRECIO VENTA", "DESCUENTO", "IMPORTE"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 149, 794, 236));

        jLabel3.setText("IMPORTE TOTAL:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(5, 332, 111, -1));
        jPanel1.add(txtImporte, new org.netbeans.lib.awtextra.AbsoluteConstraints(163, 329, 163, -1));

        btnFinalizarCompra.setBackground(new java.awt.Color(91, 168, 75));
        btnFinalizarCompra.setForeground(new java.awt.Color(51, 51, 255));
        btnFinalizarCompra.setText("SEGUIR COMPRANDO");
        btnFinalizarCompra.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarCompraActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizarCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(345, 418, -1, -1));

        Header.setBackground(new java.awt.Color(91, 168, 75));
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

        exitBtn.setBackground(new java.awt.Color(91, 168, 75));

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("X");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 759, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(HeaderLayout.createSequentialGroup()
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 485, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAñadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAñadirProductoActionPerformed
        
        CLASE_VENTA pa = new CLASE_VENTA();
        
        pa.setCodigo_producto(codigo_producto_enviado);
        pa.setDni_cliente(dni_cliente_enviado);
        pa.setCantidad_producto(Integer.parseInt(txtUnidades.getText()));
        
        obj.adicion_ventas_al_cliente(pa);
        
        //Limpiamos
        txtUnidades.setText("");

        //Mostramos la tabla
        ver_productos_pedidos(codigo_producto_enviado, dni_cliente_enviado);  
    }//GEN-LAST:event_btnAñadirProductoActionPerformed

    private void btnEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarProductoActionPerformed
        // Seleeccionamos la fila 
        int f = tabla1.getSelectedRow();
        
        //Llamamos al metodo
        int codigo_venta = Integer.parseInt(tabla1.getValueAt(f, 0).toString());
        
        CLASE_VENTA pe = new CLASE_VENTA();
        
        //Pasamos valores
        pe.setNumero_venta(codigo_venta);
        pe.setCodigo_producto(Integer.parseInt(txtCodigoProducto.getText()));
        pe.setCantidad_producto(Integer.parseInt(txtUnidades.getText()));
        
        //Llamamos al metodo
        obj.edita_pedido_cliente(pe);
        
        //Mostramos la tabla
        ver_productos_pedidos(codigo_producto_enviado, dni_cliente_enviado); 
    }//GEN-LAST:event_btnEditarProductoActionPerformed

    private void btnEliminarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarProductoActionPerformed
        // Seleeccionamos la fila 
        int f = tabla1.getSelectedRow();
        
        //Llamamos al metodo
        int codigo_venta = Integer.parseInt(tabla1.getValueAt(f, 0).toString());
        
        CLASE_VENTA pe = new CLASE_VENTA();
        
        //Pasamos valores
        pe.setNumero_venta(codigo_venta);
        
        //Limpiamos
        txtUnidades.setText("");
        
        //Llamamos al metodo
        obj.eliminar_pedido_cliente(pe);
        
        //Mostramos la tabla
        ver_productos_pedidos(codigo_producto_enviado, dni_cliente_enviado);
    }//GEN-LAST:event_btnEliminarProductoActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        // DETECTAR LA FILA SELECCIONADA
        int indice = tabla1.getSelectedRow();
        
        //COLOCAMOS EN EL FORMULARIO (ESPACIOS)
        txtUnidades.setText(tabla1.getValueAt(indice,3).toString());
    }//GEN-LAST:event_tabla1MouseClicked

    private void btnFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarCompraActionPerformed
        //Con esto cerramos el form actual
        this.setVisible(false);   
    }//GEN-LAST:event_btnFinalizarCompraActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        this.setVisible(false); 
    }//GEN-LAST:event_jLabel4MouseClicked

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        exitBtn.setBackground(Color.decode("#e81123"));
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        exitBtn.setBackground(Color.decode("#5BA84B"));
    }//GEN-LAST:event_jLabel4MouseExited

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
            java.util.logging.Logger.getLogger(Hijo2_Form_Realizar_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hijo2_Form_Realizar_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hijo2_Form_Realizar_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hijo2_Form_Realizar_Pedidos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hijo2_Form_Realizar_Pedidos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnAñadirProducto;
    private javax.swing.JButton btnEditarProducto;
    private javax.swing.JButton btnEliminarProducto;
    private javax.swing.JButton btnFinalizarCompra;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtCodigoProducto;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtUnidades;
    // End of variables declaration//GEN-END:variables
}
