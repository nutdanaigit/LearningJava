package com.learning.java.functional;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class CalculatorLearning {

    public static void main(String[] args) {
        Calculate add = (double x, double y) -> x + y;
        Calculate sub = (double x, double y) -> x - y;
        Calculate mul = (double x, double y) -> x * y;
        Calculate div = (double x, double y) -> x / y;

        double result1 = add.Cal(10, 3);
        double result2 = sub.Cal(10, 5);
        double result3 = mul.Cal(10, 4);
        double result4 = div.Cal(10, 3);

        System.out.println("Plus : " + result1);
        System.out.println("Minus : " + result2);
        System.out.println("Multiply : " + result3);
        System.out.println("Divide : " + result4);

    }


    private interface Calculate {
        double Cal(double num1, double num2);
    }
}
