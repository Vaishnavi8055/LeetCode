class Solution {
    public int lengthOfLastWord(String s) {
        
        if(s == " "){
            return 0;
        }
        
        String arr[] = s.split(" ");
        
        // if(arr[arr.length - 1].charAt(0) == ' '){
        //     return 0;
        // }
        
        return arr[arr.length - 1].length();
    }
}