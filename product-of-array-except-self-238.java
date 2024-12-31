class Solution {
    public int[] productExceptSelf(int[] nums) {
        int check = 0;
        int mul = 1;
        int count = 0;
        int[] k = new int[nums.length];
        for(int i=0;i<nums.length;i++)
        {
            if(nums[i]==0)
            {
                check = 1;
                count++;
                continue;
            }
            mul = mul*nums[i];
        }
        if(count>1)
        {
            for(int i=0;i<nums.length;i++)
            {
                k[i]=0;
            }
            return k;
        }
        if(check==0)
        {
            for(int i=0;i<nums.length;i++)
            {
                k[i] = mul/nums[i];
            }
        }
        else
        {
            for(int i=0;i<nums.length;i++)
            {
                if(nums[i]==0)
                {
                    k[i] = mul;
                    continue;
                }
                k[i] = 0;
            }
        }
        return k;
    }
}