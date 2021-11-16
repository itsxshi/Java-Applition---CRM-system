/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.system;

import business.ecosystem.EcoSystem;
import business.enterprise.AssemblyCompany;
import business.enterprise.DeliveryCompany;
import business.enterprise.Enterprise;
import business.enterprise.EnterpriseDir;
import business.enterprise.WarehouseCompany;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import util.DB4OUtil;

/**
 *
 * @author Shi
 */
public class EnterpriseJFrame extends javax.swing.JFrame {

    EcoSystem system = EcoSystem.getInstance();
    JPanel panel;
    boolean isEdit;
    Enterprise e;
    EnterpriseDir edir;

    /**
     * Creates new form EnterpriseJFrame
     */
    public EnterpriseJFrame(JPanel panel, boolean isEdit, Enterprise e, EnterpriseDir edir) {
        initComponents();
        this.panel = panel;
        this.isEdit = isEdit;
        this.e = e;
        this.edir = edir;
        DefaultComboBoxModel model = new DefaultComboBoxModel(Enterprise.type.values());
        this.categoryComboBox.setModel(model);

        if (isEdit) {
            this.TitleLabel.setText("Edit enterprise");
            Enterprise.type t = e.getType();
            switch (t) {
                case AssemblyCompany:
                    AssemblyCompany ac = (AssemblyCompany) e;
                    this.nameTxtField.setText(ac.getName());
                    this.phoneTxtField.setText(ac.getPhone());
                    this.addressTxtField.setText(ac.getAddress());
                    break;
                case DeliveryCompany:
                    DeliveryCompany dc = (DeliveryCompany) e;
                    this.nameTxtField.setText(dc.getName());
                    this.phoneTxtField.setText(dc.getPhone());
                    this.addressTxtField.setText(dc.getAddress());
                    break;
                case WarehouseCompany:
                    WarehouseCompany wc = (WarehouseCompany) e;
                    this.nameTxtField.setText(wc.getName());
                    this.phoneTxtField.setText(wc.getPhone());
                    this.addressTxtField.setText(wc.getAddress());
                    break;
            }
            this.categoryComboBox.setEnabled(false);
        } else {
            this.TitleLabel.setText("Create enterprise");
        }
        this.setSize(620, 510);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        TitleLabel = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        nameTxtField = new javax.swing.JTextField();
        phoneTxtField = new javax.swing.JTextField();
        addressTxtField = new javax.swing.JTextField();
        categoryComboBox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        saveBtn = new javax.swing.JButton();
        cancelBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TitleLabel.setText("<Action> Enterprise");

        jLabel2.setText("Name:");

        jLabel3.setText("Address:");

        jLabel4.setText("Phone:");

        categoryComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jLabel1.setText("Category");

        saveBtn.setText("Save");
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        cancelBtn.setText("Cancel");
        cancelBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 637, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(181, 181, 181)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel3)
                                .addComponent(jLabel2)
                                .addComponent(jLabel4)
                                .addComponent(jLabel1))
                            .addGap(46, 46, 46)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(TitleLabel)
                                .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(phoneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(saveBtn)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                            .addComponent(cancelBtn)))
                    .addGap(181, 181, 181)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 510, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(76, 76, 76)
                    .addComponent(TitleLabel)
                    .addGap(21, 21, 21)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(nameTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(26, 26, 26)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(addressTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(34, 34, 34)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel4)
                        .addComponent(phoneTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(35, 35, 35)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(categoryComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel1))
                    .addGap(74, 74, 74)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(saveBtn)
                        .addComponent(cancelBtn))
                    .addContainerGap(94, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        String name = this.nameTxtField.getText();
        String phone = this.phoneTxtField.getText();
        String address = this.addressTxtField.getText();
        Enterprise.type t = (Enterprise.type) this.categoryComboBox.getSelectedItem();
        if (name != null && !"".equals(name) && phone != null && !"".equals(phone) && address != null && !"".equals(address) && t != null) {
            if (isEdit) {
                Enterprise.type et = e.getType();
                switch (et) {
                    case AssemblyCompany:
                        AssemblyCompany ac = (AssemblyCompany) e;
                        ac.setAddress(address);
                        ac.setPhone(phone);
                        ac.setName(name);
                        break;
                    case DeliveryCompany:
                        DeliveryCompany dc = (DeliveryCompany) e;
                        dc.setAddress(address);
                        dc.setPhone(phone);
                        dc.setName(name);
                        break;
                    case WarehouseCompany:
                        WarehouseCompany wc = (WarehouseCompany) e;
                        wc.setAddress(address);
                        wc.setPhone(phone);
                        wc.setName(name);
                        break;
                }
            } else {
                switch (t) {
                    case AssemblyCompany:
                        edir.createAssemblyCompany(name, address, phone);
                        break;
                    case DeliveryCompany:
                        edir.createDeliveryCompany(name, address, phone);
                        break;
                    case WarehouseCompany:
                        edir.createWarehouseCompany(name, address, phone);
                        break;
                }
            }
            ((SystemMainJPanel) panel).refreshEnterpriseList();
            DB4OUtil.getInstance().storeSystem(system);
            this.dispose();
        } else {
            JOptionPane.showMessageDialog(null, "please enter valid input");
        }


    }//GEN-LAST:event_saveBtnActionPerformed

    private void cancelBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelBtnActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_cancelBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel TitleLabel;
    private javax.swing.JTextField addressTxtField;
    private javax.swing.JButton cancelBtn;
    private javax.swing.JComboBox<String> categoryComboBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nameTxtField;
    private javax.swing.JTextField phoneTxtField;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}