class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> k = new LinkedList<>();
        if(root==null)
        {
            return k;
        }
        Queue<TreeNode> w = new LinkedList<>();
        w.offer(root);
        while(!w.isEmpty())
        {
            ArrayList<Integer> l = new ArrayList<>();
            int s = w.size();
            for(int i=0;i<s;i++)
            {
                TreeNode b = w.poll();
                l.add(b.val);
                if(b.left!=null)
                {
                    w.offer(b.left);
                }
                if(b.right!=null)
                {
                    w.offer(b.right);
                }
            }
            k.add(l);
        }
        return k;

    }
}