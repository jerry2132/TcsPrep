class Solution {
    private int maxlen = 0;
    private int lo = 0;
    public String longestPalindrome(String s) {
        
        int n = s.length();
        // boolean b = false;
        // String s1 = "";
        // String s2 = "";
        // int max = 0;

        // for(int i=0;i<n;i++){
            
        //     char ch = s.charAt(i);
        //     for(int j=i+1;j<=n;j++){

        //          s1 = s.substring(i,j);
        //         StringBuilder str = new StringBuilder(s1);
                
        //          b = s1.equals(str.reverse().toString());
        //         //int n1  = s.length();

        //         if(b && s1.length() > max){

        //             max = s1.length(); METHOD IS CORRECT BUT DIDNT FULLFILLED THE LEETCODE CRITERIA
        //             s2  = s1;
                    
        //         }

        //     }
        // }

        // return s2;

        for(int i=0;i<n;i++){
            int j = i;
            check(s,i,j);   //for odd string 
            check(s,i,j+1);  // for even string
        }

        return s.substring(lo , lo + maxlen);
    }

         public void check(String s1, int l, int r){

            while(l>=0 && r < s1.length() && s1.charAt(l)==s1.charAt(r)){

                l--;
                r++;
            }

            if(maxlen < r-l-1){
                maxlen = r-l-1;
                lo = l+1;
            }

        }

}