// Any Base Multiplication Solution

import java.util.*;

public class Main{

    public static int getProduct(int b, int n1, int n2){
        // convert n1 & n2 to dec system
        int decN1= getValueInDecimal(n1, b); 
        int decN2= getValueInDecimal(n2, b);
        
        int prod = decN1 * decN2;
        return getValueInBase(prod, b);
    }
    
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int b = scn.nextInt();
        int n1 = scn.nextInt();
        int n2 = scn.nextInt();
    
        int d = getProduct(b, n1, n2);
        System.out.println(d);
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
