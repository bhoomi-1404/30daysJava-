class Solution {
  //  static int i;
    int i=0;
    public TreeNode solve(int[] preorder,int min,int max)
    {
        if(i>=preorder.length)
        {
            return null;
        }
        if(preorder[i]<min || preorder[i]>max)
        {
            return null;
        }
       // int value=preorder
        TreeNode newRoot=new TreeNode(preorder[i++]);
        newRoot.left=solve(preorder,min,newRoot.val);
        newRoot.right=solve(preorder,newRoot.val,max);
        return newRoot;
    }
    public TreeNode bstFromPreorder(int[] preorder) {
        int min=Integer.MIN_VALUE;
        int max=Integer.MAX_VALUE;
         
        return solve(preorder,min,max);
    }
}
