import java.util.*;
    
public class Main{
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int dividend = num1; 
        int divisor = num2;
        
        while( dividend % divisor != 0){
            int remd = dividend % divisor;
            dividend = divisor;
            divisor = remd;
        }
        
        int gcd = divisor;
        int lcm = (num1*num2)/gcd;
        
        System.out.print(gcd + "\n" + lcm);
    }
     
}
