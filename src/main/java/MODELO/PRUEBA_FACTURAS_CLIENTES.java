package MODELO;

public class PRUEBA_FACTURAS_CLIENTES {

    public static void main(String[] args) {
        //CREAMOS DOS CLIENTES
            CLASE_CLIENTE c1 = new CLASE_CLIENTE("87654321", "Anderson Abarca", "967141237", "Av. Los Manantiales");
            CLASE_CLIENTE c2 = new CLASE_CLIENTE("12345678", "Victoria Delgado", "965951931", "Av. Campo de Marte");
            
        //CREAMOS FACTURAS
            CLASE_FACTURAS_DE_CLIENTES f1=new CLASE_FACTURAS_DE_CLIENTES("09-05-22",300,c1);
            new CLASE_FACTURAS_DE_CLIENTES("10-05-22",130,c2);
            new CLASE_FACTURAS_DE_CLIENTES("11-05-22",240,c1);
            new CLASE_FACTURAS_DE_CLIENTES("12-05-22",120,c2);
            new CLASE_FACTURAS_DE_CLIENTES("13-05-22",88,c1);
            
        //IMPRIMIMOS
            c1.print();
            System.out.println("==================");
            c2.print();
       
    }
    
    
}
