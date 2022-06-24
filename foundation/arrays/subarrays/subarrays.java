/* Print all Sub Arrays of an Array
   - Time Complexity: O(n^3)- for loop travelled the n sized array 3 times
   - Space Complexity: O(1)- no extra space is used
*/

import java.io.*;
import java.util.*;

public class Main{
    
    // Function to print all subarrays of the given array
    public static void subarray(int[] arr){
        
        // traversing the entire given array
        for(int i=0; i<arr.length; i++){
            
            for(int k=i; k<arr.length; k++){ // traversing the entire array from ith pos
                
                for(int l=i; l<=k; l++)  // printing that subarray
                    System.out.print(arr[l] + "\t");
                
                System.out.println();  // printing the new line
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
        
        subarray(a);
    }

}
