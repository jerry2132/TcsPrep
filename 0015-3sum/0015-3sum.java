class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        List<List<Integer>> listof = new ArrayList<>();
        Set<List<Integer>> list = new HashSet<>();

        Arrays.sort(nums);

        for(int i=0;i<=n;i++){

                int j = i+1;
                int y = n-1;
                while(j<y){

                    int sum = nums[i] + nums[j] +nums[y];
                    if(sum == 0){
                        // List<Integer> sublistToCheck = List.of(nums[i], nums[j], nums[y]);
                        // if(listof.contains(sublistToCheck)){
                        //     continue;
                        // }
                        list.add(Arrays.asList(nums[i] , nums[j], nums[y]));
                    }
                    if(sum<0){
                        j++;
                    }else{
                        y--;
                    }

                }
        }


        listof.addAll(list);

        // for(int i=0;i<=n-3;i++){

        //     for(int j=i+1;j<=n-2;j++){
        //         int y= j+1;

        //         if(nums[i] + nums[j] + nums[y] == 0){
                    
        //          Set<Integer> subsetToCheck = new HashSet<>(Arrays.asList(nums[i], nums[j], nums[y]));
        //             if(list.equals(subsetToCheck)){

        //                 continue;
        //             }else{
        //                      list.add(Arrays.asList(nums[i],nums[j],nums[y]));
        //             }

                   
        //         }
        //     }
        // }

        // listof.addAll(list);
        return listof;

    }
}