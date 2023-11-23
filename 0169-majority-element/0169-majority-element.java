class Solution {
    public int majorityElement(int[] nums) {

    //     int temp = 1;
    //     int max= 1;
    //     int element = 0 ;
      int n = nums.length;

    //     if(n>1){

    //         for(int i=0;i<n-1;i++)
    //     {
    //         temp = 1;
    //         for(int j=i+1;j<n;j++)
    //         {
    //             if(nums[i]==nums[j])
    //             {
    //                 temp++;
    //             }
    //         }

    //         // if(!(temp>n/2)){
    //         //     temp = 1;
    //         // }

    //         if(temp>max)
    //         {
    //             max = temp;
    //             element = nums[i];
    //         }
    //     }

    //    return element;
    //     }

    //     else{
    //         element = nums[0];
    //         return element;
    //     }

    int count = 1;
    int candidate = nums[0];

    for(int i=1;i<n;i++){

        if(count == 0){
            candidate = nums[i];
            count =1;
        }

        else if(nums[i]==candidate){

            count++;

        }
        else{
            count--;
        }
    }
        
        return candidate;
    }
}