public class Solution {
    public int solve(int[] A) {

         int n = A.length;
        int result = 0;
        int even = 0;
        int odd =0;
        
        for(int i = 0 ; i < n ; i++){
            if(i%2 == 0)
                even += A[i];
            else
                odd += A[i];
        }
        
        int keven = 0;
        int kodd =0;
       
        
        for(int i = 0 ; i < n ; i++){
            if(i%2 == 0){
                if(odd+keven==kodd+even-A[i])
                result++;
                even-=A[i];
                keven+=A[i];
            }
            else{
                if(kodd+even==keven+odd-A[i])
                result++;
                odd-=A[i];
                kodd+=A[i];
            }
                
        }
        
        return result;
    }
}
