// Any Base To Decimal Solution

import java.util.*;
  
public class Main{
  
    // Function to convert any base to decimal no system
    public static int getValueIndecimal(int n, int b){
        int i= 0, result= 0;
        while(n!=0){
           result += (n % 10) * (int) Math.pow(b, i);
           n /= 10;
           i++;
        }
        return result;
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int b = scn.nextInt();
        int d = getValueIndecimal(n, b);
        System.out.println(d);
    }
    
}
