/* Toggle Case
   Time Complexity: O(n) & Space Complexity: O(n)
*/

class Solution{
    
    String toggleCase(String str){
        
        String s = "";
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if( Character.isUpperCase(ch) ) s += Character.toLowerCase(ch);
            else  s += Character.toUpperCase(ch);
        }
        
        return s;
    }
	
}
