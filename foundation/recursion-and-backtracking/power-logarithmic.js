/* Power Logarithmic
   Time Complexity: O(log2n)  |  Space Complexity: O(1)
  
   x^n = {  (x, n/2) * (x, n/2)        if n is even
            (x, n/2) * (x, n/2) * x    if n is odd
         }
*/

class Solution{
    
    power(x, n){
        // base case
        if( n == 0 ) return 1;
        
        // recursion call
        let xpnb2 = this.power(x, Math.floor(n/2));
        let xpn = xpnb2 * xpnb2;
        
        // if n is odd
        if( n % 2 == 1) xpn = xpn * x;
        
        // if n is even
        return xpn;
    }
    
}
