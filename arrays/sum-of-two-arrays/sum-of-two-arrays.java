// Sum Of Two Arrays program

import java.io.*;
import java.util.*;

public class Main{
    
    // Function to print the sum of two arrays
    public static void sumOfArrays(int arr1[], int size1, int arr2[], int size2){
        int sum[] = new int[size1>size2? size1: size2];
        
        int i = size1- 1, j = size2- 1, k = sum.length-1; 
        int carry = 0;
        
        // traverse both arrays till their last element
        while(i>=0 || j>=0){
            int total = carry;
            
            if(i >= 0) total += arr1[i];
            if(j >= 0) total += arr2[j];
            
            sum[k] = total % 10;  // storing the value at ones pos only
            carry = total / 10;
            
            i--;  j--; k--;
        }
        
        // (special case) if carry > 0 at last pos, just print it
        if(carry > 1) System.out.println(carry);
        
        // printing the sum of arrays
        for(int elem: sum)  System.out.println(elem);
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // Array 1
        int n1 = Integer.parseInt(br.readLine());  // size of array 1
        int a1[] = new int[n1];
        for(int i=0; i<n1; i++) a1[i] = Integer.parseInt(br.readLine());
        
        // Array 2
        int n2 = Integer.parseInt(br.readLine());  // size of array 2
        int a2[] = new int[n2];
        for(int i=0; i<n2; i++) a2[i] = Integer.parseInt(br.readLine());
        
        // Calling function to sum the arrays
        sumOfArrays(a1, n1, a2, n2);
    }

}
