/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Windows;

import Dialog.AddOrderDetail;
import Dialog.editOrderDialog;
import Dialog.AgregarPedidoDialog;
import Dialog.EditCustomerDialog;
import javax.swing.JOptionPane;
import sisexpsql.DBcustomers;
import sisexpsql.DBorders;

/**
 *
 * @author Luna
 */
public class OrdersWindow extends javax.swing.JFrame {

    /**
     * Creates new form OrdersWindow
     */
    public OrdersWindow() {
        initComponents();
        this.setLocationRelativeTo(null);
        customersTable.setModel(new DBcustomers().listar());
    }
    
    public static String text = "";
    public static String text2 = "";

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        customersTable = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        ordersTable = new javax.swing.JTable();
        jScrollPane4 = new javax.swing.JScrollPane();
        orderDetailTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        customerNumberTextField = new javax.swing.JTextField();
        findCustomeByNumberrButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        addOrderButton = new javax.swing.JButton();
        editOrderButton = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        addOrderDetailButton = new javax.swing.JButton();
        deleteOrderDetailButton = new javax.swing.JButton();
        editCustomerButton = new javax.swing.JButton();
        findCustomerByNameButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Buscar Clientes - Pedidos - Detalle de Pedidos");

        customersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        customersTable.setToolTipText("");
        customersTable.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        customersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                customersTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(customersTable);

