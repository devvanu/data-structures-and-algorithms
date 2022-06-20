// Reverse an Array solution

import java.io.*;
import java.util.*;

public class Main{
    
    // Function to reverse an array
    public static void reverse(int[] a){
        for(int i=0, j=a.length-1;  i<a.length/2;  i++, j--){
            int temp = a[i];
            a[i] = a[j];
            a[j] = temp;
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
    
        reverse(a);
        display(a);
    }

}
