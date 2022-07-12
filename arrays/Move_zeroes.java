class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int l=0,r=0;
        int temp;
        for(int i=0;i<n;i++)
        {
            if(nums[l]==0)
            {
                l++;
            }
            else
            {
            temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            r++;
            l++;
        }
        }
    }
}

--------------------or--------------------------
  fill all the non zeroes using two pointers and then fill remaining with zeroes
