class Solution {
    public String longestCommonPrefix(String[] strs) {
        String str="";
        int n=strs.length;
        Arrays.sort(strs);
        String s1=strs[0];
        String s2=strs[n-1];
        for(int i=0;i<s1.length();i++)
        {
            if(s1.charAt(i)==s2.charAt(i))
                str+=s1.charAt(i);
            else
                break;
        }
        return str;
    }
}
