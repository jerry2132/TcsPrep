class Solution {
    public String longestCommonPrefix(String[] strs) {
        
    //    String prefix = strs[0];
    //     for(int i = 1;i < strs.length; i++){
    //         while(strs[i].indexOf(prefix) != 0)
    //             prefix = prefix.substring(0, prefix.length() - 1);
    //         if(prefix.isEmpty())
    //             break;
    //     }
    //     return prefix;


    String reference = strs[0];
    for(int i=0;i<reference.length();i++){

        char character = reference.charAt(i);

        for(int j=1;j<strs.length;j++){

            if(i>=strs[j].length() || strs[j].charAt(i)!=character){

               return reference.substring(0,i);
            }
        }
    }

    return reference;
    }
}