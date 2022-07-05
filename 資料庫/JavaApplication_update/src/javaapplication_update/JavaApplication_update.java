package javaapplication_update;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class JavaApplication_update {

    public static void main(String[] args) {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String passwd = "1234";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwd);

            Statement st = con.createStatement();
            String s = "UPDATE std SET email = 'andy@biz.com' WHERE id = 10701";
            st.execute(s);
            System.out.println("資料修改成功！");

            con.close();

        } catch (ClassNotFoundException e) {
            System.out.println("驅動程式載入錯誤");
        } catch (SQLException e2) {
            System.out.println("資料庫連線錯誤");
        }
    }
}
