// Pattern13- Pascal's Triangle Pattern

import java.util.*;

public class Main{
  
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for(int i=0; i<n; i++){
            
            // representing Binomial Coefficient C(i, j)
            int iCj = 1;  
            
            for(int j=0; j<=i; j++){
                
                //printing number pattern
                System.out.print(iCj + "\t");
                
                // calculating C(i, j+1) to be printed in next iteration
                iCj = iCj * (i-j) / (j+1);
            }
            
            // printing new line
            System.out.println();
        }
    }
    
}
