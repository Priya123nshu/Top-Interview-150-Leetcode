class Solution {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int n1 = preorder.length;
        int n2 = inorder.length;
        return Tree(preorder,0,n1-1,inorder,0,n2-1);
    }
    public static TreeNode Tree(int[] preorder,int pres,int pren,int[] inorder,int ins,int ine)
    {
        if(pres>pren || ins>ine)
        {
            return null;
        }
        TreeNode temp = new TreeNode(preorder[pres]);
        int ind = 0;
        for(int i=ins;i<=ine;i++)
        {
            if(inorder[i]==preorder[pres])
            {
                ind = i;
            }
        }
        int x = ind-ins;
        temp.left = Tree(preorder,pres+1,pres+x,inorder,ins,ind-1);
        temp.right = Tree(preorder,pres+x+1,pren,inorder,ind+1,ine);
        return temp;
    }
}