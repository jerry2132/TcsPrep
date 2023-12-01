class Solution {
    public String getHint(String secret, String guess) {
        
        int m = 0;
        //int n = 0;
        int sum  =0;
        int[] count = new int[10];
        int [] count1 = new int[10];
        for(int i=0;i<secret.length();i++)
        {
            if(secret.charAt(i) == guess.charAt(i)){
                m++;
            }
            else{
                
                count[secret.charAt(i) - '0']++;
                count1[guess.charAt(i) - '0']++;
                    // for(int j=0;j<secret.length();j++){

                    //     if(secret.charAt(i) == guess.charAt(j)){
                    //         n++;
                    //         break;


                        }
                }
                    for(int i=0;i<count.length;i++){
                        
                        sum += Math.min(count[i] , count1[i]);
                    }

       // String str = m + "A" + n + "B";

        // System.out.println(m);
        // System.out.println(n);
        // System.out.println(str);

        return m + "A" + sum + "B";


    }
}