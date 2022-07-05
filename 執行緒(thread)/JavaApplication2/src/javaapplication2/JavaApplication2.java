package javaapplication2;

public class JavaApplication2 {
    public static void main(String[] args) {  // (1)
        Car c = new Car();
        //c.start();  錯  start()是Thread類別提供的
        Thread t = new Thread(c);
        t.start();    // (2)
        c.go();
        
        new Thread().start();    // (3) 沒有結果輸出
        new Thread(new Car()).start();    // (4)
        // 此程式共產生4個執行緒
    }

}

class A {}

class Car extends A implements Runnable {   
    @Override
    public void run() {  // 改寫 Runnable介面的方法
        for (long i = 1; i <= 3000_000_000L; i++);  // 空迴圈
        System.out.println("跑跑卡丁車");
    }

    public void go() {
        System.out.println("跑跑計程車");
    }
}