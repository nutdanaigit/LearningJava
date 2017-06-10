package com.learning.java.generic;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class PrintLearning {


    public static void main(String[] args) {
        Printer<Integer> p1 = new Printer<>(4);
        p1.PrintData();
    }


    public static class Printer<T>{
        private  T data;

        Printer(T input){
            this.data = input;
        }

        void PrintData(){
            System.out.println("Current Date : "+ data);
        }
    }
}
