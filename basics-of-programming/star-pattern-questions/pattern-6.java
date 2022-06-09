import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        int star = n/2 + 1;
        int space = 1;

        for(int row=1; row<=n; row++){
            
            // printing stars
            for(int j=1; j<=star; j++)
                System.out.print("*\t");
            
            // printing spaces
            for(int k=1; k<=space; k++)
                System.out.print("\t");
                
            // printing stars again
            for(int l=1; l<=star; l++)
                System.out.print("*\t");
            
            // checking whether star has to be incremented or decremented
            if(row<=n/2){
                star--;  space+=2;
            } else{
                star++;  space-=2;
            }
            
            System.out.println();  // printing new line
        }
    }
  
}
