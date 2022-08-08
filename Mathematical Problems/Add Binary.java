class Solution {
    public String addBinary(String a, String b) {
        int m = a.length()-1;
        int n = b.length()-1;
        int c = 0;
        String s = "";
        while(m>=0||n>=0){
            int z = 0;
            if(m>=0)
                z += a.charAt(m)-'0';
            if(n>=0)
                z += b.charAt(n)-'0';
            z+=c;
            s=z%2+s;
            c = z/2;    
             --m;
             --n;
        }
        if(c!=0)
            s=c+s;
        return s;
        
    }
}
