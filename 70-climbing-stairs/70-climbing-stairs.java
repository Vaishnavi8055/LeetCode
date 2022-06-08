class Solution {
    public int climbStairs(int n) {
        
        int dp[] = new int[n];
        
        Arrays.fill(dp,-1);
        
        return climbStair( n , dp , 0);
    }
    
     public int climbStair(int n , int dp[] , int curr) {
         
         // Recursion + Memoization
                
        if(curr == n)
            return 1;
         
        if(curr > n)
            return 0;
         
         if(dp[curr] != -1)
             return dp[curr];
        
        // number of choices (1 step or 2 step)
        int c1 =  climbStair(n , dp , curr+1);
        int c2 =  climbStair(n , dp , curr+2);
        
        // number of ways
        return dp[curr] = c1+c2;

    }
}