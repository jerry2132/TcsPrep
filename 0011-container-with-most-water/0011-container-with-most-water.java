class Solution {
    public int maxArea(int[] height) {
        //int max=0;
        //int n = height.length;
        int maxArea =0 ;
        int l = 0;
        int r = height.length-1;

        while(l < r){

            int min = Math.min(height[l],height[r]);
            int currentArea = min * (r-l);

            maxArea = Math.max(maxArea , currentArea);
            
            if(height[l] < height[r]){
                l++;
            }else{
                r--;
            }
        }

        return maxArea;
    }
}