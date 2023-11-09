class Solution {
    public boolean canJump(int[] nums) {
        int i=0,max=0;
        int n= nums.length-1;
        while(i<=n)
        {
            if(i>max)
            {
                return false;
            }
            max= Math.max(max,i+nums[i]);

            if(max>=n)
            {
                return true;
            }
            i++;

        }
        return false;
    }
}