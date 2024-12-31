class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        int n = nums.length;
        HashMap<Integer,Integer> p = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!p.containsKey(nums[i]))
            {
                p.put(nums[i],i);
            }
            else
            {
                int z = Math.abs(p.get(nums[i])-i);
                if(z<=k)
                {
                    return true;
                }
                p.put(nums[i],i);
            }
        }
        return false;
    }
}