class Solution {
    public boolean isHappy(int n) {
        HashSet<Integer> kk = new HashSet<>();
        while(true)
        {
            int sum = 0;
            while(n!=0)
            {
                int rem = n%10;
                sum = sum + (int)Math.pow(rem,2);
                n = n/10;
            }
            n = sum;
            if(sum==1)
            {
                return true;
            }
            if(kk.contains(n))
            {
                return false;
            }
            else
            {
                kk.add(n);
            }
        }
    }
}