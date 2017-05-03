package com.stack;

import java.util.ArrayList;

/**
 * Created by manisha on 2/5/17.
 */
public class GetAllPrime {
    public static void main(String[] args) {
        GetAllPrime getAllPrime=new GetAllPrime();
        System.out.println(getAllPrime.sieve(10));
    }
    public ArrayList<Integer> sieve(int a) {
        ArrayList<Integer> arry=new ArrayList<Integer>();

        for(int i=2;i<=a;i++){
            int count=0;
            for(int j=1;j<=i;j++){
                if(i%j==0){
                    count++;

                }



            }
            if(count==2){
                arry.add(i);
            }

        }
        return arry;

    }
}
