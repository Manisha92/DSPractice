package com.algorithm;

/**
 * Created by manisha on 3/5/17.
Check for Palindrome String using Recursion.
 */
public class StringPalindromeRec {

    public static void main(String[] args) {
        StringPalindromeRec stringPalindromeRec=new StringPalindromeRec();
        System.out.print(stringPalindromeRec.isPalindrome("malayalam"));
    }
    private boolean isPalindromeRec(String n,int s,int e){
        char[ ]str=n.toCharArray();
        if(str[s]==str[e]){
            return true;
        }
        if(str[s]!=str[e]){
            return false;
        }
        return isPalindromeRec(n,s+1,e+1);
    }
    private boolean isPalindrome(String n){
        if(n.length()==0){
            return true;
        }
        return isPalindromeRec(n,0,n.length()-1);
    }

}
