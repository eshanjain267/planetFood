/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.Dao;

import PlanetFood.DbUtil.DBConnection;
import PlanetFood.Pojo.User;
import java.sql.Connection;
import java.sql.*;
import java.util.HashMap;

/**
 *
 * @author HP
 */
public class UserDao {
    public static String validateUser(User user) throws SQLException
    {
       Connection con = DBConnection.getConnection();
       PreparedStatement pstmt = con.prepareStatement("select username from users where userid=? and password=? and usertype=?");
       pstmt.setString(1, user.getUserid());
       pstmt.setString(2, user.getPassword());
       pstmt.setString(3, user.getUserType());
       ResultSet rs = pstmt.executeQuery();
       String username = null ;
       if(rs.next())
           username= rs.getString(1);
   
       
       return username ;
    }
   
    public static HashMap<String,String> getUserList() throws SQLException
    {
        HashMap<String,String> hm = new HashMap<>();
         Connection con = DBConnection.getConnection();
     Statement st = con.createStatement();
     ResultSet rs = st.executeQuery("select * from users");
     while(rs.next())
     {
         hm.put(rs.getString("Empid"), rs.getString("UserType"));
     }
        
        return hm ;
    }
    public static boolean registerUser(User user) throws SQLException
    {
       Connection con = DBConnection.getConnection();
  PreparedStatement pst = con.prepareStatement("insert into users values(?,?,?,?,?)");
  pst.setString(1, user.getUserid());
  pst.setString(2,user.getUsername());
  pst.setString(3, user.getPassword());
  pst.setString(4, user.getEmpid());
  pst.setString(5, user.getUserType());
  int x = pst.executeUpdate();
  if(x==0)
      return false ;
  else
      return true ;
    }
    public static boolean removeUser(String UserId) throws SQLException
    {
        Connection con = DBConnection.getConnection();
  PreparedStatement pst = con.prepareStatement("delete users where userid=?");
   
  pst.setString(1, UserId);
  int x = pst.executeUpdate();
  if(x==0)
      return false;
  else
      return true ;
  
 }
    public static User searchUser(String UserId) throws SQLException
    {
         Connection con = DBConnection.getConnection();
 PreparedStatement pstsrch = con.prepareStatement("select * from users where userid=? and USERTYPE='CASHIER'");
  pstsrch.setString(1, UserId);
 ResultSet rs =  pstsrch.executeQuery();
 User user = new User();
 
 while(rs.next())
 {
     user.setEmpid(rs.getString("EMPID"));
     user.setUserid(rs.getString("USERID"));
     user.setUsername(rs.getString("USERNAME"));
     
 }
      return user ;  
    }
  
    
}
