/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.DbUtil;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class DBConnection {
   private static Connection con =null ;
    static{
        try{
    Class.forName("oracle.jdbc.driver.OracleDriver");
   con = DriverManager.getConnection("jdbc:oracle:thin:@//ESHANJAIN:1521/XE","MYPROJECT","abc");    
JOptionPane.showMessageDialog(null,"Connected succesfully to the database ","Success!",JOptionPane.INFORMATION_MESSAGE);
        }
        catch(ClassNotFoundException cnfe)
        {
            JOptionPane.showMessageDialog(null,"Error in Finding the class","ERROR",JOptionPane.ERROR_MESSAGE);
            cnfe.printStackTrace();
        }
        catch(SQLException sqle)
        {
           JOptionPane.showMessageDialog(null,"Error in Database Part//","ERROR",JOptionPane.ERROR_MESSAGE);
           sqle.printStackTrace();
        }
        
    }
    public static Connection getConnection()
    {
        return con ;
    }
    public static void closeConnection()
    {
       try{
        con.close();
        JOptionPane.showMessageDialog(null,"closing connection is succesfull","Closed",JOptionPane.INFORMATION_MESSAGE);
     
        }
       catch(SQLException sqle)
       {
           JOptionPane.showMessageDialog(null,"error in closing connection","Error!",JOptionPane.ERROR_MESSAGE);
       }
       }
       
}
