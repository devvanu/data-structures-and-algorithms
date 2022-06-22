// Decimal to Any Base program

import java.util.*;
  
public class Main{
  
  // Driver Function
  public static void main(String[] args) {
      Scanner scn = new Scanner(System.in);
      int n = scn.nextInt(); // taking decimal number
      int b = scn.nextInt(); // taking base
      int dn = getValueInBase(n, b);
      System.out.println(dn);
   }
  
  // Function to Convert Decimal to any Base number
   public static int getValueInBase(int n, int b){
       int convert_num = 0;
       int pos = 0;
       
       // iterating till number become 0
       while(n>0){
           convert_num += (n % b) * Math.pow(10,pos);
           n /= b;
           pos++;
       }
       return convert_num;
   }
   
}
