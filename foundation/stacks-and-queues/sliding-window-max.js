/* Sliding Window Maximum
   Time Complexity: O(n+2*n) = O(n)  |  Space Complexity: O(n)
*/

class Solution{
    
    slidingWindowMax(arr, n, k){
        let nge = [], stack = [];
        
        stack[0] = arr.length-1;  // pushing last array index
        nge[arr.length-1] = arr.length;  // storing array length if no greater element
        
        // finding next greater element to the right
        for(let i=arr.length-2; i>=0; i--){
            let top = stack[stack.length-1];
            
            while( stack.length > 0  &&  arr[i] >= arr[top] ){
                stack.pop();
                top = stack[stack.length-1];
            }
            
            if(stack.length == 0) nge[i] = arr.length;
            else nge[i] = top;
            
            stack.push(i);
        }
        
        // finding max in every window of size k
        let j = 0;
        
        for(let i=0; i<=arr.length-k; i++){
            if(j < i) j = i;  // when j is behind of i
            
            while( nge[j] < i + k ){ // until nge index is within the current window
                j = nge[j];
            }
            
            console.log(arr[j]);  // printing max of current window
        }
    }
    
}
