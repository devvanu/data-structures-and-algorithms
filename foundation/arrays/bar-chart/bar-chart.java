// Bar Chart program

import java.io.*;
import java.util.*;

public class Main{
    
    // Function to print Bar Chart
    public static void barChart(int arr[], int max){
        
        for(int line=max; line>=1; line--){
            
            for(int j=0; j<arr.length; j++){
                if(arr[j] >= line)
                    System.out.print("*\t");
                else
                    System.out.print("\t");
            }
            
            System.out.println();
        }
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        int max = Integer.MIN_VALUE;
        
        // taking input & finding max value
        for(int i=0; i<arr.length; i++){
            arr[i] = sc.nextInt();
            if(arr[i] > max) max = arr[i];
        }
        
        // printing bar chart
        barChart(arr, max);
    }

}
