
package student.information.system;


import java.sql.*;
import javax.swing.*;
import java.util.*;
public class db {

    Connection conn=null;
    public static Connection java_db(){
        
        try{
            Class.forName("com.mysql.jdbc");
           Connection conn =DriverManager.getConnection("jdbc:mysql://localhost:3306/dbms?","root","708381");
        System.out.println("Connection Done");
      
            return conn;
           
            
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
        
    }
}