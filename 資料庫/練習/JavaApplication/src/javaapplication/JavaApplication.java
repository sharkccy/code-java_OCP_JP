package javaapplication;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.util.TreeSet;

public class JavaApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String na = "";
        String en = "";
        int sum;
        int star[] = new int[15];
        String right = "";
        String num = "";
        TreeSet<Integer> ts = new TreeSet<>();
        while (ts.size() < 3) {
            ts.add((int) (Math.random() * 10) + 1);  // 1-10隨機挑3題                       
        }
        while (ts.size() < 5) {
            ts.add((int) (Math.random() * 5) + 11);  // 11-15隨機挑2題        
        }
        int[] test = new int[5];
        int i = 0;
        for (int x : ts) {
            test[i] = x;
            i++;
        }
        int select = 0;
        while (select != 3) {
            System.out.println("1.作答  2.統計結果  3.結束");
            select = sc.nextInt();
            
            try {
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/test";
                String user = "root", passwd = "1234";
                Class.forName(driver);
                Connection con = DriverManager.getConnection(url, user, passwd);
                Statement st = con.createStatement();

                if (select == 1) {
                    sum = 0;
                    num = "";
                    System.out.println("請輸入名字：");
                    na = sc.next();
                    String s = "SELECT * FROM exam";
                    ResultSet rs = st.executeQuery(s);
                    while (rs.next()){
                        for(int m : test){
                            if(m == rs.getInt("no")){
                                System.out.println(rs.getString("test"));
                                en = sc.next();
                                if(en.equals(rs.getString("ans"))){
                                    sum += rs.getInt("score");
                                    num += rs.getInt("no") + ", ";
                                }
                            }
                        }
                    } 
                    System.out.println("sum = " + sum);
                    
                    // ====== 以下是將作答結果寫入資料表的程式碼 ==========================
                    try{
                        String str = "INSERT INTO math (name, score, no) VALUES (" + "'" + na + "'," + sum + "," + "'" + num + "'" + ")";
                        st.execute(str);
                    }
                    catch(SQLException sq){
                        System.out.println("資料寫入錯誤");
                    }                    
                } 
                 else if (select == 2) {
                    try {
                        String s3 = "SELECT no FROM math";
                        ResultSet rs2 = st.executeQuery(s3);
                        while (rs2.next()) {
                            String[] no2 = rs2.getString("no").split(", ");
                            for (i = 0; i < 15; i++) {
                                for (String s4 : no2) {
                                    if (Integer.parseInt(s4) == i + 1) {
                                        star[i]++;
                                    }
                                }
                            }
                        }
                        System.out.println("答對題號統計：");
                        for (i = 0; i < 15; i++) {
                            System.out.print(i + 1 + "\t：");
                            for (int j = 1; j <= star[i]; j++) {
                                System.out.print("*");
                            }
                            System.out.println();
                        }
                    } 
                    catch (SQLException ee2) {
                        System.out.println("輸出統計錯誤");
                    }
                }
            } 
            catch (ClassNotFoundException e2) {
                System.out.println("驅動程式錯誤!!");
            }
            catch (NumberFormatException e3) {
                System.out.println("輸入格式錯誤!!");
            }
            catch (SQLException e4) {
                System.out.println("資料庫連線錯誤!!");
            }            
        }
    }
}
