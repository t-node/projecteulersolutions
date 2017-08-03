package com.geeksforgeeks.solutions;

/**
 * Created by vevinmoza on 8/3/17.
 */
public class BitRotations {
    public static void main(String[] args){

        int firstNumber=708989;
        int secondNumber=8798798;
        String binaryFirst=convertToBinary(firstNumber);
        String binarySecond=convertToBinary(secondNumber);
        if((binarySecond+binarySecond).indexOf(binaryFirst)>=0){
            System.out.println("Rotations");
        }
        else{
            System.out.println("Not Rotations");
        }

    }

    private static String convertToBinary(int n) {
        StringBuffer s1= new StringBuffer();
        int i=0;
        while(i<32){
            if((n & 1)==1){
                s1.append("1");
            }else{
                s1.append("0");
            }
            n=n>>1;
            i++;
        }

        return s1.reverse().toString();
    }
}
