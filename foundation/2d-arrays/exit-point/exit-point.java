/* Exit Point Of A Matrix
   Time Complexity: O(nxm), n = no of rows, m = no of cols
   Space Complexity: O(1)
*/

class Solution{
    
    void exitPoint(int arr[][], int n, int m) {
        
        int row = 0, col= 0;
        int dir = 0; // intial east direction
        
        while(true){
          dir = (dir + arr[row][col]) % 4; // getting direction when to move
          
          if(dir == 0) col++;  // east
          else if(dir == 1) row++;  // south
          else if(dir == 2) col--;  // west
          else if(dir == 3) row--;  // north
          
          // checking when to exit out of matrix 
          // and taking the prev row & col to be printed before exiting
          if(row < 0){ row++; break; }
          else if( row == m ){ row--; break; }
          else if(col < 0){ col++; break; }
          else if(col == n ){ col--; break; }
        }
        
        System.out.println(row + "\n" + col);
        
    }
    
}
