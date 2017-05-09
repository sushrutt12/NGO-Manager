/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.OperatingCompanyAdminRole;

import userinterface.AdministrativeRole.ManageRelationship;
import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import javax.swing.JPanel;

/**
 *
 * @author sushr
 */
public class OperatingCompanyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OperatingCompanyWorkAreaJPanel
     */
 JPanel userProcessContainer;
     UserAccount account;
    Organization organization;
    EcoSystem business;
    Enterprise enterprise;
    public OperatingCompanyWorkAreaJPanel(JPanel userProcessContainer, UserAccount account, Organization organization,Enterprise enterprise, EcoSystem business) {
        initComponents();
    this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.organization=organization;
        this.business=business;
        this.enterprise=enterprise;
    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        manageRelationsJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();

        manageRelationsJButton.setText("Manage Relationship");
        manageRelationsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageRelationsJButtonActionPerformed(evt);
            }
        });

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
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Operating Company");

        jButton2.setText("Add People");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(209, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2)
                    .addComponent(manageRelationsJButton)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(384, 384, 384))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(manageRelationsJButton)
                .addGap(18, 18, 18)
                .addComponent(jButton2)
                .addContainerGap(454, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void manageRelationsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageRelationsJButtonActionPerformed
        // TODO add your handling code here:
        ManageRelationship managerelationsJPanel = new ManageRelationship(userProcessContainer,business,enterprise);
        userProcessContainer.add("ManageRelationshipOperatingCompany", managerelationsJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageRelationsJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton manageRelationsJButton;
    // End of variables declaration//GEN-END:variables
}
