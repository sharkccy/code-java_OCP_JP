package javaapplication_dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JavaApplication_DBconnection {

    public static void main(String[] args) {
        try {
            String driver = "com.mysql.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/test";
            String user = "root";
            String passwd = "1234";
            Class.forName(driver);
            Connection con = DriverManager.getConnection(url, user, passwd);

            if (con != null && !con.isClosed()) {
                System.out.println("資料庫連線成功！");

                con.close();
            }
        }
        catch(ClassNotFoundException e){
            System.out.println("驅動程式載入錯誤");
        }
        catch(SQLException e2){
            System.out.println("資料庫連線錯誤");
        }

    }

}
