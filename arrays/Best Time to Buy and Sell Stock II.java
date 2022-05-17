class Solution {
    public int maxProfit(int[] prices) {
        int minn=Integer.MAX_VALUE;
        int ans=0,res=0;
        for(int i=0;i<prices.length;i++)
        {
            if(minn>prices[i])
                minn=prices[i];
           
            else
            {
                ans=prices[i]-minn;
                res=res+ans;
                minn=prices[i];
            }
            
        }
        return res;
    }
}
