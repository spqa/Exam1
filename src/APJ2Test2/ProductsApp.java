/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package APJ2Test2;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sql.rowset.CachedRowSet;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author QuangAnh
 */
public class ProductsApp extends javax.swing.JFrame {

    DefaultTableModel dataTbl;
    DefaultComboBoxModel<Manufacturers> cbData;
    List<products> lstPro;
    List<Manufacturers> lstManu;

    /**
     * Creates new form ProductsApp
     */
    public ProductsApp() {
        initComponents();
        loadData();
        disableEdit();
    }

    private void loadData() {
        cbData = new DefaultComboBoxModel<>();
        dataTbl = new DefaultTableModel();
        lstManu = new ArrayList<>();
        lstPro = new ArrayList<>();
        dataTbl.addColumn("ProductID");
        dataTbl.addColumn("Product Name");
        dataTbl.addColumn("Product Price");
        dataTbl.addColumn("Product Manufacturer");
        ProductsImpl p = new ProductsImpl();
        ManufacturerImpl m = new ManufacturerImpl();
        lstManu = m.getManuData();
        lstPro = p.loadData();
        for (products lstPro1 : lstPro) {
            String[] row = {lstPro1.getId() + "", lstPro1.getName(), lstPro1.getPrice() + "", m.getManu(lstPro1.getManuId()).getName()};
            dataTbl.addRow(row);
        }
        jTable1.setModel(dataTbl);
        for (Manufacturers lstManu1 : lstManu) {
            cbData.addElement(lstManu1);
        }

        cbManu.setModel(cbData);
    }

    private void disableEdit() {
        txtId.setEnabled(false);
        txtPrice.setEnabled(false);
        txtname.setEnabled(false);
        cbManu.setEnabled(false);
    }

    private void enableEdit() {
        txtId.setEnabled(true);
        txtPrice.setEnabled(true);
        txtname.setEnabled(true);
        cbManu.setEnabled(true);
        txtId.setText("");
        txtPrice.setText("");
        txtname.setText("");
    }

    private boolean checkValid() {
        if (txtId.getText().equals("") | txtPrice.getText().equals("") | txtname.getText().equals("")) {
            return false;
        }
        return true;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtPrice = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        cbManu = new javax.swing.JComboBox();
        btnInsert = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnFind = new javax.swing.JButton();
        btnDel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("ID: ");

        txtPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPriceActionPerformed(evt);
            }
        });

        jLabel2.setText("Name: ");

        jLabel3.setText("Price");

        jLabel4.setText("Manufacturers");

        cbManu.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        btnInsert.setText("Insert");
        btnInsert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsertActionPerformed(evt);
            }
        });

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        btnFind.setText("Find");
        btnFind.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFindActionPerformed(evt);
            }
        });

        btnDel.setText("Delete");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
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
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtname, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtPrice, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(cbManu, 0, 276, Short.MAX_VALUE))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnInsert, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnFind, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnDel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 631, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnInsert))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnUpdate))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btnFind))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbManu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDel))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPriceActionPerformed

    private void btnInsertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsertActionPerformed
        // TODO add your handling code here:
        if (btnInsert.getText().equals("Insert")) {
            enableEdit();
            btnInsert.setText("Save");
        } else {
            ProductsImpl p = new ProductsImpl();
            if (checkValid()) {
                Manufacturers m = (Manufacturers) cbManu.getSelectedItem();
                int get = p.AddData(Integer.parseInt(txtId.getText()), txtname.getText(), Integer.parseInt(txtPrice.getText()), m.getId());
                btnInsert.setText("Insert");
                disableEdit();
                loadData();
            }
        }
    }//GEN-LAST:event_btnInsertActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        ProductsImpl p = new ProductsImpl();
        if (checkValid()) {
            Manufacturers m = (Manufacturers) cbManu.getSelectedItem();
            int get = p.UpdateData(Integer.parseInt(txtId.getText()), txtname.getText(), Integer.parseInt(txtPrice.getText()), m.getId());
            loadData();
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        enableEdit();
        products p = lstPro.get(jTable1.getSelectedRow());
        ManufacturerImpl m = new ManufacturerImpl();
        txtId.setText(p.getId() + "");
        txtPrice.setText(p.getPrice() + "");
        txtname.setText(p.getName());
        cbData.setSelectedItem(m.getManu(p.getManuId()));
        cbManu.setModel(cbData);
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnFindActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFindActionPerformed
        boolean isValid = false;
        int getInt = 0;
        while (isValid == false) {
            String get = JOptionPane.showInputDialog("Enter id u need to find");
            if (get != null) {
                try {
                    getInt = Integer.parseInt(get);
                    isValid = true;
                } catch (NumberFormatException e) {
                    isValid = false;
                    JOptionPane.showMessageDialog(rootPane, "Invalid");
                }
            }else{ break;}
        }
        if (isValid == true) {
            ProductsImpl p = new ProductsImpl();
            ManufacturerImpl m = new ManufacturerImpl();
            products pro = p.findData(getInt);
            JOptionPane.showMessageDialog(rootPane, pro.getId() + "-" + pro.getName() + "-" + pro.getPrice() + "-" + m.getManu(pro.getManuId()));
        }
    }//GEN-LAST:event_btnFindActionPerformed

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
            java.util.logging.Logger.getLogger(ProductsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductsApp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductsApp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDel;
    private javax.swing.JButton btnFind;
    private javax.swing.JButton btnInsert;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JComboBox cbManu;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPrice;
    private javax.swing.JTextField txtname;
    // End of variables declaration//GEN-END:variables
}
