// Pattern 5 solution

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int space = n/2;  int nums= 1;  int line = 1;
        
        for(int row=1; row<=n; row++){    
            int val = line;
            
            // printing spaces
            for(int j=1; j<=space; j++)
                System.out.print("\t");
                
            // printing numbers
            for(int k=1; k<=nums; k++){
                System.out.print(val + "\t");
                if(k <= nums/2)  val++;
                else val--;
            }
                
            System.out.println();  // printing next line
            
            // checking whether spaces and numbers to be incremented or decremented
            if(row <= n/2){ space--;  nums += 2;  line++; }
            else{ space++;  nums -= 2;  line--; }
        }
    }
  
}
