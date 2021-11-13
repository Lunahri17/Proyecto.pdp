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
}
