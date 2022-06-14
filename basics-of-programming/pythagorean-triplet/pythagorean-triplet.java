// pythagorean triplet program

import java.util.*;

public class Main {
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // finding maximum value 
        int max = a>b? a: b>c? b: c;
        
        // checking numbers are following pythagorean property or not
        if(max == a)
            System.out.println(b*b + c*c == a*a);
        else if(max == b)
            System.out.println(a*a + c*c == b*b);
        else
            System.out.println(a*a + b*b == c*c);
        
        sc.close();
    }
    
}
