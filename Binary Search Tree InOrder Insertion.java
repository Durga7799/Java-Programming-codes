class bst
{
 class Node
    {
        int data;
        Node left, right;
        public Node(int d)
        {
            data = d;
            left = right = null;
        }
    }
    Node root;
 bst() 
    {
        root = null;
    }
bst(int value)
 {
     root = new Node(value); 
     
 }
void insert(int data)
 { 
     root = insert(root, data);
     }
 Node insert(Node root, int data)
    {
        if (root == null) 
        {
            root = new Node(data);
            return root;
        }
        else if (data < root.data)
            root.left = insert(root.left, data);
        else if (data > root.data)
            root.right = insert(root.right, data);
        return root;
    }
 void inorder()
 {
     inorder(root);
     }
    void inorder(Node root)
    {
        if (root != null) 
        {
            inorder(root.left);
            System.out.print(root.data + " ");
            inorder(root.right);
        }
    }
}
    public class Main 
    {
    public static void main(String[] args)
    {
        bst t = new bst();
 t.insert(50);
        t.insert(30);
        t.insert(20);
        t.insert(40);
        t.insert(70);
        t.insert(60);
        t.insert(80);
        t.inorder();
    }
}
