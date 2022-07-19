/* Duplicate Brackets
   Time Complexity: O(2*n)=O(n)  |  Space Complexity: O(n)
*/

class Solution{
 
    duplicateBrackets(str){   
        let stack = [];  
        
        for(let i=0; i<str.length; i++){        
            let ch = str.charAt(i);
            
            if( ch == ')' ){
                let top = stack.pop();  
                if( top === '(')  // contains no char btw '(' & ')'
                    return true;
                else{
                    while( top !== '('){  // remove all elements till ')'
                        top = stack.pop();
                    }
                }
            }
            else stack.push(ch);
        }
        return false; // means no duplicacy
    }
    
}
