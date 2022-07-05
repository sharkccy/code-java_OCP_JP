package javaapplication4;

public class JavaApplication4 {
    public static void main(String[] args) {
        String s1 = "   Hi, ";
        String s2 = "  Bill. How are   you?    ";
        
        System.out.println(s1 + s2);
        
        System.out.println(s1.trim() + s2.trim());  // trim()可以去除字串前後的空白
        
        System.out.println(s1.trim() + s2.trim().replaceAll("\\s", ""));
        
        System.out.println(s1.trim() + s2.trim().replaceAll("\\s", " ")); //   \\s 表示一個空白鍵
        
        System.out.println(s1.trim() + " " + s2.trim().replaceAll("\\s+", " "));  //   \\s+ 表示連續多個空白鍵
      
    }

}
