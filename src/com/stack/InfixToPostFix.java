package com.stack;

import static java.lang.Character.isDigit;

/**
 * Created by manisha on 18/4/17.
 */
public class InfixToPostFix  {
    ArrayStack arrayStack=new ArrayStack();
    public static void main(String[] args) {

    }
    public void evaluateExp(String exp){
        char[] arr=exp.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(isDigit(arr[i])){
                arrayStack.push(arr[i]);
            }else{
            }

        }
    }
}
