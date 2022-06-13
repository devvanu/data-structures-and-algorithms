// number pattern-2 program

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int first= 0, second= 1;
        
        for(int i=1; i<=n; i++){
            
            // printing numbers
            for(int j=1; j<=i; j++){
                System.out.print(first + "\t");
                int third = first + second;
                first = second;   second = third;
            }
            
            // printing new line
            System.out.println(); 
        }
    }
    
}
