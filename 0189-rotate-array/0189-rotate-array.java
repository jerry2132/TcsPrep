class Solution {
    public void rotate(int[] nums, int k) {
        // int n = nums.length;
        
        // for(int j =0;j<k;j++)
        // {
        //     int temp = nums[n-1];
        //     for(int i=n-1;i>0;i--)
        //     {
        //     nums[i] = nums[i-1];

        //     }
        //     nums[0] = temp;
        // }
        
        int n = nums.length;
        int[] arr = new int[n];
        
        int index =0;
        for(int x : nums)
        {
            arr[index++] = x;
        }

        for(int i=0;i<n;i++)
        {
            nums[(i+k)%n] = arr[i];
        }
        
        
    }
}