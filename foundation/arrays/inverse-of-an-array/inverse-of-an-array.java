/* Inverse Of An Array Solution
   - Time Complexity: O(n)- for loop travelled the n sized array 
   - Space Complexity: O(n)- new array (inverse) of size n has been used
*/

import java.io.*;
import java.util.*;

public class Main{
    
    // Function to return Inverse of an Array
    public static int[] inverse(int[] arr){
        
        int inverse[] = new int[arr.length];
        
        // traversing the given array
        for(int index=0; index<arr.length; index++){
            int value = arr[index];
            inverse[value] = index;
        }
        
        return inverse;
    }
    
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
        for(int val: a){ sb.append(val + "\n"); }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
    
        int[] inv = inverse(a);
        display(inv);
    }

}
