/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.EventManagerRole;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.EnterpriseRelation;
import Business.Network.Network;
import Business.UserAccount.UserAccount;
import Business.WorkQueue.EventResourcesWorkRequest;
import Business.WorkQueue.Resource;
import Business.emailclass;
import java.awt.CardLayout;
import java.awt.Component;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.ListSelectionModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author sneha
 */
public class RequestEventResources extends javax.swing.JPanel {
    JPanel userProcessContainer;
    Enterprise enterprise;
    private ArrayList<Resource>resourceList;
    UserAccount account;
    EcoSystem business;
    /**
     * Creates new form RequestEventResources
     */
    public RequestEventResources(JPanel userProcessContainer,Enterprise enterprise,UserAccount account,EcoSystem business) {
        initComponents();
        this.setSize(1100,800);
        
        this.userProcessContainer = userProcessContainer;
        this.account=account;
        this.business=business;
        this.enterprise=enterprise;
        quantityJTextField.setText("0");
        resourceList= new ArrayList<Resource>();
         populateTable();
         Date date = new Date();
         jDateChooserRequiredDate.setDate(date);
    }

    
    public void populateTable()
    {
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
        dtm.setRowCount(0);
        jTable1.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        for(Resource r : resourceList)
        {
            Object[] row = new Object[2];
            row[0]=r;
            row[1]=r.getQuantity();
            
            
            dtm.addRow(row);
            
        }
    }
           public void resetFields(){          
        requestJTextField.setText("");
        descriptionJTextArea.setText("");
        resourceJTextField.setText("");
        quantityJTextField.setText("");
         Date date = new Date();
         jDateChooserRequiredDate.setDate(date);
    }
        
