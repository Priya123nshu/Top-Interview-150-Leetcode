class Solution {
    public void flatten(TreeNode root) {
         if(root==null)
         {
            return;
         }
         TreeNode tleft = root.left;
         TreeNode tright = root.right;
         root.left = null;


         flatten(tleft);
         flatten(tright);

         root.right=tleft;
         TreeNode l=root;
         while(l.right!=null)
         {
            l = l.right;
         }
         l.right = tright;
    }
}