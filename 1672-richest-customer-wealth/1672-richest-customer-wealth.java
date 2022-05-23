class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int row = accounts.length;
        int col = accounts[0].length;
        int amount = 0;
        int max = Integer.MIN_VALUE;
        
        for(int i=0; i<row ; i++){
            amount = 0;
            for(int j=0 ; j<col ; j++){
                amount += accounts[i][j];
            }
            max = Math.max(amount , max);
        }
        
        return max;
    }
}