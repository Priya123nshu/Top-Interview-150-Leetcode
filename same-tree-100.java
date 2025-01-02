class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        Queue<TreeNode> k = new LinkedList<>();
        k.add(p);
        k.add(q);
        while(!k.isEmpty())
        {
            TreeNode a = k.poll();
            TreeNode b = k.poll();
            if(a==null && b==null)
            {
                continue;
            }
            else if(a==null || b==null || a.val!=b.val)
            {
                return false;
            }
            k.add(a.left);
            k.add(b.left);
            k.add(a.right);
            k.add(b.right);
        }
        return true;
    }
}