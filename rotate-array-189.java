class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        if(n==1)
        {
            return;
        }
        int z = k%n;
        reverserecur(nums,0,n-1);
        reverserecur(nums,0,z-1);
        reverserecur(nums,z,n-1);
    }
    public void reverserecur(int[] arr,int str,int end)
    {
        if(str>=end)
        {
            return;
        }
        int temp = arr[str];
        arr[str] = arr[end];
        arr[end] =temp;
        reverserecur(arr,str+1,end-1);
    }
}