class Solution {
    public int sumNumbers(TreeNode root) {
        return sol(root,0);
    }
    public static int sol(TreeNode root,int sum)
    {
        if(root==null)
        {
            return 0;
        }
        sum=sum*10+root.val;
        if(root.left==null&&root.right==null)
        {
            return sum;
        }
        return sol(root.left,sum)+sol(root.right,sum);
    }
}