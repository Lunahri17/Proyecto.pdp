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
    
    public DefaultTableModel findProduct(String productCode){
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
            PreparedStatement s = con.prepareStatement(
                    "SELECT * FROM products WHERE productCode LIKE ?");
            s.setString(1,"%" + productCode + "%");
            ResultSet res = s.executeQuery(); 
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
    
    public DefaultTableModel findProductByName(String productName){
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
            PreparedStatement s = con.prepareStatement(
                    "SELECT * FROM products WHERE productName LIKE ?");
            s.setString(1,"%" + productName + "%");
            ResultSet res = s.executeQuery(); 
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
    
    public void addProduct(String productCode, String productName, String productLine, 
            String productScale, String productVendor, String productDescription,
            String quantityInStock, float buyPrice, float MSRP){
            
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "INSERT INTO products VALUES(?,?,?,?,?,?,?,?,?)");
            s.setString(1, productCode);
            s.setString(2, productName);
            s.setString(3, productLine);
            s.setString(4, productScale);
            s.setString(5, productVendor);
            s.setString(6, productDescription);
            s.setString(7, quantityInStock);
            s.setFloat(8, buyPrice);
            s.setFloat(9, MSRP);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Editar columnas de tabla products
    public void updateProductName(String productName, String productCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE products SET productName = ? WHERE productCode = ?");
            s.setString(1, productName);
            s.setString(2, productCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateProductLine(String productLine, String productCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE products SET productLine = ? WHERE productCode = ?");
            s.setString(1, productLine);
            s.setString(2, productCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateProductScale(String productScale, String productCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE products SET productScale = ? WHERE productCode = ?");
            s.setString(1, productScale);
            s.setString(2, productCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateProductVendor(String productVendor, String productCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE products SET productVendor = ? WHERE productCode = ?");
            s.setString(1, productVendor);
            s.setString(2, productCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateProductDescriprtion(String productDescription, String productCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE products SET productDescription = ? WHERE productCode = ?");
            s.setString(1, productDescription);
            s.setString(2, productCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    
    
    
    

    
    //ProductLine Table:
    public DefaultComboBoxModel getProductLines(){
        DefaultComboBoxModel datos = new DefaultComboBoxModel();
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM productlines");
            while(res.next()){
                datos.addElement(res.getString("productLine"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
}
