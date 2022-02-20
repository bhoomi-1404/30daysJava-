import java.util.Scanner;

public class TreeIsBalanced {
    public static class BinaryTreeNode<T>{
      T data;
      BinaryTreeNode left;
      BinaryTreeNode right;

      public BinaryTreeNode (T data)
      {
          this.data=data;
      }
    }
    public static class BalancedTreeReturn {
        int height;
        boolean isBal;

        public BalancedTreeReturn(int height,boolean isBal)
        {
            this.height=height;
            this.isBal=isBal;
        }
    }

    public static BinaryTreeNode takeInput()
    {
        Scanner s=new Scanner(System.in);
        int rootData=s.nextInt();
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        if(rootData==-1)
        {
            return null;
        }
        BinaryTreeNode<Integer> leftChild=takeInput();
        BinaryTreeNode<Integer> rightChild=takeInput();
        root.left=leftChild;
        root.right=rightChild;


     return root;
    }
    public static BalancedTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            BalancedTreeReturn b=new BalancedTreeReturn(0,true);
            return b;
        }
        BalancedTreeReturn lefth=isBalancedBetter(root.left);
        BalancedTreeReturn rightH=isBalancedBetter(root.right);
        boolean isBal=true;
        int height=1+ Math.max(lefth.height, rightH.height);
        if(Math.abs(lefth.height-rightH.height) >1)
        {
            isBal=false;
        }
        if(!lefth.isBal || !rightH.isBal)
        {
            isBal=false;
        }
        return (new BalancedTreeReturn(height,isBal));

    }
    public static int height(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;

        }
        return 1+Math.max(height(root.left),height(root.right));
    }
    public static boolean isBalanced(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return true;

        }
        int leftHeight=height(root.left);
        int rightHeight=height(root.right);
        if(Math.abs(leftHeight-rightHeight)>1)
        {
            return  false;

        }
       boolean leftSide= isBalanced(root.left);
        boolean rightSide=isBalanced(root.right);
         return leftSide && rightSide;

    }
    public static void main(String args[])
    {
       BinaryTreeNode<Integer> root=takeInput();
       System.out.println(isBalanced(root));
    }
}
