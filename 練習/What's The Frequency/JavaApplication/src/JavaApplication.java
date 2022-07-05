import java.util.Scanner;

public class JavaApplication {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "";
        int[] m;
        int i;
        while (true) {            
            m = new int[52];
            s = sc.nextLine();
            if(s.equals("0"))
                break;
            for (i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (ch >= 'A' && ch <= 'Z') {
                    m[ch - 'A']++;
                }
                if (ch >= 'a' && ch <= 'z') {
                    m[ch - 'a' + 26]++;
                }
            }

            int max = m[0];
            for (int n : m) {
                if (n > max) {
                    max = n;
                }
            }

            for (i = 0; i < m.length; i++) {
                if (m[i] == max) {
                    if (i < 26) {
                        System.out.print((char) (i + 'A'));
                    } else {
                        System.out.print((char) (i - 26 + 'a'));
                    }
                }
            }
            System.out.println(" " + max);
        }
    }
}