    private boolean validateData()
    {
        if(!(requestJTextField.getText().trim().length() > 0)){
           JOptionPane.showMessageDialog(null,"Request Title field is empty","Warning",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(!( descriptionJTextArea.getText().trim().length() > 0)){
           JOptionPane.showMessageDialog(null,"Description field is empty","Warning",JOptionPane.WARNING_MESSAGE);
            return false;
        }
        else if(resourceList.isEmpty()){
            JOptionPane.showMessageDialog(null,"Please enter at least one resource","Warning",JOptionPane.WARNING_MESSAGE);
            return false;
            
        }
      /*  else if(!(resourceJTextField.getText().trim().length() > 0)){
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
      
        Date date=new Date();//copy me
        long i = date.getTime()+86400000;//this gets todays date and adds 24 hours in it     copy me
        Date reqdDate = jDateChooserRequiredDate.getDate();//copy me
        long j = reqdDate.getTime();//copy me
        if(j<i)// we are checking requested date is greater than todays date by 24 hours     copy me
        {
            JOptionPane.showMessageDialog(null, "Requested/Required date should be atleast 48 hours more than todays date");//copy me
            return false;
        }
 
        else
        {
            return true;
        }        
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
        jLabel4 = new javax.swing.JLabel();
        requestJTextField = new javax.swing.JTextField();
        backJButton = new javax.swing.JButton();
        jDateChooserRequiredDate = new com.toedter.calendar.JDateChooser();
        jLabel5 = new javax.swing.JLabel();
        resourceJTextField = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        quantityJTextField = new javax.swing.JTextField();
        jButtonAdd = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        submitJButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        descriptionJTextArea = new javax.swing.JTextArea();
        jButtonRemove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Request Event Resources");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(358, 32, -1, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Required Date :");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 138, -1, -1));

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Request Title :");
        add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 193, -1, -1));

        requestJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                requestJTextFieldActionPerformed(evt);
            }
        });
        add(requestJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 193, 181, -1));

        backJButton.setBackground(new java.awt.Color(255, 255, 255));
        backJButton.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        backJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsPictures/Icons/Back.GIF"))); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 28, -1, -1));
        add(jDateChooserRequiredDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 138, -1, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Resource : ");
        add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 384, -1, -1));
        add(resourceJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(203, 381, 180, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Quantity :");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(401, 384, -1, -1));

        quantityJTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                quantityJTextFieldActionPerformed(evt);
            }
        });
        add(quantityJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(545, 381, 122, -1));

        jButtonAdd.setBackground(new java.awt.Color(255, 255, 255));
        jButtonAdd.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jButtonAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsPictures/Icons/Add.GIF"))); // NOI18N
        jButtonAdd.setText("Add");
        jButtonAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddActionPerformed(evt);
            }
        });
        add(jButtonAdd, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 380, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Description :");
        add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(39, 250, 164, -1));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Resource", "Quantity"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(jTable1);

        add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 437, 617, 191));

        submitJButton.setBackground(new java.awt.Color(255, 255, 255));
        submitJButton.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        submitJButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsPictures/Icons/save.GIF"))); // NOI18N
        submitJButton.setText("Submit");
        submitJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitJButtonActionPerformed(evt);
            }
        });
        add(submitJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(394, 656, -1, -1));

        descriptionJTextArea.setColumns(20);
        descriptionJTextArea.setRows(5);
        jScrollPane1.setViewportView(descriptionJTextArea);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(221, 250, 499, -1));

        jButtonRemove.setBackground(new java.awt.Color(255, 255, 255));
        jButtonRemove.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jButtonRemove.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/IconsPictures/Icons/Delete.GIF"))); // NOI18N
        jButtonRemove.setText("Remove");
        jButtonRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRemoveActionPerformed(evt);
            }
        });
        add(jButtonRemove, new org.netbeans.lib.awtextra.AbsoluteConstraints(682, 437, -1, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/EventManagerRole/Orange.PNG"))); // NOI18N
        jLabel2.setText("jLabel2");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
        
        userProcessContainer.remove(this);
        Component[] componentArray = userProcessContainer.getComponents();
        Component component = componentArray[componentArray.length - 1];
        EventManagerWorkAreaJPanel emwajp = (EventManagerWorkAreaJPanel) component;
        emwajp.populateTable();
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);
        
       
    }//GEN-LAST:event_backJButtonActionPerformed

    private void quantityJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_quantityJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityJTextFieldActionPerformed

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
      //  Resource resource = new Resource();
       // resource.setResourceName(resourceJTextField.getText());
       // resource.setQuantity(Integer.parseInt(quantityJTextField.getText()));
        resourceList.add(resource);
        resourceJTextField.setText("");
        quantityJTextField.setText("");
        populateTable();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonAddActionPerformed

    private void submitJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitJButtonActionPerformed

        if(validateDate() && validateData()){
        EventResourcesWorkRequest request = new EventResourcesWorkRequest();
        request.setMessage("New request for event resources has been created");
        request.setSender(account);
        request.setStatus("Requested");
        request.setTitle(requestJTextField.getText());
        ArrayList<Resource> res=request.getResourceList();
        
        for(int i = 0;i<resourceList.size();i++)
        {
            res.add(i,resourceList.get(i));
        }
        resourceList.clear();
        request.setDesc(descriptionJTextArea.getText());
        Date d = jDateChooserRequiredDate.getDate();
        long m = d.getTime();
        request.setRequiredDate(m);
        
            account.getWorkQueue().getWorkRequestList().add(request);
            enterprise.getWorkQueue().getWorkRequestList().add(request);
            
            
            String sendTo=null;
        int count=0;
        for (Network n : business.getNetworkList()) {
            for (Enterprise e : n.getEnterpriseDirectory().getEnterpriseList()) {
                for(EnterpriseRelation er:enterprise.getEnterpriseRelationDirectory().getRelationList()) {
                    System.out.println(""+er.getCompanyType());
                    if (er.getCompanyType().equals("TargetCompany") && er.getCompanyName().equals(e.getName())) {
                        {
                            
                                count=0;
                                for(UserAccount ua:e.getUserAccountDirectory().getUserAccountList())
                                {
                                    if(count==0){
                                    sendTo=ua.getEmail();
                                    count++;
                                    }
                                    else
                                    {
                                        String temp=sendTo+" ,"+ua.getEmail();
                                        sendTo=temp;
                                    }
                                }
                                
                            }
                            
                        }
                    }
                }
            }
        
        
        System.err.println(""+sendTo);
//      ****************************************** Email code ***************************
//            try{
//            emailclass.generateAndSendEmailEventResources(sendTo,request);
//            }
//            catch(Exception e)
//            {
//                System.out.println(""+e);
//            }

            
         JOptionPane.showMessageDialog(null, "Request has been submitted", "Information", JOptionPane.INFORMATION_MESSAGE);
      //  backJButton.doClick();
         resetFields();
        }
        else
            return;
        // TODO add your handling code here:
    }//GEN-LAST:event_submitJButtonActionPerformed

    private void jButtonRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRemoveActionPerformed
        int selectedRow = jTable1.getSelectedRow();
        if(selectedRow>=0)
        {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(null, "would you like to delete the resource details?", "warning",dialogButton);
            if(dialogResult == JOptionPane.YES_OPTION)
            {
                Resource r = (Resource)jTable1.getValueAt(selectedRow,0);
                resourceList.remove(r);
                populateTable();
            }
        }
        else
        {
            JOptionPane.showMessageDialog(null, "Please select a row from table first","Warning",JOptionPane.WARNING_MESSAGE);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jButtonRemoveActionPerformed

    private void requestJTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_requestJTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_requestJTextFieldActionPerformed
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
    private javax.swing.JButton backJButton;
    private javax.swing.JTextArea descriptionJTextArea;
    private javax.swing.JButton jButtonAdd;
    private javax.swing.JButton jButtonRemove;
    private com.toedter.calendar.JDateChooser jDateChooserRequiredDate;
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
    private javax.swing.JTextField requestJTextField;
    private javax.swing.JTextField resourceJTextField;
    private javax.swing.JButton submitJButton;
    // End of variables declaration//GEN-END:variables
}