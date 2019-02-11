/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.Dao;

import PlanetFood.DbUtil.DBConnection;
import PlanetFood.Pojo.Category;
import PlanetFood.Pojo.Employees;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;


/**
 *
 * @author HP
 */
public class CategoryDao {
    public static HashMap<String,String> getAllCategoryId() throws SQLException{
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from categories");
        HashMap<String,String> categories = new HashMap<>();
        while(rs.next())
        {
            String cat_id = rs.getString(1);
            String cat_name = rs.getString(2);
            categories.put(cat_name, cat_id);
        }
        return categories;
    } 
    
     public static String generateCategoryId() throws SQLException{
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select count(*) from categories");
        int id=0 ;
        if(rs.next())
        {
            id= rs.getInt(1);
            id = id+101;
        }
        return "C"+id;
    } 
     public static boolean AddCategory(Category category) throws SQLException
     {
         Connection con = DBConnection.getConnection();
    PreparedStatement  pstmtadd;
pstmtadd = con.prepareStatement("insert into categories values(?,?)");
    
pstmtadd.setString(1,category.getCat_id());
        pstmtadd.setString(2,category.getCat_Name());
        
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else{
    return true ;
    }
    
     }
     
     
     public static HashMap<String,String> AllCategory() throws SQLException{
        Connection con = DBConnection.getConnection();
        Statement st = con.createStatement();
        ResultSet rs = st.executeQuery("select * from categories");
        HashMap<String,String> categories = new HashMap<>();
        while(rs.next())
        {
            String cat_id = rs.getString(1);
            String cat_name = rs.getString(2);
            categories.put(cat_id, cat_name);
        }
        return categories;
    }
     
     public static boolean EditCategory(Category category) throws SQLException
  {
    Connection con = DBConnection.getConnection();
PreparedStatement  pstmtadd = con.prepareStatement("update categories set cat_name=? where cat_id=?");
        pstmtadd.setString(1,category.getCat_Name());
        pstmtadd.setString(2,category.getCat_id());
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else
    return true ;
    }
  
    
}
