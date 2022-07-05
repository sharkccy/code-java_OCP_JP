/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author FH
 */
public class DB implements Tools {

    public void delete(Member m) {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, "root", "1234");
            String s = "DELETE FROM member WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, m.getId());
            ps.execute();
            System.out.println("資料已刪除");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public void update(Member m) {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, "root", "1234");
            String s = "UPDATE member SET name = ?,password = ?,email = ? WHERE id = ?";
            PreparedStatement ps = con.prepareStatement(s);
            ps.setString(1, m.getName());
            ps.setString(2, m.getPassword());
            ps.setString(3, m.getEmail());
            ps.setString(4, m.getId());
            ps.execute();
            System.out.println("資料已更新");
            con.close();
        } 
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
