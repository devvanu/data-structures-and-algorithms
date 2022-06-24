/* Any Base To Any Base Solution
   - Time Complexity: O(log10(n)+log10(n)) = O(log10(n))
   - Space Complexity: O(1)- as have to store few variables
*/

import java.util.*;
  
public class Main{
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int sourceBase = scn.nextInt();
        int destBase= scn.nextInt();
        
        // fist of all, convert the number in source Base to decimal system
        int decVal = getValueInDecimal(n, sourceBase);
        
        // Now, convert the decimal system to number in destination Base
        int result = getValueInBase(decVal, destBase);
        
        System.out.println(result);
    }
    
    // Function to Convert any base to decimal no system
    public static int getValueInDecimal(int n, int b){
        int i= 0, result= 0;
        while(n!=0){
           result += (n % 10) * (int) Math.pow(b, i);
           n /= 10;  i++;
        }
        return result;
    }
    
    // Function to Convert Decimal to any Base number
    public static int getValueInBase(int n, int b){
       int convert_num = 0, pos = 0;
       while(n>0){
           convert_num += (n % b) * Math.pow(10,pos);
           n /= b;  pos++;
        }
       return convert_num;
    }

}
