class Solution {
    public int[] searchRange(int[] nums, int target) {
        int left = binary(nums,0,nums.length-1,target,1);
        int right = binary(nums,0,nums.length-1,target,0);
        int[] arr= new int[2];
        arr[0] = left;
        arr[1] = right;
        return arr;

    }
    public static int binary(int[] nums,int str,int end,int t,int check)
    {
        int idx = -1;
        while(str<=end)
        {
            int mid= str+(end-str)/2;
            if(nums[mid]==t)
            {
                idx = mid;
                if(check==1)
                {
                    end = mid-1;
                }
                else
                {
                    str=mid+1;
                }
                
            }
            else if(nums[mid]>t)
            {
                end = mid-1;
            }
            else
            {
                str = mid+1;
            }
        }
        return idx;
    }
}