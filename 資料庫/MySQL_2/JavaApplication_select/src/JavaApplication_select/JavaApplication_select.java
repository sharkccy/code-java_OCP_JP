/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaApplication_select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import java.sql.ResultSet;

/**
 *
 * @author student
 */
public class JavaApplication_select {

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

        if (con != null && !con.isClosed()) {
            Scanner sc = new Scanner(System.in);
            //System.out.println("請輸入要查詢的ID：");
            //String id = sc.next();
            System.out.println("請輸入要查詢的帳號：");
            String name = sc.next();

            //String s = " SELECT * FROM member WHERE id = ? ";
            String s = " SELECT * FROM member WHERE name LIKE ? ";
            PreparedStatement ps = con.prepareStatement(s);
            //ps.setString(1, id);
            ps.setString(1, "%" + name + "%");  // 列出帳號包含字母a的所有記錄

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String n = rs.getString("name");
                String p = rs.getString("password");
                System.out.println("帳號：" + n + "\t密碼：" + p);
            }
            con.close();
        }
    }
}
