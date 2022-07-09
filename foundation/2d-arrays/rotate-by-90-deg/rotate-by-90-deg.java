/* Rotate By 90 Degree Solution
   Time Complexity: O(n^2 + n^2/2) = O(n^2)
   Space Complexity: O(1)
*/

class Solution{
    
    void rotateBy90(int arr[][], int n) {
        
        // perform transpose
        for(int row=0; row<n; row++){
            for(int col=row; col<n; col++){
                int temp = arr[row][col];
                arr[row][col] = arr[col][row];
                arr[col][row] = temp;
            }
        }
        
        // now reverse the columns
        for(int i=0; i<n; i++){
            for(int j=0; j<n/2; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[i][n-j-1];
                arr[i][n-j-1] = temp;
            }
        }
        
    }
    
}
