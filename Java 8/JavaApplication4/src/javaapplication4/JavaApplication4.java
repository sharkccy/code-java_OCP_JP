package javaapplication4;

public class JavaApplication4 {

    public static void main(String[] args) {
        String s1 = "abc";
        String s2 = "ABC";

        System.out.println(s1.equalsIgnoreCase(s2));

        System.out.println(s1.startsWith("a"));

        System.out.println(s2.endsWith("C"));

        System.out.println(s1.contains(""));
    }

}
