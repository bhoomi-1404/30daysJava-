class Solution {
   
    void solve (TreeNode root,ArrayList<String> ans,String str)
    {
                if(root==null)
        {
            return ;
        }
        str+=Integer.toString(root.val)+"->";
        if(root.left==null && root.right==null)
        {
            ans.add(str.substring(0,str.length()-2));
            return ;
        }
        if(root.left!=null)
        {
        solve(root.left,ans,str);
        }
        if(root.right!=null)
        {
        solve(root.right,ans,str);
        }

        
    }
    public List<String> binaryTreePaths(TreeNode root) {
        ArrayList<String> ans=new ArrayList<>();
         String str="";
        solve(root,ans,str);
        return ans;

        
        
    }
}
