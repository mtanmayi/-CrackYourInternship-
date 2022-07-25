class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> li = new ArrayList<Integer>();
        int maxr = matrix.length-1;
        int maxc = matrix[0].length-1;
        int i,j;
        int minr = 0, minc = 0, t = matrix.length*matrix[0].length, c = 0;
        while(c<t)
        {
            for(i = minr, j = minc; j<=maxc && c<t; j++,c++)
            {
                li.add(matrix[i][j]);
            }
            minr++;
            for(i = minr, j = maxc; i<=maxr && c<t; i++,c++)
            {
                li.add(matrix[i][j]);
            }
            maxc--;
            for(i = maxr, j = maxc; j>=minc && c<t; j--,c++)
            {
                li.add(matrix[i][j]);
            }
            maxr--;
            for(i = maxr, j = minc; i>=minr && c<t; i--,c++)
            {
                li.add(matrix[i][j]);
            }
            minc++;
        }
        return li;
        
    }
}
