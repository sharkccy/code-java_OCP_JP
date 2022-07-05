package javaapplication1;
import java.util.Scanner;
import java.util.regex.Matcher;    // regular expression：正規表示法
import java.util.regex.Pattern;

public class JavaApplication1 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       String s = "I love Taiwan";
       Pattern p1 = Pattern.compile("love");
       Pattern p2 = Pattern.compile("l*ve");    //  * 表示任何的
       Pattern p3 = Pattern.compile("l.ve");    //  . 表示任何一個字元
       Pattern p4 = Pattern.compile("l..ve");   //  . .表示任何兩個字元(依此類推)
       Pattern p5 = Pattern.compile("l[aeiou]ve");  // []表示只要是括號內任何一個字元
       Pattern p6 = Pattern.compile("l[a-m , A-M]ve");  // []表示a-m或是A-M內任何一個字元
       Pattern p7 = Pattern.compile("l[^a-m , A-M]ve"); // [^]表示不是括號內任何一個字元       
       Matcher m = p7.matcher(s);
       if(m.find()){
           System.out.println("在台灣發現真愛!!");
       }
       else{
           System.out.println("Not Found!");
       }
    }

}
