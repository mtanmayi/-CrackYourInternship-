class Solution {
    public String smallestSubsequence(String s) {
        int[] index=new int[26]; int n=s.length();
        for(int i=0;i<n;i++)
        
            index[s.charAt(i)-'a']=i;
        
        boolean[] seen=new boolean[26];
        Stack<Character> ss=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char curr=s.charAt(i);
            if(seen[curr-'a'])
                continue;
            while(!ss.isEmpty()&&ss.peek()>curr&&index[ss.peek()-'a']>i)
            {
                seen[ss.peek()-'a']=false;
                ss.pop();
               
            }
            ss.push(curr);
            seen[curr-'a']=true;
        }
        String str="";
        while(!ss.isEmpty())
        {
            str=ss.pop()+str;
        }
        return str;
    }
}
