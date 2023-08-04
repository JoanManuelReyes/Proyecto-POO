package VISTA_PRINCIPAL;

//Importamos 
import MODELO.REGISTRO;
import VISTAS_EMPLEADO.*;
import VISTAS_CLIENTES.*;
import controlador.negocio;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Hijo1_Form_Registrarse extends javax.swing.JFrame {

    //Iniciamos negocio
    negocio obj = new negocio();
    
    //Llamamos al formulario
    Hijo2_Form_Inicia_Sesion inicio = new Hijo2_Form_Inicia_Sesion();
    Padre_Form_Principal vol = new Padre_Form_Principal();
    
    //Variables generales
    String detector = "";
    
    int xMouse, yMouse;
    public Hijo1_Form_Registrarse() {
        initComponents();
        
        //NECESARIO PARA DESACTIVAR LOS PANELES EN EL RADION BUTTON 
        Panel1.setVisible(false);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        txtDireccion = new javax.swing.JTextField();
        txtCorreo = new javax.swing.JTextField();
        btnRegistrarse = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        rbCliente = new javax.swing.JRadioButton();
        rbEmpleado = new javax.swing.JRadioButton();
        Panel1 = new javax.swing.JPanel();
        txtDniCliente = new javax.swing.JTextField();
        Header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtContraseña = new javax.swing.JPasswordField();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(152, 170, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INGRESE SUS DATOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(205, 46, 144, -1));

        jLabel3.setText("NOMBRE COMPLETO");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 170, 146, -1));

        jLabel4.setText("TELEFONO");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 96, -1));

        jLabel5.setText("DIRECCION");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 96, -1));

        jLabel6.setText("CORREO ELECTRONICO");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 144, -1));
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 187, -1));
        jPanel1.add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 187, -1));
        jPanel1.add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 187, -1));
        jPanel1.add(txtCorreo, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 300, 189, -1));

        btnRegistrarse.setBackground(new java.awt.Color(152, 170, 230));
        btnRegistrarse.setText("Registrarse");
        btnRegistrarse.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnRegistrarse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarseActionPerformed(evt);
            }
        });
        jPanel1.add(btnRegistrarse, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 420, -1, -1));

        jLabel7.setText("CONTRASEÑA");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 350, 130, -1));

        rbCliente.setBackground(new java.awt.Color(152, 170, 230));
        buttonGroup1.add(rbCliente);
        rbCliente.setText("Cliente");
        rbCliente.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbClienteActionPerformed(evt);
            }
        });
        jPanel1.add(rbCliente, new org.netbeans.lib.awtextra.AbsoluteConstraints(138, 67, -1, -1));

        rbEmpleado.setBackground(new java.awt.Color(152, 170, 230));
        buttonGroup1.add(rbEmpleado);
        rbEmpleado.setText("Empleado");
        rbEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        rbEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbEmpleadoActionPerformed(evt);
            }
        });
        jPanel1.add(rbEmpleado, new org.netbeans.lib.awtextra.AbsoluteConstraints(319, 67, -1, -1));

        Panel1.setBackground(new java.awt.Color(152, 170, 230));
        Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createTitledBorder("DIGITE DNI")));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(txtDniCliente, javax.swing.GroupLayout.DEFAULT_SIZE, 196, Short.MAX_VALUE)
                .addGap(32, 32, 32))
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtDniCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        jPanel1.add(Panel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 90, -1, -1));

        Header.setBackground(new java.awt.Color(152, 170, 230));
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

        exitBtn.setBackground(new java.awt.Color(152, 170, 230));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("X");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 54, Short.MAX_VALUE)
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 486, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 540, 30));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 350, 190, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarseActionPerformed
        //Iniciamos clase
        REGISTRO pa = new REGISTRO();
        
        //Pasamos los valores
        if(detector.equals("cliente")){
            pa.setDni_cliente(txtDniCliente.getText());
            pa.setNombre_cliente(txtNombre.getText());
            pa.setContraseña_cliente(txtContraseña.getText());
            pa.setTelefono_cliente(txtTelefono.getText());
            pa.setDireccion_cliente(txtDireccion.getText());
            pa.setCorreo_cliente(txtCorreo.getText());
        
            obj.adicion_cliente_empleado(pa);
        }
        if(detector.equals("empleado")){
            pa.setDni_cliente("0");
            pa.setNombre_cliente(txtNombre.getText());
            pa.setContraseña_cliente(txtContraseña.getText());
            pa.setTelefono_cliente(txtTelefono.getText());
            pa.setDireccion_cliente(txtDireccion.getText());
            pa.setCorreo_cliente(txtCorreo.getText());
        
            obj.adicion_cliente_empleado(pa);
            
            //Buscamos el codigo
            String busqueda_cliente = obj.buscar_codigo_empleado(txtNombre.getText(), txtTelefono.getText(),txtDireccion.getText());
            
            //Le decimos al empleado su codigo
            JOptionPane.showMessageDialog(null,"Su codigo generado es: "+busqueda_cliente);
        }   
        
        //Cerramos el form actual
        this.setVisible(false);
        
        //Llamamos al formulario
        inicio.setVisible(true);
    }//GEN-LAST:event_btnRegistrarseActionPerformed

    private void rbClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbClienteActionPerformed
        //NECESARIO ACTIVAR EL PANEL
        Panel1.setVisible(true);
        detector = "cliente";
    }//GEN-LAST:event_rbClienteActionPerformed

    private void rbEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbEmpleadoActionPerformed
        //NECESARIO DESACTIVAR EL PANEL
        Panel1.setVisible(false);
        detector = "empleado";
    }//GEN-LAST:event_rbEmpleadoActionPerformed

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
        vol.setVisible(true);
    }//GEN-LAST:event_jLabel2MouseClicked

    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
        exitBtn.setBackground(Color.decode("#e81123"));
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        exitBtn.setBackground(Color.decode("#98AAE6"));
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
            java.util.logging.Logger.getLogger(Hijo1_Form_Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hijo1_Form_Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hijo1_Form_Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hijo1_Form_Registrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hijo1_Form_Registrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel Panel1;
    private javax.swing.JButton btnRegistrarse;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton rbCliente;
    private javax.swing.JRadioButton rbEmpleado;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtCorreo;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtDniCliente;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
