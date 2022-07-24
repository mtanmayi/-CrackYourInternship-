class Solution {
    public int maxArea(int[] a) {
       int area = 0;
        int n=a.length;
     int low=0;
        int high=n-1;
        while(low<high)
        {
            area=Math.max(area,(Math.min(a[low],a[high])*(high-low)));
            if(a[low]<a[high])
                low++;
            else
                high--;
        }
        return area;
    }
}
