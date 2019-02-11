/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.Gui;

import PlanetFood.Dao.CategoryDao;
import PlanetFood.Dao.ProductDao;
import PlanetFood.Pojo.Product;
import PlanetFood.Pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class ProductRemovingFrame extends javax.swing.JFrame {
HashMap hm ,pm ;
String id ;
    /**
     * Creates new form ProductRemovingFrame
     */
    public ProductRemovingFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
         lbUserName.setText("Hello " +UserProfile.getUsername());
 
             try
        {
         
          hm = CategoryDao.getAllCategoryId();
         Set ks = hm.keySet();
         Iterator it = ks.iterator();
         while(it.hasNext())
         {
             txtcategories.addItem(it.next().toString());
         }
        }
        catch(Throwable th)
        {
          th.printStackTrace();
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
        jPanel3 = new javax.swing.JPanel();
        btnRemoveProduct = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtcategories = new javax.swing.JComboBox<>();
        txtProductId = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PLANET FOOD APP");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PRODUCT REMOVING PANEL");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 40, 480, 50));

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
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 10, -1, -1));

        jPanel3.setBackground(new java.awt.Color(0, 102, 102));
        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "CHOOSE PRODUCT TO REMOVE\n\n", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 26), new java.awt.Color(255, 255, 255))); // NOI18N
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnRemoveProduct.setBackground(new java.awt.Color(0, 102, 102));
        btnRemoveProduct.setFont(new java.awt.Font("Tahoma", 1, 26)); // NOI18N
        btnRemoveProduct.setForeground(new java.awt.Color(255, 255, 255));
        btnRemoveProduct.setText("REMOVE PRODUCT");
        btnRemoveProduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveProductActionPerformed(evt);
            }
        });
        jPanel3.add(btnRemoveProduct, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, 300, 50));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel3.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 230, 50));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("PRODUCT ID");
        jPanel3.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 170, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("PRODUCT CATEGORY");
        jPanel3.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, -1, -1));

        txtcategories.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        txtcategories.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcategoriesActionPerformed(evt);
            }
        });
        jPanel3.add(txtcategories, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 410, -1));

        txtProductId.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        jPanel3.add(txtProductId, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 410, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 140, 770, 500));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/tenor.gif"))); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 510, 280));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1277, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 757, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnRemoveProductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveProductActionPerformed
id = txtProductId.getSelectedItem().toString();
try{
if(ProductDao.RemoveProduct(id))
     {
   JOptionPane.showMessageDialog(null,"Succesfully removed" ,"REMOVED",JOptionPane.INFORMATION_MESSAGE);
 
   txtcategoriesActionPerformed(evt) ;
  }
  else{
   JOptionPane.showMessageDialog(null,"UNSuccesfull removal" ,"ERROR!!",JOptionPane.ERROR_MESSAGE);
 
  }
    
  }
 catch(SQLException sq)
  {
      JOptionPane.showMessageDialog(null,"Error in DB"+sq ,"ERROR DB!!",JOptionPane.ERROR_MESSAGE);
   }


        // TODO add your handling code here:
    }//GEN-LAST:event_btnRemoveProductActionPerformed

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

    private void txtcategoriesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcategoriesActionPerformed
try
{
  pm  = ProductDao.getAllProductId(hm.get(txtcategories.getSelectedItem().toString()).toString());
 Set al = pm.keySet();
          Iterator it = al.iterator();
           txtProductId.removeAllItems();
      while(it.hasNext())
              {
                  Product p = (Product)pm.get(it.next().toString());
                  if(p.getIsActive().equals("Y"))
                  txtProductId.addItem(p.getProdName());
         }
   
}
catch(Throwable th)
{
    th.printStackTrace();
}
    


        // TODO add your handling code here:
    }//GEN-LAST:event_txtcategoriesActionPerformed

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
            java.util.logging.Logger.getLogger(ProductRemovingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ProductRemovingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ProductRemovingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ProductRemovingFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ProductRemovingFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton btnRemoveProduct;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JComboBox<String> txtProductId;
    private javax.swing.JComboBox<String> txtcategories;
    // End of variables declaration//GEN-END:variables
}
