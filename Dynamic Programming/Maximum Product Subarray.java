class Solution {
    public int maxProduct(int[] nums) {
        int maxsofar=nums[0];
        int minsofar=nums[0];
        int maxuntilhere=nums[0];
        for(int i=1;i<nums.length;i++)
        {
            int max=Math.max(Math.max(nums[i],maxsofar*nums[i]),minsofar*nums[i]);
            minsofar=Math.min(Math.min(nums[i],maxsofar*nums[i]),minsofar*nums[i]);
            maxsofar=max;
            maxuntilhere=Math.max(maxuntilhere,maxsofar);
        }
     return maxuntilhere;
    }
}
