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
}
