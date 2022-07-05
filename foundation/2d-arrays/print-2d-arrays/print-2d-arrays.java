/* Print 2D Arrays 
   - Time Complexity: O(n*m) where n=row, m=col
   - Space Complexity: O(1)
*/

class Solution{
    
    void print2DArrays(int arr[][], int n, int m) {
        
        for(int i=0; i<n; i++){
         
            for(int j=0; j<m; j++)
                System.out.print(arr[i][j] + " ");
         
            System.out.println();
        }
    }
    
}
