/* Matrix Multiplication 
   - Time Complexity: O(n^3)
   - Space Complexity: O(n^2)
*/

class Solution{
    
    void matrixMultiplication(int mat1[][], int n1, int m1, int mat2[][], int n2, int m2) {        
            
        if(m1 != n2){ // checking whether matrices can be multiplied or not
            System.out.print("Invalid input");
            return;
        }
            
        int sum[][] = new int[n1][m2];
        
        for(int i=0; i<n1; i++){ // run till matrix1 row 
         
            for(int j=0; j<m2; j++){  // run till matrix2 col
                
                for(int k=0; k<m1; k++) // run till matrix1 col
                    sum[i][j] += mat1[i][k] * mat2[k][j];
                
                System.out.print(sum[i][j] + " ");
            }
            
            System.out.println();
        }
        
    }
    
}
