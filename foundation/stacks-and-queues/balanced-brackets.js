/* Balanced Brackets
   Time Complexity: O(n)  |  Space Complexity: O(n)
*/

class Solution{

    balancedBrackets(str){
        let stack = [];
        
        for(let i=0; i<str.length; i++){
            let ch = str.charAt(i);
            
            if( ch === '[' || ch === '{' || ch === '(' ) stack.push(ch);
            
            else if( ch === ']' ){ 
                if( !this.handleClosingBrackets(stack, '[') ) return false;
            }
            
            else if( ch === '}' ){
                if( !this.handleClosingBrackets(stack, '{') ) return false;
            }
            
            else if( ch === ')' ){
                if( !this.handleClosingBrackets(stack, '(') ) return false;
            }
        }
        
        if(stack.length === 0) return true;
        return false; // means extra opening brackets
    }
    
    handleClosingBrackets(stack, pairedCh){ 
        if(stack.length === 0) // extra closing brackets
            return false;
        
        else if( stack[stack.length-1] !== pairedCh ) // mismatched
            return false;
        
        else{  // when matched
            stack.pop();
            return true;
        }
    }
    
}
