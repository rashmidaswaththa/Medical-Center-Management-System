/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagmentsystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.print.PrinterException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Anji
 */
public class LabReport extends javax.swing.JFrame {
    
    Connection con1;
    PreparedStatement insert;

    /**
     * Creates new form LabReport
     */
    public LabReport() {
        initComponents();
        //setimg();
        jPanel2.setBackground(new Color(214,234,245));
    }
//    
//     public void setimg(){
//        ImageIcon imageicon = new ImageIcon("C:\\Users\\singer\\Downloads\\user_roles\\user_roles\\icon14.png");
//        Image img = imageicon.getImage();
//        Image imgScale = img.getScaledInstance(backg.getWidth(),backg.getHeight(),Image.SCALE_FAST);
//        ImageIcon scaledIcon = new ImageIcon(imgScale);
//        backg.setIcon(scaledIcon);
//        
//    };

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel() {
            public void paintComponent(Graphics g){

                ImageIcon im = new ImageIcon("C:\\Users\\Chathunika Heenkenda\\Desktop\\ITP Project\\Main Project\\interfaces\\HospitalManagmentSystem\\src\\images\\backg1.jpg");
                Image i =im.getImage();

                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);

            }

        };
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        categoryDropdown = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jMonthChooser1 = new com.toedter.calendar.JMonthChooser();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        area = new javax.swing.JTextArea();
        viewBtn = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(214, 234, 245));

        jPanel2.setBackground(new java.awt.Color(214, 234, 245));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Total Lab Bookings");

        jButton1.setBackground(new java.awt.Color(53, 92, 125));
        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Search");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Select Month:");

        jButton2.setBackground(new java.awt.Color(53, 92, 125));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Print");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        categoryDropdown.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        categoryDropdown.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Test", "Scan" }));
        categoryDropdown.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryDropdownActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Lab Test Name", "Charge", "Issuing Time", "Total Count of Lab Bookings"
            }
        ));
        jTable1.setRowHeight(22);
        jScrollPane1.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Select Category:");

        area.setColumns(20);
        area.setRows(5);
        jScrollPane2.setViewportView(area);

        viewBtn.setBackground(new java.awt.Color(53, 92, 125));
        viewBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        viewBtn.setForeground(new java.awt.Color(255, 255, 255));
        viewBtn.setText("View");
        viewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewBtnActionPerformed(evt);
            }
        });

        jButton3.setBackground(new java.awt.Color(53, 92, 125));
        jButton3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton3.setForeground(new java.awt.Color(255, 255, 255));
        jButton3.setText("Back");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(53, 92, 125));
        jButton4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("Logout");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(458, 458, 458)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 644, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(categoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jButton1)))
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(33, 33, 33)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 402, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(72, 72, 72)))
                        .addGap(60, 60, 60))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel4)
                                .addComponent(categoryDropdown, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3))
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jMonthChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(20, 20, 20)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        int labdate = jMonthChooser1.getMonth() + 1;
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con1=DriverManager.getConnection("jdbc:mysql://localhost:3308/channelingcenter","root","");
            insert=con1.prepareStatement("SELECT count(lb.testId) as 'total' ,l.testName,l.charge,l.issuingTime FROM labtest l,labbook lb where lb.testId = l.testId AND l.category = ? and month(lb.lDate) = ? Group by l.testName, l.charge, l.issuingTime");
            insert.setString(1, categoryDropdown.getSelectedItem().toString());
            insert.setInt(2,labdate);
            
            
            //selectAddresult.setString(1, Specialty.getSelectedItem().toString());
            ResultSet rs=insert.executeQuery();
            ResultSetMetaData res =rs.getMetaData();
             
            int c= res.getColumnCount();
             
            DefaultTableModel df = (DefaultTableModel) jTable1.getModel();
            df.setRowCount(0);
             
            while(rs.next()){
                Vector v2 = new Vector ();
                for (int a=1;a<=c;a++){
                    //v2.add(rs.getString("labtest.testId"));
                    v2.add(rs.getString("l.testName"));
                    v2.add(rs.getString("l.charge"));
                    v2.add(rs.getString("l.issuingTime"));
                    v2.add(rs.getString("total"));
                
                }
                df.addRow(v2);
                 
            }
             
        } catch (SQLException ex) {
            Logger.getLogger(LabReport.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LabReport.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        //try {
                    int check = jTable1.getRowCount();

        if(check == 0)
        JOptionPane.showMessageDialog(this, "No results available!");

        else{
            int dialogresult = JOptionPane.showConfirmDialog(null, "This will print summary of Lab Bookings", "Info", JOptionPane.YES_NO_OPTION);
            if(dialogresult == JOptionPane.YES_OPTION){

                try {

                    jTable1.print(JTable.PrintMode.FIT_WIDTH);
                } catch (PrinterException ex) {

                    Logger.getLogger(LabReport.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
//            area.print();
//        } catch (PrinterException ex) {
//            Logger.getLogger(LabReport.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        labAssistantMain report = new labAssistantMain();
        report.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        //When logout from page,it redirects to the login page
        int response=JOptionPane.showConfirmDialog(this,"Do you really want to logout?","confirm",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(response==JOptionPane.YES_OPTION){
            MainLoginUI lab = new MainLoginUI();
            lab.setVisible(true);
            this.dispose();
        }
        else {

        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void categoryDropdownActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryDropdownActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_categoryDropdownActionPerformed

    private void viewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewBtnActionPerformed
        // TODO add your handling code here:
        int appdate = jMonthChooser1.getMonth() + 1;
        String mymonth;
        SimpleDateFormat sdf1 = new SimpleDateFormat("MM");

        mymonth = sdf1.format(appdate);
        System.out.println(mymonth);

//        System.out.println("Error2");
        area.setText(area.getText()+"\t"+" "+"UNION CHANNELING CENTER\n\n");area.setText(area.getText()+"-------------Total Lab Bookings Summary Report-------------\n");
//        area.setText(area.getText()+"Doctor Specialization\t\t: "+txtDoctorSpecility.getSelectedItem().toString()+"\n");
//        System.out.println("Error1");
        area.setText(area.getText()+"Month\t\t\t: "+mymonth+"\n");
//        System.out.println("Error3");
//        area.setText(area.getText()+"Total Appointments\t\t: "+totAppT.getText()+"\n");area.setText(area.getText()+"----------------------------------------------------------------------------\n\n");area.setText(area.getText()+"Doctor Name"+"\t\t\t"+"No Of Appointments"+"\n");
        area.setText(area.getText()+"----------------------------------------------------------------------------\n\n");
        for (int count = 0; count < jTable1.getRowCount(); count++){
            area.setText(area.getText()+jTable1.getValueAt(count, 0).toString()+"\t\t");
            area.setText(area.getText()+jTable1.getValueAt(count, 1).toString()+"\t\t");
            area.setText(area.getText()+jTable1.getValueAt(count, 2).toString()+"\t\t");
            area.setText(area.getText()+jTable1.getValueAt(count, 3).toString()+"\n");
        }

    }//GEN-LAST:event_viewBtnActionPerformed

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
            java.util.logging.Logger.getLogger(LabReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LabReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LabReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LabReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LabReport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea area;
    private javax.swing.JComboBox<String> categoryDropdown;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private com.toedter.calendar.JMonthChooser jMonthChooser1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JButton viewBtn;
    // End of variables declaration//GEN-END:variables
}
