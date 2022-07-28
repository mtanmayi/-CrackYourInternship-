class Solution{
    static int nCr(int n, int r)
    {
        int[][] dp=new int[n+1][r+1];
        if(n<r)
        return 0;
        for(int i=0;i<=n;i++)
        {
            for(int j=0;j<=r;j++)
            dp[i][j]=0;
        }
        for(int i=0;i<=n;i++)
        {
            dp[i][0]=1;
           
        }
        for(int i=0;i<=r;i++)
        dp[i][i]=1;
        for(int i=1;i<=n;i++)
        for(int j=1;j<=r;j++)
          {
              dp[i][j]=(dp[i-1][j-1]+dp[i-1][j])%1000000007;
          }
        return dp[n][r]%1000000007;
    }
}
