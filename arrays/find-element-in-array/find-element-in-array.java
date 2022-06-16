// Find Element In An Array program

import java.io.*;
import java.util.*;

public class Main{
    
    // Function to Find Element in Array
    public static int findElem(int arr[], int d){
        for(int i=0; i<arr.length; i++)
            if(arr[i]==d)
                return i;
        return -1;
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();  // no of elements
        
        int arr[] = new int[n];
        for(int i=0; i<arr.length; i++) // taking array input values
            arr[i] = sc.nextInt();
        
        int d = sc.nextInt();  // no to be found
        
        // finding elem in an array
        System.out.println( findElem(arr, d) );
    }

}
