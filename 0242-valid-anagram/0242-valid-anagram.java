class Solution {
    public boolean isAnagram(String s, String t) {
        
        char str[] = s.toCharArray();
        char str1[] = t.toCharArray();

        Arrays.sort(str);
        Arrays.sort(str1);

        boolean b = Arrays.equals(str,str1);
        if(b){
            return true;
        }
        else{
            return false;
        }


    }
}