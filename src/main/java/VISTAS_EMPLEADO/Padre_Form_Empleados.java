package VISTAS_EMPLEADO;

//Importamos
import javax.swing.table.DefaultTableModel;
import MODELO.*;
import controlador.negocio;
import java.awt.Image;
import java.io.File;
import java.util.*;
import javax.swing.ImageIcon;
import VISTA_PRINCIPAL.*;
import java.awt.Color;

public class Padre_Form_Empleados extends javax.swing.JFrame {

    //Iniciamos negocio
    negocio obj = new negocio();
    
    //Llamamos a los formularios
    Padre_Form_Principal inicio = new Padre_Form_Principal();
    int xMouse, yMouse;
    public Padre_Form_Empleados() {
        initComponents();
        
        //Mostramos la tabla de empleados
        muestra_empleados("");
    }

    //----------------------------------------------------------------------------------------------------
    //Hacemos el motodo filtrado de productos
    public void muestra_empleados(String cad){  //startsWith = filtra todos los nombres que empieze con esa cadena
        DefaultTableModel dt = (DefaultTableModel)tabla1.getModel();
        dt.setRowCount(0);
        obj.listado_empleados().stream().filter(a ->a.getNombre_empleado().toUpperCase().startsWith(cad)).
                forEach(x ->dt.addRow(new Object[]{x.getCodigo_empleado(),x.getNombre_empleado(),x.getTelefono_empleado(),x.getDireccion_empleado()}));  //x => es cualquier variable
    }  
    //----------------------------------------------------------------------------------------------------
    
