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
