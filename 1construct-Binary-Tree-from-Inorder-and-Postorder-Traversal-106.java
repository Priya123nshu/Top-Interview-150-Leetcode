class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        HashMap<Integer,Integer> k = new HashMap<>();
        int n = inorder.length;
        for(int i=0;i<n;i++)
        {
            k.put(inorder[i],i);
        }
        return build(inorder,0,inorder.length-1,postorder,0,postorder.length-1,k);
    }
    public TreeNode build(int[] inorder,int ins,int ine,int[] postorder,int pos,int poe,HashMap<Integer,Integer> k)
    {
        if(ins>ine)
        {
            return null;
        }
        TreeNode temp = new TreeNode(postorder[poe]);
        int index = k.get(postorder[poe]);
        int left = index-ins;
        temp.left = build(inorder,ins,index-1,postorder,pos,pos+left-1,k);
        temp.right = build(inorder,index+1,ine,postorder,pos+left,poe-1,k);
        return temp;
    }
}