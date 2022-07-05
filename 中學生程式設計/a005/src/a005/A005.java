package a005;

import java.util.Scanner;

public class A005 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            int no = sc.nextInt();
            int i ;
            int[] m = new int[no * 4];       
            for (i = 0; i < m.length; i++) {
                m[i] = sc.nextInt();
            }
            A :for (i = 0; i < m.length; i++) {
                if(m[i+1] - m[i] == m[i+2] - m[i+1] ){
                    System.out.print(m[i] + " "); 
                    System.out.print(m[i+1] + " "); 
                    System.out.print(m[i+2]+ " "); 
                    System.out.print(m[i+3]+ " "); 
                    System.out.print(m[i+3]+(m[i+1]-m[i])); 
                    break A ;
                }
            }
            B:for (i = 0; i < m.length; i++) {
                if(m[i+1] / m[i] == m[i+2] / m[i+1] ){
                    System.out.print(m[i]); 
                    System.out.print(m[i+1]); 
                    System.out.print(m[i+2]); 
                    System.out.print(m[i+3]); 
                    System.out.print(m[i+3]*(m[i+1]/m[i])); 
                    break B;
                    }
                }            
        }
    }

}
