package com.geeksforgeeks.solutions;

/**
 * Created by vevinmoza on 8/3/17.
 */
public class BinaryRepresentationOfNumber {
    public static void main(String[] args){
        int n=123;
        StringBuffer s1= new StringBuffer();
        while(n>0){
            s1=s1.append(n%2);
            n=n/2;
        }
        System.out.println(s1.reverse().toString());
    }
}
