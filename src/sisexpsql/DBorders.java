package sisexpsql;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DBorders {
    public DefaultTableModel getOrders(){
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Número de pedido");
        datos.addColumn("Fecha del pedido");
        datos.addColumn("Fecha Estipulada");
        datos.addColumn("Fecha de envío");
        datos.addColumn("Estado");
        datos.addColumn("Comentarios");
        datos.addColumn("Número de Cliente");
        
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM orders");
            while (res.next()) {
                Object[] fila = new Object[7];
                fila[0] = res.getString("orderNumber");
                fila[1] = res.getString("orderDate");
                fila[2] = res.getString("requiredDate");
                fila[3] = res.getString("shippedDate");
                fila[4] = res.getString("status");
                fila[5] = res.getString("comments");
                fila[6] = res.getString("customersNumber");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
}
