class Solution
{
    public long findMinDiff (ArrayList<Integer> a, int n, int m)
    {
        // your code here
        long minn=Integer.MAX_VALUE;
        Collections.sort(a);
        for(int i=0;i+m-1<n;i++)
        {
            int j=i+m-1;
            minn=Math.min(minn,a.get(j)-a.get(i));
        }
        return minn;
    }
}
