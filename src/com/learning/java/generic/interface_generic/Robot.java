package com.learning.java.generic.interface_generic;

/**
 * Created by Augmentis on 6/10/2017.
 */
public class Robot implements Messageable<Integer,Integer> {
    @Override
    public Integer SimpleMessage() {
        return 223840;
    }

    @Override
    public Integer ParameterMessage(Integer num) {
        return num;
    }
}