    //-------------------------------------------------------------------------------------------------------------------------
    //COLOCANDO UNA IMAGEN EN EL FORMULARIO
    //Para Visualizar una imagen pasando una cadena
    void muestra_foto_empleado(String id){
        //Obtener la ruta del proyecto
        String ruta = new File("src").getAbsolutePath();
        //Llevar la imagen a memoria
        ruta = ruta + "/main/java/fotos_empleados/"+id+".jpg";
        ImageIcon img = new ImageIcon(ruta);
        //Colocamos la escala de acuerdo al tamaño disponible
        Image imgesc = img.getImage().getScaledInstance(lbImagenEmpleado.getWidth(), lbImagenEmpleado.getHeight(), Image.SCALE_SMOOTH);
        //Colocar la imagen en la etiqueta (LABEL)
        lbImagenEmpleado.setIcon(new ImageIcon(imgesc));           
    }
    //-------------------------------------------------------------------------------------------------------------------------
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        btnListaClientes = new javax.swing.JButton();
        btnFinalizarSesion = new javax.swing.JButton();
        txtNombreEmpleado = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        lbImagenEmpleado = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnListaProductos = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnReporteVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(220, 169, 194));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnListaClientes.setBackground(new java.awt.Color(220, 169, 194));
        btnListaClientes.setText("Ver lista de clientes");
        btnListaClientes.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnListaClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaClientesActionPerformed(evt);
            }
        });
        jPanel2.add(btnListaClientes, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        btnFinalizarSesion.setBackground(new java.awt.Color(220, 169, 194));
        btnFinalizarSesion.setForeground(new java.awt.Color(255, 0, 0));
        btnFinalizarSesion.setText("Finalizar sesion");
        btnFinalizarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnFinalizarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFinalizarSesionActionPerformed(evt);
            }
        });
        jPanel2.add(btnFinalizarSesion, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 330, -1, -1));

        txtNombreEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNombreEmpleadoActionPerformed(evt);
            }
        });
        jPanel2.add(txtNombreEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, 181, -1));

        jLabel2.setText("LISTA DE EMPLEADOS");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 146, -1));

        lbImagenEmpleado.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel2.add(lbImagenEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 120, 231, 190));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "CODIGO", "NOMBRE Y APELLIDO", "TELEFONO", "DIRECCION"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 120, 561, 190));

        jButton1.setBackground(new java.awt.Color(220, 169, 194));
        jButton1.setText("Ver lista proveedores");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 330, -1, -1));

        btnListaProductos.setBackground(new java.awt.Color(220, 169, 194));
        btnListaProductos.setText("Ver lista de productos");
        btnListaProductos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnListaProductos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaProductosActionPerformed(evt);
            }
        });
        jPanel2.add(btnListaProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 360, -1, -1));

        jLabel3.setText("NOMBRE: ");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 85, 20));

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

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("X");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel1MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel1MouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 780, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jPanel2.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 40));

        btnReporteVentas.setText("Ver reporte ventas");
        btnReporteVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReporteVentasActionPerformed(evt);
            }
        });
        jPanel2.add(btnReporteVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 360, 130, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, 399, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnListaProductosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaProductosActionPerformed
        //Llamamos al formulario
        Hijo1_Form_Lista_Productos hijo1 = new Hijo1_Form_Lista_Productos();
        
        //Con esto ubicamos donde queremos que salga el formulario (lo centramos)
        hijo1.setLocationRelativeTo(null);
        
        //Con esto hacemos visible el formulario
        hijo1.setVisible(true);  
    }//GEN-LAST:event_btnListaProductosActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
            //Llamamos al formulario
        Hijo2_Form_Lista_Proveedores hijo2 = new Hijo2_Form_Lista_Proveedores();
        
        //Con esto ubicamos donde queremos que salga el formulario (lo centramos)
        hijo2.setLocationRelativeTo(null);
        
        //Con esto hacemos visible el formulario
        hijo2.setVisible(true);  
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNombreEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNombreEmpleadoActionPerformed
        //Capturamos el ingreso y lo ponemos en el metodo
        muestra_empleados(txtNombreEmpleado.getText().toUpperCase());
    }//GEN-LAST:event_txtNombreEmpleadoActionPerformed

    private void btnListaClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaClientesActionPerformed

        //Llamamos al formulario
        Hijo3_Form_Lista_Clientes hijo3 = new Hijo3_Form_Lista_Clientes();
        
        //Con esto ubicamos donde queremos que salga el formulario (lo centramos)
        hijo3.setLocationRelativeTo(null);
        
        //Con esto hacemos visible el formulario
        hijo3.setVisible(true); 
    }//GEN-LAST:event_btnListaClientesActionPerformed

    private void tabla1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabla1MouseClicked
        //Con esto obtengo la fila seleccionada en la tabla
        int f = tabla1.getSelectedRow();
        
        //Iniciamos empleados
        String codigo_empleado = tabla1.getValueAt(f, 0).toString();
        
        //Mostramos la foto
        muestra_foto_empleado(codigo_empleado);  
    }//GEN-LAST:event_tabla1MouseClicked

    private void btnFinalizarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFinalizarSesionActionPerformed
        //Cerramos el form actual
        this.setVisible(false);
        
        //Abrimos el form principal
        inicio.setVisible(true);
    }//GEN-LAST:event_btnFinalizarSesionActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void jLabel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseClicked
        System.exit(0);
    }//GEN-LAST:event_jLabel1MouseClicked

    private void jLabel1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseEntered
        exitBtn.setBackground(Color.decode("#e81123"));
    }//GEN-LAST:event_jLabel1MouseEntered

    private void jLabel1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel1MouseExited
        exitBtn.setBackground(Color.decode("#DCA9C2"));
    }//GEN-LAST:event_jLabel1MouseExited

    private void btnReporteVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReporteVentasActionPerformed
        //Llamamos al formulario
        Hijo4_Form_Grafico_Ventas grafico = new Hijo4_Form_Grafico_Ventas();
        
        //Con esto ubicamos donde queremos que salga el formulario (lo centramos)
        grafico.setLocationRelativeTo(null);
        
        //Con esto hacemos visible el formulario
        grafico.setVisible(true); 
    }//GEN-LAST:event_btnReporteVentasActionPerformed

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
            java.util.logging.Logger.getLogger(Padre_Form_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Padre_Form_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Padre_Form_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Padre_Form_Empleados.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Padre_Form_Empleados().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnFinalizarSesion;
    private javax.swing.JButton btnListaClientes;
    private javax.swing.JButton btnListaProductos;
    private javax.swing.JButton btnReporteVentas;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImagenEmpleado;
    private javax.swing.JTable tabla1;
    private javax.swing.JTextField txtNombreEmpleado;
    // End of variables declaration//GEN-END:variables
}
