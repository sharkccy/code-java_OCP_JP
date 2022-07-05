package javaapplication3;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class JavaApplication3 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/data.csv"));
        String s ;
        String[] data ;        
        br.readLine();   //讀標題列
        int sum ;
        while((s = br.readLine()) != null){
            sum = 80;
            data = s.split(",");
            System.out.print("Name :" + data[0]);
            for(int i = 1; i < data.length; i++){                
                if(data[i].equals("o")){
                sum += 10 ;
            }
            else if(data[i].equals("x")){
                sum -= 10 ;
            }                         
          }
            System.out.println("\t出席分數" + sum);
        } 
        br.close();        
    }
}
