package com.learning.java.generic;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class SortArrayLearning {

    public static void main(String[] args) {
        int [] arrInt = {4,5,2,7,89,23,-45,43,1,0,33,23,78};
        Arrays.sort(arrInt);
        Set<Integer> setInt = new HashSet<>();
        System.out.println("================Show Data Set=====================");
        for(int i : arrInt){
            setInt.add(i);
            System.out.print(i+" ");
        }
    }
}
