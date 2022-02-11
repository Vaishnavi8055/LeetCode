class Solution {
    public boolean checkInclusion(String s1, String s2) {
        
        
        // Store the count of characters of s1
        int len1 = s1.length();
        int count1[] = new int[26];
        
        //count sort
        for(int i = 0 ; i<len1 ; i++){
            int index = s1.charAt(i) - 'a';
            count1[index]++;
        }
        
        // traverse s2 in window of size s2.length
        // compare
         int windowSize = s1.length();
         int count2[] = new int[26];
        
        int i = 0;
        
        // store count of first window of s2
        while(i<windowSize && i<s2.length()){
            
            int index = s2.charAt(i) - 'a';
            count2[index]++;
            
            i++;
            // System.out.print(i);
        }
        
      
            
            if(checkEqual(count1 , count2)){
                return true;
            }
        
        while(i<s2.length()){
            
            char newChar = s2.charAt(i);
            int index = newChar - 'a';
            
            count2[index]++;
            
            // remove count of e
            char oldChar = s2.charAt(i - windowSize);
             index = oldChar - 'a';
            count2[index]--;
            
            i++;
            
         if(checkEqual(count1 , count2)){
                return true;
            }
            
        }
        
        return false;
    }
    
    
    public static boolean checkEqual(int count1[] , int count2[]){
        
        for(int i=0 ; i<26 ; i++){
            if(count1[i] != count2[i]){
                return false;
            }
        } 
        
      return true;  
    }
}