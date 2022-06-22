// Pattern 11 solution

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int stars = 1;
        for(int row=1; row<=n; row++){
            
            // printing spaces & stars
            for(int j=1; j<=n/2; j++){
                if(row != n/2+1)     // checking non middle row 
                    System.out.print("\t");
                else System.out.print("*\t");
            }
            
            // printing stars
            for(int k=1; k<=stars; k++)
                System.out.print("*\t");
            
            // checking whether stars has to be incremented or not
            if(row <= n/2) stars++;
            else stars--;
            
            System.out.println();  // printing new line
        }
    }
    
}
