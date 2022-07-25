class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
      List<Integer> list = new ArrayList<>(); int direction=0;
      
        int row=matrix.length;
        int col=matrix[0].length;
        
        int top = 0, bottom = row-1;
        int left = 0,right = col-1;
        
        while(top <= bottom && right>=left ){
            if(direction==0){
              for(int i=left;i<=right;i++)
                list.add(matrix[top][i]);
              top++;
              direction=1;
            }
            else if(direction==1){
               for(int i = top; i <= bottom; i++)
                  list.add(matrix[i][right]);
                right--;
                direction = 2;
            }
            else if(direction==2){
                for(int i=right;i>=left;i--)
                 list.add(matrix[bottom][i]);
              bottom--;
              direction=3;
            }
            else if(direction==3){
                for(int i=bottom;i>=top;i--)
                 list.add(matrix[i][left]);
               left++;
               direction =0;
            }
        }
        
        return list;
  }
}
