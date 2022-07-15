class Solution {
    public int subarraySum(int[] nums, int k) {
        int n=nums.length;
        int[] a=new int[n];
        int sum,count=0;
        
        for(int i=0;i<n;i++)
        {
            sum=0;
            for(int j=i;j<n;j++)
            {
                    sum+=nums[j];
                    if(sum==k)
                    {
                        count++;                        
                    }
            }
        }
        return count;
    }
}
-----------------------------------------------------------------------------------------------------------
  
  class Solution {
    public int subarraySum(int[] nums, int k) {
        HashMap<Integer, Integer> hs = new HashMap<>();
		// Initialize the hashmap.
        hs.put(0,1);
        int presum=0; // Prefix Sum 
        int count=0;  // Counter variable to store frequencies/ occurences
        for(int i=0;i<nums.length;i++)
        {
            presum+=nums[i];   
            // Calculate presfix sum at each step
			// Check if prefix sum is already there in map. 
			// Store its frequency in a counter. Note that we 
			// don't increment the count by 1 rather we add 
			// its frequency bcz if we saw the same prefix sum twice earlier, 
			// then we add "2" and not increment it by 1.
			if (hs.containsKey(presum-k)) 								  
            {
                count+=hs.get(presum-k);
            }
			// If presum is not there, add it with its frequency (currently 1). If it's there, increment its frequency.
             if(hs.containsKey(presum))
                hs.put(presum,hs.get(presum)+1);
            else
                hs.put(presum,1);
        }
        return count;
    }
}
