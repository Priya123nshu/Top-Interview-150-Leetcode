public class Solution {
    public static void helper(int[] nums,List<Integer> ds,boolean[] isvalid,List<List<Integer>> ans)
    {
        if(ds.size()==nums.length)
        {
            List<Integer> lt = new ArrayList<>();
            for(int i=0;i<nums.length;i++)
            {
                lt.add(ds.get(i));
            }
            ans.add(lt);
            return;
        }
        for(int i=0;i<nums.length;i++)
        {
            if(isvalid[i]==false)
            {
                isvalid[i]=true;
                ds.add(nums[i]);
                helper(nums,ds,isvalid,ans);
                isvalid[i]= false;
                ds.remove(ds.size()-1);
            }
        }
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        boolean[] isvalid = new boolean[nums.length]; 
        List<Integer> ds = new ArrayList<>();
        helper(nums,ds,isvalid,ans);
        return ans;
    }
} {
    
}