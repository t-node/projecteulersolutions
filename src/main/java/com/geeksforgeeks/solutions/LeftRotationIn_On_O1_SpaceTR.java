package com.geeksforgeeks.solutions;

import java.util.Arrays;
import java.util.Scanner;
/**
 * Created by vevinmoza on 7/30/17.
 */
public class LeftRotationIn_On_O1_Space {
    public static void main(String[] args){
        Scanner s1= new Scanner(System.in);
        int testCases=0;
        int totalCases=s1.nextInt();
        while(testCases<totalCases){
            int sizeArr=s1.nextInt();
            int rotFactor=s1.nextInt();
            int[] intArr=new int[sizeArr];
            int[] rotatedArr=new int[sizeArr];
            int i=0;
            while(i<sizeArr){
                intArr[i]=s1.nextInt();
                i++;
            }

            rotFactor=rotFactor%sizeArr;

            for(int j=0;j<sizeArr;j++){
                rotatedArr[j]=intArr[(j+rotFactor)%sizeArr];
            }

            System.out.println(Arrays.toString(rotatedArr).replace(",","").replace("[","").replace("]",""));
            testCases++;
        }

    }




}
