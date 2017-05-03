package com.stack;

/**
 * Created by manisha on 21/4/17.
 */
public class StackSorting {

    public static  ArrayStack arrayStack;

    public static void main(String[] args) {
        arrayStack=new ArrayStack();
        arrayStack.push(30);
        arrayStack.push(-5);
        arrayStack.push(18);
        arrayStack.push(14);
        arrayStack.push(3);
        StackSorting stackSorting=new StackSorting();
        stackSorting.sortStack(arrayStack);
    }
    public void sortStack(ArrayStack arrayStack){
        if(arrayStack.top!=-1) {
            int temp = (int) arrayStack.pop();
            sortStack(arrayStack);
            sortedInsert(arrayStack, temp);
        }

    }

    private void sortedInsert(ArrayStack arrayStack, int temp) {
        if((arrayStack.top == -1) || (temp > (int)arrayStack.peep())){
            arrayStack.push(temp);
            return;
        }
        int item= (int) arrayStack.pop();
        sortedInsert(arrayStack,temp);
        arrayStack.push(item);
    }
}
