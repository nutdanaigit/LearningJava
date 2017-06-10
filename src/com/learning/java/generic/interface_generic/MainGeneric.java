package com.learning.java.generic.interface_generic;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class MainGeneric {

    public static void main(String[] args) {
        Person p = new Person();
        String msg1 = p.SimpleMessage();
        String msg2 = p.ParameterMessage("Kamasaki");

        System.out.println(msg1);
        System.out.println(msg2);
        System.out.println("=============================");

        Robot r = new Robot();
        Integer int1 = r.SimpleMessage();
        Integer int2 = r.ParameterMessage(324);

        System.out.println(int1);
        System.out.println(int2);
    }
}
