/* Print Increasing
   Time Complexity: O(n)  |  Space Complexity: O(1)
*/

class Solution{
    
    printIncreasing(n){
        // base case
        if( n == 0 ) return;
        
        // recursive call
        this.printIncreasing(n-1);
        
        // self work
        console.log(n);
    }

}
