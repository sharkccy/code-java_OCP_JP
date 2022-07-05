package javaapplication1_3;
import java.util.Scanner;

public class JavaApplication1_3 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       Car c = new Car();
       c.start();
       c.go();

    }

}
class A extends Thread{}
class Car extends A{
    public void run(){
        for(long i = 1; i < 3_000_000_000L;i++);    
        System.out.println("跑跑卡丁車");
    } 
    public void go(){
        System.out.println("跑跑計程車");
    }
}