class Solution {
    public int maxProfit(int[] prices) {
        int min_price = Integer.MAX_VALUE;
        int max = 0;
                            
        
        for(int price : prices){
            if(price < min_price){
                min_price = price;
            }
            else if(price > min_price){
                max = Math.max(max , price - min_price);
            }
        }
        
        return max;
    
    }
}