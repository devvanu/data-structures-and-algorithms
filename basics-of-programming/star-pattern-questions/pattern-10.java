import java.util.*;

public class Main{

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  // n should be odd always
            
        // initial values of outer_space and inner_space
        int outer_space = n/2;  
        int inner_space = -1; 
        
        for(int row=1; row<=n; row++){
            
            // printing outer_space first
            for(int j=1; j<=outer_space; j++)
                System.out.print("\t");
            
            // printing star now
            System.out.print("*\t"); 
            
            // printing inner_space now
            for(int k=1; k<=inner_space; k++){
                System.out.print("\t");
            }
            
            // printing star again (special condition)
            if(row>1 && row<n)
                System.out.print("*\t");
        
            // checking whether outer_space and inner_space have to be incremented or decremented
            if(row<=n/2){  // for row above and equal to n/2
                outer_space--;  inner_space += 2;
            }else{  // for row below n/2
                outer_space++;  inner_space -= 2;
            }
            
            System.out.println();  // printing next line
        }
    }
    
}
