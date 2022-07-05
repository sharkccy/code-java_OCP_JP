package javaapplication3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class JavaApplication3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Std s1 = new Std("Bobo", 70, 56);
        Std s2 = new Std("Dogy", 60, 86);
        Std s3 = new Std("Sean", 90, 75);
        Std s4 = new Std("Vincent", 80, 86);
        Std s5 = new Std("Allen", 80, 56);
        ArrayList<Std> ar = new ArrayList<>();
        ar.add(s1);
        ar.add(s2);
        ar.add(s3);
        ar.add(s4);
        ar.add(s5);
        Collections.sort(ar);
        System.out.println(ar);
        
        Iterator it = ar.iterator();
        while(it.hasNext())
            System.out.println(it.next());
    }

}

class Std implements Comparable<Std> {

    String name;
    int java;
    int php;

    public Std(String name, int java, int php) {
        this.name = name;
        this.java = java;
        this.php = php;
    }

    public int compareTo(Std s) {
        if (this.java > s.java) {
            return -1;  // 遞減排序
        } 
        else if (this.java < s.java) {
            return 1;
        } 
        else {
            if (this.java > s.java) {
                return -1;  // 遞減排序
            } 
            else if (this.java < s.java) {
                return 1;
            }
            return 0;
        }
    }

    public String toString() {
        return "name :" + name + " java :" + java + " php :" + php;
    }
}
