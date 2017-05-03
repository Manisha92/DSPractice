package com.stack;

import java.util.Scanner;

/**
 * Created by manisha on 17/4/17.
 */
public class ExpressionStack{
public static int len;
    static char[] arr;
    static ArrayStack arrayStack;
    public static void main(String[] args) {
        ExpressionStack expressionStack=new ExpressionStack();
         arrayStack=new ArrayStack();
         String charArr="(1+(2+3)-0";

            System.out.print(expressionStack.checkBalance(charArr));
    }
    private int checkBalance(String expression){
        char[] exp=expression.toCharArray();
        for(int i=0;i<exp.length;i++) {
            if (exp[i] == '(' || exp[i] == '{' || exp[i] == '[') {
                arrayStack.push(exp[i]);
            } else if(exp[i] == ')' || exp[i] == '}' || exp[i] == ']'){
                char poppedItem = (char) arrayStack.pop();
                if(arrayStack.top>=0) {
                    if (arrayStack == null) {
                        return -1;
                    } else if (isMatchingExprChar(poppedItem, exp[i]) == -1)
                        return -1;
                }


                }

            }

        if(arrayStack.top==-1){
            return 0;
        }else {
            return -1;
        }
    }
    private int isMatchingExprChar(char popedItem,char exp){
        if(popedItem=='(' && exp==')' ){
            return 0;
        }
        else if(popedItem=='{' && exp=='}' ){
            return 0;

        }
        else if(popedItem=='[' && exp==']' ){
            return 0;
        }else {
            return -1;
        }
    }



}
