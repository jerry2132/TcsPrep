class Solution {
    public int titleToNumber(String columnTitle) {

        int n = columnTitle.length()-1;
        int k =0;
        int i = 0;
        
        while(n>=0){
            
            int ch = columnTitle.charAt(i++) - 'A' +1;

            k += (int) ch * Math.pow(26, n--);
        }

        return k;
        
    }
}