class Solution {
    public int maxProfit(int[] prices) {
        int counter = prices[0];
        int profit = 0;
        int temp = 0;
        for(int i = 1; i< prices.length; i++)
        {
            if(counter >= prices[i])
            {
                counter = prices[i];
                profit += temp; 
                temp = 0;  
            }
            else if(counter < prices[i])
            {
                if(temp > prices[i] - counter )
                {
                    profit += temp;
                    counter = prices[i];
                    temp = 0;   
                }
                else
                {
                    temp = prices[i] - counter;  
                }
            }
        }
        profit = profit + temp;
        return profit;
    }
}