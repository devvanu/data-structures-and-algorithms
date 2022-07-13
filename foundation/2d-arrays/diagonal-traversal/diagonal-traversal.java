/* Diagonal Traversal
   Time Complexity: O(n^2) & Space Complexity: O(1)
*/

class Solution{
    
    void diagonalTraversal(int arr[][], int n) {
        
        for(int row=0; row<n; row++){
            for(int i=0, j=row; j<n; i++, j++)
                System.out.println(arr[i][j]);
        }
        
    }
}
