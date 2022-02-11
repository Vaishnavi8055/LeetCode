class Solution {
    public int mostWordsFound(String[] sentences) {
        
        int eachChar = 0;
        int count = 0 ;
        int max = Integer.MIN_VALUE;
        
        for(int i=0 ; i<sentences.length ; i++){
           count = 0;
            for(int j=0 ; j<sentences[i].length() ; j++){
                
                if(sentences[i].charAt(j) == ' '){
                    System.out.print(count + " ");
                    count++;
                }
                
            }
            
            max = Math.max(max , count+1);
        }
        
        return max;
        
    }
}