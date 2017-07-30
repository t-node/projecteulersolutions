package com.projecteuler.solutions;

/**
 * Created by vevinmoza on 7/30/17.
 */
public class prob4 {
    public static void main(String[] args){
        int product=1;
        int greatestPalindrome=6;
        for(int i=1;i<1000;i++){
            for(int j=1;j<1000;j++){
                product=i*j;
                if(isPalindrome(product)){

                    if(greatestPalindrome<product){
                        greatestPalindrome=product;
                    }
                }
            }
        }
        System.out.println(greatestPalindrome);

    }
    static boolean isPalindrome(int number){
        int copyNumber=number;
        int reverseNumber=0;

        while(number>0){
            int r=number%10;
            number=number/10;
            reverseNumber=reverseNumber*10+r;
        }

        return reverseNumber==copyNumber?true:false;
    }

}
