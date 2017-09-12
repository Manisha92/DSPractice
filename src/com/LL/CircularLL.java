package com.LL;

import com.sun.jndi.cosnaming.CNCtx;

/**
 * Created by manisha on 8/9/17.
 */
public class CircularLL {

    CNode head;
    class CNode{
        int data;
        CNode next;
        CNode(int item){
            data=item;
            next=null;
        }
    }
    public void addToEmpty(CNode lastNode,int item){
        CNode cNode=new CNode(item);
         if(lastNode==null){

             cNode.next=cNode;
         }
         head=cNode;


    }
    public void addBegin(CNode last,int item){
        CNode newNode=new CNode(item);




    }
    public void disp(CNode last)
    {
        do{

            System.out.print(head.data);
        }while(last!=head);
    }
    public static void main(String[] args) {
        CircularLL circularLL=new CircularLL();
        circularLL.addToEmpty(null,2);
        circularLL.disp(circularLL.head);



    }
}
