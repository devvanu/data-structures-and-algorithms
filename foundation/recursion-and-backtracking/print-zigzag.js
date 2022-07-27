// Print Zigzag

class Solution{
    
    printZigzag(n){
        // base case
        if( n == 0 ) return;
        
        console.log(n);
        
        // recursive call
        this.printZigzag(n-1);
        
        console.log(n);
        
        // recursive call
        this.printZigzag(n-1);
        
        console.log(n);
    }
    
}
