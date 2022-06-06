import java.util.*;

public class Main{

  public static boolean isPrime(int num) {      
    
    for (int fact = 2; fact <= Math.sqrt(num); fact++) {
      // if num divisible by fact then num is not a prime
      if (num % fact == 0) return false;
    }
    
    // if found no factor then it is a prime
    return true;
  }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int low = sc.nextInt();
        int high = sc.nextInt();
        
        for(int elem=low; elem<=high; elem++){
            if(isPrime(elem)) System.out.println(elem);
        }
    }
    
}
