class Solution {
    public int removeDuplicates(int[] nums) {
        int n =nums.length;
        int count = 0;
        int x =0;
        int prev = 0;
        int[] k = new int[n];
        for(int i=0;i<n;i++)
        {
            if(i==0)
            {
                prev = nums[i];
                k[x++] = prev;
                count++;
                continue;
            }
            if(nums[i]==prev)
            {
                continue;
            }
            count++;
            k[x++] = nums[i];
            prev = nums[i];
        }
        for(int i=0;i<n;i++)
        {
            nums[i] = k[i];
        }
        return count;
    }
}