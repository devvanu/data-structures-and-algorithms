// Rotate an Array Solution- reversing the array approach

import java.io.*;
import java.util.*;

public class Main{
    
    public static void reverse(int arr[], int li, int ri){
        while(li < ri){
            int temp= arr[li];  arr[li] = arr[ri];  arr[ri] = temp;
            li++;  ri--;
        }
    }
    
    // Function to rotate an array
    public static void rotate(int[] ar, int k){
        
        // for k >= array length
        k = k % ar.length;
        
        // handling -ve k values (for left rotation)
        if(k<0) k += ar.length;
        
        // reverse the 1st part
        reverse(ar, 0, ar.length-k-1);
        
        // reverse the 2nd part
        reverse(ar, ar.length-k, ar.length-1);
        
        // now reverse the entire array
        reverse(ar, 0, ar.length-1);
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
