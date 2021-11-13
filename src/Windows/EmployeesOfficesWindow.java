/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Dialog.AddEmployeeDialog2;
import Dialog.AddOfficeDialog;
import Dialog.EditEmployeeDialog;
import sisexpsql.DBemployees;
import sisexpsql.DBoffices;

/**
 *
 * @author Luna
 */
public class EmployeesOfficesWindow extends javax.swing.JFrame {

    /**
     * Creates new form EmployeesOfficesWindow
     */
    public EmployeesOfficesWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        employeeTable.setModel(new DBemployees().getEmployees());
        officeTable.setModel(new DBoffices().getOffices());
    }
    
    public static String text = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        addEmployeeButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        editEmployeeTextField = new javax.swing.JTextField();
        findEmployeeLastNameButton = new javax.swing.JButton();
        findEmployeeNumberButton = new javax.swing.JButton();
        findEmployeeTextField = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        employeeTable = new javax.swing.JTable();
        getEmployeesButton = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        editEmployeeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addOfficeButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        findOfficeTextField = new javax.swing.JTextField();
        findOfficeNumberButton = new javax.swing.JButton();
        findOfficeCityNameButton = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        editOfficeTextField = new javax.swing.JTextField();
        editOfficeButton = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        officeTable = new javax.swing.JTable();
        getOfficesButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Empleados / Oficinas");

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Empleados:");

        jLabel2.setText("Opciones de Empleados:");

        addEmployeeButton.setText("Agregar un Empleado");
        addEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addEmployeeButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Buscar Empleado:");

        jLabel4.setText("Modificar un Empleado:");

        findEmployeeLastNameButton.setText("Buscar por Apellido");
        findEmployeeLastNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findEmployeeLastNameButtonActionPerformed(evt);
            }
        });

        findEmployeeNumberButton.setText("Buscar por Número de Empleado");
        findEmployeeNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findEmployeeNumberButtonActionPerformed(evt);
            }
        });

        employeeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        employeeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                employeeTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(employeeTable);

        getEmployeesButton.setText("Listar Empleados");
        getEmployeesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getEmployeesButtonActionPerformed(evt);
            }
        });

        editEmployeeButton.setText("Modificar Empleado");
        editEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editEmployeeButtonActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Oficinas:");

        jLabel6.setText("Opciones de Oficinas:");

        addOfficeButton.setText("Agregar una Oficina");
        addOfficeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOfficeButtonActionPerformed(evt);
            }
        });

        jLabel7.setText("Buscar Oficina:");

        findOfficeNumberButton.setText("Buscar por Código de Officina");
        findOfficeNumberButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findOfficeNumberButtonActionPerformed(evt);
            }
        });

        findOfficeCityNameButton.setText("Buscar por Ciudad");
        findOfficeCityNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findOfficeCityNameButtonActionPerformed(evt);
            }
        });

        jLabel8.setText("Modificar una Oficina:");

        editOfficeButton.setText("Modificar Oficina");

        officeTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        officeTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                officeTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(officeTable);

        getOfficesButton.setText("Listar Oficinas");
        getOfficesButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                getOfficesButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(addEmployeeButton)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editEmployeeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)
                                    .addComponent(editEmployeeTextField)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(findEmployeeLastNameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(findEmployeeNumberButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                                    .addComponent(findEmployeeTextField, javax.swing.GroupLayout.Alignment.TRAILING))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(getEmployeesButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(addOfficeButton)
                            .addComponent(jLabel5)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(editOfficeTextField)
                                    .addComponent(editOfficeButton, javax.swing.GroupLayout.DEFAULT_SIZE, 187, Short.MAX_VALUE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(findOfficeCityNameButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(findOfficeTextField)
                                    .addComponent(findOfficeNumberButton, javax.swing.GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(getOfficesButton)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 824, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(getEmployeesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addEmployeeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(findEmployeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findEmployeeNumberButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findEmployeeLastNameButton)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(editEmployeeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editEmployeeButton))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 258, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(getOfficesButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addOfficeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(findOfficeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findOfficeNumberButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findOfficeCityNameButton)
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(editOfficeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editOfficeButton)
                        .addGap(0, 72, Short.MAX_VALUE))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void findEmployeeNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findEmployeeNumberButtonActionPerformed
        DBemployees db = new DBemployees();
        employeeTable.setModel(db.findEmployeeByNumber(findEmployeeTextField.getText()));
    }//GEN-LAST:event_findEmployeeNumberButtonActionPerformed

    private void findOfficeNumberButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findOfficeNumberButtonActionPerformed
        DBoffices db = new DBoffices();
        officeTable.setModel(db.findOfficeByCode(findOfficeTextField.getText()));
    }//GEN-LAST:event_findOfficeNumberButtonActionPerformed

    private void getEmployeesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getEmployeesButtonActionPerformed
        employeeTable.setModel(new DBemployees().getEmployees());
    }//GEN-LAST:event_getEmployeesButtonActionPerformed

    private void findEmployeeLastNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findEmployeeLastNameButtonActionPerformed
        employeeTable.setModel(new DBemployees().findEmployeeByLastName(findEmployeeTextField.getText()));
    }//GEN-LAST:event_findEmployeeLastNameButtonActionPerformed

    private void addEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addEmployeeButtonActionPerformed
        AddEmployeeDialog2 aed = new AddEmployeeDialog2(this,true);
        aed.setVisible(true);
    }//GEN-LAST:event_addEmployeeButtonActionPerformed

    private void employeeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_employeeTableMouseClicked
        editEmployeeTextField.setText(employeeTable.getValueAt(employeeTable.getSelectedRow(), 0).toString());
        officeTable.setModel(new DBoffices().findOfficeByCode(
                employeeTable.getValueAt(employeeTable.getSelectedRow(), 5).toString()));
    }//GEN-LAST:event_employeeTableMouseClicked

    private void editEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editEmployeeButtonActionPerformed
        text = editEmployeeTextField.getText();
        EditEmployeeDialog eed = new EditEmployeeDialog(this,true);
        eed.setVisible(true);
    }//GEN-LAST:event_editEmployeeButtonActionPerformed

    private void getOfficesButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_getOfficesButtonActionPerformed
       DBoffices db = new DBoffices();
       officeTable.setModel(db.getOffices());
    }//GEN-LAST:event_getOfficesButtonActionPerformed

    private void findOfficeCityNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findOfficeCityNameButtonActionPerformed
        DBoffices db = new DBoffices();
        officeTable.setModel(db.findOfficeByCity(findOfficeTextField.getText()));
    }//GEN-LAST:event_findOfficeCityNameButtonActionPerformed

    private void officeTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_officeTableMouseClicked
        editOfficeTextField.setText(officeTable.getValueAt(officeTable.getSelectedRow(), 0).toString());
        employeeTable.setModel(new DBemployees().findEmployeesByOffice(officeTable.getValueAt(
                officeTable.getSelectedRow(), 0).toString()));
    }//GEN-LAST:event_officeTableMouseClicked

    private void addOfficeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOfficeButtonActionPerformed
        AddOfficeDialog aod = new AddOfficeDialog(this,true);
        aod.setVisible(true);
    }//GEN-LAST:event_addOfficeButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(EmployeesOfficesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EmployeesOfficesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EmployeesOfficesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EmployeesOfficesWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EmployeesOfficesWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addEmployeeButton;
    private javax.swing.JButton addOfficeButton;
    private javax.swing.JButton editEmployeeButton;
    private javax.swing.JTextField editEmployeeTextField;
    private javax.swing.JButton editOfficeButton;
    private javax.swing.JTextField editOfficeTextField;
    private javax.swing.JTable employeeTable;
    private javax.swing.JButton findEmployeeLastNameButton;
    private javax.swing.JButton findEmployeeNumberButton;
    private javax.swing.JTextField findEmployeeTextField;
    private javax.swing.JButton findOfficeCityNameButton;
    private javax.swing.JButton findOfficeNumberButton;
    private javax.swing.JTextField findOfficeTextField;
    private javax.swing.JButton getEmployeesButton;
    private javax.swing.JButton getOfficesButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTable officeTable;
    // End of variables declaration//GEN-END:variables
}
