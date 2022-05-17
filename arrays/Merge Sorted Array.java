class Solution {
    public void merge(int[] arr, int m, int[] brr, int n) {
        int i=m-1,j=n-1,c=arr.length-1;
        while(i>=0&&j>=0)
        {
            if(arr[i]>brr[j])
            {
                arr[c]=arr[i];
                c--;
                i--;
            }
            else
            {
                arr[c]=brr[j];
                c--;
                j--;
            }
        }
        while(j>=0)
        {
            arr[c]=brr[j];
            c--;
            j--;
        }
    }
}
