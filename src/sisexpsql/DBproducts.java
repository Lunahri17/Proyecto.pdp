package sisexpsql;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DBproducts {
        
    public DefaultTableModel getProducts() {
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Código de Producto");
        datos.addColumn("Nombre del Producto");
        datos.addColumn("Linea del Producto");
        datos.addColumn("Escala del Producto");
        datos.addColumn("Vendedor del Producto");
        datos.addColumn("Descripción del Producto");
        datos.addColumn("Cantidad en Stock");
        datos.addColumn("Precio de Compra");
        datos.addColumn("MSRP");
        
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM products");
            while (res.next()) {
                Object[] fila = new Object[9];
                fila[0] = res.getString("productCode");
                fila[1] = res.getString("productName");
                fila[2] = res.getString("productLine");
                fila[3] = res.getString("productScale");
                fila[4] = res.getString("productVendor");
                fila[5] = res.getString("productDescription");
                fila[6] = res.getString("quantityInStock");
                fila[7] = res.getString("buyPrice");
                fila[8] = res.getString("MSRP");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    
}