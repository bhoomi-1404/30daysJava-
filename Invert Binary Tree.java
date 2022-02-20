class Solution {
    public TreeNode invertTree(TreeNode root) {
        if(root==null)
        {
           return null; 
        }
        invertTree(root.left);
        invertTree(root.right);
        TreeNode tempLeft=root.left;
        root.left=root.right;
        root.right=tempLeft;
         return root;
    }
}
