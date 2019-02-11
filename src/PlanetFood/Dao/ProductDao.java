/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.Dao;

import PlanetFood.DbUtil.DBConnection;
import PlanetFood.Pojo.Product;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author HP
 */
public class ProductDao {
    public static String getProductId() throws SQLException
    {
      Connection con = DBConnection.getConnection();
      Statement st = con.createStatement();
     ResultSet count = st.executeQuery("select * from tcount");
     int id = 101 ;
     if(count.next())
     {
         id = id+count.getInt(1);
     }
     return "P" +id ;
    }
    public static boolean addProduct(Product p) throws SQLException
{
     Connection con = DBConnection.getConnection();
  PreparedStatement pst = con.prepareStatement("insert into products values(?,?,?,?,?)");
      pst.setString(1,p.getProId());
      pst.setString(2, p.getCatId());
      pst.setString(3,p.getProdName());
      pst.setInt(4,p.getProdPrice());
      pst.setString(5, p.getIsActive());
      int x = pst.executeUpdate();
      if(x == 0)
          return false;
      else
      {
          PreparedStatement psmt = con.prepareStatement("update tcount set pcount=pcount+1");
       psmt.executeUpdate();
   
          return true;
      }
    }   
     public static HashMap<String,Product> getAllProductId(String cat_id) throws SQLException
    {
      Connection con = DBConnection.getConnection();
     PreparedStatement st = con.prepareStatement("select * from products where cat_id= ?");
         st.setString(1, cat_id);
     ResultSet rs=  st.executeQuery();
       
   HashMap<String,Product> hm = new HashMap<>();
   
   while(rs.next())
   {
       Product pd = new Product();
       pd.setProId(rs.getString(1));
      String str = rs.getString(1);
      pd.setCatId(rs.getString(2));
      pd.setProdName(rs.getString(3));
      pd.setProdPrice(rs.getInt(4));
      pd.setIsActive(rs.getString(5));
     hm.put(str, pd);
       
   }
     return hm ;
    }
   
   public static ArrayList<Product> getAllProduct() throws SQLException
   {
       ArrayList<Product> ProdList = new ArrayList<>();
         Connection con = DBConnection.getConnection();
         Statement st = con.createStatement();
         ResultSet rs = st.executeQuery("select * from products");
   while(rs.next())
   {
       Product pd = new Product();
       pd.setProId(rs.getString(1));
       pd.setCatId(rs.getString(2));
       pd.setProdName(rs.getString(3));
       pd.setProdPrice(rs.getInt(4));
       pd.setIsActive(rs.getString(5));
       ProdList.add(pd);
   }
  
     return ProdList;  
   }
   public static boolean UpdateProduct(Product p) throws SQLException
{
     Connection con = DBConnection.getConnection();
  PreparedStatement pst = con.prepareStatement("update products set prod_name=?,prod_price=?,active=?,cat_id=? where prod_id=?");
      pst.setString(5,p.getProId());
      pst.setString(4, p.getCatId());
      pst.setString(1,p.getProdName());
      pst.setInt(2,p.getProdPrice());
      pst.setString(3, p.getIsActive());
      int x = pst.executeUpdate();
      if(x == 0)
          return false;
      else
      {
          
          return true;
      }
    }
public static boolean RemoveProduct(String Prod_name)throws SQLException
{
    Connection con  = DBConnection.getConnection();
    PreparedStatement ps = con.prepareStatement("update products set active='N' where prod_name=?");
     ps.setString(1, Prod_name);
    int x = ps.executeUpdate();
    if(x==0)
        return false ;
    else
    return true ;
    
    
}
    
}
