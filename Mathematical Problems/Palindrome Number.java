class Solution {
    public boolean isPalindrome(int x) {
        int r,rev=0;
        while(x!=0)
        {
            r=x%10;
            rev=(rev*10)+r;
            x=x/10;
           
        }  
         //System.out.print(rev+" ");
        
        if(x==rev)
            return true;
        else
            return false;
    }
}
