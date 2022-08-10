class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int x=0;
        Arrays.sort(nums);
        for(int i=0;i<n;i++)
        {
            if(nums[i]!=x)
                break;
            x++;
        }
        return x;
    }
}
-----------------------------------------------------
    class Solution {
    public int missingNumber(int[] nums) {
        int n=nums.length;
        int sum=0;
        int tsum=0;
        for(int i=0;i<n;i++)
            tsum+=nums[i];
        sum=(n*(n+1))/2;
        int ans=sum-tsum;
        return ans;
    }
}
