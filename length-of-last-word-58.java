class Solution {
    public int lengthOfLastWord(String s) {
        int n = s.length();
        System.out.println(n);
        int count = 0;
        char[] arr = s.toCharArray();
        for(int i=n-1;i>=0;i--)
        {
            if(arr[i]==' ')
            {
                continue;
            }
            else{
                int j=i;
                while(j>=0 && arr[j]!=' ')
                {
                    count++;
                    j--;
                }
                break;
            }
        }
        return count;
    }
}