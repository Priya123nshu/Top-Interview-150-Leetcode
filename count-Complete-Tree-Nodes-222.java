public class Solution {
    public int countNodes(TreeNode root) {
        ArrayList<Integer> l = new ArrayList<>();
        inordercount(root,l);
        return l.size();
    }
    public void inordercount(TreeNode root,ArrayList<Integer> l)
    {
        if(root==null)
        {
            return;
        }
        inordercount(root.left,l);
        l.add(root.val);
        inordercount(root.right,l);
    }
} 
