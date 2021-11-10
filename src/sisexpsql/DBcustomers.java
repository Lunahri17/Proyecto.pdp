package sisexpsql;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DBcustomers {
    public void addCustomer(int customerNumber, String customerName, String contactLastName,
            String contactFirstName, String phone, String addressLine1,
            String addressLine2, String city, String state, String postalCode,
            String country, int salesRepEmployeeNumber, double creditLimit){
            
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "INSERT INTO customers VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?)");
            s.setInt(1, customerNumber);
            s.setString(2, customerName);
            s.setString(3, contactLastName);
            s.setString(4, contactFirstName);
            s.setString(5, phone);
            s.setString(6, addressLine1);
            s.setString(7, addressLine2);
            s.setString(8, city);
            s.setString(9, state);
            s.setString(10, postalCode);
            s.setString(11, country);
            s.setInt(12, salesRepEmployeeNumber);
            s.setDouble(13, creditLimit);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
        
    public DefaultTableModel listar(){
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Número de Cliente");
        datos.addColumn("Nombre del Cliente");
        datos.addColumn("Nombre del Contacto");
        datos.addColumn("Apellido del Contacto");
        datos.addColumn("Teléfono");
        datos.addColumn("Dirección");
        datos.addColumn("Dirección Alternativa");
        datos.addColumn("Ciudad");
        datos.addColumn("Provincia");
        datos.addColumn("Código Postal");
        datos.addColumn("País");
        datos.addColumn("Número de Empleado a cargo");
        datos.addColumn("Límite de Credito");
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM customers");
            while (res.next()) {
                Object[] fila = new Object[13];
                fila[0] = res.getString("customerNumber");
                fila[1] = res.getString("customerName");
                fila[2] = res.getString("contactLastName");
                fila[3] = res.getString("contactFirstName");
                fila[4] = res.getString("phone");
                fila[5] = res.getString("addressLine1");
                fila[6] = res.getString("addressLine2");
                fila[7] = res.getString("city");
                fila[8] = res.getString("state");
                fila[9] = res.getString("postalCode");
                fila[10] = res.getString("country");
                fila[11] = res.getString("salesRepEmployeeNumber");
                fila[12] = res.getString("creditLimit");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public DefaultTableModel findCustomer(int customerNumber){
        DefaultTableModel resultado = new DefaultTableModel();
        resultado.addColumn("customerNumber");
        resultado.addColumn("customerName");
        resultado.addColumn("contactlastName");
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "SELECT * FROM customers WHERE customerNumber = ?");
            s.setInt(1, customerNumber);
            ResultSet res = s.executeQuery(); 
            while (res.next()) {
                Object[] fila = new Object[3];
                fila[0] = res.getString("customerNumber");
                fila[1] = res.getString("customerName");
                fila[2] = res.getString("contactLastName");
                resultado.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }

    
    //Editar Columnas de Clientes:
    public void updateCustomerName(String customerName, String customerNumber){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE customers SET customerName = ? WHERE customerNumber = ?");
            s.setString(1, customerName);
            s.setString(2, customerNumber);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
    public void prueba(){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT current_user");
            res.next();
            System.out.println(res.getString(1));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
