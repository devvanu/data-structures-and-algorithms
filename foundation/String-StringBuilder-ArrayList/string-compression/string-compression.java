/* String Compression
   Time Complexity: O(n) & Space Complexity: O(n)
*/

class Solution{
    
  // String Compression without frequency count
  String compression1(String str){

        String s = "" + str.charAt(0);

        for(int i=1; i<str.length(); i++)
            if( str.charAt(i) != str.charAt(i-1) ) 
                s += str.charAt(i);

        return s;
  }

  // String Compression with frequency count
  String compression2(String str){

        String s = "" + str.charAt(0);
        int count = 1;

        for(int i=1; i<str.length(); i++){

            // if duplicates then increment counter
            if( str.charAt(i) == str.charAt(i-1) ) 
                count++;

            else{
                if(count > 1){ // for more than 1 character
                    s += count;
                    count = 1; // reset to 1 if no duplicates
                }
                s += str.charAt(i);
            }
        }

        if(count > 1) s += count;  // handling last character count

        return s;
  }
	
}
