//Given N candies and K people. In the first turn, the first person gets 1 candy, the second gets 2 candies, and so on till K people. 
//In the next turn, the first person gets K+1 candies, the second person gets K+2 candies and so on. If the number of candies is less 
//than the required number of candies at every turn, then the person receives the remaining number of candies.
//Find the total number of candies every person has at the end.

class Solution {
    static Long[] distributeCandies(int n, int K) {
        // code here
        Long[] arr = new Long[K];
        int j = 0;
        for(int i=0;i<K;i++)
        {
            arr[i]=0L;
        }
        while(n>0){
             
            for(int i =0;i<K;i++){
                j++;
                if(n<=0){
                    break;
                }
                else{
                    if(j<n){
                        arr[i] = arr[i]+j;
                    }
                    else{
                        arr[i] = arr[i]+n;
                    }
                    n = n-j;
                }
                 
            }
        }
        return arr;
    }
};
