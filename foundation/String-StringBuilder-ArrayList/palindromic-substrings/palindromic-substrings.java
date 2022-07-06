/* Print All Palindromic Substrings
   Time Complexity: O(n^3) & Space Complexity: O(n)
*/

class Solution{
    
    boolean isPalindrome(String str){
        
        // checking whether substrings are palindrome or not
        for(int i=0, j=str.length()-1; i<j; i++, j--){
            if(str.charAt(i) != str.charAt(j)) return false;
        }
        
        return true;
    }
    
    void palindromeSubstrings(String str) {
        
        // lists all substrings
        for(int i=0; i<str.length(); i++){
        
            for(int j=i+1; j<=str.length(); j++){
                
                // printing only palindrome substrings
                if( isPalindrome( str.substring(i, j) )) 
                    System.out.println( str.substring(i, j) );
            }
        }
    }
    
}
