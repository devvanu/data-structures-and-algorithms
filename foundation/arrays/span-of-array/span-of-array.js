/* Span Of Array
   Time Complexity: O(n)  |  Space Complexity: O(1)
*/

class Solution{
    
    ArraySpan(arr){
        let max = arr[0], min = arr[0];
      
        for(let i=0; i<arr.length; i++){
            if( arr[i] > max ) max = arr[i];
            if( arr[i] < min ) min = arr[i];
        }
      
        return max - min;
    }
    
}
