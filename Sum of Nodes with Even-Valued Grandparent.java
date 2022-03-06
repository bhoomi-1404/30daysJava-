
class Solution {
    

    public int sumEvenGrandparent(TreeNode root) {
 
        if(root==null)
        {
            return 0;
            
        }
        int ls=sumEvenGrandparent(root.left);
        int rs=sumEvenGrandparent(root.right);
        int sum=ls+rs;
        if(root.val%2==0)
        {
            if(root.left!=null && root.left.left!=null)
            {
                sum+=root.left.left.val;
            }
             if(root.left!=null && root.left.right!=null)
            {
                sum+=root.left.right.val;
            }
             if(root.right!=null && root.right.left!=null)
            {
                sum+=root.right.left.val;
            }
             if(root.right!=null && root.right.right!=null)
            {
                sum+=root.right.right.val;
            }
            
        }
        return sum;
        
    }
}
