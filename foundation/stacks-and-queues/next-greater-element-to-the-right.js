/* Next Greater Element To The Right
   Time Complexity: O(n)  |  Space Complexity: O(n)
*/

class Solution{
    
    nextGreater(arr){
        let stack = [], nge = [], top;
        
        nge[arr.length-1] = -1; // cuz no greater element for last element
        
        // push the last element to the stack
        stack.push(arr[arr.length-1]);
        
        for(let i=arr.length-2; i>=0; i--){
            top = stack[stack.length-1];
            
            // pop the elements if stack is not empty & elements are smaller
            while( stack.length > 0 && arr[i] >= top ){
                stack.pop();
                top = stack[stack.length-1];
            }
            
            nge[i] = stack.length == 0 ? -1 : top;
        
            stack.push(arr[i]);
        }
        
        // printing the next greater elements
        for( let i of nge ) console.log(i);
    }
    
}
