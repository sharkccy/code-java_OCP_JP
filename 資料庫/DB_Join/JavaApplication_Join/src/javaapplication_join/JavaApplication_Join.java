/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_join;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author student
 */
public class JavaApplication_Join {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)  throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver"; 
        String url = "jdbc:mysql://localhost:3306/my"; 
        String user = "root", password = "1234"; 
        Class.forName(driver); 
        Connection con = DriverManager.getConnection(url, user, password);
        
        Statement st = con.createStatement();
        String str = "SELECT name, course, score FROM my.std, my.class, my.major "
                + "WHERE std.id = major.id "
                + "AND class.classid = major.classid "
                + "AND score BETWEEN 60 and 80";
               
        ResultSet rs = st.executeQuery(str);
        while(rs.next()){
             String n = rs.getString("name");
             String c = rs.getString("course");
             String g = rs.getString("score");

             System.out.println(n + "\t"  + c + "\t" + g);
        } 
        con.close(); 
    }
}
