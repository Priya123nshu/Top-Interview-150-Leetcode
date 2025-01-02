class Solution {
    public double myPow(double x, int n) {
        long k = n;
        return answer(x,k);
    }
    public static double answer(double x, long n)
    {
        if(n==0)
        {
            return 1;
        }
        if(n<0)
        {
            return answer(1/x,-n);
        }
        if(n%2==0)
        {
            return answer(x*x,n/2);
        }
        else
        {
            return x*answer(x*x,(n-1)/2);
        }
    }
}