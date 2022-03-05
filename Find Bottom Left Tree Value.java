class Solution {
    void solve(TreeNode root,ArrayList<Integer> ans,int level)
    {
        if(root==null)
        {
            return ;
        }
        if(level==ans.size())
        {
            ans.add(root.val);
        }
        solve (root.left,ans,level+1);
        solve(root.right,ans,level+1);
    }
    public int findBottomLeftValue(TreeNode root) {
        
        ArrayList<Integer> ans=new ArrayList<>();
        solve(root,ans,0);
        return ans.get(ans.size()-1);
    }
}
