class Solution {
    public int minimumSum(int num) {
        
        int digits[] = new int[4];
        int i=0;
        
        while(num > 0 && i<4){
            int lastDigit = num%10;
            digits[i++] = lastDigit;
            num = num / 10;
        }
        
        Arrays.sort(digits);
        
        // First digit of both number must be smallest
        int new1 = digits[0] * 10 + digits[2];
        int new2 = digits[1] * 10 + digits[3];
        
        System.out.print(new1 +" ");
        System.out.print(new2);
        
        
        return new1 + new2;
      
    }
}