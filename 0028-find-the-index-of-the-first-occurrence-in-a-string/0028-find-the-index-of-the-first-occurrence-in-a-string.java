class Solution {
    public int strStr(String haystack, String needle) {
        int haystacklength = haystack.length();
        int needlelength = needle.length();


        for(int i=0;i<=haystacklength-needlelength;i++){

            int j;
            for(j=0;j<needlelength;j++){

                if(haystack.charAt(i+j) != needle.charAt(j)){
                    break;
                }
            }

            if(j==needlelength){
                return i;
            }
        }

        return -1;

    }
}