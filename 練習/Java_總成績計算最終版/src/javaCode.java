
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class javaCode {

    public static void main(String[] args) {
        String[] std;
        String[] name;
        String str;
        double[] score;
        int idx = 0;
        try {
            Path path = Paths.get("src/data.csv");
            long line = Files.lines(path).count();
            int no = (int) line;  // 計算檔案列數    
            score = new double[no-1];        
            name = new String[no-1];            
             BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("src/data.csv"),"UTF-8"));   // 可讀中文
             String line1 = br.readLine();  // 讀取第一列(標題)
             
             while ((str = br.readLine()) != null) {
                std = str.split(",");
                name[idx] = std[0];
                for (String s : std) {
                    if (s.equals("x")) {
                        score[idx] -= 10;  // 注意這邊要使用idx
                    }
                    else if (s.equals("o")) {
                        score[idx] += 10;
                    }
                }            
                score[idx] = (100 + score[idx]) * 0.3 + (Integer.parseInt(std[std.length - 2]) * 0.3) + (Integer.parseInt(std[std.length - 1]) * 0.4);
                // 出席率、期中考：30%   期末考：40%   
                idx++;
            }
            System.out.print("姓名：\t");
            for (int i = 0; i < name.length; i++) {
                System.out.print(name[i] + "\t");
            }
            System.out.println();
            System.out.print("總分：\t");
            for (int i = 0; i < score.length; i++) {
                System.out.print(score[i] + "\t");
            }          
        } 
        catch (IOException e) {
            System.out.println(e);
        }
    }
}
