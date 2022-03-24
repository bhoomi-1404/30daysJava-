class Solution {
    public int nodeCount(TreeNode root)
    {
        if(root==null)
        {
            return 0;
        }
        return 1+nodeCount(root.left)+nodeCount(root.right);
    }
    public boolean isCBT(TreeNode root,int i,int count)
    {
        if(root==null)
        {
            return true;
        }
        if(i>=count)
        {
            return false;
        }
        else
        {
            boolean left=isCBT(root.left,2*i+1,count);
            boolean right=isCBT(root.right,2*i+2,count);
            return left && right;
        }
    }
    public boolean isCompleteTree(TreeNode root) {
        int i=0;
        return isCBT(root,i,nodeCount(root));
        
    }
}
