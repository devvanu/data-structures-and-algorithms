import java.util.*;

public class Main {

  public static void main(String[] args) {
    System.out.println("*****");
    for(int i=1; i<=3; i++){
        for(int j=1; j<=5-i-1; j++){ System.out.print(" "); }
        System.out.println("*");
    }
    System.out.println("*****");
  }
}
