// User function Template for Java

class Solution{
    static int equalPartition(int N, int arr[])
    {
        // code here
        int sum=0;
        for(int i=0;i<arr.length;i++)
        {
            sum+=arr[i];
        }
        if(sum%2!=0)
        return 0;
        else
        {
        Boolean ans= isSubsetSum(N,arr,sum/2);
        if(ans)
        return 1;
        else
        return 0;
        }
    }
    static Boolean isSubsetSum(int N, int arr[], int sum){
        // code here
        boolean[][] dp=new boolean[sum+1][N+1];
         for(int i=0;i<=sum;i++)
        dp[i][0]=false;
        for(int i=0;i<=N;i++)
        dp[0][i]=true;
       
        for(int i=1;i<=sum;i++)
        for(int j=1;j<=N;j++)
        {
            if(arr[j-1]<=i)
            dp[i][j]=dp[i-arr[j-1]][j-1]||dp[i][j-1];
            if(arr[j-1]>i)
            dp[i][j]=dp[i][j-1];
        }
        return dp[sum][N];
        
    }
}
