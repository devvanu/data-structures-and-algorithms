// Binary Search Solution
// Time complexity: O(log2n) where n= length of array

class Solution {
    
    int binarysearch(int arr[], int n, int k) {
       
        int start= 0, end= n-1;
      
        while(start <= end){
      
          int mid = (start + end)/2;
            
            if( arr[mid] == k ) return mid;
            else if( arr[mid] > k ) end= mid-1;
            else start = mid+1;
        }
        
        return -1;
    }
    
}
