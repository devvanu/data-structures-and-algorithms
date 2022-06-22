import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();

    // dividing till number become zero
    while (n > 0) {
      System.out.println(n % 10); // printing the remainder of division
      n /= 10;  // updating the number
    }  
  }
  
}
