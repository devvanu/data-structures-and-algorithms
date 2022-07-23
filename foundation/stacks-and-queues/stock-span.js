/* Stock Span
   Time Complexity: O(n)  |  Space Complexity: O(n)
*/

class Solution{
    
    stockSpan(arr){  
        let stack = [], span = [];
        
        stack[0] = 0; // push the first index
        span[0] = 1; // storing the first span
        
        for(let i=1; i<arr.length; i++){
           
            let top = stack[stack.length-1];
            
            // stack is not empty and current elem is larger than top elem
            while( stack.length > 0 && arr[i] > arr[top] ){ 
                stack.pop();
                if(stack.length === 0) top = -1;
                else top = stack[stack.length-1];
            }
            
            // stack is empty
            if( stack.length === 0 ) span[i] = i + 1;
            
            // current elem is smaller than top elem
            else span[i] = i - top;
            
            stack.push(i);
        }
        
        // display the span
        for(let i of span) console.log(i);
    }
    
}
