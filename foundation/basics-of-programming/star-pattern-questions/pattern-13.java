// Pattern 13 Solution

import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  // n should be odd
        
        for(int row=1; row<=n; row++){
            
            for(int col=1; col<=n; col++){
                
                if(row == 1){  // first row
                    if( col <= n/2+1 || col == n ) System.out.print("*\t");
                    else System.out.print("\t");
                }
                
                else if(row <= n/2){  // between first and middle row
                    if( col == n/2+1 || col == n ) System.out.print("*\t");
                    else System.out.print("\t");
                }
                
                else if(row == n/2 + 1)  // middle row
                    System.out.print("*\t");
            
                else if(row < n){  // between middle and last row
                    if( col == 1 || col == n/2+1 ) System.out.print("*\t");
                    else System.out.print("\t");
                }
                
                else{  // last row
                    if( col == 1 || col >= n/2+1 ) System.out.print("*\t");
                    else System.out.print("\t");
                }
            }
            
            System.out.println();  // printing new line
        }
    }
     
}
