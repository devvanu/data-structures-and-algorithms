/* Inverted Bar Chart Solution
   - Time Complexity: O(n + maxval*n) where n= length of array
   - Space Complexity: O(1)
*/

class Solution{
    
    void invertedBarChart(int arr[], int n){
      
       // finding max val of array
       int max= arr[0];
       for(int elem: arr) if(elem>max) max=elem;
       
       for(int i=1; i<=max; i++){
           
           for(int elem: arr){
               if(elem >= i) System.out.print("*\t");
               else System.out.print("\t");
           }
           
           System.out.println(); 
       }
    }
    
}
