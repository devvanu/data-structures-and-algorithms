// Number Pattern-1 Program

import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int sum = 1;
        for(int i=1; i<=n; i++){
            
            // printing numbers
            for(int j=1; j<=i; j++)
                System.out.print(sum++ + "\t");
            
            // printing new Line
            System.out.println();  
        }
    }
    
}
