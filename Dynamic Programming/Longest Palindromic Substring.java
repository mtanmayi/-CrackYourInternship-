class Solution {
    public String longestPalindrome(String s) {
        int n=s.length();
        boolean[][] dp=new boolean[n][n];
        int si=0,ei=0,max=0;
        for(int i=0;i<n;i++)
            dp[i][i]=true;
        for(int i=1;i<n;i++)
        {
            for(int j=0;j<n-1;j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    if(dp[i-1][j+1]==true)
                {
                    dp[i][j]=true;
                    if(i-j>max)
                    {
                        max=i-j;
                        si=j;
                        ei=i;
                    }
                }
                }               
            }
        }
        return s.substring(si,ei+1); 
        or
        String str="";
        for(int i=si;i<=ei;i++)
            str=str+s.charAt(i);
        return str;
    }
    
}
