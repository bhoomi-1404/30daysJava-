import java.util.Scanner;
public class Binarytree1 {


    public static class BinaryTreeNode<T>
    {
        T data;
        BinaryTreeNode<T> left;
        BinaryTreeNode<T> right;
        public BinaryTreeNode(T data)
        {
            this.data=data;
        }
    }


        public static  BinaryTreeNode<Integer> takeInput()
        {
            Scanner sc = new Scanner(System.in);
            int rootData=sc.nextInt();
            if(rootData==-1)
            {
                return null;
            }
            BinaryTreeNode<Integer> root = new BinaryTreeNode<>(rootData);
            BinaryTreeNode<Integer> leftChild = takeInput();
            BinaryTreeNode<Integer> rightChild = takeInput();
            root.left=leftChild;
            root.right=rightChild;
            return root;
        }
        public static int numNodes(BinaryTreeNode<Integer> root)
        {
            if(root==null)
                return 0;
            int leftcount=numNodes(root.left);
            int rightcount=numNodes(root.right);
            return leftcount+rightcount+1;
        }
        public static void printTree(BinaryTreeNode<Integer> root)
        {
            if(root==null)
                return;
            System.out.print(root.data+":");
            if(root.left!=null)
            {
                System.out.print("L"+root.left.data+",");
            }
            if(root.right!=null)
            {
                System.out.print(" R"+root.right.data+" ");
            }
            System.out.println();
            printTree(root.left);
            printTree(root.right);

        }
        public static void main(String[] args)
        {
            BinaryTreeNode<Integer> root=takeInput();
            printTree(root);
            System.out.println(numNodes(root));
        }

}
