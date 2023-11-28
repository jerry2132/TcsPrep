class Solution {
    public String convertToTitle(int columnNumber) {
        
        char currentChar;
        StringBuilder newstr  = new StringBuilder();

        while(columnNumber>0){
            
            columnNumber--;

            currentChar =(char)( 'A' + columnNumber % 26);

            newstr.append(currentChar);
            columnNumber /= 26;

            

        }

        return newstr.reverse().toString();

    }
}