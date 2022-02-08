class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        
        List<Integer> l = new ArrayList<Integer>();
        
        int row = matrix.length;
        int col = matrix[0].length;
        
        int total = row * col;
        int count = 0;
        
        int startRow = 0;
        int startCol = 0;
        int endRow = row-1;
        int endCol = col-1;
       
        
        while(count < total){
            
            // Printing Starting Row
            
            for(int i=startRow ; count < total && i<=endCol ; i++){
                l.add(matrix[startRow][i]);
                 count++;
            }
            startRow++;
            
            // Printing Ending Column
            
            for(int i=startRow ; count < total && i<=endRow ; i++){
                l.add(matrix[i][endCol]);
                 count++;
            }
            endCol--;
            
            // Printing Ending Row
            
            for(int i=endCol ; count < total && i>=startCol ; i--){
                l.add(matrix[endRow][i]);
                 count++;
            }
            endRow--;
            
             // Printing Starting Column
            
            for(int i=endRow ; count < total && i>=startRow ; i--){
                l.add(matrix[i][startCol]);
                 count++;
            }
            startCol++;
            
        }
        
        
      return  l; 
    }
}