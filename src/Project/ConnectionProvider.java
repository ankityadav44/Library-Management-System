/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;

/**
 *
 * @author 91888
 */
public class ConnectionProvider {
   public static Connection getCon(){
       try {
            Class.forName("com.mysql.cj.jdbc.Driver");
           Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/lms", "root" ,"bittuyadav@44");
           return con;
       } catch (ClassNotFoundException | SQLException e) {
           System.out.println(e);
           return null;
       }
  
   } 
}
