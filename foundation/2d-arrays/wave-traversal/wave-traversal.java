/* Wave Traversal
   Time Complexity: O(n^2) & Space Complexity: O(1)
*/

class Solution{
    
    void waveTraversal(int arr[][], int n, int m) {
        
        for(int j=0; j<m; j++){
            
            for(int i=0; i<n; i++){
                
                if(j%2==0) System.out.println(arr[i][j]);
                
                else System.out.println(arr[n-i-1][j]);
            }
        }
    }
    
}
