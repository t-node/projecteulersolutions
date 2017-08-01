package com.geeksforgeeks.solutions;

public class MinimumRotationsSameString {
    public static void main(String[] args){
        String s = "2332242142142142";
        String s1=s;
        int i=1;
        while(i<=s.length()){
            String rt=s.substring(i)+s.substring(0,i);
            if(rt.equals(s)){
                break;
            }

            i++;
        }
        System.out.println(i);
    }
}
