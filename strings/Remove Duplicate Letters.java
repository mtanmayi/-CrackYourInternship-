class Solution {
    public String removeDuplicateLetters(String s) {
        int[] index=new int[26];
        for(int i=0;i<s.length();i++)
        {
            index[s.charAt(i)-'a']=i;
        }
        boolean[] seen=new boolean[26];
        Stack<Integer> ss=new Stack<Integer>();
        for(int i=0;i<s.length();i++)
        {
            int curr=s.charAt(i)-'a';
            if(seen[curr])
                continue;
            while(!ss.isEmpty()&&(ss.peek()>curr)&&index[ss.peek()]>i)
            {
                seen[ss.pop()]=false;               
            }
            ss.push(curr);
            seen[curr]=true;
        }
        String str="";
        while(!ss.isEmpty())
        {
            char x=(char)(ss.pop()+'a');
                str=x+str;
        }
        return str;
    }
}
