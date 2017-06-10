package com.learning.java.generic;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class GenericLearning {

    public static void main(String[] args) {
        Integer[] arrInt = {100,200,400};
        String[] arrString={"Test","Google","Facebook"};
        Double[] arrDbl={50.44,33.23,55.124,435.64};
        Float[] arrFlt = {3.2f,88.4f,54.25f};
        Character[] arrChr ={'J','A','V','A'};

        PrintArrayDate(arrInt);
        PrintArrayDate(arrString);
        PrintArrayDate(arrDbl);
        PrintArrayDate(arrFlt);
        PrintArrayDate(arrChr);
    }

    private static <T> void PrintArrayDate(T[] arr) {
        for(T i:arr){
            System.out.println("Data " + i);
        }
        System.out.println("**********************************************");
    }
}
