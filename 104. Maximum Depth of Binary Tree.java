public class HeightOfBst {

    static class Node{
        int data;
        Node left;
        Node right;
        public Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }

    public static int HeightofTree(Node root){
        int result=0;
        if(root==null){
            return 0;
        }
        int leftHeight=HeightofTree(root.left);
        int rightHeight=HeightofTree(root.right);
        result=Math.max(leftHeight,rightHeight)+1;
        return result;

    }
    public static void main(String[] args) {
        Node root=new Node(1);
        root.left=new Node(2);
        root.right=new Node(3);
       root.left.left=new Node(4);
       root.left.right=new Node(5);
       root.right.left=new Node(6);
       root.right.right=new Node(7);

        System.out.println(HeightofTree(root));



    }
}
