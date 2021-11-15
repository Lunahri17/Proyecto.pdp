package sisexpsql;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

public class DBoffices {
    public DefaultComboBoxModel getOfficeCodes(){
        DefaultComboBoxModel datos = new DefaultComboBoxModel();
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM offices");
            while(res.next()){
                datos.addElement(res.getInt("officeCode"));
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public DefaultTableModel getOffices(){
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Código de Oficina");
        datos.addColumn("Ciudad");
        datos.addColumn("Teléfono");
        datos.addColumn("Dirección");
        datos.addColumn("Dirección Alternativa");
        datos.addColumn("Provincia");
        datos.addColumn("País");
        datos.addColumn("Código Postal");
        datos.addColumn("Territorio");
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM offices");
            while (res.next()) {
                Object[] fila = new Object[9];
                fila[0] = res.getString("officeCode");
                fila[1] = res.getString("city");
                fila[2] = res.getString("phone");
                fila[3] = res.getString("addressLine1");
                fila[4] = res.getString("addressLine2");
                fila[5] = res.getString("state");
                fila[6] = res.getString("country");
                fila[7] = res.getString("postalCode");
                fila[8] = res.getString("territory");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public DefaultTableModel findOfficeByCode(String officeCode){
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Código de Oficina");
        datos.addColumn("Ciudad");
        datos.addColumn("Teléfono");
        datos.addColumn("Dirección");
        datos.addColumn("Dirección Alternativa");
        datos.addColumn("Provincia");
        datos.addColumn("País");
        datos.addColumn("Código Postal");
        datos.addColumn("Territorio");
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "SELECT * FROM offices WHERE officeCode LIKE ?");
            s.setString(1,"%" + officeCode + "%");
            ResultSet res = s.executeQuery(); 
            while (res.next()) {
                Object[] fila = new Object[9];
                fila[0] = res.getString("officeCode");
                fila[1] = res.getString("city");
                fila[2] = res.getString("phone");
                fila[3] = res.getString("addressLine1");
                fila[4] = res.getString("addressLine2");
                fila[5] = res.getString("state");
                fila[6] = res.getString("country");
                fila[7] = res.getString("postalCode");
                fila[8] = res.getString("territory");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public DefaultTableModel findOfficeByCity(String city){
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Código de Oficina");
        datos.addColumn("Ciudad");
        datos.addColumn("Teléfono");
        datos.addColumn("Dirección");
        datos.addColumn("Dirección Alternativa");
        datos.addColumn("Provincia");
        datos.addColumn("País");
        datos.addColumn("Código Postal");
        datos.addColumn("Territorio");
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "SELECT * FROM offices WHERE city LIKE ?");
            s.setString(1,"%" + city + "%");
            ResultSet res = s.executeQuery(); 
            while (res.next()) {
                Object[] fila = new Object[9];
                fila[0] = res.getString("officeCode");
                fila[1] = res.getString("city");
                fila[2] = res.getString("phone");
                fila[3] = res.getString("addressLine1");
                fila[4] = res.getString("addressLine2");
                fila[5] = res.getString("state");
                fila[6] = res.getString("country");
                fila[7] = res.getString("postalCode");
                fila[8] = res.getString("territory");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public void addOffice(String officeCode, String city, String phone, String addressLine1,
            String addressLine2, String state, String country, String postalCode, String territory){
            
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "INSERT INTO offices VALUES(?,?,?,?,?,?,?,?,?)");
            s.setString(1, officeCode);
            s.setString(2, city);
            s.setString(3, phone);
            s.setString(4, addressLine1);
            s.setString(5, addressLine2);
            s.setString(6, state);
            s.setString(7, country);
            s.setString(8, postalCode);
            s.setString(9, territory);
            s.executeUpdate();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    //Updates de campos
    public void updateCity(String city, String officeCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE offices SET city = ? WHERE officeCode = ?");
            s.setString(1, city);
            s.setString(2, officeCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updatePhone(String phone, String officeCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE offices SET phone = ? WHERE officeCode = ?");
            s.setString(1, phone);
            s.setString(2, officeCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateAddressLine1(String addressLine1, String officeCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE offices SET addressLine1 = ? WHERE officeCode = ?");
            s.setString(1, addressLine1);
            s.setString(2, officeCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateAddressLine2(String addressLine2, String officeCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE offices SET addressLine2 = ? WHERE officeCode = ?");
            s.setString(1, addressLine2);
            s.setString(2, officeCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateSate(String state, String officeCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE offices SET state = ? WHERE officeCode = ?");
            s.setString(1, state);
            s.setString(2, officeCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateCounrty(String country, String officeCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE offices SET country = ? WHERE officeCode = ?");
            s.setString(1, country);
            s.setString(2, officeCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updatePostalCode(String postalCode, String officeCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE offices SET postalCode = ? WHERE officeCode = ?");
            s.setString(1, postalCode);
            s.setString(2, officeCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public void updateTerritory(String territory, String officeCode){
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "UPDATE offices SET territory = ? WHERE officeCode = ?");
            s.setString(1, territory);
            s.setString(2, officeCode);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
