class Solution {
    public int minMoves(int[] nums) {
        int n=nums.length;
        int minn=Integer.MAX_VALUE;
        for(int i=0;i<n;i++)
            minn=Math.min(minn,nums[i]);
        int count=0;
        for(int i=0;i<n;i++)
        {
            count+=nums[i]-minn;
        }
        return count;
    }
}
