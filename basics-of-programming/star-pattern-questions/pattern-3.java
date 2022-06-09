import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();

    for(int i=1; i<=n; i++){
        // printing space first
        for(int j=1; j<=(n-i); j++)
            System.out.print("\t");
        // printing stars now
        for(int k=1; k<=i; k++)
            System.out.print("*\t");
        System.out.println();
    }
  }

}
