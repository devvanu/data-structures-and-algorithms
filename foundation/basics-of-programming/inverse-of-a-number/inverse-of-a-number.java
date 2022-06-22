/*
Approach: taking 2134 as number
    -----------------------------------------------------------
    num/10 --> digit(remd)--> pos -->    inverted
    -----------------------------------------------------------
    2134/10 -->     4     -->  1  -->     0 + 1*10^(4-1) = 1000
    213/10  -->     3     -->  2  -->  1000 + 2*10^(3-1) = 1200
    21/10   -->     1     -->  3  -->  1200 + 3*10^(1-1) = 1203
    2/10    -->     2     -->  4  -->  1203 + 4*10^(2-1) = 1243
    0 (stops here)
    -----------------------------------------------------------
*/

import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(); // taking number

    int pos, inverted;
    pos = inverted = 0;

    while (n > 0) {
      pos++;
      int digit = n % 10;
      n /= 10;
      inverted += pos * Math.pow(10, digit - 1);
    }

    System.out.println(inverted);
  }
  
}
