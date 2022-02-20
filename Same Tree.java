class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null)
        {
            return true;
        }
        if(p==null && q!=null)
        {
            return false;
        }
        if(q==null && p!=null)
        {
            return false;
        }
        boolean leftSide= isSameTree(p.left,q.left);
        boolean rightSide= isSameTree(p.right,q.right);
        //boolean  value=(p.val==q.val);
        if(leftSide && rightSide && p.val==q.val)
        {
            return true;
        }
        else
        {
            return false;
        }
        
    }
}
