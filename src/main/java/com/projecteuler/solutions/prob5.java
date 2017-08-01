package com.projecteuler.solutions;

public class prob5 {
    public static void main(String[] args){
        int number=20;
        int flag=1;
        while(true){
            int i=0;
            for(i=1;i<21;i++){
                if(number%i!=0){
                    number++;
                    break;
                }
            }
            if(i==21){
                break;
            }
        }
        System.out.println(number);
    }
}
