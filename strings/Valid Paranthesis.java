class Solution {
    public boolean isValid(String s) {
        Stack<Character> ss=new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            char c=s.charAt(i);
            if(!ss.isEmpty())
            {
            
            if(c=='('||c=='{'||c=='[')
                ss.push(c);
            else if(c==')'&&ss.peek()=='(')
                ss.pop();
            else if(c=='}'&&ss.peek()=='{')
                ss.pop();
            else if(c==']'&&ss.peek()=='[')
                ss.pop();
            else
                ss.push(c);
            }
            else
                ss.push(c);
        }
        if(ss.isEmpty())
            return true;
        else
            return false;
        
    }
}
