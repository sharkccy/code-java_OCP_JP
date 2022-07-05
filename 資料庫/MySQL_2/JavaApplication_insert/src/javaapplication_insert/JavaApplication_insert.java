package javaapplication_insert;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class JavaApplication_insert {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passwd = "1234";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, passwd);
        
        Scanner sc = new Scanner(System.in);
        System.out.println("請輸入id");
        int id = sc.nextInt();
        System.out.println("請輸入姓名");
        String name = sc.next();
        System.out.println("請輸入密碼");
        String pwd = sc.next();
        
        String str = "INSERT INTO member VALUES(?,?,?)";
        PreparedStatement ps = con.prepareStatement(str);
        ps.setInt(1, id);   // 1表示上面SQL語法的第一個問號
        ps.setString(2, name);
        ps.setString(3, pwd);
        ps.executeUpdate();
        System.out.println("資料輸入成功!");
        con.close();
    }

}
