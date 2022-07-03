/* First and Last Occurence of X Solution
    - Time Complexity: O(log2n) where n= length of array
    - Space Complexity: O(1)
*/

class Solution{
    
    void firstLastOccurences(int arr[], int n, int k) {
       
        int first= -1, last= -1;
        
        // Finding First Occurence (traversing left side of mid)
        int start= 0, end= n-1;
        while(start <= end){
            int mid = (start + end)/2;
            
            if( arr[mid] == k ){ end= mid-1; first= mid; }
            else if( arr[mid] < k ) start = mid+1;
            else end= mid-1;
        }
        
        // Finding Last Occurence (traversing right side of mid)
        start= 0; end= n-1;
        while(start <= end){
            int mid = (start + end)/2;
            
            if( arr[mid] == k ){ start= mid+1; last= mid; }
            else if( arr[mid] < k ) start = mid+1;
            else end= mid-1;
        }
        
        System.out.print(first + "\n" + last);
    }
    
}
