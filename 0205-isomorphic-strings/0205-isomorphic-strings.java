class Solution {
    public boolean isIsomorphic(String s, String t) {

        int n  = s.length();
        int k = t.length();

        HashMap<Character,Character> map1 = new HashMap<>();
        HashMap<Character,Character> map2 = new HashMap<>();

        if(n!=k){
            return false;
        }

        for(int i=0;i<n;i++){

            char ch = s.charAt(i);
            char ch1 = t.charAt(i);

            if(map1.containsKey(ch)){
                if(map1.get(ch) != ch1){
                    return false;
                }
            }
                else{
                    map1.put(ch,ch1);
                }

            if(map2.containsKey(ch1)){
                if(map2.get(ch1) != ch){
                    return false;
                }
            }
                else{
                    map2.put(ch1,ch);
                }
            
        }
            return true;
    }
}