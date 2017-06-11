package com.learning.java.functional;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class ArrayPrintLearning {

    public static void main(String[] args) {
        Integer arrInt[] ={100,430,623, 740,800};
        String str [] = {"Pearl" , "google", "facebook","Deedoo","IYOu"};
        List<Integer> numList = Arrays.asList(arrInt);
        List<String> strList =Arrays.asList(str);

        numList.forEach(i -> System.out.println("Number "+i));
    }

    public class NumberModel{
        private int num;
        private String str;

        public NumberModel(int num, String str) {
            this.num = num;
            this.str = str;
        }

        public int getNum() {
            return num;
        }

        public void setNum(int num) {
            this.num = num;
        }

        public String getStr() {
            return str;
        }

        public void setStr(String str) {
            this.str = str;
        }
    }


}
