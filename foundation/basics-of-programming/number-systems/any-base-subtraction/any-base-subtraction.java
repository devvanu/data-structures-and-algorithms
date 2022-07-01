/* Any Base Subtraction Solution
    - Time Complexity: O( log10(n) ) | n= no of digits in n2 
    - Space Complexity: O(1)
*/

import java.util.*;
  
public class Main{
    
    public static int getDifference(int b, int n1, int n2){
        
        int result= 0, carry= 0, multiplier= 1;
        
        while(n2>0){
        
            int dig1 = n1 % 10;
            int dig2 = n2 % 10;
            
            int diff= dig2 + carry - dig1;
            
            if(diff < 0){ carry= -1; diff += b; } 
            else{ carry= 0; }
            
            result += diff * multiplier;
            
            multiplier *= 10;
            n1 /= 10;  n2 /= 10;
        }
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
        
        int d = getDifference(b, n1, n2);
        System.out.println(d);
    }
    

}
