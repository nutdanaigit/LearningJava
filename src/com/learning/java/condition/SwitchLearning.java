package com.learning.java.condition;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class SwitchLearning {

    public static void main(String[] args) {
        System.out.println("==============Example One==============\n");
        switchExampleOne();
        System.out.println("\n==============Example Two==============\n");
        switchExampleTwo();
    }

    private static void switchExampleOne(){
        int x = 3;
        switch (x % 2) {

            case 0:
                System.out.println("Event number");
                break;
            case 1:
                System.out.println("Odd number");
                break;
            default:
                System.out.println("Information don't correct");
                break;
        }
    }

    private static void switchExampleTwo(){
        char c ='n';

        switch (c){
            case 'y' :case'Y':
                System.out.println("Char is Y");
                break;
            case 'n':case 'N':
                System.out.println("Char is N");
                break;
                default:
                    System.out.println("Char can't check valid value");
        }
    }
}
