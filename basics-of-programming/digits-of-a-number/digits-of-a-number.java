import java.util.*;

public class Main {
 
  // Function to find the digits in a number
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

    int n = sc.nextInt();
    
    // finding the no of digits in a number
    int dCnt = digitCount(n);
    
    int divisor = (int)Math.pow(10,dCnt-1);
    
    // dividing till divisor become zero
    while(divisor != 0){
        System.out.println( n/ divisor);  // printing the quotient
        n %= divisor;  // updating the number by remainder of above divison
        divisor /= 10;  // updating the divisor 
    }
    
  }
  
}
