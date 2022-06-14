// The Curious Case Of Benjamin Bulbs program

import java.util.*;
  
public class Main{
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        
        /* 
          If a bulb had an odd number of factors, 
          then it would participate in an odd number of cycles
          and hence, would be kept on.
          also, all perfect square numbers have odd numbers of factors.
        */
        
        // so printing all perfect squares up to input
        for(int i= 1; i*i<=n; i++){
            System.out.println(i*i);
        }
    }
}
