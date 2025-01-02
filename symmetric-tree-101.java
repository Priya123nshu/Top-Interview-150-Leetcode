class Solution {
    public boolean isSymmetric(TreeNode root) {
        return sol(root,root);
    }
    public static boolean sol(TreeNode root1, TreeNode root2)
    {
        if(root1==null&&root2==null)
        {
            return true;
        }
        if(root1==null || root2==null)
        {
            return false;
        }
        return (root1.val==root2.val) && sol(root1.left,root2.right) && sol(root1.right,root2.left);
    }
}