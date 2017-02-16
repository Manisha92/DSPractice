import java.util.*;
import java.util.LinkedList;

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
        //tree.preOrderIterative(tree.root);

        //System.out.println("Height"+tree.getHeight(tree.root));
        //System.out.println("Width"+tree.getWidth(tree.root));
        //tree.printNodesAtK(tree.root,2);

     //   tree.printAncesstors(tree.root,7);
        //tree.inOrderIterative(tree.root);
        tree.top_view(tree.root);

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
protected void preOrderIterative(Node root){
        if(root==null){
            return;
        }
    Stack<Node> preOrderStack=new Stack<>();
        preOrderStack.push(root);

         while (preOrderStack.empty()==false){
             Node dispNode=preOrderStack.peek();
             System.out.print(dispNode.data+" ");
             preOrderStack.pop();


             if(dispNode.left!=null){
                 preOrderIterative(dispNode.left);
             }
             if(dispNode.right!=null){
                 preOrderIterative(dispNode.right);

             }


         }

}
protected void inOrderRecursive(Node root){
    if(root!=null) {
        inOrderRecursive(root.left);
        System.out.print(root.data + " ");
        inOrderRecursive(root.right);
    }
}
protected void inOrderIterative(Node root){
    if(root==null){
        return;
    }
    Stack<Node> inorderStack=new Stack<>();
        Node current=root;
        while(current!=null){
            inorderStack.push(current);
            current=current.left;
        }
        while(inorderStack.size()>0){
            current=inorderStack.pop();
                System.out.print(current.data+" ");
                if(current.right!=null) {
                    current = current.right;

                    while (current != null) {
                        inorderStack.push(current);
                        current = current.left;
                    }
                }
        }
}

    void top_view(Node root)
    {
        Node current=root;
        Node node=null;
        Stack<Node> nodeStack=new Stack<>();
        while(current!=null){
            nodeStack.push(current);
            current=current.left;
        }
        while(nodeStack.size()>0){
            node=nodeStack.pop();
            System.out.print(node.data+" ");
        }
        Queue<Node> nodeQueue=new LinkedList<>();

        Node cur=root;
        while(cur.right!=null){
            nodeQueue.add(cur.right);
            cur=cur.right;
        }
        while(nodeQueue.size()>0){
            node=nodeQueue.poll();
            System.out.print(node.data+" ");
        }


    }

}
