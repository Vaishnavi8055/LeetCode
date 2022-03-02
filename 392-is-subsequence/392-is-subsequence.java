class Solution {
    public boolean isSubsequence(String s, String t) {
        
        int fromIndex = 0;
        
        for(char character : s.toCharArray()){
            fromIndex = t.indexOf(character , fromIndex);
            
            if(fromIndex++ < 0)
                return false;
             
        }
    
        return true; 
    }
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
//         int i=0;
//         int j=0;
//         boolean res = false;
        
//         if(s.length() == 0)
//             return true;
        
//         if(t.length() == 0)
//             return false;
        
//         if(s.length() > t.length())
//             return false;
        
//         while(i<s.length() && j<s.length()){
            
//             if(s.charAt(i) != t.charAt(j)){
//                 j++;
//                 res = false;
//             }
//             else{
//                 i++;
//                 j = j+1;
                
//                 res = true;
//             }
            
//              if(i == s.length()-1 && j>t.length())
//                     return false;
            
//         }
        

        
//         if(i != s.length()-1)
//             return false;
        
        
        
//         return res;
    
}