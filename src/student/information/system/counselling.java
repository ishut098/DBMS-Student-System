
package student.information.system;

import java.awt.Dimension;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

public class counselling extends javax.swing.JFrame {

    Connection conn=null;
    ResultSet rs=null;
    PreparedStatement pst=null;
    studinfo st = new studinfo();
   public int count3=0;
    
    
    public counselling() {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms?zeroDateTimeBehavior=convertToNull","root","708381");
           
        }catch(Exception ex){
            System.out.println("Error: "+ex);
        }
        initComponents();
       
        
        Toolkit toolkit = getToolkit();
        Dimension size = toolkit.getScreenSize();
        setLocation(size.width/2 - getWidth()/2, 
        size.height/2 - getHeight()/2); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        usn1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        gpa1 = new javax.swing.JTextField();
        counselor1 = new javax.swing.JTextField();
        problem1 = new javax.swing.JTextField();
        remarks1 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        gpa2 = new javax.swing.JTextField();
        counselor2 = new javax.swing.JTextField();
        problem2 = new javax.swing.JTextField();
        remarks2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        gpa3 = new javax.swing.JTextField();
        counselor3 = new javax.swing.JTextField();
        problem3 = new javax.swing.JTextField();
        remarks3 = new javax.swing.JTextField();
        insert1 = new javax.swing.JButton();
        insert2 = new javax.swing.JButton();
        insert3 = new javax.swing.JButton();
        insert4 = new javax.swing.JButton();
        gpa4 = new javax.swing.JTextField();
        counselor4 = new javax.swing.JTextField();
        problem4 = new javax.swing.JTextField();
        remarks4 = new javax.swing.JTextField();
        update1 = new javax.swing.JButton();
        update2 = new javax.swing.JButton();
        update3 = new javax.swing.JButton();
        update4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Counselling Record");

        jLabel1.setText("1st Year");

        jLabel2.setText("2nd Year");

        jLabel3.setText("3rd Year");

        jLabel4.setText("4th Year");

