package com.Queue;

/**
 * Created by manisha on 30/8/17.
 */
public class RepQueue {

    int front,rear,size,cap,arr[];
    RepQueue(int cap){
        front=this.size=0;
        this.cap=cap;
        rear=cap-1;
        arr=new int[cap];

    }
    public boolean isFull(RepQueue queue)
    {
        if(queue.size==cap){
            return true;
        }
        return false;
    }
    public boolean isEmpty(RepQueue queue){
        if(queue.size==0){
            return true;
        }
        return false;
    }
    public void enqueue(int item){

        if(isFull(this)){
            return;
        }
        rear=(rear+1)%this.cap;
        arr[rear]=item;
        this.size++;
    }

    public void dequeue(){
        if(isEmpty(this)){
            return;
        }
        int item=arr[front];
        front++;
        this.size--;


    }
    public void dispQ(){
        for(int i=front;i<=rear;i++)
        {
            System.out.print(arr[i]+" ");
        }
    }

    public static void main(String[] args) {
        RepQueue repQueue=new RepQueue(4);
        repQueue.enqueue(10);
        repQueue.enqueue(20);
        repQueue.enqueue(30);
        repQueue.enqueue(40);
        repQueue.dequeue();
        repQueue.dispQ();
    }
}
