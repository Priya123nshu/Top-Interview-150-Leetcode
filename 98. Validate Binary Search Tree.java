class Solution {
    public static Integer prev;
    public boolean isValidBST(TreeNode root) {
        prev = null;
        return inorder(root);
    }
    public static boolean inorder(TreeNode root)
    {
        if(root==null)
        {
            return true;
        }
        if(!inorder(root.left))
        {
            return false;
        }
        if(prev!=null && prev>=root.val)
        {
            return false;
        }
        prev = root.val;
        if(!inorder(root.right))
        {
            return false;
        }
        return true;
    }
}