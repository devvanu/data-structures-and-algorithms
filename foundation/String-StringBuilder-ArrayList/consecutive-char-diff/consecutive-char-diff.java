/* String With Difference Of Every Two Consecutive Characters
   Time Complexity: O(n+1) = O(n)
   Space Complexity: O(n+n) = O(n)
*/

class Solution{
    String consecutiveCharDiff(String str){

        StringBuilder result = new StringBuilder();

        // append the first character of the string
        result.append( str.charAt(0) );

        for(int i=1; i<str.length(); i++){

            // difference between the current character and the previous character
            int diff = (int) str.charAt(i) - (int) str.charAt(i-1); 

            // append the difference and then append the current character 
            result.append( diff );
            result.append( str.charAt(i) );
        }

        return result.toString();
    }
}
