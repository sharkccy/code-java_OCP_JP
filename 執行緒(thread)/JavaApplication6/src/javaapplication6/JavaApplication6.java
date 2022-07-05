package javaapplication6;

public class JavaApplication6 {
    public static void main(String[] args) {
pay[] p = new pay[10];
        for(int i = 0; i < p.length; i++){
            p[i] = new pay();
            p[i].start();
        }
    }
}

class Bank {

    public static int sum = 0;

    public static synchronized void add(int NT) {   // 限制每次只能有一個執行緒執行此方法
        sum = sum + NT;
        System.out.println("帳戶總額 = " + sum);
    }
}

class pay extends Thread {

    @Override
    public void run() {
        Bank.add(100);
    }
}