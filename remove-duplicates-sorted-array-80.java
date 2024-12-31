class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> k = new HashMap<>();
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
        int count = 0;
        int x = 0;
        for(var e : k.entrySet())
        {
            int z = e.getValue();
            if(z>=2)
            {
                count= count+2;
                nums[x++] = e.getKey();
                nums[x++] = e.getKey();
            }
            else
            {
                count++;
                nums[x++] = e.getKey();
            }
        }
        for(int i=0;i<count-1;i++)
        {
            for(int j=0;j<count-1;j++)
            {
                if(nums[j]>nums[j+1])
                {
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        return count;
}
}