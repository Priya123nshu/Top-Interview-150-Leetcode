class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        HashMap<Character,Integer> pk = new HashMap<>();
        HashMap<Character,Integer> ck = new HashMap<>();
        for(int i=0;i<magazine.length();i++)
        {
            if(pk.containsKey(magazine.charAt(i)))
            {
                pk.put(magazine.charAt(i),pk.get(magazine.charAt(i))+1);
            }
            else
            {
                pk.put(magazine.charAt(i),1);
            }
        }
        for(int i=0;i<ransomNote.length();i++)
        {
            if(ck.containsKey(ransomNote.charAt(i)))
            {
                ck.put(ransomNote.charAt(i),ck.get(ransomNote.charAt(i))+1);
            }
            else
            {
                ck.put(ransomNote.charAt(i),1);
            }
        }
        System.out.println(pk);
        System.out.println(ck);
        for(var e : ck.entrySet())
        {
            if(pk.containsKey(e.getKey()))
            {
                if(e.getValue()>pk.get(e.getKey()))
                {
                    return false;
                }
            }
            else
            {
                return false;
            }
        }
        return true;


    }
}