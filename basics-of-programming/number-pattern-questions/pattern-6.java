// Pattern 6 solution

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int space = 2*n - 3, lastNum = 1;
        for(int i=1; i<=n; i++){
            
            // printing numbers
            for(int j=1; j<=i; j++)
                System.out.print(j + "\t");
                
            // printing space
            for(int k=1; k<=space; k++)
                System.out.print("\t");
                
            // printing numbers again
            if(i!=n){
                for(int l=i; l>=1; l--)
                    System.out.print(l + "\t");
            }
            else{  // for last line only
                for(int l=i-1; l>=1; l--)
                    System.out.print(l + "\t");
            }                
            
            // printing nextline
            System.out.println();
            
            space -= 2;
        }
    }
    
}
