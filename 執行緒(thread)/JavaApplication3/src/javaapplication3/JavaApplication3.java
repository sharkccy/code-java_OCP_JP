package javaapplication3;

public class JavaApplication3 {

    public static void main(String[] args) {
        Test t1 = new Test("A");
        Test t2 = new Test("B");
        System.out.println("t1狀態：" + t1.isAlive());
        System.out.println("t2狀態：" + t2.isAlive());
        t1.start();
        t2.start();

        t1.setPriority(Thread.MAX_PRIORITY);  // 10最高
        t2.setPriority(Thread.MIN_PRIORITY);  // 1最低
        System.out.println("A：" + t1.isAlive());
        System.out.println("B：" + t2.isAlive());
        System.out.println("A優先權：" + t1.getPriority());  //  預設值 = 5
        System.out.println("B優先權：" + t2.getPriority());
    }
}

class Test extends Thread {

    String id;

    public Test(String str) {
        id = str;
    }

    public void run() {
        for (int i = 1; i <= 5; i++) {
            for (long j = 0; j <= 3000_000_000L; j++);  // 空迴圈
            System.out.println(id);
        }
    }
}
