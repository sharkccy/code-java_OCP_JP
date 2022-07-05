package javaapplication1;

import java.util.ArrayList;
import java.util.Collections;

public class JavaApplication1 {

    public static void main(String[] args) {
        ArrayList<Integer> ar = new ArrayList<>();
        ar.add(3);
        ar.add(4);
        ar.add(2);
        ar.add(1);
        System.out.println(ar);
        Collections.sort(ar);
        System.out.println(ar);

        ArrayList<String> ar2 = new ArrayList<>();
        ar2.add("yamaha");
        ar2.add("kymco");
        ar2.add("sym");
        System.out.println(ar2);
        Collections.sort(ar2);
        System.out.println(ar2);

    }

}
