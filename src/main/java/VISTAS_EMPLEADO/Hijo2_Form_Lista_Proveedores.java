package VISTAS_EMPLEADO;

//Importamos
import javax.swing.table.DefaultTableModel;
import MODELO.*;
import controlador.negocio;
import java.awt.Color;
import java.awt.Image;
import java.io.File;
import java.util.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Hijo2_Form_Lista_Proveedores extends javax.swing.JFrame {

    //Iniciamos negocio
    negocio obj = new negocio();
    
    //Variable general
    int tipo;
    int xMouse, yMouse;
    public Hijo2_Form_Lista_Proveedores() {
        initComponents();
        
        //Mostramos la tabla de proveedores
        ver_proveedores();    
    }
    
    //---------------------------------------------------------------------------------------------------------
    void ver_proveedores(){
        DefaultTableModel dt = (DefaultTableModel)tabla2.getModel();
        
        //Limpiamos la tabla
        dt.setRowCount(0);
        
        //leemos      
        for(CLASE_PROVEEDOR x:obj.listado_proveedores()){
            Object v[] = {x.getRuc_proveedor(),x.getTelefono_proveedor(),x.getRazon_social_proveedor(),x.getPagina_web_proveedor(),x.getDireccion_proveedor(),x.getMarca_proveedor()};
            
            //Lo agregamos a la tabla
            dt.addRow(v);
        }
    }
    //---------------------------------------------------------------------------------------------------------
    void tipo1(){
        DefaultTableModel dt = (DefaultTableModel)tabla2.getModel();
        
        //LIMPIAR PRIMERO LA TABLA
        dt.setRowCount(0);
        
        int tipo = 1;
        
        //Creamos un objeto para mostar los datos de la tabla
        for(CLASE_PROVEEDOR x:obj.listado_proveedores_tipos(tipo)){
            Object t1[] = {x.getRuc_proveedor(),x.getTelefono_proveedor(),x.getRazon_social_proveedor(),x.getPagina_web_proveedor(),x.getDireccion_proveedor(),x.getMarca_proveedor()};  //f: es cualquier variable
            dt.addRow(t1); //Se agrega el objeto a la tabla
        }
    }
    //---------------------------------------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------------------------------------
    void tipo2(){
        DefaultTableModel dt = (DefaultTableModel)tabla2.getModel();
        
        //LIMPIAR PRIMERO LA TABLA
        dt.setRowCount(0);
        
        int tipo = 2;
        
        //Creamos un objeto para mostar los datos de la tabla
        for(CLASE_PROVEEDOR x:obj.listado_proveedores_tipos(tipo)){
            Object t2[] = {x.getRuc_proveedor(),x.getTelefono_proveedor(),x.getRazon_social_proveedor(),x.getPagina_web_proveedor(),x.getDireccion_proveedor(),x.getMarca_proveedor()};  //f: es cualquier variable
            dt.addRow(t2); //Se agrega el objeto a la tabla
        }
    }
    //---------------------------------------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------------------------------------
    void tipo3(){
        DefaultTableModel dt = (DefaultTableModel)tabla2.getModel();
        
        //LIMPIAR PRIMERO LA TABLA
        dt.setRowCount(0);
        
        int tipo = 3;
        
        //Creamos un objeto para mostar los datos de la tabla
        for(CLASE_PROVEEDOR x:obj.listado_proveedores_tipos(tipo)){
            Object t3[] = {x.getRuc_proveedor(),x.getTelefono_proveedor(),x.getRazon_social_proveedor(),x.getPagina_web_proveedor(),x.getDireccion_proveedor(),x.getMarca_proveedor()};  //f: es cualquier variable
            dt.addRow(t3); //Se agrega el objeto a la tabla
        }
    }
    //---------------------------------------------------------------------------------------------------------
    
    //---------------------------------------------------------------------------------------------------------
    void tipo4(){
        DefaultTableModel dt = (DefaultTableModel)tabla2.getModel();
        
        //LIMPIAR PRIMERO LA TABLA
        dt.setRowCount(0);
        
        int tipo = 4;
        
        //Creamos un objeto para mostar los datos de la tabla
        for(CLASE_PROVEEDOR x:obj.listado_proveedores_tipos(tipo)){
            Object t4[] = {x.getRuc_proveedor(),x.getTelefono_proveedor(),x.getRazon_social_proveedor(),x.getPagina_web_proveedor(),x.getDireccion_proveedor(),x.getMarca_proveedor()};  //f: es cualquier variable
            dt.addRow(t4); //Se agrega el objeto a la tabla
        }
    }
    //---------------------------------------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------------------------------------------------------
    //COLOCANDO UNA IMAGEN EN EL FORMULARIO
    //Para Visualizar una imagen pasando una cadena
    void muestra_foto_proveedores(String id){
        //Obtener la ruta del proyecto
        String ruta = new File("src").getAbsolutePath();
        //Llevar la imagen a memoria
        ruta = ruta + "/main/java/marcas/"+id+".jpg";
        ImageIcon img = new ImageIcon(ruta);
        //Colocamos la escala de acuerdo al tamaño disponible
        Image imgesc = img.getImage().getScaledInstance(lbImagenProveedor.getWidth(), lbImagenProveedor.getHeight(), Image.SCALE_SMOOTH);
        //Colocar la imagen en la etiqueta (LABEL)
        lbImagenProveedor.setIcon(new ImageIcon(imgesc));           
    }
    //-------------------------------------------------------------------------------------------------------------------------

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jRadioButton4 = new javax.swing.JRadioButton();
        btnRealizarPedidoProveedor = new javax.swing.JButton();
        lbImagenProveedor = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla2 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(220, 169, 194));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(220, 169, 194));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("TIPOS"));

        jRadioButton1.setBackground(new java.awt.Color(220, 169, 194));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Calzado");
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setBackground(new java.awt.Color(220, 169, 194));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Prendas inferiores");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        jRadioButton3.setBackground(new java.awt.Color(220, 169, 194));
        buttonGroup1.add(jRadioButton3);
        jRadioButton3.setText("Prendas superiores");
        jRadioButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jRadioButton4.setBackground(new java.awt.Color(220, 169, 194));
        buttonGroup1.add(jRadioButton4);
        jRadioButton4.setText("Accesorios");
        jRadioButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jRadioButton1)
                .addGap(42, 42, 42)
                .addComponent(jRadioButton2)
                .addGap(43, 43, 43)
                .addComponent(jRadioButton3)
                .addGap(44, 44, 44)
                .addComponent(jRadioButton4)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jRadioButton1)
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3)
                    .addComponent(jRadioButton4))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        jPanel2.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 90, 585, -1));

        btnRealizarPedidoProveedor.setBackground(new java.awt.Color(220, 169, 194));
        btnRealizarPedidoProveedor.setText("Realizar pedido");
        btnRealizarPedidoProveedor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRealizarPedidoProveedor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRealizarPedidoProveedorActionPerformed(evt);
            }
        });
        jPanel2.add(btnRealizarPedidoProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 340, -1, -1));

        lbImagenProveedor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lbImagenProveedor, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 160, 145, 160));

        tabla2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "RUC", "TELEFONO", "RAZON SOCIAL", "PAGINA WEB", "DIRECCION", "MARCA"
            }
        ));
        tabla2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla2);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 585, 160));

        jLabel1.setText("LISTA DE PROVEEDORES");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 60, 150, -1));

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

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 750, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 810, 40));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 395, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRealizarPedidoProveedorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRealizarPedidoProveedorActionPerformed
        //Con esto obtengo la fila seleccionada en la tabla
        int f = tabla2.getSelectedRow();
        
        //Si no seleccionamos nada en la tabla
        if(f == -1){
            JOptionPane.showMessageDialog(null, "Seleccione un proveedor");
            return;
        }
        
        //Asignar a las variables publicas estaticas
        Hijo2_1_Pedido_Proveedor.ruc_proveedor_enviado = tabla2.getValueAt(f, 0).toString();
        

        //Llamamos al formulario
        Hijo2_1_Pedido_Proveedor pedido = new Hijo2_1_Pedido_Proveedor();
        
        //Con esto ubicamos donde queremos que salga el formulario (lo centramos)
        pedido.setLocationRelativeTo(null);
        
        //Con esto hacemos visible el formulario
        pedido.setVisible(true);  
    }//GEN-LAST:event_btnRealizarPedidoProveedorActionPerformed

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        //Llamos al metodo
        tipo1();
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        //Llamos al metodo
        tipo2();
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
        //Llamos al metodo
        tipo3();
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
        //Llamos al metodo
        tipo4();
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void tabla2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla2MouseClicked
        //Con esto obtengo la fila seleccionada en la tabla
        int f = tabla2.getSelectedRow();
        
        //Iniciamos empleados
        String nombre_marca = tabla2.getValueAt(f, 5).toString();
        
        //Mostramos la foto
        muestra_foto_proveedores(nombre_marca);
    }//GEN-LAST:event_tabla2MouseClicked

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setVisible(false);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        exitBtn.setBackground(Color.decode("#e81123"));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        exitBtn.setBackground(Color.decode("#DCA9C2"));
    }//GEN-LAST:event_jLabel2MouseExited

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
            java.util.logging.Logger.getLogger(Hijo2_Form_Lista_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hijo2_Form_Lista_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hijo2_Form_Lista_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hijo2_Form_Lista_Proveedores.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hijo2_Form_Lista_Proveedores().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnRealizarPedidoProveedor;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImagenProveedor;
    private javax.swing.JTable tabla2;
    // End of variables declaration//GEN-END:variables
}
