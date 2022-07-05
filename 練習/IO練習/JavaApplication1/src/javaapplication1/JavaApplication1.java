package javaapplication1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.TreeSet;

public class JavaApplication1 {

    public static void main(String[] args) {
        TreeSet<String> ts = new TreeSet();
        String str;
        String[] data;
        String en;
        int i = 0, grade = 0;
        String[] right = new String[5]; // 記錄答對的題號
        while (ts.size() < 3) {
            int no;
            no = (int) ((Math.random() * 10) + 1);  // 產生3個1-10且不重複的字串
            ts.add(no + "");
        }
        while (ts.size() < 5) {
            int no;
            no = (int) ((Math.random() * 5) + 11);  // 產生2個11-15且不重複的字串
            ts.add(no + "");
        }

        try {
            Scanner sc = new Scanner(System.in);
            BufferedReader br = new BufferedReader(new FileReader("src/exam.csv"));
            BufferedWriter bw = new BufferedWriter(new FileWriter("src/out.txt"));
            while ((str = br.readLine()) != null) {
                data = str.split(",");
                for (String a : ts) {
                    if (a.equals(data[0])) {    // 判斷題號是否與ts挑選的相同
                        System.out.println(data[1]);
                        en = sc.next();
                        if (en.equals(data[2])) {
                            grade = grade + Integer.parseInt(data[3]);
                            right[i] = data[0];     
                            i++;
                        }
                    }
                }
            }
            System.out.println("Grade : " + grade);           
            bw.write("得分 : " + grade );
            bw.newLine();
            bw.write("答對題號 : ");
            for(String a : right){
                if(a != null){
                    bw.write(a + "   ");
                }
            }
            bw.close();
        } 
        catch (FileNotFoundException e1) {
            System.out.println("檔案開啟失敗");
        } 
        catch (IOException e2) {
            System.out.println("檔案讀取失敗");
        } 
        catch (ArrayIndexOutOfBoundsException e3) {
            System.out.println("檔案內容排版錯誤");
        }

    }

}
