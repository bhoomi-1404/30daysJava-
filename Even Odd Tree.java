class Solution {
    public boolean isEvenOddTree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int level = 0;
        while(!q.isEmpty()){
            int prev = 0;
            if(level%2 == 0){
                for(int i = q.size();i!=0;i--){
                    TreeNode front = q.remove();
                    if(front.val%2!=0 && front.val>prev){
                        prev = front.val;
                    }else return false;
                    if(front.left!=null) q.add(front.left);
                    if(front.right!=null) q.add(front.right);
                }        
            }else{
                 prev = Integer.MAX_VALUE;
                 for(int i = q.size();i!=0;i--){
                    TreeNode front = q.remove();
                    if(front.val%2==0 && front.val<prev){
                        prev = front.val;
                    }else return false;
                     
                    if(front.left!=null) q.add(front.left);
                    if(front.right!=null) q.add(front.right);
                }   
            }
            level++;
        }
        return true;
    }
}
