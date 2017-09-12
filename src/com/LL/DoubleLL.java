package com.LL;

/**
 * Created by manisha on 6/9/17.
 */
public class DoubleLL {
    DLLNode head;

    class DLLNode{
        DLLNode prev,next;;
        int data;

        DLLNode(int item){

            data=item;
        }
    }

    public void insertDLL(int item){

        DLLNode node=new DLLNode(item);
        node.prev=null;
        node.next=head;
        if(head!=null) {
            head.prev = node;
        }
        head=node;
    }
public void insertAfterDLL(int item,DLLNode prevNode){
        DLLNode node=new DLLNode(item);
        node.next=prevNode.next;
        prevNode.next=node;
        node.prev=prevNode;
        if(node.next!=null){
            node.next.prev=node;
        }

}
public  void insertAtEnd(int item){
    DLLNode node=new DLLNode(item);
    DLLNode last=head;
    if(head==null){
        node.prev=null;
        head=node;
        return;
    }
    while(last.next!=null){
        last=last.next;
    }
    last.next=node;
    node.prev=last;

}
    public void reverse(DLLNode Node){
       DLLNode temp=null;
       DLLNode current=head;
        while(current!=null){
            temp=current.prev;
            current.prev=current.next;
            current.next=temp;
            current=current.prev;
        }
        if(temp!=null){
            head=temp.prev;
        }
    }

public void deleteFromDLL(DLLNode head,DLLNode del){
    if(head==null && del==null){
        return;
    }
    if(head.data==del.data){
        this.head=del.next;
    }
    if(del.next!=null){
        del.next.prev=del.prev;

    }
    if(del.prev!=null){
        del.prev.next=del.next;
    }

}
public void dispDLL(){
    DLLNode last=head;
    while(last!=null){
        System.out.print(last.data);
        last=last.next;
    }
}
    public static void main(String[] args) {
        DoubleLL doubleLL=new DoubleLL();
        doubleLL.insertDLL(4);
        doubleLL.insertDLL(6);
        doubleLL.insertDLL(8);
       // doubleLL.insertAfterDLL(5,doubleLL.head);
        doubleLL.insertAtEnd(7);
        //doubleLL.deleteFromDLL(doubleLL.head,doubleLL.head.next.next);
        //doubleLL.dispDLL();
        doubleLL.reverse(doubleLL.head);
        doubleLL.dispDLL();


    }
}
