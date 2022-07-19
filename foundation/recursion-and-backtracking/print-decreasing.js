/* Print Decreasing
   Time Complexity: O(n)  |  Space Complexity: O(1)
*/

class Solution{
    
    printDecreasing(n){
        
        // base case
        if(n == 0) return;
        
        // self work
        console.log(n);
        
        // recursive call
        this.printDecreasing(n-1);
    }

}
