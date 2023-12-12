class Solution {
    public int reverse(int x) {
        
        long Number =0;
        int rem = 0;
        
        while(x>0 || x<0){
            
            rem = x%10;
            Number = Number * 10 + rem;
            x = x/10;
            if(Number>Integer.MAX_VALUE || Number < Integer.MIN_VALUE){
                return 0;
            }
            //return reverseNumber;
        }

        int reverseNumber = (int) Number;
        //     while(x<0){
            
        //     rem = x%10;
        //     reverseNumber = reverseNumber * 10 + rem;
        //     x = x/10;
        //     return reverseNumber;
        // }
        
        return reverseNumber;
    }
}