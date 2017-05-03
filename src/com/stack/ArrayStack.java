package com.stack;

/**
 * Created by manisha on 17/4/17.
 */
public class ArrayStack {

    int MAX=1000;
    char[] arr=new char[MAX];
    int[] intArr=new int[MAX];
    Object[] objArr=new Object[MAX];
    int top;
    ArrayStack(){
        top=-1;
    }

    public void push(Object data){
        if(top>MAX){
            System.out.print("Stack Overflow");
        }
        objArr[++top]=data;
    }
    public void push(char data){
        if(top>MAX){
            System.out.print("Stack Overflow");
        }
        arr[++top]=data;
    }
    public  Object pop(){
        if(top==-1){
            System.out.println("Stack Underlfow");

        }

        Object x=objArr[top];
        top--;
        return x;

    }
    public Object peep(){
        return objArr[top];

    }
    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        return false;
    }
    public void display(){
        if(top>0) {
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i]);
            }
        }
    }
public  int len(){
        int count=0;
        for(int i=0;i<=top;i++){
            count++;
        }
        return count;
}

    public static void main(String[] args) {
        ArrayStack arrayStack=new ArrayStack();
        arrayStack.push('a');
        arrayStack.push('b');
        arrayStack.push('c');
        arrayStack.display();
        arrayStack.pop();
        arrayStack.display();
        System.out.print(arrayStack.len());
    }
}
