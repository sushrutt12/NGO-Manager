/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.FinancialManagerRole;

import userinterface.TargetCompanyAdminRole.*;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.Resource;
import Business.WorkQueue.ResourcesWorkRequest;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sneha
 */
public class ViewRequestedResourcesF extends javax.swing.JPanel {

    JPanel userProcessContainer;
    UserAccount ua;
    ResourcesWorkRequest wr;
    /**
     * Creates new form RequestEvent
     */
    public ViewRequestedResourcesF(JPanel userProcessContainer, ResourcesWorkRequest wr,UserAccount ua) {
        initComponents();
        this.userProcessContainer = userProcessContainer;
        this.setSize(1100,800);
        this.wr=wr;
        this.ua=ua;
        enableFields();
        populateTable();
        setValues();
        disableFields();
        jButtonSave.setEnabled(false);
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
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionJTextArea = new javax.swing.JTextArea();
        requiredDateJDateChooser = new com.toedter.calendar.JDateChooser();
        jLabel4 = new javax.swing.JLabel();
        jButtonAdd = new javax.swing.JButton();
        requestTitleJTextField = new javax.swing.JTextField();
        jButtonRemove = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        resourceJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        quantityJTextField = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButtonUpdate = new javax.swing.JButton();
        jButtonSave = new javax.swing.JButton();
        bacjJButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Viewing Requested Resources");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(419, 28, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Required Date :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 97, -1, -1));

        descriptionJTextArea.setColumns(20);
        descriptionJTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionJTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 213, 499, -1));
        add(requiredDateJDateChooser, new org.netbeans.lib.awtextra.AbsoluteConstraints(239, 91, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Request Title :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 146, -1, -1));

        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 343, -1, -1));
        add(requestTitleJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(233, 146, 227, -1));

        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(677, 400, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Resource : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 347, -1, -1));

        resourceJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resourceJTextFieldActionPerformed(evt);
            }
        });
        add(resourceJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(198, 344, 180, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(396, 347, -1, -1));

        quantityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityJTextFieldActionPerformed(evt);
            }
        });
        add(quantityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 344, 122, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Description :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 213, 173, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resource", "Quantity"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(45, 400, 617, 191));

        jButtonUpdate.setBackground(new java.awt.Color(255, 255, 255));
        jButtonUpdate.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jButtonUpdate.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsPictures/Icons/edit.GIF"))); // NOI18N
        jButtonUpdate.setText("Update");
        jButtonUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonUpdateActionPerformed(evt);
            }
        });
        add(jButtonUpdate, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 610, -1, -1));

        jButtonSave.setBackground(new java.awt.Color(255, 255, 255));
        jButtonSave.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jButtonSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsPictures/Icons/save.GIF"))); // NOI18N
        jButtonSave.setText("Save");
        jButtonSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonSaveActionPerformed(evt);
            }
        });
        add(jButtonSave, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 610, -1, 70));

        bacjJButton.setBackground(new java.awt.Color(255, 255, 255));
        bacjJButton.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        bacjJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsPictures/Icons/Back.GIF"))); // NOI18N
        bacjJButton.setText("Back");
        bacjJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bacjJButtonActionPerformed(evt);
            }
        });
        add(bacjJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 28, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsPictures/Purple.PNG"))); // NOI18N
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void enableFields()
    {
        requestTitleJTextField.setEnabled(true);
        requiredDateJDateChooser.setEnabled(true);
        jButtonAdd.setEnabled(true);
        jButtonRemove.setEnabled(true);
        resourceJTextField.setEnabled(true);
        quantityJTextField.setEnabled(true);
        descriptionJTextArea.setEnabled(true);
    }
    private void setValues()
    {
        requestTitleJTextField.setText(wr.getTitle());
        long millis = wr.getRequiredDate();
        Date d = new Date(millis);
        requiredDateJDateChooser.setDate(d);
        descriptionJTextArea.setText(wr.getDesc());
        
    }
    private void disableFields()
    {
        requestTitleJTextField.setEnabled(false);
        requiredDateJDateChooser.setEnabled(false);
        jButtonAdd.setEnabled(false);
        jButtonRemove.setEnabled(false);
        resourceJTextField.setEnabled(false);
        quantityJTextField.setEnabled(false);
        descriptionJTextArea.setEnabled(false);
    }
    
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        for(Resource r : wr.getResourceList())
        {
            Object[] row = new Object[2];
            row[0]=r;
            row[1]=r.getQuantity();
            
            
            dtm.addRow(row);
            
        }
    }
    
        
        private boolean validateData()
    {
        if(!(requestTitleJTextField.getText().trim().length() > 0)){
           JOptionPane.showMessageDialog(null,"Request Title field is empty","Warning",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!( descriptionJTextArea.getText().trim().length() > 0)){
           JOptionPane.showMessageDialog(null,"Description field is empty","Warning",JOptionPane.WARNING_MESSAGE);
            return false;
        }
         else if(wr.getResourceList().isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter at least one resource","Warning",JOptionPane.WARNING_MESSAGE);
            return false;
            
        }
       /* else if(!(resourceJTextField.getText().trim().length() > 0)){
           JOptionPane.showMessageDialog(null,"Resource field is empty","Warning",JOptionPane.WARNING_MESSAGE);
            return false;
        }
           else if(!isNumber(quantityJTextField.getText().trim())){
           JOptionPane.showMessageDialog(null,"Quantity field is non numeric","Warning",JOptionPane.WARNING_MESSAGE);
            return false;
        }*/
        else{
          return true;  
        }
        
    }
    
    private boolean validateDate(){
      
        Date date=new Date();
        long i = date.getTime()+86400000;//this gets todays date and adds 24 hours in it  
        Date reqdDate = requiredDateJDateChooser.getDate();
        long j = reqdDate.getTime();
        if(j<i)// we are checking requested date is greater than todays date by 24 hours     
        {
            JOptionPane.showMessageDialog(null, "Requested/Required date should be atleast 48 hours more than todays date");//copy me
            return false;
        }
 
        else
        {
            return true;
        }        
    }
    private void jButtonAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddActionPerformed
        Resource resource = new Resource();
        if(resourceJTextField.getText().trim().length() > 0){
            resource.setResourceName(resourceJTextField.getText()); 
        }
        else{
            JOptionPane.showMessageDialog(null,"Resource field is empty","Warning",JOptionPane.WARNING_MESSAGE);
            return;
           }
        if(quantityJTextField.getText().trim().length()>0 && isNumber(quantityJTextField.getText().trim())&& Integer.parseInt(quantityJTextField.getText())>0){
                resource.setQuantity(Integer.parseInt(quantityJTextField.getText()));
           }
           else{
           JOptionPane.showMessageDialog(null,"Quantity field should be greater than zero and not null","Warning",JOptionPane.WARNING_MESSAGE);
            return;
        }
        wr.getResourceList().add(resource);
        populateTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "would you like to delete the resource details?", "warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                Resource r = (Resource)jTable1.getValueAt(selectedRow,0);
                wr.getResourceList().remove(r);
                populateTable();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void quantityJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityJTextFieldActionPerformed

    private void jButtonSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonSaveActionPerformed
 if(validateDate() && validateData()){
        wr.setDesc(descriptionJTextArea.getText());
        wr.setTitle(requestTitleJTextField.getText());
        
        Date d = requiredDateJDateChooser.getDate();
        long m = d.getTime();
        wr.setRequiredDate(m);
        disableFields();
        jButtonSave.setEnabled(false);
        jButtonSave.setEnabled(true);
        JOptionPane.showMessageDialog(null, "Record successfuly modified","Message",JOptionPane.INFORMATION_MESSAGE);
 }
 else
     return;
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonSaveActionPerformed

    private void jButtonUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonUpdateActionPerformed
        enableFields();
        jButtonUpdate.setEnabled(false);
        jButtonSave.setEnabled(true);
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonUpdateActionPerformed

    private void resourceJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resourceJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_resourceJTextFieldActionPerformed

    private void bacjJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bacjJButtonActionPerformed
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        FinancialManagerWorkAreaJPanel tcwajp = (FinancialManagerWorkAreaJPanel) component;
        tcwajp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

        // TODO add your handling code here:
    }//GEN-LAST:event_bacjJButtonActionPerformed
        private boolean isNumber(String str) {
        int num;
        try{
            num = Integer.parseInt(str);
            
        } catch (NumberFormatException nfe){
            return false;
        }
        return true;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bacjJButton;
    private javax.swing.JTextArea descriptionJTextArea;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonRemove;
    private javax.swing.JButton jButtonSave;
    private javax.swing.JButton jButtonUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField quantityJTextField;
    private javax.swing.JTextField requestTitleJTextField;
    private com.toedter.calendar.JDateChooser requiredDateJDateChooser;
    private javax.swing.JTextField resourceJTextField;
    // End of variables declaration//GEN-END:variables
}
