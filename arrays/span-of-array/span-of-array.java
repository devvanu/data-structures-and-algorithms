// Span Of Array program

import java.io.*;
import java.util.*;

public class Main{

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i=0; i<arr.length; i++){
            // taking array values
            arr[i] = sc.nextInt();
            
            // finding max and min values
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        
        // Finding the difference between max and min values (span)
        System.out.println(max-min);
    }
    
}
