package javaapplication4;

public class JavaApplication4 {
    public static void main(String[] args) {
        Car c = new Car();       
        c.start();
        c.go();
    }

}

class Car extends Thread {
    @Override
    public void run() {
        try{
            sleep(1500);  // 單位是毫秒
            System.out.println("跑跑卡丁車");
        }  
        catch(InterruptedException e){
            System.out.println(e);
        }        
    }

    public void go() {
        System.out.println("跑跑計程車");
    }
}