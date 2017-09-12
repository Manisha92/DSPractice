package com.Trees;

/**
 * Created by manisha on 29/8/17.
 */
class HNode{
    int item;
    HNode left,right;
    HNode(int data){
        this.item=data;
        left=null;
        right=null;
    }
}
public class HeightOfTree {
        HNode root;
    public int getTHeight(HNode root){
        if(root==null){
            return 0;
        }
        int lH=getTHeight(root.left);
        int rH=getTHeight(root.right);
        if(lH>rH){
            return lH+1;
        }else{
            return rH+1;
        }
    }

    public static void main(String[] args) {
        HeightOfTree heightOfTree=new HeightOfTree();
        heightOfTree.root=new HNode(1);
        heightOfTree.root.left = new HNode(2);
        heightOfTree.root.right = new HNode(3);
        heightOfTree.root.left.left = new HNode(4);
        heightOfTree.root.left.right = new HNode(5);
        System.out.print(heightOfTree.getTHeight(heightOfTree.root));
    }

}
