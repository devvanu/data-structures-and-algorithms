import java.util.*;

public class Main {

  // function to check input number is prime or not
  public static boolean isPrime(int num) {      
    /* Aim:
    if found any factor between 2 and its square root then it is not prime
    */
    for (int fact = 2; fact <= Math.sqrt(num); fact++) {
      // if num divisible by fact (means fact is factor of num)
      // then num is not a prime
      if (num % fact == 0) return false;
    }
    
    // if found no factor then it is a prime
    return true;
  }
  
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // taking the total no of inputs
    int t = scn.nextInt();

    for (int i = 0; i < t; i++) {
      // taking all the inputs, t no of times
      int inpt = scn.nextInt();

      // if input i prime then print "prime" otherwise "not prime"
      if (isPrime(inpt)) System.out.println("prime");
      else System.out.println("not prime");
    }
  }

}
