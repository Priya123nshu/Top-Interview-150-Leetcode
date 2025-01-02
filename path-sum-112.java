class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        return sol(root,targetSum);
    }
    public static boolean sol(TreeNode root,int ts)
    {
        if(root==null)
        {
            return false;
        }
        if(root.left==null && root.right==null)
        {
            return root.val==ts;
        }
        int x = ts - root.val;
        return sol(root.left,x) || sol(root.right,x);
    }
}