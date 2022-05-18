class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
       Arrays.sort(arr);
        List<List<Integer>> ans=new ArrayList<>();
        int n=arr.length;
        for(int i=0;i<n;i++){
            if(i!=0 && arr[i]==arr[i-1]) 
                continue;
            int low=i+1;
            int high=n-1;
            while(low<high){
                int sum=arr[i]+arr[low]+arr[high];
                if(sum==0){
                    ArrayList<Integer> list=new ArrayList<>();
                    list.add(arr[i]);
                    list.add(arr[low]);
                    list.add(arr[high]);
                    ans.add(list);
					
                    while(low<high && arr[low]==arr[low+1])low++;
                    while(low<high && arr[high]==arr[high-1])high--;
                    low++;
                    high--;
                }
                else if(sum>0)
                    high--;
                else
                    low++;
            }
        }
        return ans;
        
    }
}
