class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder s=new StringBuilder();
        while(columnNumber>0)
        {
            int rem=(columnNumber-1)%26;
            s.append((char)(rem+'A'));
            columnNumber=(columnNumber-1)/26;
        }
        return s.reverse().toString();
    }
}
