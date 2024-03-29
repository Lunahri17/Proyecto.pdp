package sisexpsql;

import java.sql.*;
import javax.swing.table.DefaultTableModel;

public class DBpayments {
    public DefaultTableModel getPayments(){
        DefaultTableModel datos = new DefaultTableModel();
        datos.addColumn("Número de Cliente");
        datos.addColumn("Código del Comprobante");
        datos.addColumn("Fecha del Pago");
        datos.addColumn("Cantidad");
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            Statement s = con.createStatement();
            ResultSet res = s.executeQuery("SELECT * FROM payments");
            while (res.next()) {
                Object[] fila = new Object[4];
                fila[0] = res.getString("customerNumber");
                fila[1] = res.getString("checkNumber");
                fila[2] = res.getString("paymentDate");
                fila[3] = res.getString("amount");
                datos.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return datos;
    }
    
    public void addPayment(String customerNumber, String checkNumber, String paymentDate,
            float amount){
            
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "INSERT INTO payments VALUES(?,?,?,?)");
            s.setString(1, customerNumber);
            s.setString(2, checkNumber);
            s.setString(3, paymentDate);
            s.setFloat(4, amount);
            s.executeUpdate();         
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public DefaultTableModel findPayments(String customerNumber){
        DefaultTableModel resultado = new DefaultTableModel();
        resultado.addColumn("Número de Cliente");
        resultado.addColumn("Código del Comprobante");
        resultado.addColumn("Fecha de Pago");
        resultado.addColumn("Cantidad");
        try {
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/classicmodels","root","1234");
            PreparedStatement s = con.prepareStatement(
                    "SELECT * FROM payments WHERE customerNumber = ?");
            s.setString(1, customerNumber);
            ResultSet res = s.executeQuery(); 
            while (res.next()) {
                Object[] fila = new Object[4];
                fila[0] = res.getString("customerNumber");
                fila[1] = res.getString("checkNumber");
                fila[2] = res.getString("paymentDate");
                fila[3] = res.getString("amount");
                resultado.addRow(fila);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return resultado;
    }
}
