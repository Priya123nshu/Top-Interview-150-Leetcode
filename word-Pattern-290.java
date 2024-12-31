class Solution {
    public boolean wordPattern(String pattern, String s) {
        HashMap<Character,String> k = new HashMap<>();
        int j = 0;
        for(int i=0;i<pattern.length();i++)
        {
            char ch = pattern.charAt(i);
            StringBuilder pk = new StringBuilder();
            while(j<s.length() && s.charAt(j)!=' ')
            {
                pk.append(s.charAt(j++));
            }
            j++;
            System.out.println(pk);
            String kp = pk.toString();
            pk.delete(0,pk.length());
            if(kp.equals(""))
            {
                return false;
            }
            //System.out.println(kp);
            if(k.containsKey(ch))
            {
                if(!k.get(ch).equals(kp))
                {
                    return false;
                }
            }
            else
            {
                if(k.containsValue(kp))
                {
                    return false;
                }
                k.put(ch,kp);
            }
        }
        System.out.println(k);
        if(j<s.length())
        {
            return false;
        }
        return true;
    }
}