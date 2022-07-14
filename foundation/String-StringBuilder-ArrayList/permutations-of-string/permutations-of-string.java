/* Print All Permutations Of A String Iteratively
   Time Complexity: O(n! * n)
   Space Complexity: O(n)
*/

class Solution{
    
    void stringPermutation(String str){
        int count = factorial( str.length() );
        
        for(int i=0; i<count; i++){  
            StringBuilder sb = new StringBuilder(str);
            int num = i;
            
            for(int div=str.length(); div>=1; div--){
                int pos = num % div;
                
                System.out.print( sb.charAt(pos) );
                sb.deleteCharAt(pos);
                
                num /= div;
            } 
            System.out.println();
        }
    }
    
    int factorial(int num){
        int fact = num;
        
        while(num>2){ fact *= (num-1); num--; }
        
        return fact;
    }
    
}
