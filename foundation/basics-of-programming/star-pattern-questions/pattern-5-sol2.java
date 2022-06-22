import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  // n should be odd always
        
        // initial values of space and star
        int space = n/2;  
        int star = 1; 
        
        for(int row=1; row<=n; row++){
            
            // printing space first
            for(int j=1; j<=space; j++)
                System.out.print("\t");
            
            // printing starts now
            for(int k=1; k<=star; k++)
                System.out.print("*\t");
                
            // checking whether space and star have to be incremented or decremented
            if(row<=n/2){  // for row above and equal to n/2
                space--;  star += 2;
            }else{        // for row below n/2
                space++;  star -= 2;
            }
            
            System.out.println();  // for next line
        }
    }
    
}
