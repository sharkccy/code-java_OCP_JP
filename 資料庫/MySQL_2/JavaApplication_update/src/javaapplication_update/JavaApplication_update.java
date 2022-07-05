package javaapplication_update;
import java.util.Scanner;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
public class JavaApplication_update {
    public static void main(String[] args) throws ClassNotFoundException, SQLException  {
       Scanner sc = new Scanner(System.in);
       String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost:3306/test";
        String user = "root";
        String passwd = "1234";
        Class.forName(driver);
        Connection con = DriverManager.getConnection(url, user, passwd);
               
        System.out.println("請輸入要修改email的會員id");
        int id = sc.nextInt();
        System.out.println("請輸入email");
        String mail = sc.next();
        
        String str = "UPDATE std SET email = ? WHERE ID = ? ";
        PreparedStatement ps = con.prepareStatement(str);
        ps.setString(1, mail);   // 1表示上面SQL語法的第一個問號
        ps.setInt(2, id);
        int n = ps.executeUpdate();
        if(n > 0){
            System.out.println("更新完畢");
        }
        else{
            System.out.println("更新失敗");
        }           
        con.close();
    }

}
