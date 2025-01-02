class Solution {
    public int getMinimumDifference(TreeNode root) {
        Queue<TreeNode> k = new LinkedList<>();
        ArrayList<Integer> l = new ArrayList<>();
        k.offer(root);
        while(!k.isEmpty())
        {
            int s = k.size();
            for(int i=0;i<s;i++)
            {
                TreeNode m= k.poll();
                l.add(m.val);
                if(m.left!=null)
                {
                    k.offer(m.left);
                }
                if(m.right!=null)
                {
                    k.offer(m.right);
                }
            }
        }
        System.out.println(l);
        int min = Math.abs(l.get(0)-l.get(1));
        for(int i=0;i<l.size();i++)
        {
            int g = l.get(i);
            for(int j=i+1;j<l.size();j++)
            {
                int diff = g-l.get(j);
                min = Math.min(Math.abs(diff),min);
                //System.out.println(min+" "+g+" "+l.get(j)+" "+diff);
            }
        }
        return min;
         
    }
}