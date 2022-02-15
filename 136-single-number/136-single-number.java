class Solution {
    public int singleNumber(int[] nums) {
        
//       XOR  - same = 0
//            - different = 1
        
        int res = 0;
        
        for(int ele : nums){
            res = res ^ ele;
        }
        
        return res;
        
//  -----------------------------------------------------
            
//         HashMap<Integer , Integer> map = new HashMap<Integer , Integer>();
        
//         for(int ele : nums){
//             if(!map.containsKey(ele)){
//                 map.put(ele , 1);
//             }
//             else{
//                 map.put(ele , map.get(ele)+1);
//             }
//         }
        
//         int single = 0;
//         for(int ele : nums){
//         if(map.get(ele) == 1)
//             single = ele;
//         }
        
//     return single;
    }
}