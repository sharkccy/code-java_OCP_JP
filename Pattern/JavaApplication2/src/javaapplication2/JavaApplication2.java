package javaapplication2;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class JavaApplication2 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = "I love Taiwan, I live here";
       Pattern p = Pattern.compile("l.ve");
       Matcher m = p.matcher(s);
       while(m.find()){
           System.out.println(m.group());   //輸出符合的字
       }
    }

}
