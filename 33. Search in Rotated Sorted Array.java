class Solution {
    public int search(int[] nums, int target) {
    int n = nums.length;
    int minidx = 0;
    for(int i=0;i<n;i++)
    {
        if(nums[i]<nums[minidx])
        {
            minidx = i;
        }
    }
    int s = 0;
    int e = minidx;
    while(s<=e)
    {
        int mid = s + (e-s)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]>target)
        {
            e = mid-1;
        }
        else
        {
            s = mid+1;
        }
    }
    s = minidx;
    e = n-1;
    while(s<=e)
    {
        int mid = s + (e-s)/2;
        if(nums[mid]==target)
        {
            return mid;
        }
        else if(nums[mid]>target)
        {
            e = mid-1;
        }
        else
        {
            s = mid+1;
        }
    }
    return -1;
}
}