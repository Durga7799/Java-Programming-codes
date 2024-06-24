class Node
{
    int data;
    Node left,right;
    public Node(int d)
    {
        data=d;
        left=right=null;
    }
}
class Tree
{
    Node root;
   Tree()
    {
        root=null;
    }

void inOrder(Node node)
{
    if(node==null)
    return;
    inOrder(node.left);
    System.out.println(node.data);
    inOrder(node.right);
}
}
public class Main 
{
    public static void main(String[] ar)
    {
        Tree tree=new Tree();
        tree.root=new Node(5);
        tree.root.left=new Node(3);
             tree.root.right=new Node(7);
             tree.root.left.left=new Node(10);
               tree.root.left.right=new Node(6);
               tree.inOrder(tree.root);
    }
}
