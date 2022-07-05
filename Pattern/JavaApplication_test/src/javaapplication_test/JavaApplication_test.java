package javaapplication_test;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaApplication_test {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        BufferedReader br = new BufferedReader(new FileReader("src/data.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("src/out.txt"));
        String s;
        Pattern p = Pattern.compile("劉德華");
        while((s = br.readLine()) != null){
            Matcher m = p.matcher(s);
            if(m.find()){
                s = m.replaceAll("Andy");                
            }
            bw.write(s);
            bw.newLine();
        }
        bw.close();
        br.close();
        System.out.println("資料替換完畢");
    }

}
