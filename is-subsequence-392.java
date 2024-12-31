class Solution {
    public boolean isPalindrome(String s) {
        int n = s.length();
        StringBuilder sk = new StringBuilder();
        for(int i=0;i<n;i++)
        {
            char ch = s.charAt(i);
            if((ch>='A' && ch<='Z') || (ch>='a' && ch<='z') || (ch>='0' && ch<='9'))
            {
                sk.append(ch);
            }
        }
        String k = sk.toString();
        k = k.toLowerCase();
        System.out.println(k);
        int m = k.length();
        if(k=="p")
        {
            return false;
        }
        for(int i=0,j=m-1;i<m/2;i++,j--)
        {
            if(k.charAt(i)!=k.charAt(j))
            {
                return false;
            }
        }
        System.out.println(k);
        return true;
    }
}