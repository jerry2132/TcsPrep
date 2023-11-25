class Solution {
    public String addBinary(String a, String b) {
        
        int i = a.length()-1;
        int j = b.length()-1;
        int carry =0;

        StringBuilder res = new StringBuilder();
        

        while(i>=0 || j>=0 || carry>0){

            int bit1 = (i>=0) ? a.charAt(i--) - '0' : 0;
            int bit2 = (j>=0) ? b.charAt(j--) - '0' : 0;

            int sum  = bit1+bit2+carry;

            //int ans = sum%2;

            res.append(sum%2);

            carry = sum/2;
            
        }
        res.reverse();

        return res.toString();

    }
}