package sisexpsql;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DBemployees {
    public DefaultComboBoxModel getEmployeesNumber(){
        DefaultComboBoxModel datos = new DefaultComboBoxModel();
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM employees");
            while(res.next()){
                datos.addElement(res.getInt("employeeNumber"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public DefaultTableModel getEmployees(){
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Número de Empleado");
        datos.addColumn("Apellidos");
        datos.addColumn("Nombres");
        datos.addColumn("Extensión");
        datos.addColumn("Email");
        datos.addColumn("Código de Oficina");
        datos.addColumn("Superior");
        datos.addColumn("Cargo");
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM employees");
            while (res.next()) {
                Object[] fila = new Object[8];
                fila[0] = res.getString("employeeNumber");
                fila[1] = res.getString("lastName");
                fila[2] = res.getString("firstName");
                fila[3] = res.getString("extension");
                fila[4] = res.getString("email");
                fila[5] = res.getString("officeCode");
                fila[6] = res.getString("reportsTo");
                fila[7] = res.getString("jobTitle");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public DefaultTableModel findEmployeeByNumber(String employeeNumber){
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Número de Empleado");
        datos.addColumn("Apellidos");
        datos.addColumn("Nombres");
        datos.addColumn("Extensión");
        datos.addColumn("Email");
        datos.addColumn("Código de Oficina");
        datos.addColumn("Superior");
        datos.addColumn("Cargo");
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "SELECT * FROM employees WHERE employeeNumber LIKE ?");
            s.setString(1,"%" + employeeNumber + "%");
            ResultSet res = s.executeQuery(); 
            while (res.next()) {
                Object[] fila = new Object[8];
                fila[0] = res.getString("employeeNumber");
                fila[1] = res.getString("lastName");
                fila[2] = res.getString("firstName");
                fila[3] = res.getString("extension");
                fila[4] = res.getString("email");
                fila[5] = res.getString("officeCode");
                fila[6] = res.getString("reportsTo");
                fila[7] = res.getString("jobTitle");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public DefaultTableModel findEmployeeByLastName(String lastName){
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Número de Empleado");
        datos.addColumn("Apellidos");
        datos.addColumn("Nombres");
        datos.addColumn("Extensión");
        datos.addColumn("Email");
        datos.addColumn("Código de Oficina");
        datos.addColumn("Superior");
        datos.addColumn("Cargo");
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "SELECT * FROM employees WHERE lastName LIKE ?");
            s.setString(1,"%" + lastName + "%");
            ResultSet res = s.executeQuery(); 
            while (res.next()) {
                Object[] fila = new Object[8];
                fila[0] = res.getString("employeeNumber");
                fila[1] = res.getString("lastName");
                fila[2] = res.getString("firstName");
                fila[3] = res.getString("extension");
                fila[4] = res.getString("email");
                fila[5] = res.getString("officeCode");
                fila[6] = res.getString("reportsTo");
                fila[7] = res.getString("jobTitle");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public void addEmployee(String employeeNumber, String lastName, String firstName,
            String extension, String email, String officeCode, String reportsTo, String jobTitle){
            
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "INSERT INTO employees VALUES(?,?,?,?,?,?,?,?)");
            s.setString(1, employeeNumber);
            s.setString(2, lastName);
            s.setString(3, firstName);
            s.setString(4, extension);
            s.setString(5, email);
            s.setString(6, officeCode);
            s.setString(7, reportsTo);
            s.setString(8, jobTitle);
            s.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Updates de campos
    public void updateLastName(String lastName, String employeeNumber){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE employeeNumber SET lastName = ? WHERE employeeNumber = ?");
            s.setString(1, lastName);
            s.setString(2, employeeNumber);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateFirstName(String firstName, String employeeNumber){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE employeeNumber SET firstName = ? WHERE employeeNumber = ?");
            s.setString(1, firstName);
            s.setString(2, employeeNumber);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateExtension(String extension, String employeeNumber){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE employeeNumber SET extension = ? WHERE employeeNumber = ?");
            s.setString(1, extension);
            s.setString(2, employeeNumber);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateEmail(String email, String employeeNumber){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE employeeNumber SET email = ? WHERE employeeNumber = ?");
            s.setString(1, email);
            s.setString(2, employeeNumber);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    
}
