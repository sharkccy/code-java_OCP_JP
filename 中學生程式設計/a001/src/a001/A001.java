package a001;

import java.util.Scanner;

//範例輸入
//world
//C++
//mary
//範例輸出
//hello, world
//hello, C++
//hello, mary
import java.util.Scanner;

public class A001 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
            String s;
            while (sc.hasNext()) {            
            String s1 = sc.next();
            System.out.println("hello, " + s1);
        }

    }

}
