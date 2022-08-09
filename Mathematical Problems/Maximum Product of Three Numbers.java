class Solution {
    public int maximumProduct(int[] nums) {
        
        Arrays.sort(nums);
        int n=nums.length;
        int neg=nums[0]*nums[1]*nums[2];
        int pos=nums[n-1]*nums[n-2]*nums[n-3];
        int res=Math.max(pos,neg);
        int ans=Math.max(nums[0]*nums[1]*nums[n-1],nums[0]*nums[n-2]*nums[n-1]);
        return Math.max(res,ans);
    }
}
------------------------------------------------------------------------------------------------------------------------
class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        
        int n = nums.length;
        return Math.max(nums[n-1]*nums[n-2]*nums[n-3] ,
                        nums[0]*nums[1]*nums[n-1]);
    }
}
-------------------------------------------------------------------------------------------------------------------------
/Algorithm

//We need not necessarily sort the given numsnums array to find the maximum product. Instead, we can only find the required 2 smallest values(min1min1 and min2min2) and the three largest values(max1, max2, max3max1,max2,max3) in the numsnums array, by iterating over the numsnums array only once.

//At the end, again we can find out the larger value out of min1 \times min2 \times max1min1×min2×max1 and max1 \times max2 \times max3max1×max2×max3 to find the required maximum product.

class Solution {
    public int maximumProduct(int[] nums) {
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        
        for(int elem : nums) {
            if(elem > max1) {
                //Now, max1 will get update with these new greater element, so
                //element which max1 was holding earlier is smaller than the
                //new element which max1 is holding now.
                
                //So, element which max1 was holding earlier is now 2nd
                //largest element, so update max2 with these element
                
                //So, element which max2 was holding earlier is now 3rd
                //largest element, so update max3 with these element
                
                max3 = max2;
                max2 = max1;
                max1 = elem;
            }
            else if(elem > max2) {
                max3 = max2;
                max2 = elem;
            }
            else if(elem > max3) {
                max3 = elem;
            }
            
            if(elem < min1) {
                min2 = min1;
                min1 = elem;
            }
            else if(elem < min2) {
                min2 = elem;
            }
        }
        
        return Math.max(max1*max2*max3 , min1*min2*max1);
        
    }
}
