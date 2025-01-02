class Solution {
    public int trailingZeroes(int n) {
       int a =0;
       while(n!=0)
       {
            n=n/5;
            a=a+n;
       } 
       return a;

    }
}