// Star Pattern 14 Solution

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  // n should be odd
        
        for(int row=1; row<=n; row++){
            
            for(int col=1; col<=n; col++){
                
                // for first and last columns
                if(col==1 || col==n)  
                    System.out.print("*\t");
                
                // for second half rows and diagonal columns
                else if( row >= n/2+1  &&  (col == row || col == n-row+1) )
                    System.out.print("*\t");
                    
                else System.out.print("\t");
            }
            
            System.out.println();  // printing new line
        }
    }
    
}
