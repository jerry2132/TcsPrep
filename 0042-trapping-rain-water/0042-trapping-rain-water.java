class Solution {
    public int trap(int[] height) {
        
        int n = height.length;
        int[] maxleft = new int[n];
        int[] maxright = new int[n];
        int[] boundary = new int[n];

        maxleft[0] = height[0];
       int  max = height[0];

        for(int i=1;i<n;i++){

            if(height[i]>max){
                max = height[i];
                maxleft[i] = max;
            }
            else{
                maxleft[i] = max;
            }
        }
        // for(int i=0;i<n;i++){
        //     System.out.print(maxleft[i]);
        // }

        maxright[n-1] = height[n-1];
        max = height[n-1];

        for(int i=n-2;i>=0;i--)
        {
            if(height[i]>max){
                max = height[i];
                maxright[i] = max;
            }
            else{
                maxright[i] = max;
            }
        }

        //     System.out.println();
        // for(int i=0;i<n;i++){
        //     System.out.print(maxright[i]);
        // }

        max = 0;

        for(int i=0;i<n;i++){

            boundary[i]  = Math.min(maxleft[i],maxright[i]);
            int max1 = boundary[i] - height[i];

            max += max1;
            
        }

        //     System.out.println();
        // for(int i=0;i<n;i++){
        //     System.out.print(boundary[i]);
        // }

        return max;

  
        // int l = 0, r = height.length - 1, lmax = Integer.MIN_VALUE, rmax = Integer.MIN_VALUE, ans = 0;
        // while (l < r) {
        // lmax = Math.max(lmax, height[l]);
        // rmax = Math.max(rmax, height[r]);
        // ans += (lmax < rmax) ? lmax - height[l++] : rmax - height[r--];
        // }
        // return ans;

    }
}