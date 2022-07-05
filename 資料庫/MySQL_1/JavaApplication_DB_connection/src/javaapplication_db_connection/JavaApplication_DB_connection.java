/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication_db_connection;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**
 *
 * @author student
 */
public class JavaApplication_DB_connection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver"; 
        String url = "jdbc:mysql://localhost:3306/test"; 
        String user = "root";
        String passwd = "1234"; 
        Class.forName(driver); 
        Connection con = DriverManager.getConnection(url, user, passwd);
 
        if(con != null && !con.isClosed()) {
            System.out.println("資料庫連線成功！"); 
    
                
            con.close();
        }
    }    
}

