package com.algorithm;

/**
 * Created by manisha on 15/5/17.
 */
public class PalindromeMergeOp {
    private int numOfOp;

    public static void main(String[] args) {
        PalindromeMergeOp palindromeMergeOp = new PalindromeMergeOp();
        int arr[]={11,14,15,99};
        int i=0,j=arr.length-1;
        palindromeMergeOp.getNumOfOp(arr,i,j);
    }

    public int getNumOfOp(int[] arr,int i,int j) {

        int count=0;

        if(arr[i]==arr[j]){
            getNumOfOp(arr,i+1,j-1);
        }
        if(arr[i]<arr[j]){

        }
        return numOfOp;
    }
}
