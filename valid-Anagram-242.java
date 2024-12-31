class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
        {
            return false;
        }
        HashMap<Character,Integer> kk = new HashMap<>();
        for(int i=0;i<s.length();i++)
        {
            if(!kk.containsKey(s.charAt(i)))
            {
                kk.put(s.charAt(i),1);
            }
            else
            {
                kk.put(s.charAt(i),kk.get(s.charAt(i))+1);
            }
        }
        for(int i=0;i<t.length();i++)
        {
            char ch = t.charAt(i);
            if(kk.containsKey(ch))
            {
                int z = kk.get(ch)-1;
                kk.put(ch,z);
                if(z==0)
                {
                    kk.remove(ch);
                }
            }
        }
        System.out.println(kk);
        if(kk.isEmpty())
        {
            return true;
        }
        return false;
    }
}