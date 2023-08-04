package MODELO;
import java.awt.Color;
import java.awt.Component;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
public class PINTAR_FILAS extends DefaultTableCellRenderer{
    @Override
    public Component getTableCellRendererComponent(JTable table, Object value, 
            boolean Selected,
            boolean hasFocus, int row,int col){
        super.getTableCellRendererComponent(table, value, Selected, Selected, row, col);
        int a=(int) table.getValueAt(row, 3);
        if(a>5){
            setBackground(Color.decode("#6FC730"));
            setForeground(Color.BLACK);
        }else{
            setBackground(Color.decode("#E40613"));
            setForeground(Color.BLACK);
        }
        return this;
    }
}
