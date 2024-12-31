class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        int p = n/2;
        HashMap<Integer,Integer> k =new HashMap<>();
        for(int i=0;i<n;i++)
        {
            if(!k.containsKey(nums[i]))
            {
                k.put(nums[i],1);
            }
            else
            {
                k.put(nums[i],k.get(nums[i])+1);
            }
        }
        for(var e: k.entrySet())
        {
            int a = e.getValue();
            if(a>p)
            {
                return e.getKey();
            }
        }
        return 0;
    }
}