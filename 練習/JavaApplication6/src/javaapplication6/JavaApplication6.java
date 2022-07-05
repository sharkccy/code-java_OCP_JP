package javaapplication6;

import java.util.Scanner;

public class JavaApplication6 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String time = sc.next();
 
        while (!time.equals("0:00")) {           
            String[] m = time.split(":");
            int hour = Integer.parseInt(m[0]);
            int minute = Integer.parseInt(m[1]);
            double hr = hour * 30 + (minute / 60.0 * 30);
            double mn = minute * 6;
            double angle =Math.abs(hr - mn);
            if (angle > 180) {
                angle = 360 - angle;
            }           
            System.out.printf("%.3f\n", angle);  
            time = sc.next();
        }
    }
}
