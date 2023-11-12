class Solution {
    public int candy(int[] ratings) {
        int n = ratings.length;
        int[] candies = new int[n];
        int totalcandies = 0;
        // 
        Arrays.fill(candies,1);
        //System.out.println(candies);

        for(int i=1;i<n;i++)
        {
            if(ratings[i]>ratings[i-1])
            {
                candies[i] = candies[i]+candies[i-1];
                
            }
        }
        //System.out.println(candies);
        for(int i=n-2;i>=0;i--)
        {
            if(ratings[i]>ratings[i+1]){
                candies[i] = Math.max(candies[i],candies[i+1]+1);
            }
        }
        //System.out.println(candies);
        for(int c : candies)
        {
            totalcandies += c;
        }
        
        return totalcandies;
    }
}