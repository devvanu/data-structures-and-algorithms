/* Shell Rotate
   Time Complexity: O(n+m) & Space Complexity: O(n+m)
*/

class Solution{
    
    void shellRotate(int arr[][], int s, int r) {
        int[] oneD = find1DFromShell(arr, s);
        rotateArray(oneD, r);
        findShellFrom1D(arr, s, oneD);
    }
    
    int[] find1DFromShell(int arr[][], int s){
        int minrow = s-1;
        int maxrow = arr.length - s;
        int mincol = s-1;
        int maxcol = arr[0].length - s;
        
        int size = 2*(maxrow-minrow) + 2*(maxcol-mincol);
        int oneD[] = new int[size];
        
        int index = 0;
        
        // left wall
        for(int i=minrow; i<=maxrow; i++, index++) oneD[index] = arr[i][mincol];
        
        // bottom wall
        for(int i=mincol+1; i<=maxcol; i++, index++) oneD[index] = arr[maxrow][i];
        
        // right wall
        for(int i=maxrow-1; i>=minrow; i--, index++) oneD[index] = arr[i][maxcol];
        
        // top wall
        for(int i=maxcol-1; i>mincol; i--, index++) oneD[index] = arr[minrow][i];
        
        return oneD;
    }
    
    void rotateArray(int oneD[], int r){
        r %= oneD.length;
        if( r < 0 ) r += oneD.length;
        
        reverseArray(oneD, 0, oneD.length-r-1);
        reverseArray(oneD, oneD.length-r, oneD.length-1);
        reverseArray(oneD, 0, oneD.length-1);
    }
    
    void reverseArray(int oneD[], int i, int j){
        for( ; i < j; i++, j--){
            int temp = oneD[i];
            oneD[i] = oneD[j];
            oneD[j] = temp;
        }
    }
    
    void findShellFrom1D(int[][] arr, int s, int[] oneD){
        int minrow = s-1;
        int maxrow = arr.length - s;
        int mincol = s-1;
        int maxcol = arr[0].length - s;
        
        int index = 0;
        
        // left wall
        for(int i=minrow; i<=maxrow; i++, index++) arr[i][mincol] = oneD[index];
        
        // bottom wall
        for(int i=mincol+1; i<=maxcol; i++, index++) arr[maxrow][i] = oneD[index];
        
        // right wall
        for(int i=maxrow-1; i>=minrow; i--, index++) arr[i][maxcol] = oneD[index];
        
        // top wall
        for(int i=maxcol-1; i>mincol; i--, index++) arr[minrow][i] = oneD[index];
    }
}
