package com.learning.java.generic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class MaxMinLearning {
    private static final int CHECK = 1;

    public static void main(String[] args) {

        switch (CHECK){
            case 0:
                Integer result1 = Maximum(33,2);
                System.out.println("Maximum : "+ result1);

                Double result2 = Minimum(10.25,0.2);
                System.out.println("Minimum : "+result2);

                Double result3 = Minimum(10.3d,9.9d);
                System.out.println("Minimum : "+ result3);

                break;
            case 1 :
                ArrayList<Double> arrayList = new ArrayList<>();
                arrayList.add(25.83);
                arrayList.add(311.33);
                arrayList.add(03.45);
                arrayList.add(47.52);
                arrayList.add(100.82);

                Double maxNum = Collections.min(arrayList);
                Double minNum =Collections.max(arrayList);
                System.out.println("Maximum " + maxNum);
                System.out.println("Minimum "+ minNum);
                break;
        }

    }


    private static <T extends Comparable<T>> T Maximum(T num1, T num2){
        T maxValue = num1;
        if(num2.compareTo(maxValue) > 0){
            maxValue =num2;
        }
        return maxValue;
    }

    private static <T extends  Comparable<T>> T Minimum(T num1, T num2){
        T minValue = num1;
        if(num2.compareTo(minValue) < 0){
            minValue = num2;
        }
        return minValue;
    }
}
