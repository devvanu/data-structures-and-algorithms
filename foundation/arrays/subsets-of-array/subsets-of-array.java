/* Subsets of Array Solution
   - Time Complexity: O(2^n * n) where n = array length
   - Space Complexity: O(2^n * n)
*/

class Solution{
    
    void getSubsets(int arr[], int n) {
        
        int limit= (int) Math.pow(2,n);
        
        for(int i=0; i<limit; i++){
            
            int num= i;
            String row = "";
            
            for(int j=n-1; j>=0; j--){
                
                // checking last bit is set or not
                if(num%2 == 1) row = arr[j] + "\t" + row;
                else row = "-\t" + row;
                
                // update num to remove the rightmost bit
                num /= 2;
            }
            
            System.out.println(row);
        }
    }
    
}
