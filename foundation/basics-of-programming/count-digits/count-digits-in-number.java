import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int dCnt = 0;  // digit counts
    
    // divide till quotient become 0 and count
    while(n!=0){  
        n /= 10;  
        dCnt++;
    }
    System.out.println(dCnt);
    
  }
}
