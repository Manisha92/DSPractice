package com.Trees;

import sun.reflect.generics.tree.Tree;

/**
 * Created by manisha on 8/8/17.
 */
class Node{
    int key;
    Node left,right;

    Node(int item){
        key=item;
        left=right=null;
    }
}
public class TreeTraversal {

    Node root;
    TreeTraversal(){
        root=null;
    }
    public void inOrder(Node node){

        if(node==null){
            return;
        }
        inOrder(node.left);
        System.out.print(node.key+ "");
        inOrder(node.right);
    }
    public void preOrder(Node node){
        if(node==null){
            return;
        }
        System.out.print(node.key+ "");
        preOrder(node.left);
        preOrder(node.right);
    }
    public void postOrder(Node node){
        if(node==null){
            return;
        }
        postOrder(node.left);
        postOrder(node.right);
        System.out.print(node.key+ "");
    }

    public static void main(String[] args) {

        TreeTraversal tree = new TreeTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        System.out.println("Preorder traversal of binary tree is ");
        tree.preOrder(tree.root);

        System.out.println("\nInorder traversal of binary tree is ");
        tree.inOrder(tree.root);

        System.out.println("\nPostorder traversal of binary tree is ");
        tree.postOrder(tree.root);
    }

}
