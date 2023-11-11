class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int [] answer = new int[n];

        // for(int i=0;i<n;i++)
        // {
        //     answer[i] = 1;
        //     for(int j=0;j<n;j++)
        //     {
                
        //         if(j==i)
        //         {
        //             continue;
        //         }
        //         else{
                  
        //             answer[i]=answer[i]*nums[j]; 
        //         }
        //     }
        // }
        // return answer;

        int [] left = new int[n];
        int [] right = new int[n];
        left[0] = 1;
        right[n-1] = 1;

        for(int i=1;i<n;i++)
        {
            left[i] = left[i-1]*nums[i-1];
        }
        for(int i=n-2;i>=0;i--)
        {
            right[i] = right[i+1]*nums[i+1];
        }

        for(int i=0;i<n;i++)
        {
            answer[i] = left[i]*right[i];
        }
        return answer;

        // int prod = 1;

        // for(int c : nums)
        // {
        //     prod*=c;
        // }
        // for(int i=0;i<n;i++)
        // {
        //     try{
        //              answer[i] = prod/nums[i];
        //     }
        //     catch(Exception e)
        //     {
        //         e.printStackTrace();
        //     }
           

        // }

        // return answer;

    }
}