package com.projecteuler.solutions;

public class prob6 {
    public static void main(String[] args){
        int sumOfSquares=0;
        int SquareOfSum=0;
        for(int i=1;i<=100;i++){
            sumOfSquares=sumOfSquares+i*i;
        }
        for(int i=1;i<=100;i++){
            SquareOfSum=SquareOfSum+i;
        }
        SquareOfSum=SquareOfSum*SquareOfSum;
        System.out.println(SquareOfSum-sumOfSquares);
    }
}
