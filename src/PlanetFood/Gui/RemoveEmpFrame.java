/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.Gui;
import PlanetFood.Dao.EmpDao;
import PlanetFood.Pojo.Employees;
import PlanetFood.Pojo.UserProfile;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class RemoveEmpFrame extends javax.swing.JFrame {

    /**
     * Creates new form RemoveEmpFrame
     */
    public RemoveEmpFrame() {
        initComponents();
         lbUserName.setText("Hello " +UserProfile.getUsername());
 
        this.setLocationRelativeTo(null);
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
        btnDeleteEmp = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        EmpList = new javax.swing.JTable();
        btnLogout = new javax.swing.JLabel();
        btnSearch = new javax.swing.JButton();
        txtempId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PLANET FOOD APP");

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 38)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("REMOVE EMPLOYEE");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 50, 430, 50));

        lbUserName.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        lbUserName.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(lbUserName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 220, 30));

        btnDeleteEmp.setBackground(new java.awt.Color(0, 102, 102));
        btnDeleteEmp.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnDeleteEmp.setForeground(new java.awt.Color(255, 255, 255));
        btnDeleteEmp.setText("DELETE EMP");
        btnDeleteEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteEmpActionPerformed(evt);
            }
        });
        jPanel1.add(btnDeleteEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 680, 250, 50));

        btnBack.setBackground(new java.awt.Color(0, 102, 102));
        btnBack.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("BACK");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });
        jPanel1.add(btnBack, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 680, 230, 50));

        EmpList.setBackground(new java.awt.Color(0, 102, 102));
        EmpList.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        EmpList.setForeground(new java.awt.Color(255, 255, 255));
        EmpList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "EmpId", "EmpName", "Job", "Salary"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        EmpList.setRowHeight(28);
        EmpList.setSelectionBackground(new java.awt.Color(0, 0, 0));
        EmpList.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(EmpList);
        if (EmpList.getColumnModel().getColumnCount() > 0) {
            EmpList.getColumnModel().getColumn(0).setResizable(false);
            EmpList.getColumnModel().getColumn(1).setResizable(false);
            EmpList.getColumnModel().getColumn(2).setResizable(false);
            EmpList.getColumnModel().getColumn(3).setResizable(false);
        }

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 930, 390));

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
        jPanel1.add(btnLogout, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 20, -1, -1));

        btnSearch.setBackground(new java.awt.Color(0, 102, 102));
        btnSearch.setFont(new java.awt.Font("Tahoma", 1, 22)); // NOI18N
        btnSearch.setForeground(new java.awt.Color(255, 255, 255));
        btnSearch.setText("SEARCH");
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });
        jPanel1.add(btnSearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 170, 190, 40));

        txtempId.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jPanel1.add(txtempId, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 170, 290, -1));

        jLabel2.setBackground(new java.awt.Color(0, 0, 0));
        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("EmpID          :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 170, -1, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("E:\\user logo.jpg")); // NOI18N
        jLabel6.setText("jLabel6");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 210, 200, 220));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 1266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 764, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteEmpActionPerformed
    if(EmpList.getRowCount()!=0){
        String EmId = EmpList.getValueAt(0, 0).toString();
    
        try{
            if(EmpDao.deleteemployee(EmId))
            {
                JOptionPane.showMessageDialog(null,"Data succsefully deleted from Records","Deleted",JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                  JOptionPane.showMessageDialog(null,"Data deletion from Records is Unsuccessfull","ERROR !!!!",JOptionPane.ERROR_MESSAGE);
        
            }
            
        }
        catch(SQLException sq)
        {
             JOptionPane.showMessageDialog(null,"Error n Db"+sq,"DB Error",JOptionPane.ERROR_MESSAGE);
         
        }
    }
     
    }//GEN-LAST:event_btnDeleteEmpActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        int ans;
        ans=JOptionPane.showConfirmDialog(null, "Are u sure ?","Quitting!",JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE);
        if(ans==JOptionPane.YES_OPTION)
        {
            AdminOptionsFrame ad = new AdminOptionsFrame();
            ad.setVisible(true);
            this.dispose();
        }        // TODO add your handling code here:
    }//GEN-LAST:event_btnBackActionPerformed

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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
       if(txtempId.getText().isEmpty())
{
    JOptionPane.showMessageDialog(null, "Please Enter a Employee Id","EMPTY EmpId",JOptionPane.ERROR_MESSAGE);
    return ;
}
try{
 Employees e =  EmpDao.SearchEmployee(txtempId.getText());
 if(e==null)
 {
   JOptionPane.showMessageDialog(null, "Please Enter a Valid Employee Id","Invalid EmpId",JOptionPane.ERROR_MESSAGE);
   return ;
 }
 DefaultTableModel model = (DefaultTableModel)EmpList.getModel();
    model.setRowCount(0);
    EmpList.setRowHeight(40);
    
    Object[] row = {e.getEmpId(),e.getName(),e.getJob(),e.getSalary()};
    model.addRow(row);
    

}
catch(SQLException sq){
    JOptionPane.showMessageDialog(null, "Please Enter a Valid Employee Id"+sq,"Invalid EmpId",JOptionPane.ERROR_MESSAGE);
 
    sq.printStackTrace();
}
 // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

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
            java.util.logging.Logger.getLogger(RemoveEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveEmpFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveEmpFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable EmpList;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnDeleteEmp;
    private javax.swing.JLabel btnLogout;
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbUserName;
    private javax.swing.JTextField txtempId;
    // End of variables declaration//GEN-END:variables
}
