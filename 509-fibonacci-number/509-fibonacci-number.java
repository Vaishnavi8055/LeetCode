class Solution {
    public int fib(int n) {
      
        /******** Using DP ***********/
        
         int dp[] = new int[n+1];
        
        if(n == 0)
            return 0;
        
        if(n==1)
            return 1;
        
        // base cases
        dp[0] = 0;
        
        dp[1] = 1;
        
        if(n>1){
        for(int i=2 ; i<=n ; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        }
        
        return dp[n];
        
        
    
        /********* Using Recursion ********/
        
      /*  if(n<=1){
            return n;
        }
        
        int prevTerm = fib(n-1);
        int prevToprevTerm = fib(n-2);
        
        int nTerm = prevTerm + prevToprevTerm;
        
        return nTerm;
        */
        
    }
}