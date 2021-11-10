package sisexpsql;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DBorders {
    public DefaultTableModel getOrder(String customerNumber){
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
            PreparedStatement sql = con.prepareStatement(
                    "SELECT * FROM orders WHERE customerNumber = ?");
            sql.setString(1, customerNumber);
            ResultSet res = sql.executeQuery();
            while (res.next()) {
                Object[] fila = new Object[7];
                fila[0] = res.getString("orderNumber");
                fila[1] = res.getString("orderDate");
                fila[2] = res.getString("requiredDate");
                fila[3] = res.getString("shippedDate");
                fila[4] = res.getString("status");
                fila[5] = res.getString("comments");
                fila[6] = res.getString("customerNumber");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public void addOrder(String orderNumber, String orderDate, 
            String requiredDate, String comments, String customerNumber){
            
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "INSERT INTO orders VALUES(?,?,?,NULL,'In Process',?,?)");
            s.setString(1, orderNumber);
            s.setString(2, orderDate);
            s.setString(3, requiredDate);
            s.setString(4, comments);
            s.setString(5, customerNumber);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    public void updateShippedDate(String shippedDate, int orderNumber){
            
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE orders SET shippeddate = ? WHERE orderNumber = ?");
            s.setString(1, shippedDate);
            s.setInt(2, orderNumber);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateStatus(String status, int orderNumber){
            
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE orders SET status = ? WHERE orderNumber = ?");
            s.setString(1, status);
            s.setInt(2, orderNumber);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateComments(String comment, int orderNumber){
            
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE orders SET comments = ? WHERE orderNumber = ?");
            s.setString(1, comment);
            s.setInt(2, orderNumber);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    //Talbe orderdetails -------------------------------------------------------
    public DefaultTableModel getOrderDetails(String orderNumber){
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Número de Pedido");
        datos.addColumn("Código de Producto");
        datos.addColumn("Cantidad Ordenada");
        datos.addColumn("Precio por Unidad");
        datos.addColumn("Número de Línea de Pedido");
        
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement sql = con.prepareStatement(
                    "SELECT * FROM orderdetails WHERE orderNumber = ?");
            sql.setString(1, orderNumber);
            ResultSet res = sql.executeQuery();
            while (res.next()) {
                Object[] fila = new Object[5];
                fila[0] = res.getString("orderNumber");
                fila[1] = res.getString("productCode");
                fila[2] = res.getString("quantityOrdered");
                fila[3] = res.getString("priceEach");
                fila[4] = res.getString("orderLineNumber");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public void addOrderDetail(String orderNumber, String productCode, 
            String quantityOrdered, String priceEach, String orderLineNumber){
           
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "INSERT INTO orderdetails VALUES(?,?,?,?,?)");
            s.setString(1, orderNumber);
            s.setString(2, productCode);
            s.setString(3, quantityOrdered);
            s.setString(4, priceEach);
            s.setString(5, orderLineNumber);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void delProductDetail(String orderNumber, String productCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "DELETE FROM orderdetails WHERE orderNumber = ? AND productCode = ?");
            s.setString(1, orderNumber);
            s.setString(2, productCode);
            s.executeUpdate();            
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
