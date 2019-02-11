/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.Gui;

import PlanetFood.Dao.CategoryDao;
import PlanetFood.Pojo.Category;
import PlanetFood.Pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class CategoryAddingFrame extends javax.swing.JFrame {

    /**
     * Creates new form CategoryAddingFrame
     */
    public CategoryAddingFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
         lbUserName.setText("Hello " +UserProfile.getUsername());
 
        try
        {
          String catId = CategoryDao.generateCategoryId();
          txtCategoryId.setText(catId);
        }
        catch(SQLException sq)
        {
    JOptionPane.showMessageDialog(null,"Error in Db","ERROR!!",JOptionPane.ERROR_MESSAGE);

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
        btnLogout = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCategoryId = new javax.swing.JTextField();
        txtCategoryName = new javax.swing.JComboBox<>();
        btnBack = new javax.swing.JButton();
        btnAddProd = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PLANET FOOD APP");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CATEGORY ADDING PANEL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 60, 540, 50));

        lbUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 30));

        btnLogout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
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
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1090, 20, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/menu card.gif"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 400, 580));

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "SET CATEGORY DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 26), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("CATEGORY ID");
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 80, 180, 30));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("CATEGORY NAME");
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 220, 220, -1));

        txtCategoryId.setEditable(false);
        txtCategoryId.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jPanel2.add(txtCategoryId, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 140, 410, -1));

        txtCategoryName.setEditable(true);
        txtCategoryName.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtCategoryName.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Sandwiches", "Noodles", "Drinks" }));
        jPanel2.add(txtCategoryName, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 280, 410, -1));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel2.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 380, 230, 50));

        btnAddProd.setBackground(new java.awt.Color(0, 102, 102));
        btnAddProd.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        btnAddProd.setForeground(new java.awt.Color(255, 255, 255));
        btnAddProd.setText("Add Category");
        btnAddProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddProdActionPerformed(evt);
            }
        });
        jPanel2.add(btnAddProd, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 380, 230, 50));

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 720, 460));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1192, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        int ans;
        ans=JOptionPane.showConfirmDialog(null, "Are u sure ?","Quitting!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            this.dispose();
            AdminOptionsFrame ad = new AdminOptionsFrame();
            ad.setVisible(true);
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddProdActionPerformed
try
{
  Category category = new Category();
  category.setCat_id(txtCategoryId.getText());
  category.setCat_Name(txtCategoryName.getSelectedItem().toString());
  if(CategoryDao.AddCategory(category))
  {
  JOptionPane.showMessageDialog(null,"Category successfully added to the database","Success",JOptionPane.INFORMATION_MESSAGE);
  txtCategoryName.removeItem(txtCategoryName.getSelectedItem());
  this.dispose();
  new CategoryAddingFrame().setVisible(true);
  }
}
catch(SQLException sq)
{
JOptionPane.showMessageDialog(null,"Error in Db","ERROR!!",JOptionPane.ERROR_MESSAGE);


}// TODO add your handling code here:
    }//GEN-LAST:event_btnAddProdActionPerformed

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
            java.util.logging.Logger.getLogger(CategoryAddingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CategoryAddingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CategoryAddingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CategoryAddingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CategoryAddingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddProd;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField txtCategoryId;
    private javax.swing.JComboBox<String> txtCategoryName;
    // End of variables declaration//GEN-END:variables
}
