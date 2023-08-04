package VISTAS_EMPLEADO;

//IMPORTAMOS
import MODELO.*;
import controlador.negocio;
import java.awt.BorderLayout;
import java.text.DecimalFormat;

//Importamos para el grafico
import org.jfree.chart.*;
import org.jfree.data.category.DefaultCategoryDataset;  //para barras y lineal
import org.jfree.data.general.DefaultPieDataset; //para tortas
import org.jfree.chart.plot.PlotOrientation;

public class Hijo4_Form_Grafico_Ventas extends javax.swing.JFrame {

    negocio obj = new negocio();
    
    //======================================================================================================
    //Graficamos los datos en memoria
    void lineal(){
        DefaultCategoryDataset ds = new DefaultCategoryDataset();

        //Recorremos la lista de meses de acuerdo al año
        for(CLASE_GRAFICO_VENTAS x:obj.grafico_ventas()){
            ds.setValue(x.getIngreso(), "CODIGO PRODUCTO", x.getCodigo_producto());
        }
        
        //Realiza la grafica en memoria
        JFreeChart grafico = ChartFactory.createLineChart("", "", "INGRESOS", ds);
        ChartPanel cp = new ChartPanel(grafico);
        
        //Limpiamos el panel 
        panel1.removeAll();
        
        //Lo establecemos en el grafico
        panel1.setLayout(new java.awt.BorderLayout());
        
        //Lo agregamos
        panel1.add(cp,BorderLayout.CENTER);
        
        //Validamos
        panel1.validate();
    }
    //======================================================================================================
    
    public Hijo4_Form_Grafico_Ventas() {
        initComponents();
        
        //Mostramos el grafico
        lineal();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel1 = new javax.swing.JPanel();

        panel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 688, Short.MAX_VALUE)
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 472, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(panel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Hijo4_Form_Grafico_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Hijo4_Form_Grafico_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Hijo4_Form_Grafico_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Hijo4_Form_Grafico_Ventas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Hijo4_Form_Grafico_Ventas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel panel1;
    // End of variables declaration//GEN-END:variables
}
