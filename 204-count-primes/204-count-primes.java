class Solution {
    public int countPrimes(int n) {
        
        if(n<=1){
            return 0;
        }
        
        int count = 0;
        
        boolean prime[] = new boolean[n];
        // assume all are prime i.e from 1 to n-1
        Arrays.fill(prime,true);
        
        // As 0 & 1 are not prime
        prime[0] = false;
        prime[1] = false;
        
        for(int i=2 ; i<n ; i++){
            
            if(prime[i] == true){
                count++;
            
            // Iteration1 - j=2*2=4
            // Iteration2 - j= 4+2 = 6 (2*3)
            for(int j=i*2 ; j<n ; j = j+i){
                prime[j] = false;
            }
            }
        }
       
        return count;
    }
}