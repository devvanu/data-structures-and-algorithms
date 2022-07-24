/* Power Linear
   Time Complexity: O(n)  |  Space Complexity: O(1)
*/

class Solution{
    
    powerLinear(x, n){
        // base case
        if( n == 0 ) return 1;
        
        // recursive call
        let pm1 = this.powerLinear(x, n-1);
        
        // self work
        return x * pm1;
    }
    
}
