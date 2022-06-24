// Rotate an Array Solution- shifting the element approach

import java.io.*;
import java.util.*;

public class Main{
    
    // Function to rotate an array
    public static void rotate(int[] ar, int k){
        
        // for k >= array length
        k = k % ar.length;
        
        // handling -ve k values (for left rotation)
        if(k<0) k = ar.length+k;
        
        for(int i=1; i<=k; i++){
            
            int temp = ar[ar.length-1];
            
            // changing the curr val with prev val of an array
            for(int j=ar.length-1; j>=1; j--)
                ar[j] = ar[j-1];
            
            ar[0] = temp;
        }
    }
    
    public static void display(int[] a){
        StringBuilder sb = new StringBuilder();
        for(int val: a){ sb.append(val + " "); }
        System.out.println(sb);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
        int n = Integer.parseInt(br.readLine());
        int[] a = new int[n];
        for(int i = 0; i < n; i++){
           a[i] = Integer.parseInt(br.readLine());
        }
        int k = Integer.parseInt(br.readLine());
    
        rotate(a, k);
        display(a);
    }

}
