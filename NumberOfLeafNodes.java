import java.util.Scanner;

public class NumberOfLeaf {
    public static class BinaryTreeNode<T> {
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
        T data;

        public BinaryTreeNode(T data) {
            this.data = data;
        }
    }
    public static BinaryTreeNode<Integer> takeInput()
    {
        Scanner s=new Scanner(System.in);
        int rootData=s.nextInt();
        if(rootData==-1)
        {
            return null;
        }
        BinaryTreeNode<Integer> root=new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild=takeInput();
        BinaryTreeNode<Integer> rightChild=takeInput();
        root.left=leftChild;
        root.right=rightChild;
        return  root;

    }
    public static int countLeaf(BinaryTreeNode<Integer> root)
    {
        if(root==null)
        {
            return 0;
        }
        if(root.left==null && root.right==null)
        {
            return 1;
        }
        return countLeaf(root.left)+countLeaf(root.right);
    }
    public static void main(String args[])
    {
        BinaryTreeNode<Integer> root=takeInput();
        System.out.println(countLeaf(root));

    }
}
