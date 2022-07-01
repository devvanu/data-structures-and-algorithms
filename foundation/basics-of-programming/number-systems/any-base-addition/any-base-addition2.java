/* Any Base Addition Solution
    - Time Complexity: O( log10(max(n1,n2)) )
    - Space Complexity: O(1)
*/

import java.util.*;
  
public class Main{

    public static int getSum(int b, int n1, int n2){
        int result= 0, sum=0, carry= 0, multiplier= 1;
        
        while(n1>0 || n2>0 || carry>0){
            
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            
            sum = (dig1 + dig2 + carry);
            
            result += (sum % b) * multiplier;
            
            multiplier *= 10;
            carry = sum / b;
            n1 /= 10;  n2 /= 10;
        }
        
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int d = getSum(b, n1, n2);
        System.out.println(d);
    }
    
}
