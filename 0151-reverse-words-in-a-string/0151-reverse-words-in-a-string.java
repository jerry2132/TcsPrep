class Solution {
    public String reverseWords(String s) {
    String trimstring = s.trim().replaceAll(" +", " ");
    //trimstring.replaceAll("\\s+", " ");
    String[] words = trimstring.split(" ");

    int n = words.length;
   // System.out.print(n);
    StringBuilder newstr = new StringBuilder();
    
    for(int i=n-1;i>=0;i--)
    {
        newstr.append(words[i]+" ");
    }

    String newstring = newstr.toString().trim();
    // newstring.trim();

    return newstring;


    }
}