class Solution {
int maxSum = 0;
public int maxSumBST(TreeNode root) {
if(root == null) return 0;
check(root);
return maxSum;
}
class Info{
boolean isBST;
int min;
int max;
int sum_so_far;

  public Info(boolean isBST, int min, int max, int sum_so_far){
        this.isBST = isBST;
        this.min = min;
        this.max = max;
        this.sum_so_far = sum_so_far;
    }
}
public Info check(TreeNode root){
    if(root == null) return new Info(true, Integer.MAX_VALUE,Integer.MIN_VALUE, 0);
   
    Info l = check(root.left);
    Info r = check(root.right);

    if(l == null || r == null) return null;
    
    if(l.max >= root.val || r.min <= root.val) return null;
    
    maxSum = Math.max(root.val + l.sum_so_far + r.sum_so_far, maxSum);
    
    return new Info(true, Math.min(root.val, l.min), Math.max(root.val, r.max), root.val + l.sum_so_far + r.sum_so_far);
}
}
