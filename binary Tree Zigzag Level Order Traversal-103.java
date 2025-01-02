class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> k = new ArrayList<>();
        Queue<TreeNode> p = new LinkedList<>();
        if(root==null)
        {
            return k;
        }
        p.offer(root);
        boolean check = true;
        while(!p.isEmpty())
        {
            int s = p.size();
            ArrayList<Integer> m = new ArrayList<>();
            for(int i=0;i<s;i++)
            {
                TreeNode bb = p.poll();
                if(check){
                m.add(bb.val);
                }
                else
                {
                    m.add(0,bb.val);
                }
                if(bb.left!=null)
                {
                    p.offer(bb.left);
                }
                if(bb.right!=null)
                {
                    p.offer(bb.right);
                }
            }
            k.add(m);
            check = !check;
        }
        return k;

    }
}