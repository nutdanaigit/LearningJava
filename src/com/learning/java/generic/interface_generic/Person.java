package com.learning.java.generic.interface_generic;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class Person implements Messageable<String,String> {
    @Override
    public String SimpleMessage() {
        return "Doing simple message";
    }

    @Override
    public String ParameterMessage(String str) {
        return "Person say hi " + str;
    }
}
