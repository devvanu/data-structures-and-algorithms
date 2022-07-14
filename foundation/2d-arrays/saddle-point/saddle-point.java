/* Saddle Point
   Time Complexity: O(n^2) & Space Complexity: O(1)
*/

class Solution{
    
    void saddlePoint(int arr[][], int n) {
        
        for(int i=0; i<n; i++){
            
            int minr = arr[i][0], colno = 0;
            
            // finding least value in a row
            for(int j=0; j<n; j++){
                if( arr[i][j] < minr ){ // if current elem is less than min number
                    colno = j;
                    minr = arr[i][j];
                }
            }
            
            // finding max value in a specific column
            boolean saddlePoint = true;
            for(int k=0; k<n; k++){
                if( arr[k][colno] > minr ){ // if current elem is more than min number
                    saddlePoint = false;
                    break;
                }
            }
            
            if( saddlePoint == true ){
                System.out.print( minr );
                return;
            }
          
        }
        
        System.out.print("Invalid input");
    }
}
