package javaapplication1_2;

public class JavaApplication1_2 {

    public static void main(String[] args) {
        Car c = new Car();
        // c.run();   此方式run()會被視為一般的方法
        c.start();
        c.go();
        
        Thread t = new Thread();  
        t.start();  //  執行執行緒預設的方法(沒有任何輸出)
    }

}

class Car extends Thread {
    @Override
    public void run() {
        for (long i = 1; i <= 3000_000_000L; i++);  // 空迴圈
        System.out.println("跑跑卡丁車");
    }

    public void go() {
        System.out.println("跑跑計程車");
    }
}
