/* Factorial
   Time Complexity: O(n)  |  Space Complexity: O(1)
*/

class Solution{
    
    factorial(n){
        if( n === 1 ) return 1;
        
        let fm1 = this.factorial(n-1);
        return n * fm1;
    }
    
}
