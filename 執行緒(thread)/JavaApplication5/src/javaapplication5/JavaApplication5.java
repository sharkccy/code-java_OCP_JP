package javaapplication5;

public class JavaApplication5 {
    public static void main(String[] args) {
        Test t1 = new Test("t1");
        Test t2 = new Test("t2");
        Test t3 = new Test("t3");
        t1.start();
             
        try{
            t1.join();          // 後面的執行緒必須等到t1執行緒結束才執行
        }
        catch (InterruptedException e) {
                System.out.println("join()錯誤");
        }
        t2.start();   
    }

}


class Test extends Thread {

    String id;

    public Test(String id) {
        this.id = id;
    }

    @Override
    public void run() {
        for (int i = 1; i <= 5; i++) {
            try {
                sleep(700);
                System.out.println(id);
            } 
            catch (InterruptedException e) {
                System.out.println("sleep()錯誤");
            }
        }
    }
}