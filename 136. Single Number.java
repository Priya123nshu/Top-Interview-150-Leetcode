class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        int len = nums.length;
        if(len == 1) return nums[0];
        if(nums[0] != nums[1]) return nums[0];
        for(int i = 1; i < len - 1; i++){
           if(nums[i] != nums[i - 1] && nums[i] != nums[i + 1])
               return nums[i];
        }
        return nums[len - 1];
    }
}
