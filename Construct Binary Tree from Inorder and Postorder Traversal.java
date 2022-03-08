class Solution {
     static int index;
     static HashMap<Integer,Integer> hm;
      public static TreeNode solve(int inorder[],int postorder[],int start,int end,int n)
     {
         if(index<0 || start>end)
         {
             return null;
         }
         int element =postorder[index--];
         TreeNode root=new TreeNode(element);
         int pos=hm.get(element);
           root.right=solve(inorder,postorder,pos+1,end,n);
         root.left=solve(inorder,postorder,start,pos-1,n);
        
         return root;
         
     }
    public TreeNode buildTree(int[] inorder, int[] postorder) {
          index=inorder.length-1;;
        hm= new HashMap<>();
        for(int i=0;i<inorder.length;i++)
        {
            hm.put(inorder[i],i);
        }
        TreeNode ans=solve(inorder,postorder,0,inorder.length-1,inorder.length);
        return ans;
        
    }
}
