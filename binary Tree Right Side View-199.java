class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        if(root==null)
        {
            return l;
        }
        Queue<TreeNode> k = new LinkedList<>();
        k.offer(root);
        while(!k.isEmpty())
        {
            int size = k.size();
            for(int i=0;i<size;i++)
            {
                TreeNode p = k.poll();
                if(i==size-1)
                {
                    l.add(p.val);
                }
                if(p.left!=null)
                {
                    k.offer(p.left);
                }
                if(p.right!=null)
                {
                    k.offer(p.right);
                }
            }
        }
        return l;
    }
}