/* Spiral Traversal
   Time Complexity: O(n^2) & Space Complexity: O(1)
*/

class Solution{
    
    void spiralTraversal(int arr[][], int n, int m) {
        
        int minrow=0, mincol=0;
        int maxrow=n-1, maxcol=m-1;
        
        int tolElem = n*m, count = 0;
        
        while(count < tolElem){ // traversing box by box
            
            for(int k=minrow; k<=maxrow && count<tolElem; k++){ // left wall
                System.out.println(arr[k][mincol]);
                count++;
            }
            mincol++;
            
            for(int k=mincol; k<=maxcol && count<tolElem; k++){ // bottom wall
                System.out.println(arr[maxrow][k]);
                count++;
            }
            maxrow--;
            
            for(int k=maxrow; k>=minrow && count<tolElem; k--){ // right wall
                System.out.println(arr[k][maxcol]);
                count++;
            }
            maxcol--;
            
            for(int k=maxcol; k>=mincol && count<tolElem; k--){ // top wall
                System.out.println(arr[minrow][k]);
                count++;
            }
            minrow++;
        }
    }
    
}
