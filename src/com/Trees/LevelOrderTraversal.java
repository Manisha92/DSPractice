package com.Trees;

/**
 * Created by manisha on 8/8/17.
 */
class node{
    int key;
    node left,right;
    public  node(int item){
        key=item;
        left=right=null;
    }
}
public class LevelOrderTraversal {
    node root;

    LevelOrderTraversal(){
        root=null;
    }
    private void printLevelOrder(node node){
        for(int i=1;i<=getHeight(node);i++){
            printTheLevel(node,i);
        }
    }
    private void printTheLevel(node node,int height){
        if(node==null){
            return;
        }
        if(height==1){
            System.out.print(node.key);
        }
       else if(height>1){
            printTheLevel(node.left,height-1);
            printTheLevel(node.right,height-1);
        }


    }
    private int getHeight(node node){
           if(node==null){
               return 0;
           }
           int lHeight=getHeight(node.left);
           int rHeight=getHeight(node.right);
           if(rHeight>lHeight){
               return (rHeight+1);
           }else{
               return (lHeight+1);
           }
    }
    public static void main(String[] args) {
            LevelOrderTraversal tree=new LevelOrderTraversal();

        tree.root= new node(1);
        tree.root.left= new node(2);
        tree.root.right= new node(3);
        tree.root.left.left= new node(4);
        tree.root.left.right= new node(5);
        tree.root.left.left.left= new node(6);
        tree.root.left.left.right= new node(7);
        //tree.getHeight(tree.root);

        System.out.println("Level order traversal of binary tree is ");
        tree.printLevelOrder(tree.root);
    }

}
