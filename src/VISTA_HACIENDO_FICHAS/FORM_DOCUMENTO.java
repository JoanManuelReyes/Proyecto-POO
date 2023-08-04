package VISTA_HACIENDO_FICHAS;

//IMPORTAMOS TODAS LAS CLASES
import CASO_3.*;

//IMPORTAMOS TABLA
import javax.swing.table.DefaultTableModel;

public class FORM_DOCUMENTO extends javax.swing.JFrame {

    //INICIALIZAMOS 
    NEGOCIO obj = new NEGOCIO();
    
    //VARIABLE PARA USAR EN EL BOTON ADICIONAR (si es boton boleta es 1 y si es boton factura es 2)
    int tipo;
    
    public FORM_DOCUMENTO() {
        initComponents();
        
        //NECESARIO PARA MOSTRAR TODOS LOS DOCUMENTOS 
        muestra1();
        
        //NECESARIO PARA DESACTIVAR LOS PANELES EN EL BOTON ADICIONAR 
        Panel1.setVisible(false);
        Panel2.setVisible(false);
    }
    
    //LISTAR TODOS
    void muestra1(){
        DefaultTableModel dt = (DefaultTableModel)TABLA1.getModel();
        
        //LIMPIAR PRIMERO LA TABLA
        dt.setRowCount(0);
        
        String tp = "";
        
        //Creamos un objeto para mostar los datos de la tabla
        for(I_DOCUMENTO x:obj.getDoc()){
            tp = (x instanceof II_BOLETA)?"BOLETA":"FACTURA";
            Object f[] = {x.getNumero(),x.getFecha(),x.getImporte(), tp};  //f: es cualquier variable
            dt.addRow(f); //Se agrega el objeto a la tabla
        }
    }
    
    //LISTAR SOLO BOLETAS
    void muestra2(){
        DefaultTableModel dt = (DefaultTableModel)TABLA1.getModel();
        
        //LIMPIAR PRIMERO LA TABLA
        dt.setRowCount(0);
        
        String tp = "";
        
        //Creamos un objeto para mostar los datos de la tabla
        for(I_DOCUMENTO x:obj.getDoc()){
            if(x instanceof II_BOLETA){
                tp = "BOLETA"; 
                Object f[] = {x.getNumero(),x.getFecha(),x.getImporte(), tp};  //f: es cualquier variable
                dt.addRow(f); //Se agrega el objeto a la tabla
            }    
            
        }
    }
    
