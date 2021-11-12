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

    
    
    
    
    
    
    
}
