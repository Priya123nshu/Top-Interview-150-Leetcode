class Solution {
    public int maxDepth(TreeNode root) {
        return depth(root);
    }
    public static int depth(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        int l = depth(root.left);
        int r = depth(root.right);
        return Math.max(l,r)+1;
    }
}