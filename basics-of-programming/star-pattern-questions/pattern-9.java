import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  // n should be odd always
        
        for(int i=1; i<=n; i++){
            
            for(int j=1; j<=n; j++){
                
                // printing stars
                if(i==j || j==n-i+1)
                    System.out.print("*\t");
                    
                // printing spaces
                else
                    System.out.print("\t");
            }
            
            System.out.println();  // printing new line
        }
    }
  
}
