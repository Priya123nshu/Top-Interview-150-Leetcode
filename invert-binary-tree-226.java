class Solution {
    public TreeNode invertTree(TreeNode root) {
        Invert(root);
        return root;
    }
    public static void Invert(TreeNode root)
    {
        if(root==null)
        {
            return;
        }
        Invert(root.right);
        Invert(root.left);
        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;
    }
}
