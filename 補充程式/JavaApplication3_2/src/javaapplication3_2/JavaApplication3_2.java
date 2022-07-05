package javaapplication3_2;

public class JavaApplication3_2 {

    public static void main(String[] args) {
        int i, j;

        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
                if (i + j >= 3) {
                    return;
                }
            }
        }
    }
    
   
}
