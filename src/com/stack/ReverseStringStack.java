package com.stack;

/**
 * Created by manisha on 18/4/17.
 */
public class ReverseStringStack {
    ArrayStack arrayStack=new ArrayStack();
    public static void main(String[] args) {
        ReverseStringStack reverseStringStack=new ReverseStringStack();
        System.out.print(reverseStringStack.reverseUsingSwap("Man"));
    }
    public String reverseString(String original){
        char[] strArr=original.toCharArray();
        for(int i=0;i<strArr.length;i++){
            arrayStack.push(strArr[i]);
        }
        StringBuilder stringBuilder=new StringBuilder();
        while(arrayStack.top!=-1){
            stringBuilder.append(arrayStack.pop());
        }
        String revString= String.valueOf(stringBuilder);
        return revString;
    }
    public String reverseUsingSwap(String orig){
        char[] strArr=orig.toCharArray();
        for(int i=0;i<strArr.length/2;i++){
            swap(strArr[i],strArr[strArr.length-i-1]);
        }
        return String.valueOf(strArr);
    }
    public void swap(char a,char b){
        char c=a;
        a=b;
        b=c;

    }
}
