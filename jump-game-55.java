class Solution {
    public boolean canJump(int[] nums) {
        int last = nums.length-1;
        int n = nums.length-1;
        for(int i=n;i>=0;i--)
        {
            int jump = i+nums[i];
            if(jump>=last)
            {
                last = i;
            }
        }
        if(last==0)
        {
            return true;
        }
        return false;
    }
}