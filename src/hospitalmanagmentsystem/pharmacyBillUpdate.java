/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagmentsystem;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author singer
 */
public class pharmacyBillUpdate extends javax.swing.JFrame {

    Boolean result;
    Connection con1;
    PreparedStatement insert;
    /**
     * Creates new form pharmacyBillUpdate
     */
    public pharmacyBillUpdate() {
        initComponents();
        table_update();
//        setimg();
//        jPanel1.setBackground(new Color(255,255,255,120));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    
//     public void setimg(){
//        ImageIcon imageicon = new ImageIcon("C:\\Users\\singer\\Downloads\\user_roles\\user_roles\\icon14.png");
//        Image img = imageicon.getImage();
//        Image imgScale = img.getScaledInstance(backg.getWidth(),backg.getHeight(),Image.SCALE_FAST);
//        ImageIcon scaledIcon = new ImageIcon(imgScale);
//        backg.setIcon(scaledIcon);
//        
//    };
    
       public void table_update(){
    
         try{
            int c;
            Class.forName("com.mysql.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/channelingcenter","root","");
            
            insert = con1.prepareStatement("select PharmacyBillId from pharmacybill group by PharmacyBillId order by PharmacyBillId desc limit 1");

            ResultSet rs = insert.executeQuery();

            while(rs.next()){

                bno.setText(rs.getString("PharmacyBillId"));
            }
            
            String billNo = bno.getText();
            
            insert = con1.prepareStatement("select drug.drugName , billdrug.itemQty, stock.unitPrice from billdrug,drug, stock where billdrug.PharmacyBillID = ? AND drug.drugID = billdrug.drugId and stock.drugID = billdrug.drugId order by billdrug.drugId");            
            insert.setString(1,billNo);
            
            ResultSet rs1 = insert.executeQuery();
            ResultSetMetaData res = rs1.getMetaData();
            c = res.getColumnCount();
            DefaultTableModel df = (DefaultTableModel) drugupdate.getModel();
            int selectedIndex = drugupdate.getSelectedRow();
            df.setRowCount(0);
            
            //double ttprice = 0;
            //double price = 0; 
            //int quty = 0;
            
            
            
            //price = Double.parseDouble(billNo);
            
            while(rs1.next())
            {
                Vector v2=new Vector();
                for(int a=1;a<=c;a++)
                {
                    v2.add(rs1.getString("drug.drugName"));
                    v2.add(rs1.getString("billdrug.itemQty"));
                    v2.add(rs1.getString("stock.unitPrice"));
                    //v2.add(rs1.getString("DoctorName"));
                }
                df.addRow(v2);    
                
                //price = Double.parseDouble(rs1.getString("Price"));
                //quty = Integer.parseInt(rs1.getString("Quantity"));
                //ttprice = ttprice + (quty * price);
                
            }
            
            //double total = price * quty;
           //String num="";
           //num+=ttprice;
           //totprice.setText(num);
            
        }
        catch (ClassNotFoundException ex) {
            Logger.getLogger(billDrugInsert.class.getName()).log(Level.SEVERE, null, ex);
        } 
        catch (SQLException ex) {
            Logger.getLogger(billDrugInsert.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel(){
            public void paintComponent(Graphics g){

                ImageIcon im = new ImageIcon("C:\\Users\\Chathunika Heenkenda\\Desktop\\ITP Project\\Main Project\\interfaces\\HospitalManagmentSystem\\src\\images\\backg1.jpg");
                Image i =im.getImage();

                g.drawImage(i,0,0,this.getSize().width,this.getSize().height,this);

            }};
            jPanel2 = new javax.swing.JPanel();
            jLabel4 = new javax.swing.JLabel();
            jLabel5 = new javax.swing.JLabel();
            jLabel6 = new javax.swing.JLabel();
            qty = new javax.swing.JTextField();
            jButton1 = new javax.swing.JButton();
            jButton2 = new javax.swing.JButton();
            jScrollPane1 = new javax.swing.JScrollPane();
            drugupdate = new javax.swing.JTable();
            jLabel1 = new javax.swing.JLabel();
            bno = new javax.swing.JLabel();
            drug = new javax.swing.JLabel();
            price = new javax.swing.JLabel();

            setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

            jPanel2.setBackground(new java.awt.Color(214, 234, 245));
            jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Drug Update"));

            jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel4.setText("Drug");

            jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel5.setText("Quantity");

            jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel6.setText("Price");

            qty.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

            jButton1.setBackground(new java.awt.Color(53, 92, 125));
            jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jButton1.setForeground(new java.awt.Color(255, 255, 255));
            jButton1.setText("Update");
            jButton1.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton1ActionPerformed(evt);
                }
            });

            jButton2.setBackground(new java.awt.Color(53, 92, 125));
            jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
            jButton2.setForeground(new java.awt.Color(255, 255, 255));
            jButton2.setText("Cancel");
            jButton2.addActionListener(new java.awt.event.ActionListener() {
                public void actionPerformed(java.awt.event.ActionEvent evt) {
                    jButton2ActionPerformed(evt);
                }
            });

            drugupdate.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                    "Drug", "Quantity", "price"
                }
            ));
            drugupdate.addMouseListener(new java.awt.event.MouseAdapter() {
                public void mouseClicked(java.awt.event.MouseEvent evt) {
                    drugupdateMouseClicked(evt);
                }
            });
            jScrollPane1.setViewportView(drugupdate);

            jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            jLabel1.setText("Bill Number");

            bno.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

            drug.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            drug.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            price.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
            price.setBorder(javax.swing.BorderFactory.createEtchedBorder());

            javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
            jPanel2.setLayout(jPanel2Layout);
            jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addGap(30, 30, 30)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGap(43, 43, 43)
                                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 162, Short.MAX_VALUE)
                                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(12, 12, 12))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE))
                                    .addGap(64, 64, 64)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(bno, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(qty)
                                        .addComponent(drug, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(price, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGap(54, 54, 54)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 541, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(40, 40, 40))))
            );
            jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel2Layout.createSequentialGroup()
                    .addContainerGap()
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(bno, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addGap(72, 72, 72)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(drug, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(price, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(64, 64, 64)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(qty, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(102, 102, 102)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(23, 23, 23))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jScrollPane1)
                            .addContainerGap())))
            );

            javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
            jPanel1.setLayout(jPanel1Layout);
            jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );
            jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            );

            javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
            getContentPane().setLayout(layout);
            layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(34, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(30, 30, 30))
            );
            layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(46, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(63, 63, 63))
            );

            pack();
        }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DefaultTableModel df = (DefaultTableModel) drugupdate.getModel();
        int selectedIndex = drugupdate.getSelectedRow();

        String Drug = drug.getText();
        String Quantity = qty.getText();
        String Price = price.getText();
        //String dname = docname.getText();
        String did = null;
        if(drug.equals("") || Price.equals(""))
        {
            JOptionPane.showMessageDialog(this, "Please fill the form!");
        }

        else{
            String PATTERN = "^[a-zA-Z]{0,30}$";
            Pattern patt = Pattern.compile(PATTERN);
            Matcher match;
            match = patt.matcher(drug.getText());
            if(!match.matches()){
                JOptionPane.showMessageDialog(this,"Please enter letters!");
            }
            else{
                String PATTERN1 = "^[0-9]{0,9}$";
                Pattern patt1 = Pattern.compile(PATTERN1);
                Matcher match1;
                match1 = patt1.matcher(price.getText());

                if(!match1.matches()){
                    JOptionPane.showMessageDialog(this,"Please enter numbers!");
                }

                else{
                    try {

                        Class.forName("com.mysql.jdbc.Driver");

                        con1 = DriverManager.getConnection("jdbc:mysql://localhost:3308/channelingcenter","root","");

                        insert = con1.prepareStatement("select drugID from drug where drugName = ? ");
                        insert.setString(1,Drug);

                        ResultSet rs = insert.executeQuery();

                        while(rs.next()){
                            did = rs.getString("drugId");
                        }

                        insert = con1.prepareStatement("update billdrug set itemQty = ? where drugId = ?");

                        insert.setString(1, Quantity);
                        //insert.setString(2, dname);
                        insert.setString(2, did);

                        insert.executeUpdate();

                        JOptionPane.showMessageDialog(this, "Record Updated");
                        //table_update();

                        drug.setText("");
                        qty.setText("");
                        price.setText("");
                        //docname.setText("");
                        drug.requestFocus();

                        //table_update();

                    }
                    catch (SQLException ex) {

                       Logger.getLogger(pharmacyBillUpdate.class.getName()).log(Level.SEVERE, null, ex);

                    }
                    catch (ClassNotFoundException ex) {
                       Logger.getLogger(pharmacyBillUpdate.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    pharmacyBill nd = new pharmacyBill();
                    nd.setVisible(true);
                    this.dispose();// TODO add your handling code here:
                }
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        pharmacyBill nd = new pharmacyBill();
        nd.setVisible(true);
        JOptionPane.showMessageDialog(this, "Record Update Canceled!");// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void drugupdateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_drugupdateMouseClicked
        // TODO add your handling code here:
        DefaultTableModel df = (DefaultTableModel) drugupdate.getModel();
        int selectedIndex = drugupdate.getSelectedRow();

        drug.setText(df.getValueAt(selectedIndex, 0).toString());
        qty.setText(df.getValueAt(selectedIndex, 1).toString());
        price.setText(df.getValueAt(selectedIndex, 2).toString());
        //docname.setText(df.getValueAt(selectedIndex, 3).toString());
    }//GEN-LAST:event_drugupdateMouseClicked

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
            java.util.logging.Logger.getLogger(pharmacyBillUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pharmacyBillUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pharmacyBillUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pharmacyBillUpdate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pharmacyBillUpdate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel bno;
    private javax.swing.JLabel drug;
    private javax.swing.JTable drugupdate;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel price;
    private javax.swing.JTextField qty;
    // End of variables declaration//GEN-END:variables
}