package javaapplication_select;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaApplication_select {

    public static void main(String[] args) {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String passwd = "1234";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement st = con.createStatement();
            //String s = "SELECT * FROM std";
            //String s = "SELECT * FROM std WHERE id >= 10704";
            //String s = "SELECT * FROM std WHERE email LIKE '%msn.com' ";
            //String s = "SELECT * FROM std WHERE name LIKE 'a%' ";
            //String s = "SELECT * FROM std WHERE id BETWEEN 10703 AND";
            String s = "SELECT name, email FROM std WHERE id BETWEEN 10703 AND 10705";
            ResultSet rs = st.executeQuery(s);
            while(rs.next()){
                //int id = rs.getInt("id");
                String name = rs.getString("name");
                String mail = rs.getString("email");
                System.out.println("Name: " + name + "\tEmail: " + mail);
            }

            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("驅動程式載入錯誤");
        } catch (SQLException e2) {
            System.out.println("資料庫連線錯誤");
        }
    }
}
