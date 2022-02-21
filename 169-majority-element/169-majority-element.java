class Solution {
    public int majorityElement(int[] num) {
        
//         int count = 1; 
//         int majorityElement = nums[0];
        
//         for(int i=1 ; i<nums.length ; i++){
            
//             // if count = 0 it means 2 types of elements have count equal
            
//             if(nums[i] == majorityElement){
//                 count++;
//             }
//             else{
//                 count--;
//             }
           
//         }  
//             return count;    
//     }
// }
        
        
        HashMap<Integer,Integer> map = new HashMap();
        
        int major = 0;

        for(int ele : num){
            if(!map.containsKey(ele)){
            map.put(ele , 1);
                }
            else{
                map.put(ele , map.get(ele)+1);
            }
            
            if(map.get(ele) > (num.length / 2)){
                major = ele;
                break;
            }
            
        }
         return major;
        
        
//         int major=num[0], count = 1;
//         for(int i=1; i<num.length;i++){
//             if(count==0){
//                 count++;
//                 major=num[i];
//             }else if(major==num[i]){
//                 count++;
//             }else count--;
            
//         }
//         return major;
    
    }
}
        
     