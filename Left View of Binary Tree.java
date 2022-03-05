class Tree
{
    //Function to return list containing elements of left view of binary tree.
     void solve(Node root,ArrayList<Integer> ans,int level)
     {
         if(root==null)
         {
             return ;
         }
         if(level==ans.size())
         {
             ans.add(root.data);
         }
         solve(root.left,ans,level+1);
         solve(root.right,ans,level+1);
     }
    ArrayList<Integer> leftView(Node root)
    {
      // Your code here
      ArrayList<Integer> ans=new ArrayList<>();
     solve(root,ans,0);
      return ans;
    }
}
