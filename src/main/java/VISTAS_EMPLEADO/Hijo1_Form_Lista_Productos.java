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

public class Hijo1_Form_Lista_Productos extends javax.swing.JFrame {

    //Inicamos negocio
    negocio obj = new negocio();
    
    //Llamamos al metodo para pintar
    PINTAR_FILAS pintar=new PINTAR_FILAS();
    int xMouse, yMouse;
    public Hijo1_Form_Lista_Productos() {
        initComponents();
        
        //Mostramos lista de productos
        ver_productos();     
    }

    //---------------------------------------------------------------------------------------------------------
    void ver_productos(){
        DefaultTableModel dt = (DefaultTableModel)tabla1.getModel();
        
        //Limpiamos la tabla
        dt.setRowCount(0);
        
        //leemos      
        for(CLASE_PRODUCTO x:obj.listado_productos()){
            Object v[] = {x.getCodigo_producto(),x.getDescripcion_producto(),x.getPrecio_unitario_producto(),x.getStock_producto(),x.getCategoria_producto(),x.getMarca_producto()};
            
            //Lo agregamos a la tabla
            dt.addRow(v);
        }
        
        //Pintamos las celdas
        tabla1.setDefaultRenderer(tabla1.getColumnClass(3), pintar);
    }
    //---------------------------------------------------------------------------------------------------------
    
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
        Image imgesc = img.getImage().getScaledInstance(lbImagenProducto.getWidth(), lbImagenProducto.getHeight(), Image.SCALE_SMOOTH);
        //Colocar la imagen en la etiqueta (LABEL)
        lbImagenProducto.setIcon(new ImageIcon(imgesc));           
    }
    //-------------------------------------------------------------------------------------------------------------------------
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla1 = new javax.swing.JTable();
        lbImagenProducto = new javax.swing.JLabel();
        Header = new javax.swing.JPanel();
        exitBtn = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();

        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(220, 169, 194));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("LISTA DE PRODUCTOS");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 50, 162, -1));

        tabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "CODIGO", "DESCRIPCION", "PRECIO UNITARIO", "STOCK", "CATEGORIA", "MARCA"
            }
        ));
        tabla1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabla1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabla1);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 93, 552, 185));

        lbImagenProducto.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.add(lbImagenProducto, new org.netbeans.lib.awtextra.AbsoluteConstraints(592, 93, 191, 185));

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
            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
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
                .addGap(0, 753, Short.MAX_VALUE)
                .addComponent(exitBtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        HeaderLayout.setVerticalGroup(
            HeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(exitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 309, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Hijo1_Form_Lista_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hijo1_Form_Lista_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hijo1_Form_Lista_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hijo1_Form_Lista_Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hijo1_Form_Lista_Productos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Header;
    private javax.swing.JPanel exitBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbImagenProducto;
    private javax.swing.JTable tabla1;
    // End of variables declaration//GEN-END:variables
}
