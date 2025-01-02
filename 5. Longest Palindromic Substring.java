class Solution {
    public String longestPalindrome(String s) {
        if(s.length()<2)
        {
            return s;
        }
        int n = s.length();
        int max = 0;
        String p = new String("");
        for(int i=0;i<n;i++)
        {
            for(int j=n-1;j>=i;j--)
            {
                boolean k = isPalindrome(s,i,j);
                {
                    if((j-i+1>max) && k)
                    {
                        p= s.substring(i,j+1);
                        max = j-i+1;
                    }
                }
            }
        }
        return p;

    }
    public static boolean isPalindrome(String s,int str,int end)
    {
        while(str<=end)
        {
            if(s.charAt(str)!=s.charAt(end))
            {
                return false;
            }
            str++;
            end--;
        }
        return true;
    }
}