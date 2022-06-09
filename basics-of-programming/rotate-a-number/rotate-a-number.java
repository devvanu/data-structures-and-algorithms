import java.util.*;

public class Main {
    
    // Function to count the digits in a number
    static int digitCount(int num){
        int count = 0;
        while (num != 0) {
          num /= 10;
          count ++;
        }  
        return count;
    }

  public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int n= sc.nextInt();
       int k= sc.nextInt();
      
       // finding no of digits in a number
       int digits = digitCount(n);
       
       // for k >= digits of a number
       k = k % digits;
       
       // for -ve value of k
       if(k<0){
           k += digits;
       }
       
       // finding rotated value by taking +ve k in consideration first
       int divisor = (int) Math.pow(10, k);
       int rotValue = (n % divisor) * (int)Math.pow(10, digits-k) 
                      + (n / divisor);
       System.out.println(rotValue);
   }
  
}
