package javaapplication6_2;

public class JavaApplication6_2 {
    public static void main(String[] args) {
            Pay p[] = new Pay[10];
            for (int i = 0; i < 10; i++) {
            p[i] = new Pay();
            p[i].start();
        }
    }
}

class Pay extends Thread {

    public static int sum = 0;

    public void run() {
            synchronized (Pay.class) {  // synchronized(X.class) 一次只允許一個Pay類別產生的物件執行
            sum += 100;
            System.out.println("帳戶總額：" + sum);
        }
    }
}
