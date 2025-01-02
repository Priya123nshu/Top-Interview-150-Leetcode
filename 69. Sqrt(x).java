class Solution {
    public int mySqrt(int x) {
        long str = 1;
        long end = x;

        while(str<end)
        {
            long mid = str +(end-str)/2;
            if(mid*mid>=x)
            {
                end = mid;
            }
            else
            {
                str = mid+1;
            }
        }
        if(str*str==x)
        {
            return (int)str;
        }
        return (int)str-1;
    }
}