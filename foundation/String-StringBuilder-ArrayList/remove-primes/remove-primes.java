/* Remove Primes
   Time Complexity: O(n^2)- due to internal shifting of elem in arraylist
   Space Complexity: O(1)
*/

class Solution{
    
    void removePrimes(ArrayList<Integer> al){
      
        // starting iteration from back to avoid missing elem due to internal shifting
        for(int i=al.size()-1; i>=0; i--){
            
            if( isPrime(al.get(i)) )
                al.remove(i);
        }
    }
    
    boolean isPrime(int num){
        
        for(int i=2; i*i<=num; i++)
            if(num %i == 0) return false;
        
        return true;
    }
}
