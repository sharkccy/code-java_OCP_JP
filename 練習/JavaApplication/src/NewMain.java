
import java.util.Scanner;

public class NewMain {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();

        while (round-- != 0) {
            int no = sc.nextInt();
            int[] m = new int[10];
            int i;
            for (i = 1; i <= no; i++) {
                int n = i;
                while (n != 0) {
                    int x = n % 10;
                    m[x]++;
                    n = n / 10;
                }
            }
            for (int p : m) {
                System.out.print(p + " ");
            }
            System.out.println("");
        }
    }
}
