/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.Gui;

import PlanetFood.Dao.EmpDao;
import PlanetFood.Dao.UserDao;
import PlanetFood.DbUtil.DBConnection;
import PlanetFood.Pojo.Employees;
import PlanetFood.Pojo.User;
import PlanetFood.Pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class RegisterCashierFrame extends javax.swing.JFrame {
HashMap<String,String> hm ;
String userid , password ;
HashMap<String,Employees> al;

    /**
     * Creates new form RegisterCashierFrame
     */
    public RegisterCashierFrame() {
        initComponents();
         lbUserName.setText("Hello " +UserProfile.getUsername());
 
        this.setLocationRelativeTo(null);
        try{
         al = EmpDao.ViewEmployee();
        hm = UserDao.getUserList();
        Set<String> id = al.keySet();
        for(String eo:id)
        {
            Employees e = al.get(eo);
            if(e.getJob().equalsIgnoreCase("cashier") && (hm.get(e.getEmpId())==null) )
            {
               JCEmpId.addItem(e.getEmpId());
            }
           
        }
        
        }
         catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Error in SQL part"+ex,"Failure",JOptionPane.ERROR_MESSAGE);

            ex.printStackTrace();
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbUserName = new javax.swing.JLabel();
        btnAddEmployee = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        btnLogout = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtUserId = new javax.swing.JTextField();
        JCEmpId = new javax.swing.JComboBox<>();
        pswrdCnfrm = new javax.swing.JPasswordField();
        pswrdUser = new javax.swing.JPasswordField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PLANET FOOD APP");
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
            }
        });

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REGISTER CASHIER");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 440, 50));

        lbUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 30, 220, 40));

        btnAddEmployee.setBackground(new java.awt.Color(0, 102, 102));
        btnAddEmployee.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnAddEmployee.setForeground(new java.awt.Color(255, 255, 255));
        btnAddEmployee.setText("REGISTER");
        btnAddEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(btnAddEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 630, 250, 50));

        jButton2.setBackground(new java.awt.Color(0, 102, 102));
        jButton2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("BACK");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 630, 230, 50));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        btnLogout.setForeground(new java.awt.Color(255, 255, 255));
        btnLogout.setText("LOGOUT");
        btnLogout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLogoutMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnLogoutMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnLogoutMouseExited(evt);
            }
        });
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(970, 10, -1, -1));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CASHIER DETAILS\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setOpaque(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EmpID          :");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("User ID         :");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        jLabel4.setBackground(new java.awt.Color(0, 0, 0));
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Password     :");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, 160, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("ReType Password   :");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        txtUserId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel2.add(txtUserId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 160, 290, -1));

        JCEmpId.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        jPanel2.add(JCEmpId, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 90, 290, -1));

        pswrdCnfrm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(pswrdCnfrm, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 320, 290, -1));

        pswrdUser.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jPanel2.add(pswrdUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 240, 290, -1));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 700, 420));

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\user logo.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1067, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddEmployeeActionPerformed
       if(validateInput()==false)
        {
      JOptionPane.showMessageDialog(null,"please fill all the fields From the Above with correct details.\nPassword Doesn't Match","Empty Values",JOptionPane.ERROR_MESSAGE);
 return ;
        }
        try{
            
            User user = new User();
            user.setUserid(userid);
            user.setPassword(password);
             user.setEmpid(JCEmpId.getSelectedItem().toString());
              Employees e = al.get(user.getEmpid());
              user.setUsername(e.getName());
              user.setUserType(e.getJob());
            if(UserDao.registerUser(user))
            {
    JOptionPane.showMessageDialog(null,"Successfully Registered to the database","Success",JOptionPane.INFORMATION_MESSAGE);
this.dispose();
    new RegisterCashierFrame().setVisible(true);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Data is not added successfully to the database","Failure",JOptionPane.ERROR_MESSAGE);

            }
        }
        catch(SQLException ex)
        {
            JOptionPane.showMessageDialog(null,"Data is not added successfully to the database \n Error in SQL part\nNote: Please  check the details","Failure",JOptionPane.ERROR_MESSAGE);

            ex.printStackTrace();
        }
        catch(NumberFormatException ex)
        {
            JOptionPane.showMessageDialog(null,"Please write a valid Data only","Failure",JOptionPane.ERROR_MESSAGE);

        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddEmployeeActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        int ans;
        ans=JOptionPane.showConfirmDialog(null, "Are u sure ?","Quitting!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            DBConnection.closeConnection();
            System.exit(0);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btnLogoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseClicked
        int ans;
        ans=JOptionPane.showConfirmDialog(null, "Are u sure \n You want to Logout?","Logout",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            this.dispose();
            LoginFrame lf = new LoginFrame();
            lf.setVisible(true);
        }
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutMouseClicked

    private void btnLogoutMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseEntered
        btnLogout.setForeground(Color.yellow);  // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutMouseEntered

    private void btnLogoutMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLogoutMouseExited
        btnLogout.setForeground(Color.white);  // TODO add your handling code here:

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLogoutMouseExited

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained

            
            
               
        
// TODO add your handling code here:
    }//GEN-LAST:event_jPanel1FocusGained

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        

if(JCEmpId.getItemCount()==0)
        {
            JOptionPane.showMessageDialog(null,"NO Cashier is Left for Registeration !!","Empty List",JOptionPane.INFORMATION_MESSAGE);
AdminOptionsFrame ad = new AdminOptionsFrame();
this.dispose();
ad.setVisible(true);
        }
// TODO add your handling code here:
    }//GEN-LAST:event_formWindowGainedFocus

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
            java.util.logging.Logger.getLogger(RegisterCashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterCashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterCashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterCashierFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterCashierFrame().setVisible(true);
            }
        });
    }
    
    
    
    private boolean validateInput()
{
    char[] pwd = pswrdUser.getPassword();
     password = String.valueOf(pwd);
    pwd = pswrdCnfrm.getPassword();
    String confirm = String.valueOf(pwd);
    if(txtUserId.getText().isEmpty()|| password.length()==0 || confirm.length()==0){
       
        return false;
    }
    else{
         if(!password.equals(confirm))
        {
       JOptionPane.showMessageDialog(null,"Password doesn't Match with Confirm ","Password Mismatch!!",JOptionPane.ERROR_MESSAGE);
        return false; 
        }
         userid = txtUserId.getText();
    return true;
    }
}
    
    private void close()
    {
        this.setVisible(false);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> JCEmpId;
    private javax.swing.JButton btnAddEmployee;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JPasswordField pswrdCnfrm;
    private javax.swing.JPasswordField pswrdUser;
    private javax.swing.JTextField txtUserId;
    // End of variables declaration//GEN-END:variables
}