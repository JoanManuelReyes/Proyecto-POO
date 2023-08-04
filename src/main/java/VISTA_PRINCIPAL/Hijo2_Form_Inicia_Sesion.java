package VISTA_PRINCIPAL;

//Importamos
import VISTAS_CLIENTES.*;
import VISTAS_EMPLEADO.*;
import controlador.negocio;
import java.awt.Color;
import javax.swing.JOptionPane;

public class Hijo2_Form_Inicia_Sesion extends javax.swing.JFrame {

    int xMouse, yMouse;
    //Iniciamos negocio 
    negocio obj = new negocio();
    
    //Llamos formularios generales
    Padre_Form_Productos product = new Padre_Form_Productos();
    Padre_Form_Empleados empleados = new Padre_Form_Empleados();
    Padre_Form_Principal inicio = new Padre_Form_Principal();
    
    public Hijo2_Form_Inicia_Sesion() {
        initComponents();
        
        //Para que aparezca en medio
        this.setLocationRelativeTo(null); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        Header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        extTxt = new javax.swing.JLabel();
        btnVolverAtras = new javax.swing.JButton();
        txtDni = new javax.swing.JTextField();
        txtContraseña = new javax.swing.JPasswordField();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(152, 170, 230));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("INICIA SESION");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 40, 99, -1));

        jLabel2.setText("DNI y/o CODIGO");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 90, 91, 20));

        jLabel3.setText("CONTRASEÑA");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 112, 20));

        jRadioButton1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jRadioButton1);
        jRadioButton1.setText("Cliente");
        jRadioButton1.setContentAreaFilled(false);
        jRadioButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 230, -1, -1));

        jRadioButton2.setBackground(new java.awt.Color(152, 170, 230));
        buttonGroup1.add(jRadioButton2);
        jRadioButton2.setText("Empleado");
        jRadioButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jRadioButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 230, -1, -1));

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

        extTxt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        extTxt.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extTxt.setText("X");
        extTxt.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        extTxt.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                extTxtMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                extTxtMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                extTxtMouseExited(evt);
            }
        });

        javax.swing.GroupLayout exitBtnLayout = new javax.swing.GroupLayout(exitBtn);
        exitBtn.setLayout(exitBtnLayout);
        exitBtnLayout.setHorizontalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitBtnLayout.createSequentialGroup()
                .addComponent(extTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        exitBtnLayout.setVerticalGroup(
            exitBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitBtnLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(extTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        btnVolverAtras.setBackground(new java.awt.Color(152, 170, 230));
        btnVolverAtras.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btnVolverAtras.setForeground(new java.awt.Color(255, 0, 0));
        btnVolverAtras.setText("←");
        btnVolverAtras.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnVolverAtras.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnVolverAtras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverAtrasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout HeaderLayout = new javax.swing.GroupLayout(Header);
        Header.setLayout(HeaderLayout);
        HeaderLayout.setHorizontalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addContainerGap(340, Short.MAX_VALUE)
                .addComponent(btnVolverAtras)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, HeaderLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnVolverAtras, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(exitBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        jPanel1.add(Header, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 450, -1));
        jPanel1.add(txtDni, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 90, 150, -1));
        jPanel1.add(txtContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 150, 20));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        //
        String busqueda_cliente = obj.buscarCliente(txtDni.getText(), txtContraseña.getText());
        
        if(busqueda_cliente.equals("s")){
            
            //Enviamos el dni al formulario Hijo2_Form_Realizar_Pedidos
            Hijo2_Form_Realizar_Pedidos.dni_cliente_enviado = Integer.parseInt(txtDni.getText());
            
            //Con esto ubicamos donde queremos que salga el formulario (lo centramos)
            product.setLocationRelativeTo(null);
        
            //Con esto hacemos visible el formulario
            product.setVisible(true);
            
            //Cerramos el inicio
            this.setVisible(false);
        }
        else{
            JOptionPane.showMessageDialog(null, "¡Usuario o Contraseña incorrecto!");
        }    
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        String busqueda_empleado = obj.buscarEmpleado(txtDni.getText(), txtContraseña.getText());
        
        if(busqueda_empleado.equals("s")){
            
            //Enviamos el dni al formulario Hijo2_Form_Realizar_Pedidos
            Hijo2_1_Pedido_Proveedor.cod_empleado_enviado = Integer.parseInt(txtDni.getText());
            
            //Con esto ubicamos donde queremos que salga el formulario (lo centramos)
            empleados.setLocationRelativeTo(null);
        
            //Con esto hacemos visible el formulario
            empleados.setVisible(true);
            empleados.muestra_empleados("");
            
            //Cerramos el inicio
            this.setVisible(false);  
        }
        else{
            JOptionPane.showMessageDialog(null, "¡Usuario o Contraseña incorrecto!");
        }   
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void btnVolverAtrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverAtrasActionPerformed
        //Cerramos el form actual
        this.setVisible(false);
        
        //Abrimos el principal
        inicio.setVisible(true);
        
    }//GEN-LAST:event_btnVolverAtrasActionPerformed

    private void HeaderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMousePressed
        xMouse = evt.getX();
        yMouse = evt.getY();
    }//GEN-LAST:event_HeaderMousePressed

    private void HeaderMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HeaderMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        this.setLocation(x-xMouse,y-yMouse);
    }//GEN-LAST:event_HeaderMouseDragged

    private void extTxtMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extTxtMouseClicked
        System.exit(0);
    }//GEN-LAST:event_extTxtMouseClicked

    private void extTxtMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extTxtMouseEntered
        exitBtn.setBackground(Color.decode("#e81123"));
    }//GEN-LAST:event_extTxtMouseEntered

    private void extTxtMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_extTxtMouseExited
        exitBtn.setBackground(Color.decode("#98AAE6"));
    }//GEN-LAST:event_extTxtMouseExited

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
            java.util.logging.Logger.getLogger(Hijo2_Form_Inicia_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hijo2_Form_Inicia_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hijo2_Form_Inicia_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hijo2_Form_Inicia_Sesion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hijo2_Form_Inicia_Sesion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JButton btnVolverAtras;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel extTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JPasswordField txtContraseña;
    private javax.swing.JTextField txtDni;
    // End of variables declaration//GEN-END:variables
}
