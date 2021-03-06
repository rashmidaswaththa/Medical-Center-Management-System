/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hospitalmanagmentsystem;

import java.awt.Graphics;
import java.awt.HeadlessException;
import java.awt.Image;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.*;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import java.util.Vector;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author acer
 */
public class patientRegister extends javax.swing.JFrame {

    String pGender;
    final String password = "";
    final String userName = "root";
    final String URL = "jdbc:mysql://localhost:3308/channelingcenter";
    Connection con;
    PreparedStatement insert;

    /**
     * Creates new form MPatientRegister
     */
    public patientRegister() {
        initComponents();
        setImg();
//        try {
//               //set connection
//               Class.forName("com.mysql.jdbc.Driver");
//               con = (Connection) DriverManager.getConnection(URL, userName, password);
//          
//        } catch (HeadlessException | ClassNotFoundException | SQLException ex) {
//            JOptionPane.showMessageDialog(this,"Patient already registered!");
//           
//        }
    }

    //set icon 
    public void setImg() {
        ImageIcon imageicon = new ImageIcon("C:\\\\Users\\\\Rashmi\\\\Desktop\\\\SLIIT\\\\~2-2~\\\\ITP\\\\ui\\\\projectImages\\\\back.png");
        Image img = imageicon.getImage();
        Image imgScale = img.getScaledInstance(backg.getWidth(), backg.getHeight(), Image.SCALE_FAST);

        ImageIcon scaledIcon = new ImageIcon(imgScale);
        backg.setIcon(scaledIcon);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        age = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        mobileno = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        email = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        addBtn = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        address = new javax.swing.JTextArea();
        demoBtn = new javax.swing.JButton();
        backBtn = new javax.swing.JButton();
        logoutBtn = new javax.swing.JButton();
        backg = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(214, 234, 245));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Add Patient");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Full Name");

        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        name.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                nameKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Age");

        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });
        age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ageActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Contact No");

        mobileno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mobilenoActionPerformed(evt);
            }
        });
        mobileno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobilenoKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Address");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setText("Email");

        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });
        email.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailKeyReleased(evt);
            }
        });
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setText("Gender");

        jRadioButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton1.setText("Female");
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jRadioButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jRadioButton2.setText("Male");
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        addBtn.setBackground(new java.awt.Color(53, 92, 125));
        addBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        addBtn.setForeground(new java.awt.Color(255, 255, 255));
        addBtn.setText("Add");
        addBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addBtnActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(88, 131, 176));
        jButton2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel8.setForeground(new java.awt.Color(204, 0, 0));

        address.setColumns(20);
        address.setRows(5);
        jScrollPane1.setViewportView(address);

        demoBtn.setBackground(new java.awt.Color(53, 92, 125));
        demoBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        demoBtn.setForeground(new java.awt.Color(255, 255, 255));
        demoBtn.setText("Demo");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        demoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                demoBtnActionPerformed(evt);
            }
        });

        backBtn.setBackground(new java.awt.Color(53, 92, 125));
        backBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        backBtn.setForeground(new java.awt.Color(255, 255, 255));
        backBtn.setText("Back");
        backBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backBtnActionPerformed(evt);
            }
        });

        logoutBtn.setBackground(new java.awt.Color(53, 92, 125));
        logoutBtn.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        logoutBtn.setForeground(new java.awt.Color(255, 255, 255));
        logoutBtn.setText("Logout");
        logoutBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(55, 55, 55)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(164, 164, 164)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(email, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(32, 32, 32)
                                        .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(demoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(55, 55, 55))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(140, 140, 140)))
                        .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(171, 171, 171)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(143, 143, 143)
                        .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(logoutBtn)
                        .addGap(39, 39, 39))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(170, 170, 170))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(24, 24, 24)
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(logoutBtn)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel3)
                                .addComponent(age, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel6)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(mobileno, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jRadioButton2)
                                .addComponent(jRadioButton1)
                                .addComponent(jLabel7)))
                        .addGap(74, 74, 74)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(addBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(demoBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(303, 303, 303))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(backBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(269, 269, 269))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 1034, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(31, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backg, javax.swing.GroupLayout.DEFAULT_SIZE, 1105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 424, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(backg, javax.swing.GroupLayout.DEFAULT_SIZE, 519, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void nameKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        //name should be enter letters.
        String PATTERN = "^[a-zA-Z0-9\\-#\\.\\(\\)\\/%&\\s]{0,19}";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match;
        match = patt.matcher(name.getText());
        if (!match.matches()) {
            //jLabel8.setText("Please enter letters!");
        } else {
            jLabel8.setText(null);
        }
    }



    private void mobilenoActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void mobilenoKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        //phone should be numeriacal and should be 10 digits
        String PATTERN = "^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]{0,5}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match;
        match = patt.matcher(mobileno.getText());
        if (!match.matches()) {
            jLabel8.setText("Please enter a valid Contact No!");
        } else {
            jLabel8.setText(null);
        }
    }

    private void addressActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
    }

    private void ageKeyReleased(java.awt.event.KeyEvent evt) {
        //validate the age
        String PATTERN = "^[0-9]{0,3}$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match;
        match = patt.matcher(age.getText());
        if (!match.matches()) {
            jLabel8.setText("Please enter only numbers for age!");
        } else {
            jLabel8.setText(null);
        }

    }

    private void emailKeyReleased(java.awt.event.KeyEvent evt) {
        // TODO add your handling code here:
        //email should be format
        String PATTERN = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
        Pattern patt = Pattern.compile(PATTERN);
        Matcher match;
        match = patt.matcher(email.getText());
        if (!match.matches()) {
            jLabel8.setText("Please enter a valid email!");
        } else {
            jLabel8.setText(null);
        }
    }
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
        // TODO add your handling code here:
        pGender = "Female";
        //validate radio buttons
        if (jRadioButton1.isSelected()) {
            jRadioButton2.setSelected(false);

        }
    }//GEN-LAST:event_jRadioButton1ActionPerformed

    private void backBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backBtnActionPerformed
        // TODO add your handling code here:
        //when click on back button it should be receptionistUI
        receptionistMainUI recept = new receptionistMainUI();
        recept.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backBtnActionPerformed

    private void addBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addBtnActionPerformed
        // TODO add your handling code here:
        String pName = name.getText();
        String pAge = age.getText();
        String pMobileno = mobileno.getText();
        String pAddress = address.getText();
        String pEmail = email.getText();

        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3308/channelingcenter", "root", "");

            if (pName.equals("") || pAge.equals("") || pMobileno.equals("") || pEmail.equals("")) {
                JOptionPane.showMessageDialog(this, "Please enter Lab test details!");
            } else {
                String PATTERN = "^[a-zA-Z0-9\\-#\\.\\(\\)\\/%&\\s]{0,19}";
                Pattern patt = Pattern.compile(PATTERN);
                Matcher match;
                match = patt.matcher(name.getText());
                if (!match.matches()) {
                    JOptionPane.showMessageDialog(this, "Please enter letters for Patient Name!");
                } else {
                    String PATTERN2 = "^[0-9]{0,9}$";
                    Pattern patt2 = Pattern.compile(PATTERN2);
                    Matcher match2;
                    match2 = patt2.matcher(age.getText());
                    if (!match2.matches()) {
                        JOptionPane.showMessageDialog(this, "Please enter numbers for age!");
                    } else {
                        String PATTERN1 = "^[0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9][0-9]{0,5}$";
                        Pattern patt1 = Pattern.compile(PATTERN1);
                        Matcher match1;
                        match1 = patt1.matcher(mobileno.getText());

                        if (!match1.matches()) {
                            JOptionPane.showMessageDialog(this, "Please enter a valid Contact No!");
                        } else {
                            String PATTERN3 = "^[a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9-]+(?:\\.[a-zA-Z0-9-]+)*$";
                            Pattern patt3 = Pattern.compile(PATTERN3);
                            Matcher match3;
                            match3 = patt3.matcher(email.getText());

                            if (!match3.matches()) {
                                JOptionPane.showMessageDialog(this, "Please enter a valid E-mail!");
                            } 
                            if(jRadioButton2.isSelected()==false && jRadioButton1.isSelected()== false){
                                JOptionPane.showMessageDialog(this, "Please select the gender!");
                            }else {
                                insert = con.prepareStatement("Select 1 from patient where contactNo = ?");
                                insert.setString(1, mobileno.getText());

                                ResultSet r = insert.executeQuery();

                                int a = 0;

                                while (r.next()) {
                                    a = r.getInt("1");
                                }
                                if (a == 1) {
                                    JOptionPane.showMessageDialog(this, "Patient details already exist");
                                } else {
                                    insert = con.prepareStatement("insert into patient(fullName,address,age,email,contactNo,gender)values(?,?,?,?,?,?)");

                                    insert.setString(1, pName);
                                    insert.setString(2, pAddress);
                                    insert.setString(3, pAge);
                                    insert.setString(4, pEmail);
                                    insert.setString(5, pMobileno);
                                    insert.setString(6, pGender);
                                    insert.executeUpdate();

                                    JOptionPane.showMessageDialog(this, "Patient added successfully");
                                    //table_update();
                                }
                            }
                        }
                    }
                }
            }

        } catch (ClassNotFoundException ex) {
            //JOptionPane.showMessageDialog(this, "Cannot add patient details");
            Logger.getLogger(patientRegister.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(patientRegister.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_addBtnActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        //when click on clear button every fields should be null
        name.setText(null);
        email.setText(null);
        mobileno.setText(null);
        age.setText(null);
        address.setText(null);
        jRadioButton1.setSelected(false);
        jRadioButton2.setSelected(false);

    }//GEN-LAST:event_jButton2ActionPerformed

    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ageActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
        // TODO add your handling code here:
         pGender = "Male";
        //validate radio buttons
        if (jRadioButton2.isSelected()) {
            jRadioButton1.setSelected(false);
        }
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void demoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_demoBtnActionPerformed
        // TODO add your handling code here:
        name.setText("Saman Silva");
        email.setText("samans@gmail.com");
        mobileno.setText("0751231231");
        age.setText("70");
        address.setText("No.12, Nelum Mawatha, Badulla");
//        jRadioButton1.setSelected(true);
//        jRadioButton2.setSelected(false);
    }//GEN-LAST:event_demoBtnActionPerformed

    private void logoutBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutBtnActionPerformed
        // TODO add your handling code here:
        int response = JOptionPane.showConfirmDialog(this, "Do you really want to logout?", "confirm", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (response == JOptionPane.YES_OPTION) {
            //MAdminLogin admin = new MAdminLogin();
            //admin.setVisible(true);
        } else {

        }
    }//GEN-LAST:event_logoutBtnActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbge
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new patientRegister().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addBtn;
    private javax.swing.JTextArea address;
    private javax.swing.JTextField age;
    private javax.swing.JButton backBtn;
    private javax.swing.JLabel backg;
    private javax.swing.JButton demoBtn;
    private javax.swing.JTextField email;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton logoutBtn;
    private javax.swing.JTextField mobileno;
    private javax.swing.JTextField name;
    // End of variables declaration//GEN-END:variables
}
