class Solution {
    public boolean isValid(String s) {
        Stack<Character> k = new Stack<>();
        for(int i=0;i<s.length();i++)
        {
            if(s.charAt(i)=='{' || s.charAt(i)=='(' || s.charAt(i)=='[')
            {
                k.push(s.charAt(i));
            }
            else
            {
                if(k.isEmpty())
                {
                    System.out.println("fff");
                    return false;
                }
                char ph = k.pop();
                if(s.charAt(i)==']')
                {
                    if(ph!='[')
                    {
                        return false;
                    }
                }
                else if(s.charAt(i)=='}')
                {
                    if(ph!='{')
                    {
                        return false;
                    }
                }
                else if(s.charAt(i)==')')
                {
                    if(ph!='(')
                    {
                        return false;
                    }
                }
            }
        }
        if(k.isEmpty())
        {
            return true;
        }
        return false;
    }
}