/* Print Increasing Decreasing
   Time Complexity: O(n)  |  Space Complexity: O(1)
*/

class Solution{
    
    printIncreDecre(n){
        // base case
        if(n == 0) return;
        
        console.log(n);
        
        // recursive call
        this.printIncreDecre(n-1);
        
        console.log(n);
    }
    
}
