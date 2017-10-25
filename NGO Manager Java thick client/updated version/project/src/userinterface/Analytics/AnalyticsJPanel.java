/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.Analytics;

import Business.EcoSystem;
import Business.Enterprise.Enterprise;
import Business.Enterprise.OperatingCompanyEnterprise;
import Business.Network.Network;
import Business.WorkQueue.EventWorkRequest;
import Business.WorkQueue.FundsWorkRequest;
import Business.WorkQueue.Resource;
import Business.WorkQueue.WishWorkRequest;
import Business.WorkQueue.WorkRequest;
import java.awt.CardLayout;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JFrame;
import javax.swing.JPanel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.data.general.PieDataset;
import org.jfree.util.Rotation;

public class AnalyticsJPanel extends javax.swing.JPanel {
    JPanel userProcessContainer;
    EcoSystem business;
    Enterprise enterprise;
    
    /**
     * Creates new form Analytics
     */
    public AnalyticsJPanel(JPanel userProcessContainer, EcoSystem business, Enterprise enterprise) {
        initComponents();
        this.enterprise=enterprise;
        this.business=business;
        this.userProcessContainer=userProcessContainer;
        
    }

    
    
   
  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ntopBudgetEventsJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        ntopFundingCompaniesJButton = new javax.swing.JButton();
        ncomparisonJButton = new javax.swing.JButton();
        leastFundedJButton = new javax.swing.JButton();
        resourcesProvidedJButton = new javax.swing.JButton();
        nresourceDistributionJButton = new javax.swing.JButton();
        jLabelNGO = new javax.swing.JLabel();
        jLabelBenfactor = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ntopBudgetEventsJButton.setText("Top Budget Events");
        ntopBudgetEventsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntopBudgetEventsJButtonActionPerformed(evt);
            }
        });
        add(ntopBudgetEventsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 190, -1, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 27)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Analytics");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(479, 18, -1, -1));

        ntopFundingCompaniesJButton.setText("Top 5 Funding Companies");
        ntopFundingCompaniesJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ntopFundingCompaniesJButtonActionPerformed(evt);
            }
        });
        add(ntopFundingCompaniesJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 302, -1, -1));

        ncomparisonJButton.setText("Comparison");
        ncomparisonJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ncomparisonJButtonActionPerformed(evt);
            }
        });
        add(ncomparisonJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 1288, -1, -1));

        leastFundedJButton.setText("Least Funded NGOs'");
        leastFundedJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                leastFundedJButtonActionPerformed(evt);
            }
        });
        add(leastFundedJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 136, -1, -1));

        resourcesProvidedJButton.setText("Resources given in the year");
        add(resourcesProvidedJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 1240, -1, -1));

        nresourceDistributionJButton.setText("Resources Distributed");
        add(nresourceDistributionJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(67, 1353, -1, -1));

        jLabelNGO.setForeground(new java.awt.Color(255, 255, 255));
        jLabelNGO.setText("NGO");
        add(jLabelNGO, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 80, -1, -1));

        jLabelBenfactor.setForeground(new java.awt.Color(255, 255, 255));
        jLabelBenfactor.setText("Benefactor");
        add(jLabelBenfactor, new org.netbeans.lib.awtextra.AbsoluteConstraints(584, 79, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/userinterface/bluedesign.PNG"))); // NOI18N
        jLabel6.setText("jLabel6");
        add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void ntopBudgetEventsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntopBudgetEventsJButtonActionPerformed
        // TODO add your handling code here:
         ArrayList<Resource> companyList=new ArrayList<Resource>();
       for(WorkRequest wr:enterprise.getWorkQueue().getWorkRequestList())
       {
           if(wr instanceof EventWorkRequest)
           {
               EventWorkRequest ewr = (EventWorkRequest) wr;
               Resource r = new Resource();
               r.setResourceName(ewr.getEventName());
//               System.out.println(" Event name>>>>>>>>>>R"+r.getResourceName());
//               System.out.println(" Event name>>>>>>>>>>"+ewr.getEventName());
               r.setQuantity(ewr.getBudget());
//               System.out.println(" Event name>>>>>>>>>>R"+r.getQuantity());
//               System.out.println(" Event name>>>>>>>>>>"+ewr.getBudget()+"\n\n\n\n");
               companyList.add(r);
           }
       }
       
       Collections.sort(companyList, (o1, o2) ->
               o2.getQuantity() - o1.getQuantity());
       for(Resource resource:companyList){
//               System.out.print(""+resource.getResourceName()+ " ");
//               System.out.println(""+resource.getQuantity());
               }
       DefaultCategoryDataset dataset=new DefaultCategoryDataset();
       for(Resource resource:companyList){
//               System.out.print(""+resource.getResourceName()+ " ");
//               System.out.println(""+resource.getQuantity());
        dataset.setValue(resource.getQuantity(), "Budget", resource.getResourceName());
               }
        
//        JFreeChart jChart=ChartFactory.createBarChart3D("Student Record", "Student Name", "Student Marks", dataset);
        JFreeChart jChart1=ChartFactory.createBarChart("Top budget Events", "EventName", "Budget", dataset,PlotOrientation.VERTICAL,true,true,false);
        CategoryPlot p= jChart1.getCategoryPlot();
        p.setRangeGridlinePaint(java.awt.Color.BLACK);
//           
            
        ChartFrame chartFarme= new ChartFrame("Student Record", jChart1,true);
        chartFarme.setVisible(true);
        chartFarme.setSize(500, 400);
        
            chartFarme.pack();
            chartFarme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            chartFarme.setVisible(true);
        
    }//GEN-LAST:event_ntopBudgetEventsJButtonActionPerformed

    private void ntopFundingCompaniesJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ntopFundingCompaniesJButtonActionPerformed
        // TODO add your handling code here:
        
        boolean flag=true;
       ArrayList<Resource> companyList=new ArrayList<Resource>();
       for(WorkRequest wr:enterprise.getWorkQueue().getWorkRequestList())
       {
           if(wr instanceof FundsWorkRequest)
               
           {
               FundsWorkRequest ewr = (FundsWorkRequest) wr;
               for(Resource res:ewr.getDonationList()){
                   if(res.getResourceName().equals("Food")){
                       if(!(companyList.isEmpty())){
                       for(Resource res1:companyList)
                       {
                           flag=true;
                           if(res1.getResourceName().equals(ewr.getBenefactorName()))
                           {
                               int a=res1.getQuantity();
                               int b=res.getQuantity();
                               int c=a+b;
                               res1.setQuantity(c);
                               flag=false;
                           }
                           
                           
                       }
                       }
                       if(flag){
               Resource r = new Resource();
               r.setResourceName(ewr.getBenefactorName());
               System.out.println(" Event name>>>>>>>>>>"+r.getResourceName());

               r.setQuantity(res.getQuantity());
               System.out.println(" Event name>>>>>>>>>>"+r.getQuantity());

               companyList.add(r);}
               }}
           }
       }
       
       Collections.sort(companyList, (o1, o2) ->
               o2.getQuantity() - o1.getQuantity());
       DefaultCategoryDataset dataset=new DefaultCategoryDataset();
       for(Resource resource:companyList){

        dataset.setValue(resource.getQuantity(), "Budget", resource.getResourceName());
               }
        
//        JFreeChart jChart=ChartFactory.createBarChart3D("Student Record", "Student Name", "Student Marks", dataset);
        JFreeChart jChart1=ChartFactory.createBarChart("Top budget Events", "EventName", "Budget", dataset,PlotOrientation.VERTICAL,true,true,false);
        CategoryPlot p= jChart1.getCategoryPlot();
        p.setRangeGridlinePaint(java.awt.Color.BLACK);
//           
            
        ChartFrame chartFarme= new ChartFrame("Events Record", jChart1,true);
        chartFarme.setVisible(true);
        chartFarme.setSize(500, 400);
        
            chartFarme.pack();
            chartFarme.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            chartFarme.setVisible(true);
        
    }//GEN-LAST:event_ntopFundingCompaniesJButtonActionPerformed

    private void ncomparisonJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ncomparisonJButtonActionPerformed
        // TODO add your handling code here:
        CompanyFundComparison cfc = new CompanyFundComparison(userProcessContainer,business,enterprise);
        userProcessContainer.add("CompanyFundComparison", cfc);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_ncomparisonJButtonActionPerformed

    private void leastFundedJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_leastFundedJButtonActionPerformed
        // TODO add your handling code here:
        Network tempNetwork=null;
       loop:        for(Network n: business.getNetworkList())
       {
           for(Enterprise e:n.getEnterpriseDirectory().getEnterpriseList())
           {
               if(enterprise.getName().equals(e.getName()))
               {
                   tempNetwork=n;
                   break loop;
                   
               }
           }
       }
       
       ArrayList <Resource> ngoFunds = new ArrayList <Resource>();
        int count=0,amount=0;
           for(Enterprise e:tempNetwork.getEnterpriseDirectory().getEnterpriseList())
           {
               count=0;
               if(e instanceof OperatingCompanyEnterprise)
               {
                   Resource res1 = new Resource();
                   res1.setResourceName(e.getName());
                   res1.setQuantity(0);
                   for(WorkRequest wr:e.getWorkQueue().getWorkRequestList())
                   {
                       if(wr instanceof FundsWorkRequest)
                       {
                           FundsWorkRequest fwr = (FundsWorkRequest) wr;
                           amount=0;
                           for(Resource res:fwr.getDonationList())
                           {
                               if(res.getResourceName().equals("Money"))
                               {
                                   amount=res.getQuantity()+res1.getQuantity();
                                   res1.setQuantity(amount);
                                   
                                   
                                   
                               }
                           }
                           
                       }
                   }
                   ngoFunds.add(res1);
                   
                   
               }
           
       }
           
           Collections.sort(ngoFunds, (o1, o2) ->
              o1.getQuantity() - o2.getQuantity());
           DefaultCategoryDataset dataset=new DefaultCategoryDataset();
      for(Resource resource:ngoFunds){
       ///chart code here
       
        dataset.setValue(70, "Funds", resource.getResourceName());
        
      }
        JFreeChart jChart=ChartFactory.createBarChart3D("Funds Record", "Resource Name", "Funds", dataset);
//        JFreeChart jChart1=ChartFactory.createBarChart("Student Record", "Student Name", "Student Marks", dataset,PlotOrientation.VERTICAL,true,true,false);
        CategoryPlot p= jChart.getCategoryPlot();
        p.setRangeGridlinePaint(java.awt.Color.BLACK);
//            
        ChartFrame chartFarme= new ChartFrame("Funds Record", jChart,true);
        chartFarme.setVisible(true);
        chartFarme.setSize(500, 400);
       
      
    }//GEN-LAST:event_leastFundedJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabelBenfactor;
    private javax.swing.JLabel jLabelNGO;
    private javax.swing.JButton leastFundedJButton;
    private javax.swing.JButton ncomparisonJButton;
    private javax.swing.JButton nresourceDistributionJButton;
    private javax.swing.JButton ntopBudgetEventsJButton;
    private javax.swing.JButton ntopFundingCompaniesJButton;
    private javax.swing.JButton resourcesProvidedJButton;
    // End of variables declaration//GEN-END:variables
}
