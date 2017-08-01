package com.projecteuler.solutions;

public class prob3 {
    public static void main(String[] args){
    Long number=new Long("600851475143");

    int index=2;
    int maxPrime=2;
    while(number!=1){
        if(number%index==0){
            number=number/index;
            if(maxPrime<index){
                maxPrime=index;
            }
        }else{
            index++;
        }
    }
    System.out.println(maxPrime);


    }
}
