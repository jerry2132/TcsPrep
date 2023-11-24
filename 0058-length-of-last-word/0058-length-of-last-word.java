class Solution {
    public int lengthOfLastWord(String s) {
        
        String trimString = s.trim();
        // int n = s.length();

        StringBuilder result = new StringBuilder();

        for(int i=trimString.length()-1;i>=0;i--){

            if(trimString.charAt(i)==' ')
            {
                break;
            }

            result.append(s.charAt(i));

        }

        return result.toString().length();
    }
}