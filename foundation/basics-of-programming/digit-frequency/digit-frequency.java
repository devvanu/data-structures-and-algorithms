import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int d = scn.nextInt();
        int f = getDigitFrequency(n, d);
        System.out.println(f);
    }

    public static int getDigitFrequency(int n, int d) {
        int freq = 0;
        
        // dividing till number becomes 0
        while(n!=0){
            if(n%10==d) freq++;
            n /= 10;
        }
        
        return freq;  // returning frequency of d in n
    }
  
}
