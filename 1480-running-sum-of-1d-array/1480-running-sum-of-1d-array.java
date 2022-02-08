class Solution {
    public int[] runningSum(int[] nums) {
        
        //int a[] = new int[nums.length];
        
      
      /*  for(int i=0 ; i<nums.length ; i++){
            for(int j=0 ; j<=i ; j++){
                a[i] = a[i] + nums[j];
            }
        } */
        
         for(int i=1 ; i<nums.length ; i++){
             nums[i] = nums[i] + nums[i-1];
            }
    
        return nums;
        
    }
}