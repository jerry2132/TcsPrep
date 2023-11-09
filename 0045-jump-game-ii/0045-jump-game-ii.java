class Solution {
    public int jump(int[] nums) {
        int jumps = 0;
        int current=0;
        int i = 0;
        int maxl = 0;
        int n = nums.length;
        while(i<n-1)
        {
           maxl  = Math.max(maxl,i+nums[i]);
           if(i==current)
           {
                jumps++;
                current = maxl;
           }
           i++;
           
        }
        return jumps;
    }
}