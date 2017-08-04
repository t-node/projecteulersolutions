package com.geeksforgeeks.solutions;

/**
 * Created by vevinmoza on 8/4/17.
 */
public class LeftAndRightRotationOfString {
    public static void main(String[] args){
        String s="GeeksforGeeks";
        int d=3%s.length();
        char[] s_arr=s.toCharArray();
        char t=' ';
        for(int i=0;i<d;i++){
            t=s_arr[0];
            int j=0;
            for(;j<s.length()-1;j++){
                s_arr[j]=s_arr[j+1];
            }
            s_arr[s_arr.length-1]=t;
        }
        System.out.println(String.valueOf(s_arr));
        s="GeeksforGeeks";
        s_arr=s.toCharArray();
        for(int i=0;i<d;i++){
            t=s_arr[s_arr.length-1];
            int j=s_arr.length-1;
            for(;j>0;j--){
                s_arr[j]=s_arr[j-1];
            }
            s_arr[0]=t;
        }
        System.out.println(String.valueOf(s_arr));
    }
}
