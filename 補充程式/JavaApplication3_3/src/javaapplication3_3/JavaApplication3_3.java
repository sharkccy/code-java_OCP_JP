package javaapplication3_3;

public class JavaApplication3_3 {

    public static void main(String[] args) {
       boolean t = true;        
        first: {
            second: {
                third: {
                    System.out.println("Begin: ");
                    
                    if(t) 
                        break second; 
                    
                    System.out.println("third");
                }
            System.out.println("second");
            }
        System.out.println("first");
        }
    }
}