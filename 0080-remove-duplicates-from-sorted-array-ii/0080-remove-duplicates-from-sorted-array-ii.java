class Solution {
    public int removeDuplicates(int[] nums) {
        //int[] arr  = new int[nums.length];
        // int k = 0;
        // int l  =1;
        // for(int i=0;i<nums.length-1;i++)
        // {
        //     for(int j=i+1;j<nums.length;j++)
        //     {
        //         if(nums[i]==nums[j])
        //         {
        //             l++;
        //             if(l<=2)
        //             {
        //                 nums[k] = nums[i];
        //                 nums[++k] = nums[j];
        //             }
        //             if(k>2)
        //             {
        //                 break;
        //             }
        //         }
        //         else
        //         {
        //             nums[k++] =  nums[j];
        //             break;
        //         }

        //     }
        // }

        // return k;

        // int k =2;
        // for(int i=2;i<nums.length;i++)
        // {
        //     if(nums[i]!=nums[k-2])
        //     {
        //         System.out.println(k);
        //         nums[k] = nums[i];
        //         k++;
        //     }
        // }
        // return k;
        
        // if(nums.length < 3) return nums.length;
        // int i = 0, j = 0;
        // while(i < nums.length){
        //     nums[j++] = nums[i++];
        //     if(i < nums.length && nums[i] == nums[j-1])
        //         nums[j++] = nums[i++];
        //     while(i < nums.length && nums[i] == nums[j-1]) i++;
        // }
        // return j;
       
       int   index = 1;
      int  count = 0;
        for(int i = 1;i<nums.length;i++){
            if(nums[i] == nums[i-1]){
                count++;
            }
            else{
                count = 0;
            }

            if(count <= 1){
                nums[index] = nums[i];
                index++;
            }
        }
        return index;

    }
    
}