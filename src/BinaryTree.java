/**
 * Created by manisha on 9/1/17.
 */
class Node{
    int data;
    Node left,right;
    Node(int item){
        data=item;
        left=right=null;

    }
}
public class BinaryTree {
    Node root;
    public static void main(String[] args) {

        BinaryTree tree=new BinaryTree();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(8);
        tree.root.right.right.left = new Node(6);
        tree.root.right.right.right = new Node(7);

        //System.out.println("Height"+tree.getHeight(tree.root));
        //System.out.println("Width"+tree.getWidth(tree.root));
        //tree.printNodesAtK(tree.root,2);

        tree.printAncesstors(tree.root,7);

    }
    protected  int getHeight(Node root){

        if(root==null){
            return 0;
        }
      //  System.out.println("Data "+root.data);
        int rHeight=0,lHeight=0;
        lHeight=getHeight(root.left);
       // System.out.println("LHeight "+lHeight);

        rHeight=getHeight(root.right);
       // System.out.println("RHeight "+rHeight);

       // System.out.println("MAxH "+1+Math.max(lHeight,rHeight));

        return 1+Math.max(lHeight,rHeight);


    }
    protected int getWidth(Node root)
    {
        int maxWidth=0;
            int h=getHeight(root);
            for(int i=1;i<h;i++){
                int width=getLevelWidth(root,i);
                if(width>maxWidth){

                    maxWidth=width;
                }
            }
            return maxWidth;
    }

    private int getLevelWidth(Node root, int i) {
        if(root==null){
            return 0;
        }
        if(i==1){
            System.out.println(root.data+","+i);
            return 1;
        }else if(i>1){

            return getLevelWidth(root.left,i-1)+getLevelWidth(root.right,i-1);
        }else{
            return -1;
        }

    }

    protected void printNodesAtK(Node root,int k){
        if(root==null){
            return ;
        }
        if(k==0){
            System.out.print(" "+root.data);
        }else{
            printNodesAtK(root.left,k-1);
            printNodesAtK(root.right,k-1);
        }
    }
    protected  boolean printAncesstors(Node node,int target){


        if (node == null)
            return false;

        if (node.data == target)
            return true;

        /* If target is present in either left or right subtree
           of this node, then print this node */
        if (printAncesstors(node.left, target)
                || printAncesstors(node.right, target))
        {
            System.out.print(node.data + " ");
            return true;
        }

        /* Else return false */
        return false;

    }

}
