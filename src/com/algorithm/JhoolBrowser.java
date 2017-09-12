package com.algorithm;


import java.util.Scanner;

/**
 * Created by manisha on 4/5/17.
 */
public class JhoolBrowser {

    static String url="www.google.com";

    public static void main(String[] args) {
        JhoolBrowser jhoolBrowser=new JhoolBrowser();
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        String [] stringArr=new String[N];
        for (int i = 0; i < N; i++) {
            //System.out.println("Enter String");
            stringArr[i]=s.next();
        }
        for(int i=0;i<N;i++){
            String str=jhoolBrowser.validateString(stringArr[i]);
            //jhoolBrowser.findLen(str,stringArr[i]);
            jhoolBrowser.findLenWithReplace(stringArr[i]);
        }
    }

    private String validateString(String s) {
        String newS=s.substring(s.indexOf(".")+1,s.lastIndexOf("."));
      //  System.out.print(newS);

        return newS;
    }

    public void findLen(String n,String actualStr) {
        int mainLength=actualStr.length();
        int newLength=n.length();

        for (int i = 0; i < n.length(); i++) {
            switch (n.charAt(i)) {
                case 'a': newLength--;break;
                case 'e':newLength--;break;
                case 'i':newLength--;break;
                case'o':newLength--;break;
                case 'u':newLength--;break;
            }
        }
        System.out.println((newLength+4)+"/"+mainLength);

    }
    public void findLenWithReplace(String n){
        String str=n.substring(n.indexOf(".")+1,n.length());
        str = str.replaceAll("[aeiou]", "");
        /*str=str.replace("a","");
        str=str.replace("e","");
        str=str.replace("i","");
        str=str.replace("u","");
        str=str.replace("o","");*/
        System.out.println(str);
    }


}

