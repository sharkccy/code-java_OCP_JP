package a003;
import java.util.Scanner;
//M=月
//D=日 
//S=(M*2+D)%3
//得到 S 的值，再依照 S 的值從 0 到 2 分別給與 普通、吉、大吉 等三種不同的運勢
//範例輸入
//1 1
//1 2
//範例輸出
//普通
//吉

public class A003 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int M = sc.nextInt();
            int D = sc.nextInt();
            int S = (M * 2 + D) % 3;
            if (S == 0) {
                System.out.println("普通");
                break;
            } 
            else if (S == 1) {
                System.out.println("吉");
                break;
            } 
            else if (S == 2) {
                System.out.println("大吉");
                break;
            }
        }
    }
}
