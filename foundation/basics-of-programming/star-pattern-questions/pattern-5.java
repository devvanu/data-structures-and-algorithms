import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();  // n should be odd always
        
        int l = n/2 + 1;  // dividing pattern to two halves

        // for upper half
        for(int i=1; i<=l; i++){
            
            // printing space first
            for(int j=1; j<=l-i; j++)
                System.out.print("\t");
                
            // printing stars now
            for(int k=1; k<=2*i-1; k++)
                System.out.print("*\t");
            System.out.println();
        }
        
        // for lower half
        for(int i=l-1; i>=1; i--){
            
            // printing space first
            for(int j=1; j<=l-i; j++)
                System.out.print("\t");
            
            // printing stars now
            for(int k=1; k<=2*i-1; k++)
                System.out.print("*\t");
            System.out.println();
        }

    }
}
