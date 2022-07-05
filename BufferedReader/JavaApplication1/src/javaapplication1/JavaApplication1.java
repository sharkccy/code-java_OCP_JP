package javaapplication1;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class JavaApplication1 {
    public static void main(String[] args) throws FileNotFoundException, IOException {
       Scanner sc = new Scanner(System.in);
       FileReader fr = new FileReader("src/data.txt");
       BufferedReader br = new BufferedReader(fr);
       String str;
       while((str = br.readLine())!= null){
           System.out.println(str);
       }
       fr.close();
       br.close();
    }

}
