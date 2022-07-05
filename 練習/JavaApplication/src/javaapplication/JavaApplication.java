package javaapplication;

import java.util.Scanner;

public class JavaApplication {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
        String[] m = time.split(":");
        int hour = Integer.parseInt(m[0]);
        int minute = Integer.parseInt(m[1]);
    }

}
