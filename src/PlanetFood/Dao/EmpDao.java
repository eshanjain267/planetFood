/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PlanetFood.Dao;

import PlanetFood.DbUtil.DBConnection;
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
public class EmpDao {
     public static boolean AddEmployee(Employees empobj) throws SQLException
  {
    Connection con = DBConnection.getConnection();
    PreparedStatement  pstmtadd,pst ;
pstmtadd = con.prepareStatement("insert into employees values(?,?,?,?)");
    
pstmtadd.setString(1,empobj.getEmpId());
        pstmtadd.setString(2,empobj.getName());
        pstmtadd.setString(3,empobj.getJob());
        pstmtadd.setInt(4,empobj.getSalary());
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else{
       pst =  con.prepareStatement("update tcount set ecount=ecount+1");
       pst.executeUpdate();
    return true ;
    }
    }
     public static HashMap<String,Employees> ViewEmployee() throws SQLException
     {
         Connection con = DBConnection.getConnection();
     Statement  stmtviewall = con.createStatement();
    HashMap<String,Employees> records= new HashMap<>();
     ResultSet rs = stmtviewall.executeQuery("select * from employees");
  while(rs.next())
  {
      Employees e = new Employees();
      e.setEmpId(rs.getString(1));
      e.setName(rs.getString(2));
      e.setJob(rs.getString(3));
      e.setSalary(rs.getInt(4));
      records.put(e.getEmpId(),e);
  }
   return records;  
     }
     
  public static Employees SearchEmployee(String EmpId) throws SQLException
     {
         Connection con = DBConnection.getConnection();
     PreparedStatement  stmt = con.prepareStatement("select * from employees where empid=?");
    stmt.setString(1, EmpId);
    Employees e = null;
     ResultSet rs = stmt.executeQuery();
  while(rs.next())
  {
       e = new Employees();
      e.setEmpId(rs.getString(1));
      e.setName(rs.getString(2));
      e.setJob(rs.getString(3));
      e.setSalary(rs.getInt(4));
      
  }
   return e;      
}
  public static boolean UpdateEmployee(Employees empobj) throws SQLException
  {
    Connection con = DBConnection.getConnection();
PreparedStatement  pstmtadd = con.prepareStatement("update employees set ename=? ,job = ?,sal=? where empid=?");
    
      pstmtadd.setString(4,empobj.getEmpId());
        pstmtadd.setString(1,empobj.getName());
        pstmtadd.setString(2,empobj.getJob());
        pstmtadd.setInt(3,empobj.getSalary());
   int x =     pstmtadd.executeUpdate();
   if(x == 0)
       return false;
   else
    return true ;
    }
   public static boolean deleteemployee(String EmpId) throws SQLException
    {
        Connection con = DBConnection.getConnection();
        PreparedStatement pstmt ,pst ;
  pstmt = con.prepareStatement("delete from employees where empid=?");
        pstmt.setString(1,EmpId);
   int x =     pstmt.executeUpdate();
   if(x == 0)
       return false;
   else
   {
    return true ;
   }
   
    }
   public static String generateId() throws SQLException{
       int id =0;
       
        Connection con = DBConnection.getConnection();
Statement st = con.createStatement();
ResultSet rs = st.executeQuery("select * from tcount");
while(rs.next()){
    id = rs.getInt(2);
}
id = 101 +id ;
return "E"+id ;
   }
}
