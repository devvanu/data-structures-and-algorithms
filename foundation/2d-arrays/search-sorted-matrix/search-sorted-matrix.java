/* Search In A Sorted 2d Array
   Time Complexity: O(n+m) & Space Complexity: O(1)
*/

class Solution{
    
    void searchSortedMatrix(int arr[][], int n, int X) {
        int row = 0, col = n-1;
        
        while( row < n && col >= 0){
            
            if( arr[row][col] == X ){
                System.out.println(row + "\n" + col);
                return;
            }
            
            else if( arr[row][col] < X ) row++;
            
            else col--;
        }
        
        System.out.println("Not Found");
    }
    
}
