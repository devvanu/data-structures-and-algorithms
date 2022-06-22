// Difference Of Two Arrays solution

import java.io.*;
import java.util.*;

public class Main{
    
    // Function to print the difference of two arrays
    public static void diffOfArrays(int arr1[], int size1, int arr2[], int size2){
        
        int diff[] = new int[size2];  // size of larger array, arr2
        int carry = 0;
        
        for(int i=size2-1, j=size1-1, k=diff.length-1;  i>=0;  i--, j--, k--){
            
            // handing if no number present in array1 to get subtracted
            int n1 = j >=0 ? arr1[j] : 0;
            
            if( arr2[i]+carry >= n1){ 
                diff[k]= arr2[i] + carry - n1; 
                carry = 0;
            }  
            else{  // when array2 value can't subtract array1
                diff[k] = arr2[i] + carry + 10 - n1;
                carry = -1;
            }
        }
        
        // handling preceding zeroes that should not be printed 
        int index= 0;
        while(index<=diff.length  &&  diff[index]==0){
            index++;    // finding index no of first non-zero number
        }
        
        // printing the difference of arrays
        while(index < diff.length){
            System.out.println( diff[index++] );
        }
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
        
        // Calling function to subtract the arrays
        diffOfArrays(a1, n1, a2, n2);
    }

}
