import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        
        for (int i = 1; i <= n; i++) {
          
            // printing spaces
            for(int j = 1; j <= i - 1; j++)
                System.out.print("\t");

            // printing stars and new line
            System.out.println("*\t");
        }
    }
    
}
