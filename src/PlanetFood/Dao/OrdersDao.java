/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.Dao;

import PlanetFood.DbUtil.DBConnection;
import PlanetFood.Pojo.Orders;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author HP
 */
public class OrdersDao {
    public static ArrayList<Orders> getOrdersByDate(Date startDate, Date EndDate) throws SQLException
    {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from orders where ord_date BETWEEN ? and ?");
  
          long mili1 = startDate.getTime();
          long mili2= EndDate.getTime();
          java.sql.Date dl1 = new java.sql.Date(mili1);
          java.sql.Date dl2 = new java.sql.Date(mili2);
          pst.setDate(1, dl1);
          pst.setDate(2,dl2);
          ArrayList<Orders> orders= new ArrayList<>();
ResultSet rs = pst.executeQuery();
while(rs.next())
        { 
            Orders obj = new Orders();
            obj.setOrd_id(rs.getString(1));
            SimpleDateFormat smp = new SimpleDateFormat("dd-MMM-yyyy");
            java.sql.Date d = rs.getDate(2);
            String date = smp.format(d);
            obj.setOrd_date(date);
            obj.setSub_total(rs.getInt(8));
            obj.setGst(rs.getInt(3));
            obj.setGst_amt(rs.getInt(4));
            obj.setGrand_total(rs.getInt(6));
            obj.setDiscount(rs.getInt(5));
            obj.setUser_id(rs.getString(7));
            orders.add(obj);
             }
    
return orders;
    }
    public static String getId() throws Exception
    {
     int id =0;
      Connection con = DBConnection.getConnection();
     Statement pst = con.createStatement();
  ResultSet rs = pst.executeQuery("select count(*) from orders");
     if(rs!=null){
         rs.next();
         id=rs.getInt(1);
     }
     return "ORD-"+id;   
    }
    public  static boolean addOrder(Orders obj) throws SQLException
    {
         Connection con = DBConnection.getConnection();
 PreparedStatement pst = con.prepareStatement("insert into orders values(?,?,?,?,?,?,?,?)");
  pst.setString(1, obj.getOrd_id());
  SimpleDateFormat smp ;
 java.sql.Date d =new java.sql.Date(System.currentTimeMillis());
          
  pst.setDate(2,d);
  pst.setDouble(3,obj.getGst());
  pst.setDouble(4,obj.getGst_amt());
  pst.setDouble(5,obj.getDiscount());
  pst.setDouble(6, obj.getGrand_total());
  pst.setString(7,obj.getUser_id());
  pst.setDouble(8,obj.getSub_total());
  int i = pst.executeUpdate();
  if(i!=0)
      return true;
  else
      return false;
        
        
        
    }
     public static ArrayList<Orders> getAllOrders() throws SQLException
    {
        Connection con = DBConnection.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from orders");
     ArrayList<Orders> orders= new ArrayList<>();
ResultSet rs = pst.executeQuery();
while(rs.next())
        {
            Orders obj = new Orders();
            obj.setOrd_id(rs.getString(1));
            SimpleDateFormat smp = new SimpleDateFormat("dd-MMM-yyyy");
            java.sql.Date d = rs.getDate(2);
            String date = smp.format(d);
            obj.setOrd_date(date);
            obj.setSub_total(rs.getInt(8));
            obj.setGst(rs.getInt(3));
            obj.setGst_amt(rs.getInt(4));
            obj.setGrand_total(rs.getInt(6));
            obj.setDiscount(rs.getInt(5));
            obj.setUser_id(rs.getString(7));
            orders.add(obj);
            }
    
return orders;
    }
   
    
}
