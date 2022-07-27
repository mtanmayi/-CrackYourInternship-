class Solution {
    public boolean validPalindrome(String s) {
        int n=s.length();
        int i=0;
        int j=n-1;
        int flag1=0,flag2=0;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                flag1++;
                i++;
            }
            else{
            i++;
            j--;
            }
        }
        i=0;j=n-1;
        while(i<j)
        {
            if(s.charAt(i)!=s.charAt(j))
            {
                flag2++;
                j--;
            }
            else{
            i++;
            j--;
            }
        }
        
        if(flag1==0||flag1==1||flag2==0||flag2==1)
            
            return true;
        else
            return false;
    }
}