    //LISTAR SOLO FACTURAS
    void muestra3(){
        DefaultTableModel dt = (DefaultTableModel)TABLA1.getModel();
        
        //LIMPIAR PRIMERO LA TABLA
        dt.setRowCount(0);
        
        String tp = "";
        
        //Creamos un objeto para mostar los datos de la tabla
        for(I_DOCUMENTO x:obj.getDoc()){
            if(x instanceof III_FACTURA){
                tp = "FACTURA"; 
                Object f[] = {x.getNumero(),x.getFecha(),x.getImporte(), tp};  //f: es cualquier variable
                dt.addRow(f); //Se agrega el objeto a la tabla
            }    
            
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtImporte = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        rbRegistroBoleta = new javax.swing.JRadioButton();
        rbRegistroFactura = new javax.swing.JRadioButton();
        Panel1 = new javax.swing.JPanel();
        txtCliente = new javax.swing.JTextField();
        Panel2 = new javax.swing.JPanel();
        txtRuc = new javax.swing.JTextField();
        btnAdicionar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        rbTodos = new javax.swing.JRadioButton();
        rbBoleta = new javax.swing.JRadioButton();
        rbFactura = new javax.swing.JRadioButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TABLA1 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtNumero = new javax.swing.JTextField();
        btnConsultar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtRespuesta = new javax.swing.JTextArea();
        btnAnular = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("FECHA");

        jLabel3.setText("IMPORTE");

        jLabel4.setText("TIPO");

        buttonGroup2.add(rbRegistroBoleta);
        rbRegistroBoleta.setText("BOLETA");
        rbRegistroBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRegistroBoletaActionPerformed(evt);
            }
        });

        buttonGroup2.add(rbRegistroFactura);
        rbRegistroFactura.setText("FACTURA");
        rbRegistroFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbRegistroFacturaActionPerformed(evt);
            }
        });

        Panel1.setBorder(javax.swing.BorderFactory.createTitledBorder("CLIENTE"));

        javax.swing.GroupLayout Panel1Layout = new javax.swing.GroupLayout(Panel1);
        Panel1.setLayout(Panel1Layout);
        Panel1Layout.setHorizontalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtCliente)
                .addContainerGap())
        );
        Panel1Layout.setVerticalGroup(
            Panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel1Layout.createSequentialGroup()
                .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 11, Short.MAX_VALUE))
        );

        Panel2.setBorder(javax.swing.BorderFactory.createTitledBorder("RUC"));

        javax.swing.GroupLayout Panel2Layout = new javax.swing.GroupLayout(Panel2);
        Panel2.setLayout(Panel2Layout);
        Panel2Layout.setHorizontalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(txtRuc)
                .addContainerGap())
        );
        Panel2Layout.setVerticalGroup(
            Panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Panel2Layout.createSequentialGroup()
                .addComponent(txtRuc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
        );

        btnAdicionar.setText("ADICIONAR");
        btnAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(35, 35, 35)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(rbRegistroBoleta)
                                        .addGap(18, 18, 18)
                                        .addComponent(rbRegistroFactura))
                                    .addComponent(txtImporte)
                                    .addComponent(txtFecha)))
                            .addComponent(Panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Panel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnAdicionar)))
                .addContainerGap(202, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtImporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(rbRegistroBoleta)
                    .addComponent(rbRegistroFactura))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addComponent(Panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Panel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAdicionar)
                .addGap(14, 14, 14))
        );

        jTabbedPane1.addTab("REGISTRO", jPanel1);

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("LISTAR POR"));

        buttonGroup1.add(rbTodos);
        rbTodos.setText("Todos");
        rbTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbTodosActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbBoleta);
        rbBoleta.setText("Boleta");
        rbBoleta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbBoletaActionPerformed(evt);
            }
        });

        buttonGroup1.add(rbFactura);
        rbFactura.setText("Factura");
        rbFactura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rbFacturaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(56, Short.MAX_VALUE)
                .addComponent(rbTodos)
                .addGap(30, 30, 30)
                .addComponent(rbBoleta)
                .addGap(35, 35, 35)
                .addComponent(rbFactura)
                .addGap(68, 68, 68))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rbTodos)
                    .addComponent(rbBoleta)
                    .addComponent(rbFactura))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        TABLA1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "NUMERO", "FECHA", "IMPORTE", "TIPO"
            }
        ));
        jScrollPane2.setViewportView(TABLA1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(48, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("LISTADO", jPanel2);

        jLabel1.setText("INGRESE DOCUMENTO");

        btnConsultar.setText("CONSULTAR");
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        txtRespuesta.setColumns(20);
        txtRespuesta.setRows(5);
        jScrollPane1.setViewportView(txtRespuesta);

        btnAnular.setText("ANULAR");
        btnAnular.setEnabled(false);
        btnAnular.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAnularActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(27, 27, 27)
                                .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(34, 34, 34)
                                .addComponent(btnConsultar))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addComponent(btnAnular)))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConsultar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnAnular)
                .addContainerGap(28, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CONSULTA", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 509, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //VARIABLE DE TIPO GENERAL
    I_DOCUMENTO bus;
    
    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        
        bus = obj.BUSCA(txtNumero.getText());
        
        if(bus == null){
            txtRespuesta.setText("¡DOCUMENTO NO EXISTE!");
            return; //SIGNIFICA SALE DEL METODO
        }
        txtRespuesta.setText(bus.print());
        
        //Esto es para activar el boton anular
        btnAnular.setEnabled(true);
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void btnAnularActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAnularActionPerformed
        obj.ANULAR(bus);
        txtRespuesta.setText("¡DOCUMENTO ANULADO!");
        
        //PONEMOS ESO PARA QUE SE ACTUALIZE LA LISTA
        muestra1();
        
        //LUEGO DESACTIVAMOS EL BOTON ANULA
        btnAnular.setEnabled(false);
    }//GEN-LAST:event_btnAnularActionPerformed

    private void rbTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbTodosActionPerformed
        // LLAMAMOS MUESTRA 1
        muestra1();
    }//GEN-LAST:event_rbTodosActionPerformed

    private void rbBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbBoletaActionPerformed
        // LLAMAMOS MUESTRA 2
        muestra2();
    }//GEN-LAST:event_rbBoletaActionPerformed

    private void rbFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbFacturaActionPerformed
        // LLAMAMOS MUESTRA 3
        muestra3();
    }//GEN-LAST:event_rbFacturaActionPerformed

    private void btnAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdicionarActionPerformed
        //CAPTURANDO LOS DATOS 
        String fecha = txtFecha.getText();
        double importe = Double.parseDouble(txtImporte.getText());  
        
        //AGREGAMOS AL REGISTRO DE ACUERDO AL TIPO SELECCIONADO
        if(tipo == 1){
            II_BOLETA bol = new II_BOLETA(fecha, importe, txtCliente.getText());
            obj.ADICION_BOLETA(bol);
        }
        if(tipo == 2){
            III_FACTURA fac = new III_FACTURA(fecha, importe, txtRuc.getText());
            obj.ADICION_FACTURA(fac);
        }
        
        //GRABO Y LIMPIO LOS DATOS 
        txtCliente.setText("");
        txtFecha.setText("");
        txtRuc.setText("");
        txtImporte.setText("");
        
        //LLAMAMOS A LA MUESTRA 1
        muestra1();
        
        //DESACTIVAMOS LOS BOTONES
        Panel1.setVisible(false);
        Panel2.setVisible(false);
        
        
    }//GEN-LAST:event_btnAdicionarActionPerformed

    private void rbRegistroBoletaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRegistroBoletaActionPerformed
        tipo = 1;
        
        //ACTIVAMOS EL PANEL 1
        Panel1.setVisible(true);
        
        //DESACTIVAMOS EL PANEL 2
        Panel2.setVisible(false);
        
    }//GEN-LAST:event_rbRegistroBoletaActionPerformed

    private void rbRegistroFacturaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rbRegistroFacturaActionPerformed
        tipo = 2;
        
        //ACTIVAMOS EL PANEL 2
        Panel2.setVisible(true);
        
        //DESACTIVAMOS EL PANEL 1
        Panel1.setVisible(false);
    }//GEN-LAST:event_rbRegistroFacturaActionPerformed

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
            java.util.logging.Logger.getLogger(FORM_DOCUMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FORM_DOCUMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FORM_DOCUMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FORM_DOCUMENTO.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FORM_DOCUMENTO().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Panel1;
    private javax.swing.JPanel Panel2;
    private javax.swing.JTable TABLA1;
    private javax.swing.JButton btnAdicionar;
    private javax.swing.JButton btnAnular;
    private javax.swing.JButton btnConsultar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton rbBoleta;
    private javax.swing.JRadioButton rbFactura;
    private javax.swing.JRadioButton rbRegistroBoleta;
    private javax.swing.JRadioButton rbRegistroFactura;
    private javax.swing.JRadioButton rbTodos;
    private javax.swing.JTextField txtCliente;
    private javax.swing.JTextField txtFecha;
    private javax.swing.JTextField txtImporte;
    private javax.swing.JTextField txtNumero;
    private javax.swing.JTextArea txtRespuesta;
    private javax.swing.JTextField txtRuc;
    // End of variables declaration//GEN-END:variables
}
