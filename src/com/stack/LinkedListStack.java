package com.stack;

/**
 * Created by manisha on 17/4/17.
 */
public class LinkedListStack {
    Node root;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    LinkedListStack(int data){
        root=new Node(data);

    }
   public void push(int data){
        Node newNode=new Node(data);
        newNode.next=root;
        root=newNode;
   }
   public Node pop(){
       Node temp=root;
       root=root.next;
       return temp;
   }
   public boolean isEmpty(){
       if(root==null){
           return true;
       }
       return  false;
   }
public void display(){
       Node ptr=root;
        System.out.println("List");
       while(ptr!=null){
           System.out.print(ptr.data);
           ptr=ptr.next;
       }
}
    public static void main(String[] args) {
        LinkedListStack linkedListStack=new LinkedListStack(2);
        linkedListStack.push(1);
        linkedListStack.push(3);
        linkedListStack.push(4);
        linkedListStack.push(6);
        linkedListStack.display();
        linkedListStack.pop();
        linkedListStack.display();



    }

}
