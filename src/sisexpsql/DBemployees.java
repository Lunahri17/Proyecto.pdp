package sisexpsql;

import java.sql.*;
import javax.swing.DefaultComboBoxModel;

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
                        //+ " : " + res.getString("lastName") + ", " + res.getString("firstName")); //En algún momento lo hare asi xd
            }
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
}
