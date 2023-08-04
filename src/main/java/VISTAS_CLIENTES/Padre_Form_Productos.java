package VISTAS_CLIENTES;

//Importamos
import javax.swing.table.DefaultTableModel;
import MODELO.*;
import controlador.negocio;
import java.awt.Image;
import java.io.File;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import VISTA_PRINCIPAL.*;
import java.awt.Color;

public class Padre_Form_Productos extends javax.swing.JFrame {

    //Inicializamos negocio
    negocio obj = new negocio();
    
    //Llamamos al formulario
    Padre_Form_Principal inicio = new Padre_Form_Principal();
    int xMouse, yMouse;
    public Padre_Form_Productos() {
        initComponents();
        
        //Mostramos la tabla de productos
        muestra_productos("");
    }

    //----------------------------------------------------------------------------------------------------
    //Hacemos el motodo filtrado de productos
    void muestra_productos(String cad){  //startsWith = filtra todos los nombres que empieze con esa cadena
        DefaultTableModel dt = (DefaultTableModel)tabla1.getModel();
        dt.setRowCount(0);
        obj.listado_productos().stream().filter(a ->a.getDescripcion_producto().toUpperCase().startsWith(cad)).
                forEach(x ->dt.addRow(new Object[]{x.getCodigo_producto(),x.getDescripcion_producto(),x.getPrecio_unitario_producto(),x.getStock_producto()}));  //x => es cualquier variable
    }  
    //----------------------------------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------------------------------------------------------
    //COLOCANDO UNA IMAGEN EN EL FORMULARIO
    //Para Visualizar una imagen pasando una cadena
    void muestra_foto_productos(String id){
        //Obtener la ruta del proyecto
        String ruta = new File("src").getAbsolutePath();
        //Llevar la imagen a memoria
        ruta = ruta + "/main/java/productos/"+id+".jpg";
        ImageIcon img = new ImageIcon(ruta);
        //Colocamos la escala de acuerdo al tamaño disponible
        Image imgesc = img.getImage().getScaledInstance(lbImagen.getWidth(), lbImagen.getHeight(), Image.SCALE_SMOOTH);
        //Colocar la imagen en la etiqueta (LABEL)
        lbImagen.setIcon(new ImageIcon(imgesc));           
    }
    //-------------------------------------------------------------------------------------------------------------------------
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        lbImagen = new javax.swing.JLabel();
        btnConsultarPrecio = new javax.swing.JButton();
        btnRealizarPedidos = new javax.swing.JButton();
        txtDescripcionProducto = new javax.swing.JTextField();
        btnFinalizarSession = new javax.swing.JButton();
        Header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(91, 168, 75));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("SUBURBAN CLOSET");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 50, 122, -1));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO", "STOCK"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 488, 233));

        jLabel2.setText("DESCRIPCION PRODUCTO:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 90, 197, 20));

        lbImagen.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 207, 233));

        btnConsultarPrecio.setBackground(new java.awt.Color(91, 168, 75));
        btnConsultarPrecio.setText("PRECIO Y DETALLES");
        btnConsultarPrecio.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnConsultarPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarPrecioActionPerformed(evt);
            }
        });
        jPanel1.add(btnConsultarPrecio, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 380, -1, -1));

        btnRealizarPedidos.setBackground(new java.awt.Color(91, 168, 75));
        btnRealizarPedidos.setText("REALIZAR PEDIDOS");
        btnRealizarPedidos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRealizarPedidos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPedidosActionPerformed(evt);
            }
        });
        jPanel1.add(btnRealizarPedidos, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 380, -1, -1));

        txtDescripcionProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDescripcionProductoActionPerformed(evt);
            }
        });
        jPanel1.add(txtDescripcionProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, 215, 30));

        btnFinalizarSession.setBackground(new java.awt.Color(91, 168, 75));
        btnFinalizarSession.setForeground(new java.awt.Color(255, 51, 51));
        btnFinalizarSession.setText("Finalizar sesion");
        btnFinalizarSession.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFinalizarSession.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarSessionActionPerformed(evt);
            }
        });
        jPanel1.add(btnFinalizarSession, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 377, 120, 30));

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

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("X");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 788, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        jButton1.setText("GRAFICO STOCK > 30");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 380, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 429, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConsultarPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarPrecioActionPerformed
        //Llamamos al formulario
        Hijo1_Form_Precio_Detalles hijo1 = new Hijo1_Form_Precio_Detalles();
        
        //Con esto ubicamos donde queremos que salga el formulario (lo centramos)
        hijo1.setLocationRelativeTo(null);
        
        //Con esto hacemos visible el formulario
        hijo1.setVisible(true);        
    }//GEN-LAST:event_btnConsultarPrecioActionPerformed

    private void btnRealizarPedidosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPedidosActionPerformed
        //Con esto obtengo la fila seleccionada en la tabla
        int f = tabla1.getSelectedRow();
        
        //Si no seleccionamos nada en la tabla
        if(f == -1){
            JOptionPane.showMessageDialog(null, "Seleccione una producto");
            return;
        }
        
        //Asignar a las variables publicas estaticas
        Hijo2_Form_Realizar_Pedidos.codigo_producto_enviado = Integer.parseInt(tabla1.getValueAt(f, 0).toString());

        
        //Llamamos al formulario
        Hijo2_Form_Realizar_Pedidos hijo2 = new Hijo2_Form_Realizar_Pedidos();
        
        //Con esto ubicamos donde queremos que salga el formulario (lo centramos)
        hijo2.setLocationRelativeTo(null);
        
        //Con esto hacemos visible el formulario
        hijo2.setVisible(true);     
    }//GEN-LAST:event_btnRealizarPedidosActionPerformed

    private void txtDescripcionProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDescripcionProductoActionPerformed
        //Capturamos el ingreso y lo ponemos en el metodo
        muestra_productos(txtDescripcionProducto.getText().toUpperCase());
    }//GEN-LAST:event_txtDescripcionProductoActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        //Con esto obtengo la fila seleccionada en la tabla
        int f = tabla1.getSelectedRow();
        
        //Iniciamos empleados
        String cod_producto_stri = tabla1.getValueAt(f,0).toString();
        int cod_producto_int = Integer.parseInt(cod_producto_stri);
        String nombre = "";
        
        if(cod_producto_int > 10000 && cod_producto_int <= 10006){
            nombre = "zapatillas"; 
        }
        if(cod_producto_int >= 10007 && cod_producto_int <= 10009){
            nombre = "sandalias"; 
        }
        if(cod_producto_int >= 10010 && cod_producto_int <= 10014){
            nombre = "medias"; 
        }
        if(cod_producto_int >= 20001 && cod_producto_int <= 20007){
            nombre = "pantalones"; 
        }
        if(cod_producto_int >= 20008 && cod_producto_int <= 20012){
            nombre = "shorts"; 
        }
        if(cod_producto_int >= 20013 && cod_producto_int <= 20016){
            nombre = "ropa_interior_hombre"; 
        }
        if(cod_producto_int >= 20017 && cod_producto_int <= 20019){
            nombre = "ropa_interior_mujer"; 
        }
        if(cod_producto_int >= 30001 && cod_producto_int <= 30008){
            nombre = "camisas_hombre"; 
        }
        if(cod_producto_int >= 30009 && cod_producto_int <= 30013){
            nombre = "camisas_mujer"; 
        }
        if(cod_producto_int >= 30014 && cod_producto_int <= 30023){
            nombre = "camisetas"; 
        }
        if(cod_producto_int >= 30024 && cod_producto_int <= 30028){
            nombre = "casacas_hombre"; 
        }
        if(cod_producto_int >= 30029 && cod_producto_int <= 30033){
            nombre = "chompas_hombre"; 
        }
        if(cod_producto_int== 30034){
            nombre = "casacas_hombre"; 
        }
        if(cod_producto_int >= 30035 && cod_producto_int <= 30041){
            nombre = "chompas_mujer"; 
        }
        if(cod_producto_int >= 30042 && cod_producto_int <= 30050){
            nombre = "poleras"; 
        }
        if(cod_producto_int >= 30051 && cod_producto_int <= 30057){
            nombre = "polos_hombre"; 
        }
        if(cod_producto_int >= 30058 && cod_producto_int <= 30066){
            nombre = "polos_mujer"; 
        }
        if(cod_producto_int >= 40001 && cod_producto_int <= 40002){
            nombre = "lentes"; 
        }
        if(cod_producto_int >= 40003 && cod_producto_int <= 40012){
            nombre = "gorro"; 
        }
        if(cod_producto_int >= 40013 && cod_producto_int <= 40015){
            nombre = "aretes"; 
        }
        if(cod_producto_int >= 40016 && cod_producto_int <= 40020){
            nombre = "pulseras"; 
        }
        if(cod_producto_int >= 40021 && cod_producto_int <= 40023){
            nombre = "reloj"; 
        }
        muestra_foto_productos(nombre); 
    }//GEN-LAST:event_tabla1MouseClicked

    private void btnFinalizarSessionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarSessionActionPerformed
        //Cerramos el form actual
        this.setVisible(false);
        
        //Abrimos el formularion principal
        inicio.setVisible(true);
    }//GEN-LAST:event_btnFinalizarSessionActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        exitBtn.setBackground(Color.decode("#e81123"));
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        exitBtn.setBackground(Color.decode("#5BA84B"));
    }//GEN-LAST:event_jLabel3MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Llamamos al formulario
        Hijo3_Grafico_productos graf = new Hijo3_Grafico_productos();
        
        //Con esto ubicamos donde queremos que salga el formulario (lo centramos)
        graf.setLocationRelativeTo(null);
        
        //Con esto hacemos visible el formulario
        graf.setVisible(true);     
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Padre_Form_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Padre_Form_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Padre_Form_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Padre_Form_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Padre_Form_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnConsultarPrecio;
    private javax.swing.JButton btnFinalizarSession;
    private javax.swing.JButton btnRealizarPedidos;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImagen;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtDescripcionProducto;
    // End of variables declaration//GEN-END:variables
}