        ordersTable.setModel(new javax.swing.table.DefaultTableModel(
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
        ordersTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ordersTableMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(ordersTable);

        orderDetailTable.setModel(new javax.swing.table.DefaultTableModel(
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
        orderDetailTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                orderDetailTableMouseClicked(evt);
            }
        });
        jScrollPane4.setViewportView(orderDetailTable);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Opciones de Clientes:");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setText("Número de Cliente:");

        findCustomeByNumberrButton.setText("Buscar por Número");
        findCustomeByNumberrButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCustomeByNumberrButtonActionPerformed(evt);
            }
        });

        jButton1.setText("Listar Tabla");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Clientes");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Pedidos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Detalle del pedido");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Opciones de Pedidos:");

        addOrderButton.setText("Agregar");
        addOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderButtonActionPerformed(evt);
            }
        });

        editOrderButton.setText("Modificar");
        editOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editOrderButtonActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Opciones de Detalle de Pedido:");

        addOrderDetailButton.setText("Agregar");
        addOrderDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addOrderDetailButtonActionPerformed(evt);
            }
        });

        deleteOrderDetailButton.setText("Eliminar");
        deleteOrderDetailButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteOrderDetailButtonActionPerformed(evt);
            }
        });

        editCustomerButton.setText("Modificar Cliente");
        editCustomerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editCustomerButtonActionPerformed(evt);
            }
        });

        findCustomerByNameButton.setText("Buscar por Nombre");
        findCustomerByNameButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                findCustomerByNameButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 898, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1)
                            .addComponent(jLabel6)
                            .addComponent(addOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7)
                            .addComponent(editOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(deleteOrderDetailButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                .addComponent(addOrderDetailButton, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(editCustomerButton, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(findCustomerByNameButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(findCustomeByNumberrButton, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(customerNumberTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))))
                        .addGap(16, 16, 16))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addContainerGap(1075, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(customerNumberTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addComponent(findCustomeByNumberrButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(findCustomerByNameButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editCustomerButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(addOrderButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editOrderButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(11, 11, 11)
                        .addComponent(addOrderDetailButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(deleteOrderDetailButton)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DBcustomers db = new DBcustomers();
        customersTable.setModel(db.listar());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void findCustomeByNumberrButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCustomeByNumberrButtonActionPerformed
        DBcustomers db = new DBcustomers();
        customersTable.setModel(db.findCustomer(Integer.parseInt(customerNumberTextField.getText())));
         ordersTable.setModel(new DBorders().getOrder(customerNumberTextField.getText()));
    }//GEN-LAST:event_findCustomeByNumberrButtonActionPerformed

    private void ordersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ordersTableMouseClicked
        int fila = ordersTable.getSelectedRow();
        String numero = ordersTable.getValueAt(fila, 0).toString();
        orderDetailTable.setModel(new DBorders().getOrderDetails(numero));
    }//GEN-LAST:event_ordersTableMouseClicked

    private void orderDetailTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_orderDetailTableMouseClicked
        //no se usa xdd
    }//GEN-LAST:event_orderDetailTableMouseClicked

    private void customersTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_customersTableMouseClicked
        String numero = customersTable.getValueAt(customersTable.getSelectedRow(), 0).toString();
        customerNumberTextField.setText(numero);
        ordersTable.setModel(new DBorders().getOrder(numero));
    }//GEN-LAST:event_customersTableMouseClicked

    private void addOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderButtonActionPerformed
        if (!customersTable.isRowSelected(customersTable.getSelectedRow())) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Cliente para poder agragar un pedido.");
        } else {
            text = customersTable.getValueAt(customersTable.getSelectedRow(), 0).toString();
            AgregarPedidoDialog apd = new AgregarPedidoDialog(this,true);
            apd.setVisible(true);
            ordersTable.setModel(new DBorders().getOrder(text));
        }
    }//GEN-LAST:event_addOrderButtonActionPerformed

    private void editOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editOrderButtonActionPerformed
        if (!ordersTable.isRowSelected(ordersTable.getSelectedRow())) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un pedido.");
        } else {
            text2 = ordersTable.getValueAt(ordersTable.getSelectedRow(), 0).toString();
            editOrderDialog eod = new editOrderDialog(this,true);
            eod.setVisible(true);
        }
    }//GEN-LAST:event_editOrderButtonActionPerformed

    private void addOrderDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addOrderDetailButtonActionPerformed
        if (!ordersTable.isRowSelected(ordersTable.getSelectedRow())) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Pedido para poder agregar un detalle.");
        } else {
            text2 = ordersTable.getValueAt(ordersTable.getSelectedRow(), 0).toString();
            AddOrderDetail aob = new AddOrderDetail(this,true);
            aob.setVisible(true);
            orderDetailTable.setModel(new DBorders().getOrderDetails(
                    ordersTable.getValueAt(ordersTable.getSelectedRow(), 0).toString()));
        }
    }//GEN-LAST:event_addOrderDetailButtonActionPerformed

    private void deleteOrderDetailButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteOrderDetailButtonActionPerformed
        if (!orderDetailTable.isRowSelected(orderDetailTable.getSelectedRow())) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar un Pedido para poder eliminarlo.");
        } else {
            int resp = JOptionPane.showConfirmDialog(null, "¿Esta seguro que desea eliminar?", "Eliminar un detalle de Pedido", 
                    JOptionPane.YES_NO_OPTION, JOptionPane.ERROR_MESSAGE);
            if (resp == 0) {
                DBorders db = new DBorders();
                db.delProductDetail(orderDetailTable.getValueAt(orderDetailTable.getSelectedRow(), 0).toString(),
                        orderDetailTable.getValueAt(orderDetailTable.getSelectedRow(), 1).toString());
                orderDetailTable.setModel(new DBorders().getOrderDetails(
                    ordersTable.getValueAt(ordersTable.getSelectedRow(), 0).toString()));
            } 
        }
    }//GEN-LAST:event_deleteOrderDetailButtonActionPerformed

    private void editCustomerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editCustomerButtonActionPerformed
        if (customerNumberTextField.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente.");
        } else {
            text = customerNumberTextField.getText();
            EditCustomerDialog ecd = new EditCustomerDialog(this,true);
            ecd.setVisible(true);
            customersTable.setModel(new DBcustomers().listar());
        }
    }//GEN-LAST:event_editCustomerButtonActionPerformed

    private void findCustomerByNameButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_findCustomerByNameButtonActionPerformed
        DBcustomers db = new DBcustomers();
        customersTable.setModel(db.findCustomerByName(customerNumberTextField.getText()));
    }//GEN-LAST:event_findCustomerByNameButtonActionPerformed
    
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
            java.util.logging.Logger.getLogger(OrdersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OrdersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OrdersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OrdersWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OrdersWindow().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addOrderButton;
    private javax.swing.JButton addOrderDetailButton;
    private javax.swing.JTextField customerNumberTextField;
    private javax.swing.JTable customersTable;
    private javax.swing.JButton deleteOrderDetailButton;
    private javax.swing.JButton editCustomerButton;
    private javax.swing.JButton editOrderButton;
    private javax.swing.JButton findCustomeByNumberrButton;
    private javax.swing.JButton findCustomerByNameButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JTable orderDetailTable;
    private javax.swing.JTable ordersTable;
    // End of variables declaration//GEN-END:variables
}
