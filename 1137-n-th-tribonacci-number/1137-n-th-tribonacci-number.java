class Solution {
    public int tribonacci(int n) {
        
        // Tabulation method
        
        if(n==0 || n==1){
            return n;
        }
        
          int dp[] = new int[n+1];
        
        dp[0] = 0;
        dp[1] = 1;
        dp[2] = 1;
        
        for(int i=3 ; i<=n ; i++){
            dp[i] = dp[i-1] + dp[i-2] + dp[i-3];
        } 
        
        
         // Top Down Approach => Recursion + Memoization
        
     /*  Arrays.fill(dp , -1);
        
        if(n==0 || n==1){
            return n;
        }
        
        if(n == 2){
            return 1;
        }
        
        if(dp[n] != -1){
            return dp[n];
        }
        
      dp[n] = tribonacci(n-1)+tribonacci(n-2)+tribonacci(n-3);
      */
        
        return dp[n];
    }
    
}