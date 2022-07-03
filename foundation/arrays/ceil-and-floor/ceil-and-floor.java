/* Ceil and Floor Solution
    - Time Complexity: O(log2n) where n= length of array
    - Space Complexity: O(1)
*/

class Solution{
    
    void ceilFloor(int arr[], int n, int k) {
       
        int start= 0, end= n-1;
        int ceil= 0, floor= 0;
        while(start <= end){
            int mid = (start + end)/2;
            
            if( arr[mid] == k ){
                ceil = floor = arr[mid];
                break;
            }
            else if( arr[mid] > k ){
                end= mid-1;
                ceil = arr[mid];
            } 
            else{ start= mid+1; floor= arr[mid]; }
        }
        
        System.out.print(ceil + "\n" + floor);
    }
    
}
