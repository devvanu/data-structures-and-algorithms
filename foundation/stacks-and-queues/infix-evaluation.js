/* Infix Evaluation
   Time Complexity: O(n)  |  Space Complexity: O(n)
*/

class Solution{
    
    infixEval(expr){
        let operands = [], operators = [];
        
        for(let i=0; i<expr.length; i++){
            let ch = expr.charAt(i);
            let top1 = operands[operands.length-1];
            let top2 = operators[operators.length-1];
            
            if(ch == '(') operators.push(ch);
            
            // for digits
            else if( /\d/.test(ch) ) operands.push(parseInt(ch));
            
            else if( ch=='+' || ch=='-' || ch=='*' || ch=='/' ){
                
                // pop out the operators that with greater precedence
                while( operators.length > 0 && top2 != '(' && 
                       this.precedence(ch) <= this.precedence(top2) ){
                    let val2 = operands.pop(); top1 = operands[operands.length-1];
                    let val1 = operands.pop(); top1 = operands[operands.length-1];
                    let op = operators.pop(); top2 = operators[operators.length-1];
                    let opValue = this.operation(val1, val2, op);
                    operands.push(opValue);
                }
                
                // push the operators in stack anyway
                operators.push(ch);
            }
            
            else if( ch == ')' ){
                
                // pop out all the operators until '('
                while( operators.length > 0 && top2 != '(' ){
                    let val2 = operands.pop(); top1 = operands[operands.length-1];
                    let val1 = operands.pop(); top1 = operands[operands.length-1];
                    let op = operators.pop(); top2 = operators[operators.length-1];
                    let opValue = this.operation(val1, val2, op);
                    operands.push(opValue);
                }
                
                // then finally pop out '('
                operators.pop();
                top2 = operators[operators.length-1];
            }
            
        }
        
        // now pop out remaining operators out of stack and evaluate
        while( operators.length > 0 ){
            let val2 = operands.pop(); 
            let val1 = operands.pop(); 
            let op = operators.pop(); 
            let opValue = this.operation(val1, val2, op);
            operands.push(opValue);
        }
        
        console.log(operands.pop());
    }
    
    // function to return the precedence of a operator
    precedence(op){
        if( op == '+' || op == '-' ) return 1;
        else if( op == '*' || op == '/' ) return 2;
    }
    
    // function for evaluation
    operation(val1, val2, op){
        if( op == '+' ) return val1 + val2;
        else if( op == '-' ) return val1 - val2;
        else if( op == '*' ) return val1 * val2;
        else return Math.floor(val1 / val2);
    }
     
}