        usn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usn1ActionPerformed(evt);
            }
        });

        jLabel5.setText("USN:");

        jLabel6.setText("GPA:");

        jLabel7.setText("Counselor:");

        jLabel8.setText("Problems:");

        jLabel9.setText("Remarks:");

        counselor1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                counselor1ActionPerformed(evt);
            }
        });

        jLabel10.setText("GPA:");

        jLabel11.setText("Counselor:");

        jLabel12.setText("Problems:");

        jLabel13.setText("Remarks:");

        remarks2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                remarks2ActionPerformed(evt);
            }
        });

        jLabel14.setText("GPA:");

        jLabel15.setText("Counselor:");

        jLabel16.setText("Problems:");

        jLabel17.setText("Remarks:");

        jLabel18.setText("GPA:");

        jLabel19.setText("Counselor:");

        jLabel20.setText("Problems:");

        jLabel21.setText("Remarks:");

        insert1.setText("Insert Details");
        insert1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert1ActionPerformed(evt);
            }
        });

        insert2.setText("Insert Details");
        insert2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert2ActionPerformed(evt);
            }
        });

        insert3.setText("Insert Details");
        insert3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert3ActionPerformed(evt);
            }
        });

        insert4.setText("Insert Details");
        insert4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insert4ActionPerformed(evt);
            }
        });

        update1.setText("Update");
        update1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update1ActionPerformed(evt);
            }
        });

        update2.setText("Update");
        update2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update2ActionPerformed(evt);
            }
        });

        update3.setText("Update");
        update3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update3ActionPerformed(evt);
            }
        });

        update4.setText("Update");
        update4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                update4ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/student/information/system/images/Save-icon.png"))); // NOI18N
        jButton1.setText("Back to info");
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usn1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(45, 45, 45)))
                        .addGap(122, 122, 122)
                        .addComponent(jLabel2)
                        .addGap(116, 116, 116))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(111, 111, 111))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel16))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gpa3, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(counselor3, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(problem3, javax.swing.GroupLayout.DEFAULT_SIZE, 237, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(gpa1, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(counselor1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                            .addComponent(insert1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 70, Short.MAX_VALUE)
                                            .addComponent(update1))
                                        .addComponent(problem1)
                                        .addComponent(remarks1)))))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel17)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remarks3)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(insert3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(update3)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel19)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(counselor4, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel20)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(problem4))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel12)
                            .addGap(18, 18, 18)
                            .addComponent(problem2))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel10))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(gpa2, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(counselor2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel13)
                                .addComponent(jLabel18))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(remarks2, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(gpa4, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(insert2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(update2)))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel21)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(remarks4, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(insert4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButton1)
                                    .addComponent(update4))))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(usn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel1))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(gpa1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(gpa2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(counselor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(counselor2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(problem1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12)
                    .addComponent(problem2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(remarks1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(remarks2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert1)
                    .addComponent(insert2)
                    .addComponent(update1)
                    .addComponent(update2))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(jLabel18)
                    .addComponent(gpa3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gpa4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jLabel19)
                    .addComponent(counselor3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(counselor4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jLabel20)
                    .addComponent(problem3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(problem4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(jLabel21)
                    .addComponent(remarks3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(remarks4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insert3)
                    .addComponent(insert4)
                    .addComponent(update3)
                    .addComponent(update4))
                .addGap(18, 18, 18)
                .addComponent(jButton1)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void counselor1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_counselor1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_counselor1ActionPerformed

    private void remarks2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_remarks2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_remarks2ActionPerformed

    private void insert1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert1ActionPerformed
        // TODO add your handling code here:
            try{
                 String value1=usn1.getText();
                    
               /* String msql="select usn from student";
                    pst=conn.prepareStatement(msql);
                    pst.execute(msql);
                */
                if(value1.equals("")){
                    String m="USN can't be empty";
                    JOptionPane.showMessageDialog(null, m);
                    
                    
                }
               
                else {
                    
                    
                    String value2 = gpa1.getText();
                    String value3 = counselor1.getText();
                    String value4 = problem1.getText();
                    String value5 = remarks1.getText();
                    String sql = "insert into firstyr values ('"+value1+"','"+value2+"','"+value3+"','"+value4+"','"+value5+"')";
                    
                    pst=conn.prepareStatement(sql);
                    pst.execute(sql);
                    String my="Record ADDED!";
                    JOptionPane.showMessageDialog(null, my);
                    count3++;
                    value1=value2=value3=value4=value5="";
                }
                /*else{
                    String sp="Student info not present";
                    JOptionPane.showMessageDialog(null, sp);
                }*/
            }
                 
            catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
            }
            
    }//GEN-LAST:event_insert1ActionPerformed

    private void insert2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert2ActionPerformed
        // TODO add your handling code here:
        try{
                
                 String value1 = usn1.getText();
                 if(usn1.getText().equals("")){
                    String m="USN can't be empty";
                    JOptionPane.showMessageDialog(null, m);
                    
                    
                }
                else{
                String value2 = gpa2.getText();
                String value3 = counselor2.getText();
                String value4 = problem2.getText();
                String value5 = remarks2.getText();
           String sql = "insert into secondyr values ('"+value1+"','"+value2+"','"+value3+"','"+value4+"','"+value5+"')";
           
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
                String my="Record ADDED!";
                     JOptionPane.showMessageDialog(null, my);
                count3++;
                value1=value2=value3=value4=value5=""; 
            }
        }
            catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_insert2ActionPerformed

    private void insert3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert3ActionPerformed
        // TODO add your handling code here:
        try{
                
                String value1 = usn1.getText();
                if(usn1.getText().equals("")){
                    String m="USN can't be empty";
                    JOptionPane.showMessageDialog(null, m);
                    
                    
                }
                else{
                String value2 = gpa3.getText();
                String value3 = counselor3.getText();
                String value4 = problem3.getText();
                String value5 = remarks3.getText();
           String sql = "insert into thirdyr values ('"+value1+"','"+value2+"','"+value3+"','"+value4+"','"+value5+"')";
           
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
                String my="Record ADDED!";
                     JOptionPane.showMessageDialog(null, my);
                count3++;
               value1=value2=value3=value4=value5=""; 
            }
        }
            catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_insert3ActionPerformed

    private void insert4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insert4ActionPerformed
        // TODO add your handling code here:
        try{
                
                String value1 = usn1.getText();
                if(usn1.getText().equals("")){
                    String m="USN can't be empty";
                    JOptionPane.showMessageDialog(null, m);
                    
                    
                }
                else{
                String value2 = gpa4.getText();
                String value3 = counselor4.getText();
                String value4 = problem4.getText();
                String value5 = remarks4.getText();
           String sql = "insert into fourthyr values ('"+value1+"','"+value2+"','"+value3+"','"+value4+"','"+value5+"')";
           
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
                String my="Record ADDED!";
                     JOptionPane.showMessageDialog(null, my);
                count3++;
               value1=value2=value3=value4=value5=""; 
            }
        }
            catch(Exception e){
                 JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_insert4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        
        studinfo st = new studinfo();
                String sew= "Records inserted in this session: "+count3;
                JOptionPane.showMessageDialog(null, sew);
        setVisible(false);
        st.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void usn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_usn1ActionPerformed
        // TODO add your handling code here:
      /*  
        try{
            studinfo st = new studinfo();
            usn1.setText(st.usn.getText());
        }
        catch(Exception e)
        {
             JOptionPane.showMessageDialog(null, e);
        }*/
    }//GEN-LAST:event_usn1ActionPerformed

    private void update1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update1ActionPerformed
        // TODO add your handling code here:
        try{
             String val4 = usn1.getText();
                if(usn1.getText().equals("")){
                    String m="USN can't be empty";
                    JOptionPane.showMessageDialog(null, m);
                    
                    
                }
                else{
                    String val1=gpa1.getText();
                    String val = counselor1.getText();
                    String val2=problem1.getText();
                    String val3=remarks1.getText();
               if(!gpa1.getText().equals("")){
                    String sql= "update firstyr set Gpa='"+val1+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!counselor1.getText().equals("")){
                    String sql= "update firstyr set Conselor='"+val+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!problem1.getText().equals("")){
                    String sql= "update firstyr set Problems='"+val2+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!remarks1.getText().equals("")){
                    String sql= "update firstyr set Remarks='"+val3+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               
                String my="Record Updated!";
                     JOptionPane.showMessageDialog(null, my);
                
        }
        }
        catch(Exception e)
        {
            
             String my="USN not present";
            JOptionPane.showMessageDialog(null, e);
             JOptionPane.showMessageDialog(null, my);
        }
    
    }//GEN-LAST:event_update1ActionPerformed

    private void update2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update2ActionPerformed
        // TODO add your handling code here:
         try{
             String val4 = usn1.getText();
                if(usn1.getText().equals("")){
                    String m="USN can't be empty";
                    JOptionPane.showMessageDialog(null, m);
                    
                    
                }
                else{
                    String val1=gpa2.getText();
                    String val = counselor2.getText();
                    String val2=problem2.getText();
                    String val3=remarks2.getText();
               if(!gpa2.getText().equals("")){
                    String sql= "update secondyr set Gpa='"+val1+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!counselor2.getText().equals("")){
                    String sql= "update secondyr set Conselor='"+val+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!problem2.getText().equals("")){
                    String sql= "update secondyr set Problems='"+val2+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!remarks2.getText().equals("")){
                    String sql= "update secondyr set Remarks='"+val3+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               
                String my="Record Updated!";
                     JOptionPane.showMessageDialog(null, my);
                
        }
        }
        catch(Exception e)
        {
            
             String my="USN not present";
            JOptionPane.showMessageDialog(null, e);
             JOptionPane.showMessageDialog(null, my);
        }
    }//GEN-LAST:event_update2ActionPerformed

    private void update3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update3ActionPerformed
        // TODO add your handling code here:
       try{
             String val4 = usn1.getText();
                if(usn1.getText().equals("")){
                    String m="USN can't be empty";
                    JOptionPane.showMessageDialog(null, m);
                    
                    
                }
                else{
                    String val1=gpa3.getText();
                    String val = counselor3.getText();
                    String val2=problem3.getText();
                    String val3=remarks3.getText();
               if(!gpa3.getText().equals("")){
                    String sql= "update thirdyr set Gpa='"+val1+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!counselor3.getText().equals("")){
                    String sql= "update thirdyr set Conselor='"+val+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!problem3.getText().equals("")){
                    String sql= "update thirdyr set Problems='"+val2+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!remarks3.getText().equals("")){
                    String sql= "update thirdyr set Remarks='"+val3+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               
                String my="Record Updated!";
                     JOptionPane.showMessageDialog(null, my);
                
        }
        }
        catch(Exception e)
        {
            
             String my="USN not present";
            JOptionPane.showMessageDialog(null, e);
             JOptionPane.showMessageDialog(null, my);
        }
    }//GEN-LAST:event_update3ActionPerformed

    private void update4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_update4ActionPerformed
        // TODO add your handling code here:
         try{
             String val4 = usn1.getText();
                if(usn1.getText().equals("")){
                    String m="USN can't be empty";
                    JOptionPane.showMessageDialog(null, m);
                    
                    
                }
                else{
                    String val1=gpa4.getText();
                    String val = counselor4.getText();
                    String val2=problem4.getText();
                    String val3=remarks4.getText();
               if(!gpa4.getText().equals("")){
                    String sql= "update fourthyr set Gpa='"+val1+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!counselor4.getText().equals("")){
                    String sql= "update fourthyr set Conselor='"+val+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!problem4.getText().equals("")){
                    String sql= "update fourthyr set Problems='"+val2+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               if(!remarks4.getText().equals("")){
                    String sql= "update fourthyr set Remarks='"+val3+"' where usn='"+val4+"'";
                pst=conn.prepareStatement(sql);
                pst.executeUpdate(sql);
               }
               
                String my="Record Updated!";
                     JOptionPane.showMessageDialog(null, my);
                
        }
        }
        catch(Exception e)
        {
            
             String my="USN not present";
            JOptionPane.showMessageDialog(null, e);
             JOptionPane.showMessageDialog(null, my);
        }
    }//GEN-LAST:event_update4ActionPerformed

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
            java.util.logging.Logger.getLogger(counselling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(counselling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(counselling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(counselling.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new counselling().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField counselor1;
    private javax.swing.JTextField counselor2;
    private javax.swing.JTextField counselor3;
    private javax.swing.JTextField counselor4;
    private javax.swing.JTextField gpa1;
    private javax.swing.JTextField gpa2;
    private javax.swing.JTextField gpa3;
    private javax.swing.JTextField gpa4;
    private javax.swing.JButton insert1;
    private javax.swing.JButton insert2;
    private javax.swing.JButton insert3;
    private javax.swing.JButton insert4;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField problem1;
    private javax.swing.JTextField problem2;
    private javax.swing.JTextField problem3;
    private javax.swing.JTextField problem4;
    private javax.swing.JTextField remarks1;
    private javax.swing.JTextField remarks2;
    private javax.swing.JTextField remarks3;
    private javax.swing.JTextField remarks4;
    private javax.swing.JButton update1;
    private javax.swing.JButton update2;
    private javax.swing.JButton update3;
    private javax.swing.JButton update4;
    private javax.swing.JTextField usn1;
    // End of variables declaration//GEN-END:variables
}
