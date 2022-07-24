/* Largest Area Histogram
   Time Complexity: O(n)  |  Space Complexity: O(n)
*/

class Solution{
    
    largestAreaHistogram(arr){
        
        // next smaller element index on the left
        let lb = [], stack = [];
        
        stack.push(0);  // pushing array 1st index
        lb[0] = -1;
        
        for(let i=1; i<arr.length; i++){
            let top = stack[stack.length-1];
            while( stack.length > 0  &&  arr[i] <= arr[top] ){
                stack.pop();
                top = stack[stack.length-1];
            }
            if( stack.length == 0 ) lb[i] = -1;
            else lb[i] = top;
            
            stack.push(i);
        }
        
        // next smaller element index on the right
        let rb = [];
        stack = [];
        
        stack.push(arr.length-1);  // pushing array last index
        rb[arr.length-1] = arr.length;
        
        for(let i=arr.length-2; i>=0; i--){
            let top = stack[stack.length-1];
            while( stack.length > 0  &&  arr[i] <= arr[top] ){
                stack.pop();
                top = stack[stack.length-1];
            }
            if( stack.length == 0 ) rb[i] = arr.length;
            else rb[i] = top;
            
            stack.push(i);
        }
        
        // finding largest area
        let maxArea = 0;
        for(let i=0; i<arr.length; i++){
            let width = rb[i] - lb[i] - 1;
            let area = width * arr[i];
            if(area > maxArea) maxArea = area; 
        }
        
        console.log(maxArea);
    }
    
}
