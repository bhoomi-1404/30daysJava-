class Solution {
      static int index;
     static HashMap<Integer,Integer> hm;
      public static TreeNode solve(int inorder[],int preorder[],int start,int end,int n)
     {
         if(index>=n || start>end)
         {
             return null;
         }
         int element =preorder[index++];
         TreeNode root=new TreeNode(element);
         int pos=hm.get(element);
         root.left=solve(inorder,preorder,start,pos-1,n);
         root.right=solve(inorder,preorder,pos+1,end,n);
         return root;
         
     }
    public TreeNode buildTree(int[] preorder, int[] inorder) {
         index=0;
        hm= new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            hm.put(inorder[i],i);
        }
        TreeNode ans=solve(inorder,preorder,0,inorder.length-1,inorder.length);
        return ans;
    }
}
