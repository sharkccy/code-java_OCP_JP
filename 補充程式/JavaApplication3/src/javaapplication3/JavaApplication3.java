package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        int i, j;
        A:
        for (i = 1; i <= 3; i++) {
            for (j = 1; j <= 3; j++) {
                System.out.println(i + " + " + j + " = " + (i + j));
                if (i + j >= 3) {
                    break A;
                }
            }
        }
    }

}
