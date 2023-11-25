class Solution {
    public boolean isPalindrome(String s) {
        
        StringBuilder input  = new StringBuilder();
       String newstr =  s.replaceAll("[^a-zA-Z0-9]", "");

        input.append(newstr).reverse();
        // input.reverse();

        if(newstr.equalsIgnoreCase(input.toString()) || newstr.isEmpty()){

            return true;
        }
        
        // if(newstr.isEmpty()){
        //     return true;
        // }


        return false;
    }
}