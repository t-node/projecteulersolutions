package com.geeksforgeeks.solutions;

/**
 * Created by vevinmoza on 8/1/17.
 */
public class LexographicallySmallestRotatedSequence {
    public static void main(String[] args){
        String s1="CAPABCQ";
        String minimum=s1;

        int i=0;
        while(i<s1.length()) {
            minimum = compare(minimum, s1.substring(i)+s1.substring(0,i));
            i++;
        }
        System.out.println(minimum);

    }
    //returns the minimum string always
    static String compare(String s1,String s2){

        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)>s2.charAt(i)){
                return s2;
            }
            else if(s1.charAt(i)<s2.charAt(i)){
                return s1;
            }
            else {
                continue;
            }
        }

        return s1;

    }

}
