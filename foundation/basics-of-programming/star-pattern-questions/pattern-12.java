// Pattern 12 solution

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int stars= n, spaces= 0;
        for(int row=1; row<=n; row++){
            
            // printing spaces
            for(int j=1; j<=spaces; j++)
                System.out.print("\t");
            
            // printing stars
            for(int k=1; k<=stars; k++){
                // for upper half rows and middle columns
                if(row>1 && row<=n/2   &&   k>1 && k<stars)
                    System.out.print("\t");
                else 
                    System.out.print("*\t");
            }
                
            // checking whether stars & spaces have to be incremented or decremented
            if(row <= n/2){ stars -= 2;  spaces++; }
            else{ stars += 2;  spaces--; }
            
            System.out.println();  // printing new line
        }
    }
    
}
