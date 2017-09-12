package com.algorithm;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Created by manisha on 4/5/17.
 */
public class DeleteFriends {
    public static void main(String[] args) {
        DeleteFriends deleteFriends = new DeleteFriends();
        Scanner s = new Scanner(System.in);
        int T = s.nextInt();
        int N[]=new int[T] , deleted , K[]=new int[T];
        int maxPop = 100;
        ArrayList<ArrayList<Integer>> arrayList = new ArrayList<>();

        if (T <= 1000) {
            for (int i = 0; i < T; i++) {
                deleted = 0;
                ArrayList<Integer> arr = new ArrayList<>();
                N[i] = s.nextInt();
                K[i] = s.nextInt();
                int j = 0;
                while (j < N[i]) {

                    arr.add(s.nextInt());
                    j++;
                }
                //arrayList.add(arr);


//                ArrayList<Integer> removalArr = arrayList.get(i);
                int l=0;
                do {


                         if (deleted == K[i]) {
                             break;
                         } else if(deleted!=K[i]) {
                             l = 0;
                         }else{
                             if (l!=N[i]-1 && arr.get(l) < arr.get(l + 1)) {
                                 //arr.(arr.get(l));
                                 arr.set(l, -1);
                                 deleted++;

                             }
                         l++;
                         }


                }while(l<N[i]);
                arrayList.add(arr);
            }
        }
        for(int i=0;i<T;i++){
            System.out.println();
            for(int j=0;j<arrayList.get(i).size();j++) {

                if (arrayList.get(i).get(j)!=-1) {
                    System.out.print(arrayList.get(i).get(j)+" ");
                }
            }
        }
        }
    }


