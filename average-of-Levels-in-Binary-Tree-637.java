class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
        ArrayList<Double> k = new ArrayList<>();
        Queue<TreeNode> p = new LinkedList<>();
        p.offer(root);
        while(p.size()!=0)
        {
            ArrayList<Integer> m = new ArrayList<>();
            int n = p.size();
            for(int i=0;i<n;i++)
            {
                TreeNode b = p.poll();
                m.add(b.val);
                if(b.left!=null)
                {
                    p.add(b.left);
                }
                if(b.right!=null)
                {
                    p.add(b.right);
                }
            }
            Double sum = 0.00;
            for(int i=0;i<m.size();i++)
            {
                sum = sum+m.get(i);
            }
            Double v = sum/m.size();
            k.add(v);
        }
        System.out.println(k);
        return k
        ;
    }
}