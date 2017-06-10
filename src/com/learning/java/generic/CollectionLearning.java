package com.learning.java.generic;

import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class CollectionLearning {
    private static final int CHECK = 1;

    public static void main(String[] args) {
        switch (CHECK) {
            case 0:
                sortExample();
                break;
            case 1:
                copyExample();
                break;
        }
    }

    private static void sortExample() {
        ArrayList<Double> arrayList = new ArrayList<>();
        arrayList.add(25.83);
        arrayList.add(311.33);
        arrayList.add(03.45);
        arrayList.add(47.52);
        arrayList.add(100.82);

        Collections.sort(arrayList);
        for (Double d : arrayList) {
            System.out.println(d);
        }
    }

    private static void copyExample(){
        ArrayList<String> al1  = new ArrayList<>();
        al1.add("FRE");
        al1.add("YOU");
        al1.add("JAVA");
        al1.add("GOOGLE");

        ArrayList<String> al2 = new ArrayList<>();
        al2.add("234");
        al2.add("786");


        Collections.copy(al1,al2);
        System.out.println(al1);
    }
}

