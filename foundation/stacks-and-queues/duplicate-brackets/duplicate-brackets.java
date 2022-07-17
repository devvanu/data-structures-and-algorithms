/* Duplicate Brackets
   Time Complexity: O(2*n) = O(n)
   Space Complexity: O(n)
*/

class Solution{
    
    boolean duplicateBrackets(String str){        
        Stack<Character> st = new Stack<>();
        
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);
            
            if( ch == ')' ){ 
                if( st.peek() == '(' ) // contains no char btw '(' & ')'
                    return true;
                else{
                    while( st.peek() != '(' ){ // remove all elements till ')'
                        st.pop();
                    }
                    st.pop(); // remove '('
                }
            }
            else st.push(ch);
        }
        return false; // means no duplicacy
    }
}
