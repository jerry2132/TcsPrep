class Solution {
    public int maxProfit(int[] prices) {
        
        int max = 0;


        // for(int i=1;i<prices.length;i++)
        // {
        //     int j = i-1;
        //     while(j>=0)
        //     {
        //         int profit = prices[i]-prices[j];
        //         if(profit>0 && profit>max)
        //         {
        //             max = profit;
        //         }
        //         j--;
        //     }
            
           
        // }
        // return max;
        int price = Integer.MAX_VALUE;
        for(int min:prices)
        {
            if(min<price)
            {
                price = min;
            }
            else if(min-price>max)
            {
                max = min-price;
            }
        }
        return max;
    }
}