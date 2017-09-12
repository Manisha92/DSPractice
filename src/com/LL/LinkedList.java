package com.LL;

/**
 * Created by manisha on 10/1/17.
 */

 class LinkedList
{
    Node head;
    class Node{
        Node next;
         int data;
        Node(int item){
            data=item;
            next=null;
        }
    }

    public Node getNext(Node node){
        return node.next;
    }
    protected void push(int data){
        Node node=new Node(data);
        node.next=head;
        head=node;
    }
protected void display(Node head){
        Node ptr=head;
        while(ptr!=null){
            System.out.println(ptr.data);
            ptr=ptr.next;
        }
}


protected void reverseList(Node node){
Node temp,next=null,prev=null,current=node;
while(current!=null){
    next=current.next;
    current.next=prev;
    prev=current;
    current=next;
}
head=prev;

}

protected void reverseListRecursive(Node h){
    Node first,rest;
    if(head==null){
        return;
    }
    first=head;
    rest=first.next;
    if(rest==null){
        return;
    }
    reverseListRecursive(first.next);
    first.next.next=first;
    first.next=null;
    head=rest;
}




    public static void main(String[] args) {

        LinkedList ll=new LinkedList();
        ll.push(1);
        ll.push(2);
        ll.push(3);
        ll.push(4);
        ll.push(5);
       //ll.display(ll.head);
       // ll.printReverse(ll.head);
   //   ll.reverseList(ll.head);
         ll.reverseListRecursive(ll.head);
        ll.display(ll.head);
    }
}


